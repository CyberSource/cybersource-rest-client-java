package masking;

import java.util.Map.Entry;

import org.apache.logging.log4j.Logger;

import com.cybersource.authsdk.util.GlobalLabelParameters;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/*
 * This Class contains the logic for masking sensitive data.
 */
public class Masking {

	private static final JsonElement mask = new JsonParser().parse(GlobalLabelParameters.MASKING_PATTERN);

	/**
	 * @param json
	 * @param logger
	 * @return
	 */
	public static String prepareMasking(String json, Logger logger) {
		/* Add the fields need to be masked in this list */
		String[] list = { "email", "cardNumber", "expirationDate", "expirationMonth", "cardType", "cardCode",
				"nameOnAccount", "currency" };
		try {
			JsonElement object = new JsonParser().parse(json);
			// object.get
			getChild(object, list);
			return object.toString();
		} catch (JsonSyntaxException e) {
			return json;
		}
	}

	/**
	 * 
	 * @param json
	 * @param list
	 */
	private static void getChild(JsonElement json, String[] list) {

		if (json.isJsonObject()) {
			JsonObject obj = (JsonObject) json;
			mask(obj, list);
			for (Entry<String, JsonElement> entry : obj.entrySet()) {
				getChild(entry.getValue(), list);
			}

		}

	}

	/**
	 * @param obj
	 * @param list
	 */
	private static void mask(JsonObject obj, String[] list) {

		for (String current : list) {
			/* masking field. */
			if (obj.has(current)) {
				obj.add(current, mask);
			}
		}
	}

}