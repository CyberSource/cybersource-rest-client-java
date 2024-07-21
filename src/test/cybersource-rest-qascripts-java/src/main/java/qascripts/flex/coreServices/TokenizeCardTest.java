package qascripts.flex.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.model.FlexToken;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import Api.FlexTokenApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.FlexV1KeysPost200Response;
import Model.FlexV1TokensPost200Response;
import Model.Flexv1tokensCardInfo;
import Model.TokenizeRequest;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class TokenizeCardTest {

	public static FlexV1TokensPost200Response response = null;
	public static FlexV1KeysPost200Response keyResponse;
	private static Properties merchantProp;
	public static String keyId = null;
	public static String respKeyId = null;

	@SuppressWarnings("rawtypes")

	static Map<?, ?> tokenMap = new HashMap();

	static TokenizeRequest request;

	public static void main(String args[]) throws Exception {
		TokenizeCardTest tokenizeCardTest = new TokenizeCardTest();
		tokenizeCardTest.process();
	}

	public  TokenizeRequest getRequest() throws Exception {
		request = new TokenizeRequest();
		request.keyId(keyId);

		Flexv1tokensCardInfo cardInfo = new Flexv1tokensCardInfo();
		cardInfo.cardNumber("5555555555554444");
		cardInfo.cardExpirationMonth("03");
		cardInfo.cardExpirationYear("2031");
		cardInfo.cardType("002");
		request.cardInfo(cardInfo);

		return request;

	}

	public  void process() throws Exception {

		File inputFile = new File(
				System.getProperty("user.dir") + "\\src\\main\\java\\CSV_Files\\Flex\\CoreServices\\TokenizeCard.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();
		while ((columns = csvReader.readNext()) != null) {
			ApiClient apiClient = null;
			try {
				keyId=columns[1];
				request = getRequest();
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				FlexTokenApi tokenizationApi = new FlexTokenApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = tokenizationApi.tokenize(request);

				FlexToken flexTokenResponseBody = new FlexToken();
				flexTokenResponseBody.setKeyId(response.getKeyId());
				flexTokenResponseBody.setToken(response.getToken());
				flexTokenResponseBody.setMaskedPan(response.getMaskedPan());
				flexTokenResponseBody.setCardType(response.getCardType());
				flexTokenResponseBody.setTimestamp(response.getTimestamp());
				flexTokenResponseBody.setSignedFields(response.getSignedFields());
				flexTokenResponseBody.setSignature(response.getSignature());
				flexTokenResponseBody.setDiscoverableServices(response.getDiscoverableServices());

				ObjectMapper oMapper = new ObjectMapper();
				tokenMap = oMapper.convertValue(flexTokenResponseBody, Map.class);

				if (response.getKeyId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.TOKENIZE_CARD, ConstantUtility.ASSERTION_FAILED,
							ConstantUtility.KEY_ID_NULL, response.getKeyId(), apiClient.getResponseCode(),
							Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.TOKENIZE_CARD, ConstantUtility.ASSERTION_PASS,
							columns[2], response.getKeyId(), apiClient.getResponseCode(), Boolean.TRUE);
				}
			}

			catch (ApiException e) {
				String reason = null;
				try {
					if (apiClient.getRespBody() == null) {
						reason = e.getMessage();
					} else {
						JSONObject obj = new JSONObject(apiClient.getRespBody()).getJSONObject("responseStatus");
						reason = obj.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.TOKENIZE_CARD, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.TOKENIZE_CARD, ConstantUtility.FAIL, e.getMessage(),
						null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
	}
}