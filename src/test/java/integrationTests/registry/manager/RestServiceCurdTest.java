package integrationTests.registry.manager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fretron.HttpRequestHepler;
import com.fretron.JwtUtil;
import com.fretron.Model.Driver;
import com.fretron.Model.Organisation;
import com.fretron.utils.SmsService;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class RestServiceCurdTest {

//    public static void main(String[] args){
//        System.out.println(randomAlphaNumeric(8));
//    }
    String userMobile = "0000";
    String email =  randomAlphaNumeric(8)+"@gmail.com";
    String otp = null;
    final String baseUrl = "http://192.168.0.153";

    final String signInUrl = baseUrl + "/user/login/forany";
    final String signUpUrl = baseUrl + "/user/create";
    final String orgCreateUrl = baseUrl + "/organisation/create";
    final String switchOrgUrl = baseUrl + "/user/switchorg?orgId=";
    final String groupCreateUrl = baseUrl + "/group/create";

    final String vehicleAddUrl = baseUrl + "/registry/vehicle/add";
    final String vehicleUpdateUrl = baseUrl + "/registry/vehicle/update";
    final String vehicleDeleteUrl = baseUrl + "/registry/vehicle/delete";
    final String addVehicleToGroupUrl = baseUrl + "/registry/vehicle/addgroup";
    final String getVehicleOfOrgUrlV = baseUrl + "/registry/org/vehicle/v2";
    final String getVehicleOfOrgUrl = baseUrl + "/registry/org/vehicle";
    final String createVehicleMultipleUrl = baseUrl + "/registry/vehicle/addmultiple";
    final String deleteMultiplevehicles = baseUrl + "/registry//vehicle/deletemultiple";
    final String deleteVehicleFromOrg = baseUrl + "/registry/vehicle/deleteorg";
    final String vehicleRemoveDriverUrl = baseUrl + "/registry/vehicle/removedriver";

    final String getVehiclesOfGroup = baseUrl + "/registry/group/vehicle?groupId=";
    final String deleteVehicleFromGroup = baseUrl + "/registry/vehicle/deletegroup";
    final String vehicleListUrl = baseUrl + "/registry/vehicleList";
    final String removeSharedOrgFromVehicleUrl = baseUrl + "/registry/vehicle/remove/share";

    final String deviceAddUrl = baseUrl + "/registry/device/add";
    final String devicewithStatusUrl = baseUrl + "/registry/deviceswithstatus";
    final String deviceUpdateUrl = baseUrl + "/registry/device/update";
    final String orgDeviceUrl = baseUrl + "/registry/org/device";
    final String checkdeviceUrl = baseUrl + "/registry/checkdevice";



    final String driverUpdateUrl = baseUrl + "/registry/driver/update";
    final String driverDeleteUrl = baseUrl + "/registry/driver/delete";
    final String driverAddUrl = baseUrl + "/registry/driver/add";

    final String vehicleShareUrl =  baseUrl + "/registry/vehicle/share";
    final String getAllVehiceUrl = baseUrl + "/registry/dashboard";
    final String checkVehicleUrl = baseUrl + "/registry/checkvehicle";

    final String vehicleListForTripUrl = baseUrl +"/registry/vehicleList/forTrip";

    //GET URIS
    final String getDriverUrl =  baseUrl + "/registry/driver/getList";
    final String getDriverWithUuidUrl =  baseUrl + "/registry/driver/get/";
    String jsondataPath="fretron-common/src/test/java/integrationTests/registry/manager/";

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    boolean shouldProceed =  true;
    public String mobileNumer = "98"+randomAlphaNumeric(8);
    String updatedVehicleType = "Taurus 15MT";
    String manufacturerName = randomAlphaNumeric(6);


    StringEntity stringEntity = null;

    ArrayList<String> orgTokenArr = new ArrayList<>();
    ArrayList<String> orgIdArr = new ArrayList<>();
    ArrayList<String> driverIdArr =new ArrayList<>();
    ArrayList<String> deviceIdArr = new ArrayList<>();
    ArrayList<String> vehicleIdArr = new ArrayList<>();
    ArrayList<String> deviceImeiArr = new ArrayList<>();

    ArrayList<String> vehicleRegistrationNoArr = new ArrayList<>();

    JSONArray vehicleUuidList = new JSONArray();
    String groupId = null;
    String firstToken = null;
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public boolean startTest() throws InterruptedException {


        Path currentRelativePath = Paths.get(jsondataPath);
        jsondataPath  = currentRelativePath.toAbsolutePath().toString();
        jsondataPath = jsondataPath+"/";
        System.out.println("Current relative path is: " + jsondataPath);
        signUpAndLoginUser();

        assert shouldProceed;
        return shouldProceed;
    }

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public void signUpAndLoginUser() throws InterruptedException {
        Thread.sleep(1000);
        userMobile = userMobile + SmsService.getOtpWithLength(6);

        String userData = "{\n" +
                "\t\"loginType\":\"fretron\",\n" +
                "\t\"mobileNumber\":\"999999999\"\n" +
                "}\n";

        JSONObject userObject = new JSONObject(userData);
        userObject.put("mobileNumber","9999999999");

        HttpEntity responseEntity = HttpRequestHepler.makePostRequest(signInUrl,userObject,null);

        if(responseEntity!=null){
            try {
                String responseString = EntityUtils.toString(responseEntity);
                JSONObject customerResponse = new JSONObject(responseString);
                otp = customerResponse.getString("otp");

            } catch (IOException e) {
                shouldProceed = false;
                e.printStackTrace();
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in User Login -- Parsing error");
            }
        }
        else{
            shouldProceed = false;
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in User Login -- response entity null");
        }
        //todo user signup and getToken
        if(shouldProceed){
            String signUpdata = "{\n" +
                    "\t\"onBoardingType\":\"fretron\",\n" +
                    "\t\"email\":\"abhinavs.som@fretron.com\",\n" +
                    "\t\"mobileNumber\":\"8708069755\",\n" +
                    "\t\"name\":\"Som\",\n" +
                    "\t \"otp\": \"897233\"\n" +
                    "}";

            JSONObject signUpObject = new JSONObject(signUpdata);
            signUpObject.put("mobileNumber","9999999999");
            signUpObject.put("email",email);
            signUpObject.put("otp",otp);

            HttpEntity responseEntity2 = HttpRequestHepler.makePostRequest(signUpUrl,signUpObject,null);
            if(responseEntity2!=null){
                try {

                    String responseString = EntityUtils.toString(responseEntity2);
                    JSONObject customerResponse = new JSONObject(responseString);




                    firstToken = customerResponse.getString("token");

                } catch (IOException e) {
                    shouldProceed = false;
                    e.printStackTrace();
                    java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in User Signup -- Parsing error");
                }
            }
            else{
                shouldProceed = false;
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in User SignUp -- response entity null");
            }
        }

        if(shouldProceed){
            createOrg();
        }

    }

    public void createOrg() throws InterruptedException {
        Thread.sleep(1000);
        Organisation[] orgArr = null;
        ArrayList<Organisation> orgArrList = new ArrayList<>() ;
        try {

             orgArr = mapper.readValue(new File(jsondataPath+"orgdata.json"), Organisation[].class);
             orgArrList = new ArrayList(Arrays.asList(orgArr));

        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i=0 ;i<orgArrList.size();i++){
            orgArrList.get(i).setOrgId(randomAlphaNumeric(5));
            orgArrList.get(i).setOrganisationName("TestOrg-"+i);
        }

        for(int j=0;j<orgArrList.size();j++){
            HttpEntity responseEntity2 = HttpRequestHepler.makePostRequest(orgCreateUrl,orgArrList.get(j),firstToken);
            if(responseEntity2!=null){
                try {
                    String str = EntityUtils.toString(responseEntity2);
                    JSONObject jsonObject = new JSONObject(str);
                    if(jsonObject.getInt("status")==200)     {
                        if(jsonObject.has("organisation.created"))  {
                            String orgId = jsonObject.getJSONObject("organisation.created").getString("uuid");
                            orgIdArr.add(orgId);
                        }
                    }
                    else{
                        java.util.logging.Logger.getGlobal().log(Level.WARNING,"Organisation creation fail ");
                        shouldProceed = false;
                    }
                } catch (IOException e) {
                    shouldProceed = false;
                    java.util.logging.Logger.getGlobal().log(Level.WARNING,"Organisation -- Parsing error");
                }
            }
            else{
                shouldProceed = false;
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Organisation Creation -- response entity null");
            }
        }

        if(shouldProceed){
            switchOrganisation(orgIdArr.get(0),firstToken);
        }

    }

    public void switchOrganisation(String orgToSwitch, String oldToken) throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity entity   = HttpRequestHepler.makeGetRequest(switchOrgUrl+orgToSwitch,oldToken);
        if(entity!=null) {
            String responseString = null;
            try {
                responseString = EntityUtils.toString(entity);
                JSONObject jsonObject = new JSONObject(responseString);
                String token2 = null;
                if (jsonObject.has("token")){
                    token2 = jsonObject.getString("token");
                    orgTokenArr.add(token2);
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e1) {
                shouldProceed = false;
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Organisation Switch-- Parsing error");
            }

        }
        else{
            shouldProceed = false;
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Switiching Organisation Creation -- response entity null");
        }

        if(shouldProceed){
            addDriver();
        }
    }

    public void addDriver() throws InterruptedException {
        Thread.sleep(1000);
        Driver[] driverArr = null;
        ArrayList<Driver> driverArrList = new ArrayList<>() ;
        try {
            driverArr = mapper.readValue(new File( jsondataPath+"driverdata.json"), Driver[].class);
            driverArrList = new ArrayList(Arrays.asList(driverArr));

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i=0 ;i<driverArrList.size();i++){
            driverArrList.get(i).setMobileNumber("xxxx"+SmsService.getOtpWithLength(6));
        }

        for(int j=0;j<driverArrList.size();j++){
            HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(driverAddUrl,driverArrList.get(j),orgTokenArr.get(0));
            if(responseEntity!=null){
                String resp = null;
                try {
                    resp = EntityUtils.toString(responseEntity);
                    JSONObject jsonObject = new JSONObject(resp);
                    int status = jsonObject.getInt("status");
                    if(status==200){
                        System.out.println("Driver added successfully");
                    }
                    else{
                        System.out.println("Error in Driver add ");
                    }
                } catch (IOException e) {
                    shouldProceed = false;
                    java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in parsing Driver Creation response");
                }
            }
            else{
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Driver Creation -- response entity null");
                shouldProceed = false;
            }
        }

        if(shouldProceed){
               if(getDrivers(driverArrList.size())){
                   updateDriver();
               }
        }
    }

    public boolean getDrivers(int valueToCount) throws InterruptedException {
        Thread.sleep(1000);
          HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(getDriverUrl,orgTokenArr.get(0));
          if(responseEntity!=null){
              String resp = null;
              try {
                  resp = EntityUtils.toString(responseEntity);
                  JSONObject jsonObject = new JSONObject(resp);
                  int status = jsonObject.getInt("status");
                  if(status==200){
                      JSONArray arr = jsonObject.getJSONArray("list");
                      if(arr.length() == valueToCount){
                          System.out.println("Driver list got ");
                          for(int i=0;i<arr.length();i++){
                              try {
                                  driverIdArr.add(arr.getJSONObject(i).getString("uuid"));
                              } catch (JSONException e) {
                                  e.printStackTrace();
                              }
                          }
                      }
                      else{
                          System.out.println("Number of driver are not as expected");
                          shouldProceed = false;
                      }
                  }
                  else{
                      System.out.println("Error in Driver add ");
                      shouldProceed = false;
                  }
              } catch (IOException e) {
                  e.printStackTrace();
                  shouldProceed = false;
              }
          }
          else{
              java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Getting Driver list -- response entity null");
              shouldProceed = false;
          }
          return shouldProceed;
    }

    public void updateDriver() throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj =new JSONObject();
        obj.put("uuid",driverIdArr.get(driverIdArr.size()-1));
        obj.put("mobileNumber",mobileNumer);
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(driverUpdateUrl,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("Driver updated status = 200 , with Id "+driverIdArr.get(driverIdArr.size()-1));
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Updating Driver parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Updating Driver -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            getDriverWithUuid(driverIdArr.get(driverIdArr.size()-1));
        }
    }

    public void getDriverWithUuid(String uuid) throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(getDriverWithUuidUrl+"/"+uuid,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    JSONObject driver =  jsonObject.getJSONObject("driver");
                    if(driver.getString("mobileNumber").equalsIgnoreCase(mobileNumer)){
                        System.out.println("Driver Updated");
                    }
                    else{
                        System.out.println("Driver not updated ,, when get driver with uuid ");
                    }
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Updating Driver parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Updating Driver -- response entity null");
            shouldProceed = false;
        }
        if(shouldProceed){
            deleteDriver(driverIdArr.get(driverIdArr.size()-1));
        }
    }

    public void deleteDriver(String uuid) throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj =new JSONObject();
        obj.put("uuid",uuid);
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(driverDeleteUrl+"?uuid="+uuid,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("Driver deleted with Id "+driverIdArr.get(driverIdArr.size()-1));
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Deletibg Driver parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Deleting Driver -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            getDrivers(driverIdArr.size()-1);
            addVehicle();
        }
    }

    public void addVehicle() throws InterruptedException {
        Thread.sleep(1000);
        JSONArray jsonArray = RestServiceCurdTestHelper.getVehicles();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            HttpEntity responseEntity = HttpRequestHepler.makePostRequest(vehicleAddUrl, jsonObject, orgTokenArr.get(0));
            if (responseEntity != null) {
                String json = null;
                try {
                    json = EntityUtils.toString(responseEntity);
                    JSONObject jsonObject1 = new JSONObject(json);
                    if (jsonObject1.has("status")) {
                        String vehicleId = jsonObject1.getString("vehicleId");
                        System.out.println("vehicle created --> " + vehicleId);
                        vehicleIdArr.add(vehicleId);
                    }
                } catch (IOException e) {
                    java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Adding Vehicle  -- parsing error");
                    shouldProceed = false;
                }
            } else {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Adding Vehicle  -- response entity null");
                shouldProceed = false;
            }
        }
            if (shouldProceed) {
                updateVehicle();
            }
    }

    public void updateVehicle() throws InterruptedException {
        Thread.sleep(1000);
      JSONObject jsonObject = new JSONObject();
      jsonObject.put("uuid",vehicleIdArr.get(0));
      jsonObject.put("vehicleType",updatedVehicleType);
      jsonObject.put("driverId",driverIdArr.get(0));

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(vehicleUpdateUrl,jsonObject,orgTokenArr.get(0));

        if (responseEntity != null) {
            String json = null;
            try {
                json = EntityUtils.toString(responseEntity);
                JSONObject jsonObject1 = new JSONObject(json);
                if (jsonObject1.has("status")) {

                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Updating Vehicle  -- parsing error");
                shouldProceed = false;
            }
        } else {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Updating Vehicle  -- response entity null");
            shouldProceed = false;
        }
        if (shouldProceed) {
            getAllVehicles();
        }
    }

    public void getAllVehicles() throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(getAllVehiceUrl,orgTokenArr.get(0));

        if (responseEntity != null) {
            String json = null;
            try {
                json = EntityUtils.toString(responseEntity);
                JSONArray array = new JSONArray(json);
                for (int i=0;i<array.length();i++) {
                    JSONObject jsonObject = (JSONObject) array.get(i);
                    if (jsonObject.has("vehicleRegistrationNumber")) {
                        vehicleRegistrationNoArr.add(jsonObject.getString("vehicleRegistrationNumber"));
                    }

                    if (jsonObject.has("vehicleType")) {
                        if (jsonObject.getString("vehicleType").equalsIgnoreCase(updatedVehicleType)) {
                            System.out.print("vehicle updated with uuid -- > " + vehicleIdArr.get(0));
                            System.out.println(" with driverId-- > " + driverIdArr.get(0));
                        }

                    }
                    else {
                        System.out.println("failed to updated vehicle");
                        shouldProceed = false;
                    }
                }

            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle  -- parsing error");
                shouldProceed = false;
            }
        } else {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle  -- response entity null");
            shouldProceed = false;
        }
        if (shouldProceed) {
            removeDriverFromVehicle();

        }
    }
    public void removeDriverFromVehicle() throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj =new JSONObject();
        obj.put("uuid",vehicleIdArr.get(0));
        obj.put("driverId",driverIdArr.get(0));
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(vehicleRemoveDriverUrl,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){

                }
                else{
                    System.out.println("Error remove driver from vehicle");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
                shouldProceed = false;
            }
            if(shouldProceed){
                checkVehicle();
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Remove Driver Frome Vehicle -- response entity null");
            shouldProceed = false;
        }
    }
    public void checkVehicle() throws InterruptedException {
            Thread.sleep(1000);
            try {
                HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(checkVehicleUrl+"?registrationNumber="+ URLEncoder.encode(vehicleRegistrationNoArr.get(0),"UTF-8"),orgTokenArr.get(0));
                if (responseEntity != null) {
                    String json = null;
                    json = EntityUtils.toString(responseEntity);
                    JSONObject jsonObject = new JSONObject(json);
                    if (jsonObject.has("vehicle")) {
                        JSONObject vehicle = jsonObject.getJSONObject("vehicle");
                            if (vehicle.isNull("driverId")) {
                                System.out.println("Driver removed with driverId "+driverIdArr.get(0)+" from vehicle uuid ->"+vehicleIdArr.get(0) +" " );
                            }
                    } else {
                        System.out.println("failed to check vehicle exist");
                        shouldProceed = false;
                    }
                }
                else {
                    java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle  -- response entity null");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle  -- parsing error");
                shouldProceed = false;
            }
        if (shouldProceed) {
            deleteVehicle(vehicleIdArr.get(vehicleIdArr.size()-1));
        }
    }

    public void deleteVehicle(String uuid) throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj =new JSONObject();
        obj.put("uuid",uuid);
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(vehicleDeleteUrl,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("vehicle deleted with Id "+ vehicleIdArr.get(vehicleIdArr.size()-1));
                    vehicleIdArr.remove(vehicleIdArr.size()-1);
                }
                else{
                    System.out.println("failed to delete vehicle");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Deleting Vehicle parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Deleting Vehicle -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            createGroup();
        }
    }

    public void createGroup() throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj = new JSONObject();
        obj.put("orgId",orgIdArr.get(orgIdArr.size()-1));
        obj.put("groupName","TestGroup_"+randomAlphaNumeric(5));
        obj.put("groupType","vehicleGroup");

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(groupCreateUrl,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    groupId = jsonObject.getJSONObject("organisationGroup").getString("uuid");
                    System.out.println("Group created with uuid --> " + groupId);
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Creating Group -- parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Creating Group -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            addVehicleToGroup();
        }
    }

    public void addVehicleToGroup() throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj = new JSONObject();
        obj.put("groupId",groupId);
        obj.put("vehicleList",vehicleIdArr);
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(addVehicleToGroupUrl,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                      System.out.println("vehicles are shared with group --> "+ groupId);
                }
                else{
                    System.out.println("failed to share vehicles to a group");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in adding Vehicles to Group -- parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in adding Vehicles to Group -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            getVehiclesOfOrgV();
            getVehiclesOfOrg();
        }
    }

    public void getVehiclesOfOrgV() throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(getVehicleOfOrgUrlV+"?orgId="+orgIdArr.get(0),orgTokenArr.get(0));

        if (responseEntity != null) {
            String json = null;
            try {
                json = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(json);
                if(jsonObject.getInt("status")==200) {
                      JSONArray array = jsonObject.getJSONArray("list");
                      if(array.length()==vehicleIdArr.size())
                          System.out.println("list of vehicles for org api /org/vehicle/v2");
                } else {
                    System.out.println("failed to get vehicles of org api /org/vehicle/v2");
                    shouldProceed = false;
                }


            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle of a Org api /org/vehicle/v2 -- parsing error");
                shouldProceed = false;
            }
        } else {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle of a Org /org/vehicle/v2 -- response entity null");
            shouldProceed = false;
        }
        if (shouldProceed) {

        }
    }

    public void getVehiclesOfOrg() throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(getVehicleOfOrgUrl+"?orgId="+orgIdArr.get(0),orgTokenArr.get(0));

        if (responseEntity != null) {
            String json = null;
            try {
                json = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(json);
                if(jsonObject.getInt("status")==200) {
                    JSONArray array = jsonObject.getJSONArray("list");
                    if(array.length()==vehicleIdArr.size())
                        System.out.println("list of vehicles api /org/vehicle");
                } else {
                    System.out.println("failed to get vehicles api /org/vehicle");
                    shouldProceed = false;
                }


            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle of a Org api /org/vehicle-- parsing error");
                shouldProceed = false;
            }
        } else {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle of a Org /org/vehicle -- response entity null");
            shouldProceed = false;
        }
        if (shouldProceed) {
            createMultipleVehicles();
        }
    }

    public void createMultipleVehicles() throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(createVehicleMultipleUrl,RestServiceCurdTestHelper.getVehicles(),orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    vehicleUuidList = jsonObject.getJSONArray("successList");
                    System.out.println("multiple vehicles added --> "+ vehicleUuidList);
                }
                else{
                    System.out.println("failed to create multiple vehicles");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in creating multiple vehicles -- parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in deleting multiple vehicles -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            deleteMultipleVehicle();
        }
    }

    public void deleteMultipleVehicle() throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(deleteMultiplevehicles,vehicleUuidList,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){

                    System.out.println("multiple vehicles deleted --> "+ jsonObject.getJSONArray("successList"));
                }
                else{
                    System.out.println("failed to delete multiple vehicles");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in deleting multiple vehicles -- parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in deleting multiple vehicles -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
//            deleteVehicleFromOrg();
            shareVehiclesWithOrg();
        }
    }

    public void deleteVehicleFromOrg() throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(deleteVehicleFromOrg+"?vehicleId="+vehicleIdArr.get(0),orgTokenArr.get(0));

        if (responseEntity != null) {
            String json = null;
            try {
                json = EntityUtils.toString(responseEntity);
//                JSONObject jsonObject = new JSONObject(json);
//                if(jsonObject.getInt("status")==200) {
//                  System.out.print("vehicle deleted uuid --> " + vehicleIdArr.get(0));
//                } else {
//                    System.out.println("failed to delete vehicles of org");
//                    shouldProceed = false;
//                }


            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in deleting Vehicle of a Org -- parsing error");
                shouldProceed = false;
            }
        } else {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in deleting Vehicle of a Org -- response entity null");
            shouldProceed = false;
        }
        if (shouldProceed) {
            shareVehiclesWithOrg();
        }
    }

    public void shareVehiclesWithOrg() throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj = new JSONObject();
        obj.put("orgId",orgIdArr.get(orgIdArr.size()-1));
        obj.put("vehicleList", Collections.singletonList(vehicleIdArr.get(vehicleIdArr.size()-1)));

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(vehicleShareUrl,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                   System.out.println("vehicle --> " + vehicleIdArr.get(vehicleIdArr.size()-1) + " shared with org --> " + orgIdArr.get(1));
                }
                else{
                    System.out.println("failed to share vehicle with org --> " + orgIdArr.get(1));
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in sharing vehicles with org -- parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in sharing vehicles with org -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            vehiclesOfGroup(vehicleIdArr.size());
            deleteVehicleFromGroup();
        }
    }

    public void vehiclesOfGroup(int expectedVehicles) throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(getVehiclesOfGroup+groupId,orgTokenArr.get(0));

        if (responseEntity != null) {
            String json = null;
            try {
                json = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(json);
                if(jsonObject.getInt("status")==200) {
                    JSONArray array = jsonObject.getJSONArray("list");
                    if(array.length()==expectedVehicles)
                        System.out.println("vehicles of a group obtained");
                } else {
                    System.out.println("failed to get vehicles of group");
                    shouldProceed = false;
                }


            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle of a group -- parsing error");
                shouldProceed = false;
            }
        } else {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting all Vehicle of a group -- response entity null");
            shouldProceed = false;
        }
        if (shouldProceed) {

        }
    }

    public void deleteVehicleFromGroup() throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj = new JSONObject();
        obj.put("vehicleId",vehicleIdArr.get(vehicleIdArr.size()-1));
        obj.put("groupId",groupId);

        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(deleteVehicleFromGroup,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("vehicle --> " + vehicleIdArr.get(vehicleIdArr.size()-1) + " deleted from group --> " + groupId);
                }
                else{
                    System.out.println("failed to delete vehicle from group --> " + groupId);
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in deleting vehicle from group -- parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in deleting vehicle from group -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            vehiclesOfGroup(vehicleIdArr.size()-1);
            vehicleListForTrip();
        }
    }

    public void vehicleListForTrip() throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(vehicleListForTripUrl+"?orgId="+orgIdArr.get(orgIdArr.size()-1)+"&isGod=false",orgTokenArr.get(0));

        if (responseEntity != null) {
            String json = null;
            try {
                json = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(json);
                if(jsonObject.getInt("status")==200) {
                    JSONArray array = jsonObject.getJSONArray("list");
                    if(array.length()>0)
                        System.out.println("vehicleList/forTrip api runs successfully");
                } else {
                    System.out.println("failed to run vehicleList/forTrip api");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in vehicleList/forTrip -- parsing error");
                shouldProceed = false;
            }
        } else {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in vehicleList/forTrip -- response entity null");
            shouldProceed = false;
        }
        if (shouldProceed) {
            getVehicleList();
        }
    }

    public void getVehicleList() throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(vehicleListUrl,orgTokenArr.get(0));

        if (responseEntity != null) {
            String json = null;
            try {
                json = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(json);
                if(jsonObject.getInt("status")==200) {
                    if(jsonObject.has("list"))
                        System.out.println("registry/vehicleList api runs successfully");
                } else {
                    System.out.println("failed to run registry/vehicleList api");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in registry/vehicleList -- parsing error");
                shouldProceed = false;
            }
        } else {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in registry/vehicleList -- response entity null");
            shouldProceed = false;
        }
        if (shouldProceed) {
            removeSharedOrgFromVehicle();
        }
    }

    public void removeSharedOrgFromVehicle() throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj =new JSONObject();
        obj.put("orgId",orgIdArr.get(orgIdArr.size()-1));
        obj.put("vehicleId",vehicleIdArr.get(vehicleIdArr.size()-1));
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(removeSharedOrgFromVehicleUrl,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200 && jsonObject.get("vehicleId").equals(vehicleIdArr.get(vehicleIdArr.size()-1))){
                    System.out.println("shared org removed from vehicle uuid (org)--> " + orgIdArr.get(orgIdArr.size()-1));
                }
                else{
                    System.out.println("failed to remove shared org from vehicle");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in parsing -- > vehicle/remove/share");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in vehicle/remove/share -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            addDevice();
        }
    }
    public void addDevice() throws InterruptedException {
        Thread.sleep(1000);
        JSONArray deviceArrList = RestServiceCurdTestHelper.getDevices();
        for (int i = 0; i < deviceArrList.length(); i++) {
            HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(deviceAddUrl,deviceArrList.get(i),orgTokenArr.get(0));
            if(responseEntity!=null){
                String resp = null;
                try {
                    resp = EntityUtils.toString(responseEntity);
                    JSONObject jsonObject = new JSONObject(resp);
                    int status = jsonObject.getInt("status");
                    if(status==200){
                        System.out.println("Device added successfully");
                    }
                    else{
                        System.out.println("Error in Device add ");
                    }
                } catch (IOException e) {
                    shouldProceed = false;
                    java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in parsing Device Creation response");
                }
            }
            else{
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Device Creation -- response entity null");
                shouldProceed = false;
            }
        }

        if(shouldProceed){
            if(getDevice(deviceArrList.length())){
                updateDevice();
            }
        }
    }
    public boolean getDevice(int valueToCount) throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(devicewithStatusUrl+"?orgId="+ JwtUtil.getOrgIdFromToken(orgTokenArr.get(0)),null);
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    JSONArray arr = jsonObject.getJSONArray("list");

                    if(arr.length() == valueToCount){
                        System.out.println("Device list got ");
                        for(int i=0;i<arr.length();i++){
                            if(arr.getJSONObject(i).has("device")) {
                                JSONObject device = arr.getJSONObject(i).getJSONObject("device");
                                deviceIdArr.add(device.getString("uuid"));
                                deviceImeiArr.add(device.getString("imei"));
                            }
                        }
                    }
                    else{
                        System.out.println("Number of device are not as expected");
                        shouldProceed = false;
                    }
                }
                else{
                    System.out.println("Error get all device of org");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Getting Device list -- response entity null");
            shouldProceed = false;
        }
        return shouldProceed;
    }
    public void updateDevice() throws InterruptedException {
        Thread.sleep(1000);
        JSONObject obj =new JSONObject();
        obj.put("uuid",deviceIdArr.get(deviceIdArr.size()-1));
        obj.put("manufacturerName",manufacturerName);
        HttpEntity responseEntity =  HttpRequestHepler.makePostRequest(deviceUpdateUrl,obj,orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("Device updated status = 200 , with Id "+deviceIdArr.get(deviceIdArr.size()-1));
                }
                else{
                    shouldProceed = false;
                }
            } catch (IOException e) {
                java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Updating Device parsing error");
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Updating Device -- response entity null");
            shouldProceed = false;
        }

        if(shouldProceed){
            checkDevice();
        }
    }
    public void checkDevice() throws InterruptedException {
        Thread.sleep(1000);
        try {
            HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(checkdeviceUrl+"?imei="+ URLEncoder.encode(deviceImeiArr.get(0),"UTF-8"),orgTokenArr.get(0));
            if (responseEntity != null) {
                String json = null;
                json = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(json);
                int status = jsonObject.getInt("status");
                if(status==200){
                    System.out.println("check device exist " +jsonObject.getBoolean("exist"));
                } else {
                    System.out.println("failed to check device exist");
                    shouldProceed = false;
                }
            }
            else {
                java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting device  -- response entity null");
                shouldProceed = false;
            }
        } catch (IOException e) {
            java.util.logging.Logger.getGlobal().log(Level.WARNING, "Error in Getting device  -- parsing error");
            shouldProceed = false;
        }
        if (shouldProceed) {
            getDevicesOfOrgWithToken(deviceIdArr.size());
        }
    }
    public void getDevicesOfOrgWithToken(int valueToCount) throws InterruptedException {
        Thread.sleep(1000);
        HttpEntity responseEntity =  HttpRequestHepler.makeGetRequest(orgDeviceUrl+"?orgId="+JwtUtil.getOrgIdFromToken(orgTokenArr.get(0)),orgTokenArr.get(0));
        if(responseEntity!=null){
            String resp = null;
            try {
                resp = EntityUtils.toString(responseEntity);
                JSONObject jsonObject = new JSONObject(resp);
                int status = jsonObject.getInt("status");
                if(status==200){
                    JSONArray arr = jsonObject.getJSONArray("list");
                    if(arr.length() == valueToCount){
                        System.out.println("Device list as expected ");
                    }
                    else{
                        System.out.println("Number of device are not as expected");
                        shouldProceed = false;
                    }
                }
                else{
                    System.out.println("Error get all device of org");
                    shouldProceed = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
                shouldProceed = false;
            }
        }
        else{
            java.util.logging.Logger.getGlobal().log(Level.WARNING,"Error in Getting Device list -- response entity null");
            shouldProceed = false;
        }
    }

}
