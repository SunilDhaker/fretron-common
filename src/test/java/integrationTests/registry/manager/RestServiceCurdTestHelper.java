package integrationTests.registry.manager;

import org.json.JSONArray;
import org.json.JSONObject;

public class RestServiceCurdTestHelper {

    public static JSONArray getVehicles() {
        JSONArray array = new JSONArray();

        for (int i = 0; i < 4; i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("vehicleRegistrationNumber", "DEV TEST " + RestServiceCurdTest.randomAlphaNumeric(4));
            jsonObject.put("vtsDeviceId", "DevTest " + "_" + RestServiceCurdTest.randomAlphaNumeric(6));
            jsonObject.put("vehicleModel", "LPT 1109 7.5MT");
            jsonObject.put("vehicleMake", "LPT 1109 7.5MT");
            jsonObject.put("vehicleType", "LPT 1109 7.5MT");

            array.put(jsonObject);
        }
        return array;
    }
    public static JSONArray getDevices() {
        JSONArray array = new JSONArray();

        for (int i = 0; i < 4; i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("imei", "DevTest " + "_" + RestServiceCurdTest.randomAlphaNumeric(6));
            jsonObject.put("mobileNumber",8888+ RestServiceCurdTest.randomAlphaNumeric(6));
            jsonObject.put("manufacturerName", RestServiceCurdTest.randomAlphaNumeric(4));

            array.put(jsonObject);
        }

        return array;
    }
}
