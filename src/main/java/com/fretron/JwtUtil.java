package com.fretron;

import com.fretron.Constant.Constants;
import io.jsonwebtoken.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by PalodRohit on 11/21/2017.
 */
public class JwtUtil {

//    public static RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));

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
                    return null;
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
                    return null;
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
            RedisServerManager  serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));
            if (serverManager.isConnected()) {
                String userID = serverManager.getValueForKey(token);
                if (userID == null) {
                    Logger.getGlobal().log(Level.WARNING, "REDIS CONNECTED BUT TOKEN NOT FOUND -- " + token);
                    System.out.println();
                } else {
                    System.out.println("USER ID FOUND IN REDIS");
                }
                return userID;
            } else {
                Logger.getGlobal().log(Level.WARNING, "REDIS  NOT  CONNECTED WHILE GETTING USER ID FROM TOKEN -- " + token);
                System.out.println();
                return null;
            }
        }
    }

    public static String getUserIdForTokenV2(String token) {
        RedisServerManager serverManager = RedisServerManager.getInstance(Context.getProp(Constants.REDIS_SERVER_IP));
        if (serverManager.isConnected()) {
            String userID = serverManager.getValueForKey(token);
            if (userID == null) {
                Logger.getGlobal().log(Level.WARNING, "REDIS CONNECTED BUT TOKEN NOT FOUND -- " + token);
                System.out.println();
            } else {
                System.out.println("USER ID FOUND IN REDIS ");
            }
            return userID;
        } else {
            Logger.getGlobal().log(Level.WARNING, "REDIS  NOT  CONNECTED WHILE GETTING USER ID FROM TOKEN -- " + token);
            System.out.println();
            return null;
        }
    }

}
