package com.fretron;

import com.fretron.Constant.Constants;
import com.fretron.Logger.Log;
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
            if (checkIfTokenExist(token)) {
                return getFromToken(token, "orgId");
            } else {
                Log.debug("TOKEN NOT FOUND IN REDIS -- " + token);
                return null;
            }

        } catch (Exception e) {
            Log.error(e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    public static String getEmailFromToken(String token) {
        try {

            if (checkIfTokenExist(token)) {
                return getFromToken(token, "email");
            } else {
                Log.debug("TOKEN NOT FOUND IN REDIS -- " + token);
                return null;
            }

        } catch (Exception e) {
            Log.error(e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    public static boolean checkIfTokenExist(String token) {
        RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));

        if (serverManager.isConnected()) {
            if (serverManager.tokenExist(token)) {
                return true;
            } else {
                Log.warning("REDIS CONNECTED BUT TOKEN NOT FOUND -- " + token);
                System.out.println();
            }
        } else {
            Log.warning("REDIS  NOT  CONNECTED WHILE CHECKING FOR TOKEN -- " + token);
            System.out.println();
        }
        return false;
    }

    public static String getUserIdForToken(String token) {

        RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));
        if (serverManager.isConnected()) {
            String userID = serverManager.getValueForKey(token);
            if (userID == null) {
                Log.debug("TOKEN NOT FOUND IN REDIS -- " + token);

            } else {
                Log.info("USER ID FOUND IN REDIS");
            }
            return userID;
        } else {
            Log.warning("REDIS  NOT  CONNECTED WHILE GETTING USER ID FROM TOKEN -- " + token);
            return getFromToken(token, "userId");
        }
    }

    public static String getUserIdForTokenV2(String token) {
        RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));
        if (serverManager.isConnected()) {
            String userID = serverManager.getValueForKey(token);
            if (userID == null) {
                Log.debug("TOKEN NOT FOUND IN REDIS -- " + token);
            } else {
                Log.info("USER ID FOUND IN REDIS ");
            }
            return userID;
        } else {
            Log.warning("REDIS  NOT  CONNECTED WHILE GETTING USER ID FROM TOKEN -- " + token);
            return getFromToken(token, "userId");
        }
    }

    public static void makeHttpCallToUserManager(String token, String userId) throws Exception {
        if (userId == null) {
            userId = getFromToken(token, "userId");
        }
        CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
        client.start();
        HttpGet request = new HttpGet(Context.getProp(Constants.USER_MANAGER_SERVICE_URL) + "/user/session?token=" + token + "&userId=" + userId);
//        HttpGet request = new HttpGet("http://192.168.0.93:8099"+"/user/session?token="+token+"&userId="+userId);

        try {
            client.execute(request, new FutureCallback<HttpResponse>() {
                @Override
                public void completed(HttpResponse result) {
                    Log.info("Completed saving token --API FOR SESSION");
                }

                @Override
                public void failed(Exception ex) {
                    Log.warning("Failed saving token --API FOR SESSION");
                }

                @Override
                public void cancelled() {
                    Log.warning("cancelled --API FOR SESSION");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    private static void saveToRedis(String key, String value) {

        RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));
        serverManager.saveInfo(key, value);
    }

}
