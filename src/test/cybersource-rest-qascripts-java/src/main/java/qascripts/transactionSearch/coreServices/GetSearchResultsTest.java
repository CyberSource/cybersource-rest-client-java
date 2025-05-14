package qascripts.transactionSearch.coreServices;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.SearchTransactionsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.TssV2TransactionsPost201Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetSearchResultsTest {

	public static void main(String args[]) throws Exception {
		GetSearchResultsTest getSearchResultsTest = new GetSearchResultsTest();
		getSearchResultsTest.process();
	}
	
	public TssV2TransactionsPost201Response process() throws Exception {
		 TssV2TransactionsPost201Response response = null;
		 String respSearchId = null;
		 Properties merchantProp;
		 		
	        File inputFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\CSV_Files\\TransactionSearch\\CoreServices\\GetSearchResults.csv");
	      	CSVReader csvReader = new CSVReader(new FileReader(inputFile));
	      	String[] columns = null;
	      	csvReader.readNext();
	      	
	      	while((columns = csvReader.readNext()) != null)
	      	{
					ApiClient apiClient = null;
					try { 
			        	/* Read Merchant details. */
						merchantProp = Configuration.getMerchantDetails();
						MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
						SearchTransactionsApi searchTransactionsApi = new SearchTransactionsApi(merchantConfig);
						apiClient=Invokers.Configuration.getDefaultApiClient();
						response = searchTransactionsApi.getSearch(columns[1]);
						
						JSONObject obj = new JSONObject(apiClient.getRespBody());
						respSearchId = obj.getString("searchId");
						if (apiClient.getResponseCode() == null) {
							CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SEARCH_RESULT,
									ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, respSearchId,
									apiClient.getResponseCode(), Boolean.TRUE);
						} else if (!columns[1].equals(respSearchId)) {
							CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SEARCH_RESULT,
									ConstantUtility.ASSERTION_FAILED, ConstantUtility.INVALID_SEARCH_ID, respSearchId,
									apiClient.getResponseCode(), Boolean.TRUE);
						} else {
							CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SEARCH_RESULT,
									ConstantUtility.ASSERTION_PASS, columns[2], respSearchId, apiClient.getResponseCode(),
									Boolean.TRUE);
						}
					} catch (ApiException e) {
						String reason = null;
						try {
							if (apiClient.getRespBody() == null) {
								reason = e.getMessage();
							} else {
								JSONObject jsonObject = new JSONObject(apiClient.getRespBody());
								reason = jsonObject.getString("message");
							}
						} catch (JSONException exp) {
							reason = apiClient.getRespBody();
						}
						CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SEARCH_RESULT, ConstantUtility.FAIL, reason,
								respSearchId, apiClient.getResponseCode(), Boolean.TRUE);
					} catch (Exception e) {
						CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SEARCH_RESULT, ConstantUtility.FAIL,
								e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
					}
			      	} 
			      	csvReader.close();
					return response;
			       
			    }
			}
			