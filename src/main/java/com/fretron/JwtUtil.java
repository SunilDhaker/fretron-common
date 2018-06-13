package com.fretron;

import com.fretron.Constant.Constants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by PalodRohit on 11/21/2017.
 */
public class JwtUtil {


    public static String getFromToken(String token, String valueToGet) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey("abcabcabcabc")
                    .parseClaimsJws(token).getBody();

            return (String) claims.get(valueToGet);

        } catch (ExpiredJwtException e) {
            e.printStackTrace();
        } catch (UnsupportedJwtException e) {
            e.printStackTrace();
        } catch (MalformedJwtException e) {
            e.printStackTrace();
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Boolean checkIfGod(String token) {
        try {

            Claims claims = Jwts.parser()
                    .setSigningKey("abcabcabcabc")
                    .parseClaimsJws(token).getBody();

            return (Boolean) claims.get("isGod");

        } catch (ExpiredJwtException e) {
            e.printStackTrace();
        } catch (UnsupportedJwtException e) {
            e.printStackTrace();
        } catch (MalformedJwtException e) {
            e.printStackTrace();
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getOrgIdFromToken(String token) {
        try {
            if (checkIfGod(token)) {
                return getFromToken(token, "orgId");
            }
            else {
                if (checkIfTokenExist(token)) {
                    return getFromToken(token, "orgId");
                }
                else {
                    String userID = getFromToken(token, "userId");
                    try {
                        makeHttpCallToUserManager(token,userID);
                        saveToRedis(token,userID);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return getFromToken(token, "orgId");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getEmailFromToken(String token) {
        try {
            if (checkIfGod(token)) {
                return getFromToken(token, "email");
            }
            else {
                if (checkIfTokenExist(token)) {
                    return getFromToken(token, "email");
                }
                else {
                    String userID = getFromToken(token, "userId");
                    try {
                        makeHttpCallToUserManager(token,userID);
                        saveToRedis(token,userID);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return getFromToken(token, "email");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static boolean checkIfTokenExist(String token){
         RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));

        if (serverManager.isConnected()) {
            if(serverManager.tokenExist(token)){
                return true;
            }
            else{
                Logger.getGlobal().log(Level.WARNING, "REDIS CONNECTED BUT TOKEN NOT FOUND -- " + token);
                System.out.println();
            }
        } else {
            Logger.getGlobal().log(Level.WARNING, "REDIS  NOT  CONNECTED WHILE CHECKING FOR TOKEN -- " + token);
            System.out.println();
        }
        return false;
    }

    public static String getUserIdForToken(String token) {

        if (checkIfGod(token)) {
            return getFromToken(token, "userId");
        } else {
            RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));
            if (serverManager.isConnected()) {
                String userID = serverManager.getValueForKey(token);
                if (userID == null) {
                    userID = getFromToken(token, "userId");
                    try {
                        makeHttpCallToUserManager(token,userID);
                        saveToRedis(token,userID);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Logger.getGlobal().log(Level.WARNING, "REDIS CONNECTED BUT TOKEN NOT FOUND -- " + token);
                    return getFromToken(token, "userId");
                } else {
                    System.out.println("USER ID FOUND IN REDIS");
                }
                return userID;
            } else {
                Logger.getGlobal().log(Level.WARNING, "REDIS  NOT  CONNECTED WHILE GETTING USER ID FROM TOKEN -- " + token);
                System.out.println();
                return getFromToken(token, "userId");
            }
        }
    }

    public static String getUserIdForTokenV2(String token) {
        RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));
        if (serverManager.isConnected()) {
            String userID = serverManager.getValueForKey(token);
            if (userID == null) {
                userID = getFromToken(token, "userId");
                try {
                    makeHttpCallToUserManager(token,userID);
                    saveToRedis(token,userID);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Logger.getGlobal().log(Level.WARNING, "REDIS CONNECTED BUT TOKEN NOT FOUND -- " + token);
            } else {
                System.out.println("USER ID FOUND IN REDIS ");
            }
            return userID;
        } else {
            Logger.getGlobal().log(Level.WARNING, "REDIS  NOT  CONNECTED WHILE GETTING USER ID FROM TOKEN -- " + token);
            System.out.println();
            return getFromToken(token, "userId");
        }
    }

    public static  void makeHttpCallToUserManager(String token , String userId) throws Exception{
        if(userId == null){
            userId = getFromToken(token, "userId");
        }
        CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
        client.start();
        HttpGet request = new HttpGet("http://192.168.0.153/integrations/all/jobByJobIdStore");

        try {
            client.execute(request, new FutureCallback<HttpResponse>() {
                @Override
                public void completed(HttpResponse result) {
                    System.out.println("Completed saving token --API");
                }

                @Override
                public void failed(Exception ex) {
                    System.out.println("Failed saving token --API");
                }

                @Override
                public void cancelled() {
                    System.out.println("cancelled --API");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }

        System.out.println("ok");
    }

    private static void saveToRedis(String key, String value){

        RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));
        serverManager.saveInfo(key,value);
    }

}
