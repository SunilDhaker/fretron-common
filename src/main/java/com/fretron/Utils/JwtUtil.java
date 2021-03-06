package com.fretron.Utils;

import io.jsonwebtoken.*;

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
    return getFromToken(token, "orgId");
  }

  public static String getEmailFromToken(String token) {
    return getFromToken(token, "email");
  }

  public static String getUserIdForToken(String token) {

    return getFromToken(token, "userId");
  }

  public static Boolean isValid(String token) {
    return getFromToken(token, "userId") != null;
  }

  public static Boolean checkIfAgent(String token) {
    try {

      Claims claims = Jwts.parser()
              .setSigningKey("abcabcabcabc")
              .parseClaimsJws(token).getBody();

      Object isAgent =   claims.get("isAgent");
      if(isAgent == null){
        return false;
      }
      else{
        return (Boolean) isAgent;
      }
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

    return false;
  }

}
