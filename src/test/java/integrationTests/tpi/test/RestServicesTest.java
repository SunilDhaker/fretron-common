package integrationTests.tpi.test;

import com.fretron.HttpRequestHepler;
import com.fretron.utils.SmsService;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestServicesTest {

    String userMobile = "0000";
    String email =  randomAlphaNumeric(8)+"@gmail.com";
    String otp = null;
    final String baseUrl = "http://192.168.0.153";

    final String signInUrl = baseUrl + "/user/login/forany";
    final String signUpUrl = baseUrl + "/user/create";
    final String orgCreateUrl = baseUrl + "/organisation/create";
    final String switchOrgUrl = baseUrl + "/user/switchorg?orgId=";

    final String tfLoginUrl = baseUrl + "/integrations/tatafleetman/login";

    final String scheduleJobUrl = baseUrl + "/integrations/job/schedule";
    final String etransUrl = baseUrl + "/integrations/etrans/login";
    final String trackingExpertsUrl = baseUrl + "/integrations/trackingexperts/login";
    final String listIntegrationUrl = baseUrl + "/integrations/list";
    final  String deleteIntegartionUrl = baseUrl + "/integrations/delete?jobId=";
    final String integrationStatusUrl = baseUrl + "/integrations/status";
    final String generateCustomUrl = baseUrl + "/integrations/generate/url?type=Rooster";

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    boolean shouldProceed =  true;
    String mobileNumber = "98"+randomAlphaNumeric(8);

    String token = null;
    String jobId = null;


    public void startTest() throws Exception{
        System.out.println("Test Started");
        signUpAndLoginUser();
        Thread.sleep(5000L);
    }



    public static String randomAlphaNumeric(int count) {

        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public void signUpAndLoginUser() throws Exception{

        userMobile = userMobile + SmsService.getOtpWithLength(6);

        String userData = "{\n" +
                "\t\"loginType\":\"fretron\",\n" +
                "\t\"mobileNumber\":\"8764315730\"\n" +
                "}\n";

        JSONObject userObject = new JSONObject(userData);
        userObject.put("mobileNumber",userMobile);

        HttpEntity responseEntity = HttpRequestHepler.makePostRequest(signInUrl,userObject,null);

        if(responseEntity!=null){
            try {
                String responseString = EntityUtils.toString(responseEntity);
                JSONObject customerResponse = new JSONObject(responseString);
                otp = customerResponse.getString("otp");
                System.out.println("otp :: "+otp);

            } catch (IOException e) {
                shouldProceed = false;
                e.printStackTrace();
                Logger.getGlobal().log(Level.WARNING,"Error in User Login -- Parsing error");
            }
        }
        else{
            shouldProceed = false;
            Logger.getGlobal().log(Level.WARNING,"Error in User Login -- response entity null");
        }
        // user sign-up and getToken
        if(shouldProceed){
            String signUpdata = "{\n" +
                    "\t\"onBoardingType\":\"fretron\",\n" +
                    "\t\"email\":\"abhinavs.som@fretron.com\",\n" +
                    "\t\"mobileNumber\":\"8764315730\",\n" +
                    "\t\"name\":\"Sahu\",\n" +
                    "\t \"otp\": \"897233\"\n" +
                    "}";

            JSONObject signUpObject = new JSONObject(signUpdata);
            signUpObject.put("mobileNumber",userMobile);
            signUpObject.put("email",email);
            signUpObject.put("otp",otp);

            HttpEntity responseEntity2 = HttpRequestHepler.makePostRequest(signUpUrl,signUpObject,null);
            if(responseEntity2!=null){
                try {

                    String responseString = EntityUtils.toString(responseEntity2);
                    JSONObject customerResponse = new JSONObject(responseString);
                    token = customerResponse.getString("token");

                } catch (IOException e) {
                    shouldProceed = false;
                    e.printStackTrace();
                    Logger.getGlobal().log(Level.WARNING,"Error in User Sign-up -- Parsing error");
                }
            }
            else{
                shouldProceed = false;
                Logger.getGlobal().log(Level.WARNING,"Error in User SignUp -- response entity null");
            }
        }

        if(shouldProceed){

           createOrg();
            Thread.sleep(1000L);

        }

    }


    public void createOrg() throws  Exception{

        Long timestamp = System.currentTimeMillis();
        String orgJson = "{\n" +
                "   \"orgId\":\"Test_TPI\",\n" +
                "   \"organisationName\" : \"TestTPI\",\n" +
                "   \"type\" : \"FLEET_OWNER\"\n" +
                " }";

        JSONObject req = new JSONObject(orgJson);
        req.put("organisationName","Test_TPI"+timestamp);
        req.put("orgId" ,"Test_TPI"+timestamp);
        HttpEntity responseEntity2 = HttpRequestHepler.makePostRequest(orgCreateUrl,req,token);
        String orgId = null;
        if(responseEntity2!=null){
            try {
                String str = EntityUtils.toString(responseEntity2);
                JSONObject jsonObject = new JSONObject(str);



                if(jsonObject.getInt("status")==200){
                    if(jsonObject.has("organisation.created")) {

                        orgId = jsonObject.getJSONObject("organisation.created").getString("uuid");
                        System.out.println("Organisation Creation Successful");
                    }

                }
                else{
                    Logger.getGlobal().log(Level.WARNING,"Organisation creation fail ");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                shouldProceed = false;
                Logger.getGlobal().log(Level.WARNING,"Organisation -- Parsing error");
            }
        }
        else{
            shouldProceed = false;
            Logger.getGlobal().log(Level.WARNING,"Error in Organisation Creation -- response entity null");
        }

        if(shouldProceed){
            switchOrganisation(orgId ,token);
            Thread.sleep(1000L);
        }

    }



    public void switchOrganisation(String orgToSwitch, String oldToken) throws Exception{
        HttpEntity entity   = HttpRequestHepler.makeGetRequest(switchOrgUrl+orgToSwitch,oldToken);
        if(entity!=null) {
            String responseString = null;
            try {
                responseString = EntityUtils.toString(entity);
                JSONObject jsonObject = new JSONObject(responseString);
                if (jsonObject.has("token")){
                    token = jsonObject.getString("token");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e1) {
                shouldProceed = false;
                Logger.getGlobal().log(Level.WARNING,"Organisation Switch-- Parsing error");
            }

        }
        else{
            shouldProceed = false;
            Logger.getGlobal().log(Level.WARNING,"Error in Switiching Organisation Creation -- response entity null");
        }

        if(shouldProceed){
            tataFleetManLogin();
        }
    }



    public void tataFleetManLogin() throws Exception{

        JSONObject obj =new JSONObject();
        obj.put("username","mehars346@gmail.com");
        obj.put("password","123456");

        JSONObject responseObj = null;

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(tfLoginUrl,obj,token);
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                responseObj = new JSONObject(resp);
                int status = responseObj.getInt("status");
                if(status==200){
                    System.out.println("Tata-Fleet-Man Login Successful");
                    jobId = responseObj.getString("jobId");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Error in Tata-Fleet-Man Login parsing error");
                shouldProceed = false;
            }
        }
        else{
            Logger.getGlobal().log(Level.WARNING,"Error in Tata-Fleet-Man Login-- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            if (scheduleJob(responseObj)){
                eTransLogin();
                Thread.sleep(1000L);
            }

        }
    }



    public void eTransLogin() throws  Exception{

        JSONObject obj =new JSONObject();
        obj.put("eid","1990");
        obj.put("key","19xZ3Dar09sh67arjk90");

        JSONObject responseObj = null;

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(etransUrl,obj,token);
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                responseObj = new JSONObject(resp);
                int status = responseObj.getInt("status");
                if(status==200){
                    System.out.println("E-trans Login Successful");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Error in E-trans Login parsing error");
                shouldProceed = false;
            }
        }
        else{
            Logger.getGlobal().log(Level.WARNING,"Error in E-trans Login -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            if (scheduleJob(responseObj)){
                trackingExpertsLogin();
                Thread.sleep(1000L);
            }

        }

    }


    public void trackingExpertsLogin() throws Exception{
        JSONObject obj =new JSONObject();
        obj.put("url","http://trackingexperts.com/mobileapp/vehilestatus_srigoodscarriers.php");
        JSONObject responseObj = null;

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(trackingExpertsUrl,obj,token);
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                responseObj = new JSONObject(resp);
                int status = responseObj.getInt("status");
                if(status==200){
                    System.out.println("Tracking Experts Login Successful");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Error in Tracking Experts Login parsing error");
                shouldProceed = false;
            }
        }
        else{
            Logger.getGlobal().log(Level.WARNING,"Error in Tracking Experts Login -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            if (scheduleJob(responseObj)){
                listIntegrations();
                Thread.sleep(1000L);
            }

        }

    }



    public Boolean scheduleJob(JSONObject requestObj) throws Exception{

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(scheduleJobUrl,requestObj,token);

        if(responseEntity!=null){

            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("Job Scheduled Successful");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Error while schedule job parsing error");
                shouldProceed = false;
            }
        }
        else{
            Logger.getGlobal().log(Level.WARNING,"Error while schedule job -- response entity null");
            shouldProceed = false;
        }


        return shouldProceed;

    }



    public void listIntegrations() throws Exception{
        HttpEntity entity   = HttpRequestHepler.makeGetRequest(listIntegrationUrl,token);
        if(entity!=null) {
            String responseString = null;
            try {
                responseString = EntityUtils.toString(entity);
                JSONObject jsonObject = new JSONObject(responseString);
                int status = jsonObject.getInt("status");
                if(status==200){
                    JSONArray list = jsonObject.getJSONArray("response");
                    System.out.println("Number of integrations :: "+ list.length());
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e1) {
                shouldProceed = false;
                Logger.getGlobal().log(Level.WARNING,"list integration-- Parsing error");
            }

        }
        else{
            shouldProceed = false;
            Logger.getGlobal().log(Level.WARNING,"Error in list integration -- response entity null");
        }

        if(shouldProceed){
            Thread.sleep(2000L);
            deleteIntegration();

        }


    }


    public void deleteIntegration() throws Exception{

        String url = deleteIntegartionUrl+jobId;

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(url,"",token);
        if(responseEntity!=null){

            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("Integration Deleted Successfully");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"Error while Delete integration parsing error");
                shouldProceed = false;
            }
        }
        else{
            Logger.getGlobal().log(Level.WARNING,"Error while Delete integration -- response entity null");
            shouldProceed = false;
        }


        if (shouldProceed){
            listIntegrations();
            Thread.sleep(1000L);
            integrationStatus();
            Thread.sleep(1000L);

        }
    }




    public void integrationStatus() throws Exception{
        HttpEntity entity   = HttpRequestHepler.makeGetRequest(integrationStatusUrl,token);
        if(entity!=null) {
            String responseString = null;
            try {
                responseString = EntityUtils.toString(entity);
                JSONObject jsonObject = new JSONObject(responseString);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("Success :: Get Integration Status");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e1) {
                shouldProceed = false;
                Logger.getGlobal().log(Level.WARNING,"Get Integration Status -- Parsing error");
            }

        }
        else{
            shouldProceed = false;
            Logger.getGlobal().log(Level.WARNING,"Error in Get Integration Status -- response entity null");
        }

        if(shouldProceed){
            generateCustomIntegrationUrl();
            Thread.sleep(1000L);
        }



    }


    public void generateCustomIntegrationUrl() throws Exception {

        HttpEntity entity   = HttpRequestHepler.makeGetRequest(generateCustomUrl,token);
        String url = null;
        if(entity!=null) {
            String responseString = null;

            try {
                responseString = EntityUtils.toString(entity);
                JSONObject jsonObject = new JSONObject(responseString);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("Success in generate custom url");
                    url = jsonObject.getString("url");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e1) {
                shouldProceed = false;
                Logger.getGlobal().log(Level.WARNING,"Generate Custom url-- Parsing error");
            }

        }
        else{
            shouldProceed = false;
            Logger.getGlobal().log(Level.WARNING,"Error in Generate Custom url -- response entity null");
        }

        if(shouldProceed){

            pushData(url);
            Thread.sleep(1000L);

        }


    }



    public void pushData(String url){

        String data = "[  \n" +
                "   {  \n" +
                "      \"VehicleNo\":\"RJ01GB3496\",\n" +
                "      \"Temperature\":0,\n" +
                "      \"Latitude\":\"25.267603\",\n" +
                "      \"Longitude\":\"74.629686\",\n" +
                "      \"LocationDescription\":\"NH79, Bhilwara(S),  Bhilwara,  RJ, India\",\n" +
                "      \"Datetime\":\"2018-01-03 09:35:57\",\n" +
                "      \"IgnitionStatus\":\"OFF\",\n" +
                "      \"Speed\":0,\n" +
                "      \"OdometerReading\":203316,\n" +
                "      \"DeviceID\":\"00000536\",\n" +
                "      \"Direction\":\" S\"\n" +
                "   },\n" +
                "   {  \n" +
                "      \"VehicleNo\":\"RJ01GB4068\",\n" +
                "      \"Temperature\":0,\n" +
                "      \"Latitude\":\"24.713283\",\n" +
                "      \"Longitude\":\"74.367695\",\n" +
                "      \"LocationDescription\":\"NH76, Bhadura,  Chittaurgarh,  RJ, India\",\n" +
                "      \"Datetime\":\"2017-12-14 21:37:11\",\n" +
                "      \"IgnitionStatus\":\"ON\",\n" +
                "      \"Speed\":50,\n" +
                "      \"OdometerReading\":138934,\n" +
                "      \"DeviceID\":\"00005157\",\n" +
                "      \"Direction\":\" W\"\n" +
                "   }]";


        JSONArray req = new JSONArray(data);

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(url,req,null);
        if(responseEntity!=null){

            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("Successfully data pushed on custom url");
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                Logger.getGlobal().log(Level.WARNING,"parsing error while push data on custom url");
                shouldProceed = false;
            }
        }
        else{
            Logger.getGlobal().log(Level.WARNING,"Error while push data on custom url -- response entity null");
            shouldProceed = false;
        }


        if (shouldProceed){

            System.out.println("All is Well :-D ");

        }

    }


    public static void main(String [] args) throws Exception{

        RestServicesTest test = new RestServicesTest();
        test.startTest();



    }



}






