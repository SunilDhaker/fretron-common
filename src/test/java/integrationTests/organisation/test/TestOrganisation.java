package integrationTests.organisation.test;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrganisation {

    private final String baseIP = "http://192.168.0.153";

   private final String loginUrl = baseIP + "/user/login/forany";
   private String otpPath = baseIP + "/user/authentication?mobileNumber=8168332313&otp=";
   private final String createOrgpath = baseIP + "/organisation/create";
   private final String updateOrgpath = baseIP + "/organisation/update";
   private final String deleteOrgPath = baseIP + "/organisation/delete";

   private final String getMemebersPath = baseIP + "/organisation/users";
   private final String addUserOrgAclPath = baseIP + "/organisation/add";

   private final String createGroupPath = baseIP + "/group/create";
   private final String shareGroupPath = baseIP + "/group/share";
   private final String deleteGroupPath = baseIP + "/group/delete";
   private final String removeSharedGroupPath = baseIP + "group/remove/shared";

   private final String getOrgPath = baseIP + "/organisation/organizations";
   private String getOrgFromOrgIdPath = baseIP+"/organisation/getbyid/";
   private String getOrgFromUuid = baseIP + "organisation";

   private String getGroupPath = baseIP + "/group/get";

   private final String createVehiclePath = baseIP + "/registry/vehicle/add";
   private final String addGroupPath= baseIP + "/registry/vehicle/addgroup";

   private final String orgDetailPath = baseIP + "/organisation/get/detail";

   private String switchOrg = baseIP + "/user/switchorg?orgId=";
   private final String vehicleOfSwitchOrg = baseIP + "/registry/dashboard";

   private ArrayList<String> vehicleIds = new ArrayList<>();

   private String token  = null;
   private String otp = null;
   private String orgId_1 = null;

   private String orgId_2 = null;

   public String addedBy = null;
   public String groupId = null;
   public String vehicleId = null;
   public String imei = "imei";
//   public String newToken = null;

   public boolean assertThat;

   private long timeStamp;
   private String errorMessage = null;

   ArrayList<String> tokens = new ArrayList<>();

   @Before
   public void init() {
       timeStamp = System.currentTimeMillis();
       assertThat = false;
   }

    @Test
    public void startTest() throws IOException, InterruptedException {

//create org, login user, add userOrgacl, get users
//        login();
//        if (authenticateUser()){
//            if(createOrg())
//                if(createOrg())
//                    if(getOrgDetails())
//                    if(getOrgFromOrgId())
//                      if(getMembers()) {
//                          Thread.sleep(1000);
//                          if (addUserOrgAcl())
//                        if (createGroup())
//                            if(getGroups())
//                               if(createVehicle())
//                                  if(addVehicle())
//                                     if(shareGroup())
//                                        if(switchOrg())
//                                         getVehicleListOfSwitchedOrg();



//                }

        if(login())
        if(authenticateUser())
        if(createOrg())
        if(switchOrg(orgId_1))
        if(getOrgDetails())
        if(getMembers())
        if(addUserOrgAcl())
        if(createGroup())
        if(getGroups())
        if(createVehicle())
        if(addVehicle())
        if(shareGroup())
        if(switchOrg(orgId_2))
        if(getVehicleListOfSwitchedOrg())
        if(updateOrg())
        if(deleteOrg())
        if(removeSharedGroup())
        if(deleteGroup());

//        login();
//        if(authenticateUser())
//        if(getOrganisations())
//            getGroups();

        //get organisation from orgId
//        login();
//        if(authenticateUser())
//            assert getOrgFromOrgId();

        // get orgDetails
//        login();
//        if(authenticateUser())
//             getOrgDetails();
        assert assertThat;
    }

    private boolean login() {
        HttpClient httpClient = new DefaultHttpClient();
        JSONObject reqObj = new JSONObject();
        HttpPost post = new HttpPost(loginUrl);
        try {
            reqObj.put("loginType", "fretron");
            reqObj.put("mobileNumber", "8168332313");
            String s = reqObj.toString();
            post.setHeader("Content-Type", "application/json");
            post.setEntity(new StringEntity(s));

            HttpResponse response = httpClient.execute(post);
            Thread.sleep(1000);
            HttpEntity entity = response.getEntity();
            if (response.getStatusLine().getStatusCode()==200) {
                String responseString = EntityUtils.toString(entity);
                JSONObject jsonObject = new JSONObject(responseString);
                if (jsonObject.has("otp"))

                    otp = jsonObject.getString("otp");
                System.out.println("login");
                assertThat = true;
            } else {
               System.out.println("login failed");
                assertThat = false;
            }
        } catch (IOException e) {
            assertThat = false;
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return assertThat;
    }

   private boolean authenticateUser() throws IOException, InterruptedException {
        if(otp!=null)
            otpPath = otpPath + otp;

       HttpClient client = new DefaultHttpClient();

       HttpGet httpGet = new HttpGet(otpPath);
       httpGet.setHeader("Content-Type","application/json");

       HttpResponse response = client.execute(httpGet);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String responseString = EntityUtils.toString(response.getEntity());

           JSONObject json = new JSONObject(responseString);
           int successStatus = json.getInt("status");
           if(successStatus==200) {
               if (json.has("token"))
                   token = json.getString("token");
               System.out.println("authenticate");
               assertThat = true;
               return true;
           }
       }
       System.out.println("authentication failed");
       return false;
   }


   private boolean createOrg() throws IOException, InterruptedException {
//       File file = new File("/home/umesh/fretron-organisation-manager/src/test/java/organisation.json");
//       String org = new String(Files.readAllBytes(file.toPath()))
       Thread.sleep(1000);

       Long tStamp = System.currentTimeMillis();

       System.out.println(tStamp);

       JSONObject json = new JSONObject();
       json.put("orgId","TEST001_"+tStamp);
       json.put("organisationName","TESTORG_1"+tStamp);
       json.put("type","FLEET_OWNER");

       JSONObject json1 = new JSONObject();
       json.put("orgId","TEST002_"+tStamp);
       json.put("organisationName","TESTORG_2_"+tStamp);
       json.put("type","FLEET_OWNER");

       JSONArray array = new JSONArray();
       array.put(json);
       array.put(json1);

       for(int i=0; i<array.length(); i++) {
           HttpClient client = new DefaultHttpClient();
           HttpPost httpPost = new HttpPost(createOrgpath);

           httpPost.setHeader("Content-Type", "application/json");
           httpPost.setHeader("Authorization", "bearer " + token);
           httpPost.setEntity(new StringEntity(array.getJSONObject(i).toString()));

           HttpResponse response = client.execute(httpPost);
           Thread.sleep(1000);

           if (response.getStatusLine().getStatusCode() == 200) {
               String str = EntityUtils.toString(response.getEntity());

               JSONObject jsonObject = new JSONObject(str);

               if (jsonObject.getInt("status") == 200) {
                   if (jsonObject.has("organisation.created")) {
                       System.out.println("org create");
                       if (orgId_1 == null){
                           orgId_1 = jsonObject.getJSONObject("organisation.created").getString("uuid");
                           addedBy = jsonObject.getJSONObject("organisation.created").getString("addedBy");
                   }
                       else
                           orgId_2 = jsonObject.getJSONObject("organisation.created").getString("uuid");

                       assertThat = true;
                   }
               } else {
                   System.out.println("organisation creation failed");
                   assertThat = false;

                   return false;
               }
           }
       }
        return false;
   }

   private boolean getMembers() throws IOException, InterruptedException {
       Thread.sleep(1000);
       HttpGet httpGet = new HttpGet(getMemebersPath);
       httpGet.setHeader("Authorization","bearer "+tokens.get(0));

       HttpClient client = new DefaultHttpClient();

       HttpResponse response = client.execute(httpGet);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String str = EntityUtils.toString(response.getEntity());

           JSONArray jsonArray = new JSONArray(str);

           if(jsonArray.length()>0) {
               assertThat = true;
               System.out.println("get member");
               return true;
           }
       } else {
           System.out.println("getting members of organisation failed");
           assertThat = false;
       }
       return false;
   }

   private boolean addUserOrgAcl() throws IOException, InterruptedException {
        Thread.sleep(1000);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("orgUuid",orgId_1);
        jsonObject.put("userUuid",addedBy);
        jsonObject.put("accessLevel","user");


        HttpPost httpPost = new HttpPost(addUserOrgAclPath);
        HttpClient client = new DefaultHttpClient();

        StringEntity entity = new StringEntity(jsonObject.toString());
        httpPost.setHeader("Content-Type","application/json");
        httpPost.setHeader("Authorization","bearer "+tokens.get(0));

        httpPost.setEntity(entity);

        HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

        if(response.getStatusLine().getStatusCode()==200) {
            String str = EntityUtils.toString(response.getEntity());

            JSONObject jsonObject1 = new JSONObject(str);

            if(jsonObject1.getInt("status")==200) {
                System.out.println("add user acl");
                assertThat = true;
                return true;
            }

        } else {
             System.out.println("changing user org acl failed");
            assertThat = true;
        }
        return false;
   }


   private boolean createGroup() throws IOException, InterruptedException {

       Thread.sleep(1000);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("orgId",orgId_1);
        jsonObject.put("groupName","TestGroup_"+timeStamp);
        jsonObject.put("groupType","vehicleGroup");

        HttpPost httpPost = new HttpPost(createGroupPath);
        httpPost.setHeader("Authorization","bearer "+tokens.get(0));

        HttpClient client = new DefaultHttpClient();

        StringEntity entity = new StringEntity(jsonObject.toString());

        httpPost.setHeader("Content-Type","application/json");
        httpPost.setEntity(entity);

        HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

        if(response.getStatusLine().getStatusCode()==200) {
            String str = EntityUtils.toString(response.getEntity());

            JSONObject jsonObject1 = new JSONObject(str);

            if(jsonObject1.getInt("status")==200) {
                if(jsonObject1.has("organisationGroup"))
                    groupId = jsonObject1.getJSONObject("organisationGroup").getString("uuid");
                System.out.println("group created");
                assertThat = true;
                return true;
            }
        }

        System.out.println("failed to create group");
        assertThat = false;
        return false;
   }

   private boolean shareGroup() throws IOException, InterruptedException {

       Thread.sleep(1000);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("orgId",orgId_2);
        jsonObject.put("groupId",groupId);

        HttpPost httpPost = new HttpPost(shareGroupPath);
        httpPost.setHeader("Authorization","bearer "+tokens.get(0));

        HttpClient client = new DefaultHttpClient();

        httpPost.setHeader("Content-Type","application/json");
        httpPost.setEntity(new StringEntity(jsonObject.toString()));

        HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

        if(response.getStatusLine().getStatusCode()==200) {
            String str = EntityUtils.toString(response.getEntity());

            JSONObject jsonObject1 = new JSONObject(str);

            if(jsonObject1.getInt("status")==200) {
                System.out.println("group shared");
                assertThat = true;
                return true;
            }
        }
        System.out.println("failed to share group");
        assertThat = true;
        return false;
   }

   private boolean getOrganisations() throws IOException, InterruptedException {

       Thread.sleep(1000);

        HttpGet httpGet = new HttpGet(getOrgPath);
        httpGet.setHeader("Authorization","bearer "+tokens.get(0));

        HttpClient client = new DefaultHttpClient();

        HttpResponse response = client.execute(httpGet);
       Thread.sleep(1000);

        if(response.getStatusLine().getStatusCode()==200) {
            String json = EntityUtils.toString(response.getEntity());

            JSONArray jsonArray = new JSONObject(json).getJSONArray("list");

            if(jsonArray.length()>0) {
                assertThat = true;
                return true;
            }
        }

        System.out.println("error in getting organisations");
        assertThat = false;
      return false;
   }

   private boolean getOrgFromOrgId() throws IOException, InterruptedException {

       Thread.sleep(1000);

        getOrgFromOrgIdPath = getOrgFromOrgIdPath + "TEST001_1517225544574";
       HttpGet httpGet = new HttpGet(getOrgFromOrgIdPath);
       httpGet.setHeader("Authorization","bearer "+tokens.get(0));

       HttpClient client = new DefaultHttpClient();

       HttpResponse response = client.execute(httpGet);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String json = EntityUtils.toString(response.getEntity());
           JSONObject jsonObject = new JSONObject(json);

           if(jsonObject.getInt("status")==200) {
               assertThat = true;
               return true;
           }
       }
       System.out.println("failed to get organisation from orgId");
       assertThat = false;
       return false;
   }

   private boolean getOrgDetails() throws IOException, InterruptedException {

       Thread.sleep(1000);

       HttpPost httpPost = new HttpPost(orgDetailPath);
       httpPost.setHeader("Authorization","bearer "+tokens.get(0));

       List<String> list = Collections.singletonList(orgId_1);
       JSONObject jsonObject = new JSONObject();
       jsonObject.put("orgIdList",list);

       StringEntity entity = new StringEntity(jsonObject.toString());
       httpPost.setEntity(entity);

       HttpClient client = new DefaultHttpClient();

       HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String json = EntityUtils.toString(response.getEntity());
           System.out.println(json);
           JSONObject jsonObject1 = new JSONObject(json);

           if(jsonObject1.has("list")) {
              JSONArray jsonArray = jsonObject1.getJSONArray("list");
              if(jsonArray.length()>0) {
                  System.out.println("get detail");
                  assertThat = true;
                  return true;
              }
           }
       }

       System.out.println("failed to get details of organisation");
       assertThat = false;
       return false;
   }

   private boolean getGroups() throws IOException, InterruptedException {

       Thread.sleep(1000);

       HttpGet httpGet = new HttpGet(getGroupPath);
       httpGet.setHeader("Authorization","bearer "+tokens.get(0));

       HttpClient client = new DefaultHttpClient();

       HttpResponse response = client.execute(httpGet);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String json = EntityUtils.toString(response.getEntity());

           JSONObject jsonObject = new JSONObject(json);

           if( jsonObject.has("list")) {
               System.out.println("get group");
               assertThat = true;
               return true;
           }
       }

       System.out.println("failed to get groups of a organisation");
       assertThat = false;
       return false;
   }


   private boolean createVehicle() throws IOException, InterruptedException {

       Thread.sleep(1000);

       JSONObject jsonObject = new JSONObject();
       jsonObject.put("vehicleRegistrationNumber","HR_"+timeStamp);
       jsonObject.put("vtsDeviceId",imei+"_"+timeStamp);
       jsonObject.put("vehicleModel","LPT 1109 7.5MT");
       jsonObject.put("vehicleMake","LPT 1109 7.5MT");
       jsonObject.put("vehicleType","LPT 1109 7.5MT");

       HttpClient client = new DefaultHttpClient();

       HttpPost httpPost = new HttpPost(createVehiclePath);
       httpPost.setHeader("Content-Type","application/json");
       httpPost.setHeader("Authorization","Bearer "+tokens.get(0));

       StringEntity entity = new StringEntity(jsonObject.toString());

       httpPost.setEntity(entity);

       HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String json = EntityUtils.toString(response.getEntity());

           JSONObject jsonObject1 = new JSONObject(json);

           if(jsonObject1.has("status")) {
               System.out.println("create vehicle");
               vehicleId = jsonObject1.getString("vehicleId");
               assertThat = true;
           }
       }
       System.out.println("failed to create vehicle");
       assertThat = false;
       return false;
   }

   private boolean addVehicle() throws IOException, InterruptedException {

       Thread.sleep(1000);

       JSONObject jsonObject = new JSONObject();
       jsonObject.put("groupId",groupId);
       jsonObject.put("vehicleList",Collections.singletonList(vehicleId));

       HttpClient client = new DefaultHttpClient();

       HttpPost httpPost = new HttpPost(addGroupPath);
       httpPost.setHeader("Authorization","bearer "+tokens.get(0));
       httpPost.setHeader("Content-Type","application/json");

       StringEntity entity = new StringEntity(jsonObject.toString());

       httpPost.setEntity(entity);

       HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           System.out.println("add vehicle");
           String json = EntityUtils.toString(response.getEntity());

           if(new JSONObject(json).getInt("status")==200) {
               assertThat = true;
               return true;
           }
       }

       System.out.println("failed to add vehicle in a group");
       assertThat = false;
       return false;
   }

   private boolean switchOrg(String orgId) throws IOException, InterruptedException {
       Thread.sleep(1000);

       HttpGet httpGet = new HttpGet(switchOrg + orgId);

       httpGet.setHeader("Authorization","bearer "+token);
       httpGet.setHeader("Content-Type","application/json");

       HttpClient client = new DefaultHttpClient();

       HttpResponse response = client.execute(httpGet);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String json = EntityUtils.toString(response.getEntity());

           JSONObject jsonObject = new JSONObject(json);

           if(jsonObject.getInt("status")==200) {
               System.out.println("switch org");
              tokens.add(jsonObject.getString("token"));
               assertThat = true;
               return true;
           }
       }

       System.out.println("failed to switch organisation");
       assertThat = false;
       return false;
   }

   private boolean getVehicleListOfSwitchedOrg() throws InterruptedException, IOException {
       Thread.sleep(1000);


       HttpGet httpGet = new HttpGet(vehicleOfSwitchOrg);

       httpGet.setHeader("Authorization","bearer "+tokens.get(1));

       HttpClient client = new DefaultHttpClient();

       HttpResponse response = client.execute(httpGet);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
       String json = EntityUtils.toString(response.getEntity());

       JSONArray array = new JSONArray(json);

       if(array.length()==1) {
           assertThat = true;
           System.out.println("vehicle list");

           return true;
         }
       }

       System.out.println("failed to get dashboard vehicle in switched org");
       assertThat = false;
       return false;
   }

   private boolean deleteOrg() throws IOException, InterruptedException {
       Thread.sleep(1000);
       JSONObject json = new JSONObject();
       json.put("uuid",orgId_2);

       HttpClient client = new DefaultHttpClient();
       HttpPost httpPost = new HttpPost(deleteOrgPath);

       httpPost.setHeader("Content-Type","application/json");
       httpPost.setHeader("Authorization","bearer "+tokens.get(1));
       httpPost.setEntity(new StringEntity(json.toString()));

       HttpResponse response = client.execute(httpPost);

       if(response.getStatusLine().getStatusCode()==200) {
           String str = EntityUtils.toString(response.getEntity());

           JSONObject jsonObject = new JSONObject(str);

           if(jsonObject.getInt("status")==200)     {
               if(jsonObject.has("organisation.deleted"))  {
                   System.out.println("organisation deleted");
                   assertThat = true;
                   return true;
               }
           } else {
               System.out.println("organisation delete failed failed");
               assertThat = false;
           }
       }
       return false;
   }

   private boolean updateOrg() throws IOException, InterruptedException {
       Thread.sleep(1000);
       JSONObject json = new JSONObject();
       json.put("uuid",orgId_2);
       json.put("organisationName","updatedName_"+timeStamp);
       HttpClient client = new DefaultHttpClient();
       HttpPost httpPost = new HttpPost(updateOrgpath);

       httpPost.setHeader("Content-Type","application/json");
       httpPost.setHeader("Authorization","bearer "+tokens.get(1));
       httpPost.setEntity(new StringEntity(json.toString()));

       HttpResponse response = client.execute(httpPost);

       if(response.getStatusLine().getStatusCode()==200) {
           String str = EntityUtils.toString(response.getEntity());

           JSONObject jsonObject = new JSONObject(str);

           if(jsonObject.getInt("status")==200)     {
                  System.out.println("organisation updated");
                   assertThat = true;
                   return true;
               }
            else {
               System.out.println("organisation deletion failed");
               assertThat = false;
           }
       }
       return false;
   }

   public boolean getOrgFromUuid() throws InterruptedException, IOException {
       Thread.sleep(1000);

       HttpPost httpPost = new HttpPost(getOrgFromUuid);
       httpPost.setHeader("Authorization","bearer "+token);

       List<String> list = Collections.singletonList("5ed91e89-b991-4fa8-a4eb-f9b34c698188");
       JSONObject jsonObject = new JSONObject();
       jsonObject.put("orgIdList",list);

       StringEntity entity = new StringEntity(jsonObject.toString());
       httpPost.setEntity(entity);

       HttpClient client = new DefaultHttpClient();

       HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String json = EntityUtils.toString(response.getEntity());
           System.out.println(json);
           JSONObject jsonObject1 = new JSONObject(json);

           if(jsonObject1.has("list")) {
               JSONArray jsonArray = jsonObject1.getJSONArray("list");
               if(jsonArray.length()>0) {
                   assertThat = true;
                   return true;
               }
           }
       }

       System.out.println("failed to get details of organisation");
       assertThat = false;
       return false;
   }

   public boolean deleteGroup() throws InterruptedException, IOException {
       Thread.sleep(1000);

       JSONObject jsonObject = new JSONObject();
       jsonObject.put("uuid",groupId);


       HttpPost httpPost = new HttpPost(deleteGroupPath);
       httpPost.setHeader("Authorization","bearer "+tokens.get(0));

       HttpClient client = new DefaultHttpClient();

       StringEntity entity = new StringEntity(jsonObject.toString());

       httpPost.setHeader("Content-Type","application/json");
       httpPost.setEntity(entity);

       HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String str = EntityUtils.toString(response.getEntity());

           JSONObject jsonObject1 = new JSONObject(str);

           if(jsonObject1.getInt("status")==200) {
              System.out.println("group deleted");

               assertThat = true;
               return true;
           }
       }

       System.out.println("failed to delete group");
       assertThat = false;
       return false;
   }


   public boolean removeSharedGroup() throws IOException, InterruptedException {
       Thread.sleep(1000);

       JSONObject jsonObject = new JSONObject();
       jsonObject.put("orgId",orgId_2);
       jsonObject.put("groupId",groupId);


       HttpPost httpPost = new HttpPost(removeSharedGroupPath);
       httpPost.setHeader("Authorization","bearer "+tokens.get(0));

       HttpClient client = new DefaultHttpClient();

       StringEntity entity = new StringEntity(jsonObject.toString());

       httpPost.setHeader("Content-Type","application/json");
       httpPost.setEntity(entity);

       HttpResponse response = client.execute(httpPost);
       Thread.sleep(1000);

       if(response.getStatusLine().getStatusCode()==200) {
           String str = EntityUtils.toString(response.getEntity());

           JSONObject jsonObject1 = new JSONObject(str);

           if(jsonObject1.getInt("status")==200) {
               System.out.println("group removed");

               assertThat = true;
               return true;
           }
       }

       System.out.println("failed to remove group");
       assertThat = false;
       return false;
   }
}
