//package com.fretron.Utils;
//
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//import java.util.Random;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//
///**
// * Created by PalodRohit on 11/14/2017.
// */
//public class SmsService {
//
//  public static void sendSms(String mobileNumber, String content)
//      throws UnsupportedEncodingException {
//
//    if (!mobileNumber.startsWith("+91")) {
//      mobileNumber = "+91" + mobileNumber;
//    }
//
//    String encoded = URLEncoder.encode(content, "UTF-8");
//    DefaultHttpClient httpClient = new DefaultHttpClient();
//    //todo change IP --> write in config
//    HttpGet get = new HttpGet(
//        "http://103.233.79.246/submitsms.jsp?user=FretronP&key=d9bd95a85bXX&mobile=" + mobileNumber
//            + "&message=" + encoded + "&senderid=FRTRON&accusage=1&unicode=1");
//    get.setHeader("Content-type", "application/json");
//
//    try {
//      HttpResponse response = httpClient.execute(get);
//      System.out.println(response.getEntity().toString());
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }
//
//  public static String getOtpWithLength(int lenth) {
//    String numbers = "0123456789";
//    // Using random method
//    Random rndm_method = new Random();
//    char[] otp = new char[lenth];
//    for (int i = 0; i < lenth; i++) {
//      otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
//    }
//    String generatedOtp = String.valueOf(otp);
//    return generatedOtp;
//  }
//}
