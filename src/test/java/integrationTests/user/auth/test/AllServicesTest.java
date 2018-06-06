package integrationTests.user.auth.test;

import com.fretron.JwtUtil;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AllServicesTest {
    private static final String BASE_IP_USER="http://192.168.0.153/user";
    private static final String BASE_IP_ORGANISATION="http://192.168.0.153/organisation";
    private static String LOGIN_URL=BASE_IP_USER+"/login/forany";
    private static String SEND_OTP_URL=BASE_IP_USER+"/sendotp/forany";
    private static String TOKEN_VAL_URL=BASE_IP_USER+"/authorize";
    private static String AUTH_URL=BASE_IP_USER+"/authentication";
    private static String GET_USER_URL=BASE_IP_USER+"/getUser";
    private static String CREATE_USER_URL=BASE_IP_USER+"/create";
    private static String ORGANISATION_LIST_URL=BASE_IP_ORGANISATION+"/organisations";
    private static String ORGANISATION_CREATE_URL=BASE_IP_ORGANISATION+"/create";
    private static String SWITCH_ORG_URL=BASE_IP_USER+"/switchorg?orgId=";

    private static String mobileNummber="9776217769";
    private static boolean flag=false;
    private static String email;
    private static long timeStamp;

    DefaultHttpClient httpClient;
    @Before
    public void setUp() {
        timeStamp=System.currentTimeMillis();
        email="test"+timeStamp+"@gmail.com";
        httpClient = new DefaultHttpClient();
    }
    @Test
    public boolean allServicesTest() {
        loginTest(mobileNummber);
        Assert.assertTrue(flag);
        return flag;
    }
    private void loginTest(String mobNo){
        httpClient = new DefaultHttpClient();
         JSONObject reqObj = new JSONObject();
         HttpPost post = new HttpPost(LOGIN_URL);
         try {
             reqObj.put("loginType", "fretron");
             reqObj.put("mobileNumber",mobNo);
             String s=reqObj.toString();
             post.setHeader("Content-Type", "application/json");
             post.setEntity(new StringEntity(s));
             HttpResponse response =  httpClient.execute(post);
             if(response.getStatusLine().getStatusCode()==200 ){
                 HttpEntity entity   = response.getEntity();
                 if(entity!=null) {
                     String responseString = EntityUtils.toString(entity);
                     System.out.println("Login success:");
                     System.out.println(responseString);
                     JSONObject jsonObject = new JSONObject(responseString);
                     String otp = null;
                     if (jsonObject.has("otp"))
                         otp = jsonObject.getString("otp");
                     if (jsonObject.has("userType")) {
                         if (jsonObject.getString("userType").equals("existing"))
                             otpValidationTest(mobNo, otp);
                         if (jsonObject.getString("userType").equals("new")){
                              sendOtpTest(mobNo);
                         }
                     }
                 }
             }
             else{
                 flag=false;
             }
         } catch (IOException e) {
             flag=false;
             e.printStackTrace();
         }
     }
    private void otpValidationTest( String mobNo,String otp){
        httpClient = new DefaultHttpClient();
        HttpGet get = new HttpGet(AUTH_URL+"?mobileNumber="+mobNo+"&otp="+otp);
        try {
            get.setHeader("Content-Type", "application/json");
            HttpResponse response =  httpClient.execute(get);
            if(response.getStatusLine().getStatusCode()==200 ){
                HttpEntity entity   = response.getEntity();
                if(entity!=null) {
                    String responseString = EntityUtils.toString(entity);
                    System.out.println("Validate OTP");
                    System.out.println(responseString);
                    JSONObject jsonObject = new JSONObject(responseString);
                    String token = null;
                    if (jsonObject.has("token")) {
                        token = jsonObject.getString("token");
                        boolean exist=tokenValidationTest(token);
                        if(exist) {
                            String userEmail = JwtUtil.getEmailFromToken(token);

                            getUserTest(userEmail, mobileNummber, token);
                        }
                        else{flag=false;}
                    }
                }
            }
            else{
                flag=false;
            }

        } catch (IOException e) {
            flag=false;
            e.printStackTrace();
        }
    }
    private boolean tokenValidationTest( String token){
        httpClient = new DefaultHttpClient();
        HttpGet get = new HttpGet(TOKEN_VAL_URL);
        try {
            get.setHeader("Content-Type", "application/json");
            get.setHeader("Authorization","Bearer "+token);
            HttpResponse response =  httpClient.execute(get);
            if(response.getStatusLine().getStatusCode()==200 ){
                System.out.println("Validate token");
                return  true;
            }
            else{
                return false;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    private void sendOtpTest( String mobNo){
        httpClient = new DefaultHttpClient();
        HttpGet get = new HttpGet(SEND_OTP_URL+"?mobileNumber="+mobNo+"&otpType=signup");
        try {
            get.setHeader("Content-Type", "application/json");
            HttpResponse response =  httpClient.execute(get);
            if(response.getStatusLine().getStatusCode()==200 ){
                HttpEntity entity   = response.getEntity();
                if(entity!=null) {
                    String responseString = EntityUtils.toString(entity);
                    System.out.println(responseString);
                    JSONObject jsonObject = new JSONObject(responseString);
                    String otp = null;
                    if (jsonObject.has("otp"))
                        otp= jsonObject.getString("otp");
                    createNewUserTest(mobNo,otp);
                }
            }
            else {
                flag=false;
            }
        } catch (IOException e) {
            flag=false;
            e.printStackTrace();
        }
    }
    private void createNewUserTest(String mobNo,String otp){
        httpClient = new DefaultHttpClient();
        JSONObject reqObj = new JSONObject();
        HttpPost post = new HttpPost(CREATE_USER_URL);
        try {
            reqObj.put("onBoardingType", "fretron");
            reqObj.put("mobileNumber",mobNo);
            reqObj.put("email",email);
            reqObj.put("otp",otp);
            reqObj.put("name","AKASH");
            reqObj.put("otpType","signup");
            String s=reqObj.toString();
            post.setHeader("Content-Type", "application/json");
            post.setEntity(new StringEntity(s));
            HttpResponse response =  httpClient.execute(post);
            if(response.getStatusLine().getStatusCode()==200 ){
                HttpEntity entity   = response.getEntity();
                if(entity!=null) {
                    String responseString = EntityUtils.toString(entity);
                    JSONObject jsonObject = new JSONObject(responseString);
                    System.out.println("create new user");
                    System.out.println(responseString);
                    String token = null;
                    if (jsonObject.has("token")) {
                        token = jsonObject.getString("token");
                        boolean exist=tokenValidationTest(token);
                        if(exist) {
                            String userEmail = JwtUtil.getEmailFromToken(token);

                            getUserTest(userEmail, mobileNummber, token);
                        }
                        else{flag=false;}
                    }
                }
            }
            else  {
                flag=false;
            }
        } catch (Exception e) {
            flag=false;
            e.printStackTrace();
        }

    }

    private void createNewOrg1Test(String token){
        httpClient = new DefaultHttpClient();
        JSONObject reqObj = new JSONObject();
        HttpPost post = new HttpPost(ORGANISATION_CREATE_URL);
        try {
            reqObj.put("orgId", "org_test1_"+timeStamp);
            reqObj.put("organisationName","ORG_FLEET1_"+timeStamp);
            reqObj.put("type","FLEET_OWNER");
            String s=reqObj.toString();
            post.setHeader("Content-Type", "application/json");
            post.setHeader("Authorization","Bearer "+token);
            post.setEntity(new StringEntity(s));
            HttpResponse response =  httpClient.execute(post);
            if(response.getStatusLine().getStatusCode()==200 ){
                HttpEntity entity   = response.getEntity();
                if(entity!=null) {
                    String responseString = EntityUtils.toString(entity);
                    JSONObject jsonObject = new JSONObject(responseString);
                    String orgId=null;
                    if (jsonObject.has("uuid"))
                        orgId = jsonObject.getString("uuid");
                    System.out.println("create new org1");
                    System.out.println(responseString);
                    createNewOrg2Test(token,orgId);
                }
            }
            else  {
                flag=false;
            }
        } catch (Exception e) {
            flag=false;
            e.printStackTrace();
        }

    }
    private void createNewOrg2Test(String token,String orgId){
        httpClient = new DefaultHttpClient();
        JSONObject reqObj = new JSONObject();
        HttpPost post = new HttpPost(ORGANISATION_CREATE_URL);
        try {
            reqObj.put("orgId", "org_test2_"+timeStamp);
            reqObj.put("organisationName","ORG_FLEET2_"+timeStamp);
            reqObj.put("type","FLEET_OWNER");
            String s=reqObj.toString();
            post.setHeader("Content-Type", "application/json");
            post.setHeader("Authorization","Bearer "+token);
            post.setEntity(new StringEntity(s));
            HttpResponse response =  httpClient.execute(post);
            if(response.getStatusLine().getStatusCode()==200 ){
                HttpEntity entity   = response.getEntity();
                if(entity!=null) {
                    String responseString = EntityUtils.toString(entity);
                    JSONObject jsonObject = new JSONObject(responseString);
                    System.out.println("create new org2");
                    System.out.println(responseString);
                    switchOrgTest(token,orgId);
                }
            }
            else  {
                flag=false;
            }
        } catch (Exception e) {
            flag=false;
            e.printStackTrace();
        }

    }
    private void switchOrgTest( String token,String orgId){
        httpClient = new DefaultHttpClient();
        HttpGet get = new HttpGet(SWITCH_ORG_URL+orgId);
        try {
            get.setHeader("Content-Type", "application/json");
            get.setHeader("Authorization","Bearer "+token);
            HttpResponse response =  httpClient.execute(get);
            if(response.getStatusLine().getStatusCode()==200 ){
                HttpEntity entity   = response.getEntity();
                if(entity!=null) {
                    String responseString = EntityUtils.toString(entity);
                    JSONObject jsonObject = new JSONObject(responseString);
                    String token2 = null;
                    if (jsonObject.has("token"))
                        token2 = jsonObject.getString("token");
                    System.out.println("switch org ");
                    System.out.println(responseString);
                    System.out.println(token);
                    System.out.println(token2);

                }
                flag=true;
            }
            else{
                flag=false;
            }

        } catch (IOException e) {
            flag=false;
            e.printStackTrace();
        }
    }



    private void getUserTest( String email,String mobNo,String token){
        httpClient = new DefaultHttpClient();
        HttpGet get = new HttpGet(GET_USER_URL+"?email="+email+"&mobileNumber="+mobNo);
        try {
            get.setHeader("Content-Type", "application/json");
            get.setHeader("Authorization","Bearer "+token);
            HttpResponse response =  httpClient.execute(get);
            if(response.getStatusLine().getStatusCode()==200 ) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseString = EntityUtils.toString(entity);
                    System.out.println("Login User Detail:");
                    System.out.println(responseString);
                    createNewOrg1Test(token);
                }
            }
            else{
                flag=false;
            }
        } catch (Exception e) {
            flag=false;
            e.printStackTrace();

        }
    }
}
