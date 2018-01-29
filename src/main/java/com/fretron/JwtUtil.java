package com.fretron;

import com.fretron.Constant.Constants;
import io.jsonwebtoken.*;

/**
 * Created by PalodRohit on 11/21/2017.
 */
public class JwtUtil {

    public static String getFromToken(String token , String valueToGet){
        try {

            // todo check  if token exist or not

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
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return  null;
    }

    public static Boolean checkIfGod(String token ){
        try {

            // todo check  if token exist or not

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
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return  null;
    }

    public static String getOrgIdFromToken(String token){
        try {

            // todo check  if token exist or not

            Claims claims = Jwts.parser()
                    .setSigningKey("abcabcabcabc")
                    .parseClaimsJws(token).getBody();

            return (String) claims.get("orgId");

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
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return  null;
    }
    public static String getEmailFromToken(String token){
        try {

            // todo check  if token exist or not

            Claims claims = Jwts.parser()
                    .setSigningKey("abcabcabcabc")
                    .parseClaimsJws(token).getBody();

            return (String) claims.get("email");

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
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return  null;
    }

    public static String getUserIdForToken(String token) {

//            return getFromToken(token,"userId");
        RedisServerManager serverManager=null;

             serverManager = new RedisServerManager(Context.getProp(Constants.REDIS_SERVER_IP));

        if(serverManager.isConnected()){
            String userID =    serverManager.getValueForKey(token);
            if(userID == null){
                System.out.println("redis connected but -- token not found --  null user id ,, will return user id by manually verifying");
            }
            return getFromToken(token,"userId");
        }else {
            System.out.println("redis not connected -- verifying token manually");
            return  getFromToken(token , "userId");
        }

    }
}
