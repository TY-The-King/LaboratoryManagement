package com.theking.common.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
import java.util.Map;

/**
 * @author TheKing
 * @version 1.0
 * @className JwtUtil
 * @description JWT Token Utils
 * @date 2022/9/26 14:50
 */
@Slf4j
public class JwtUtil {

    //private key
    private static final String secret = "theking";

    //role
    private static final String issuer = "theking";

    public static String getToken(int id, String name) {
        return JWT.create()
                .withIssuer(issuer)
                .withClaim("userName", name)
                .sign(Algorithm.HMAC256(secret));
    }

    public static boolean verifierToken(String token) {
        try {
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(secret))
                    .withIssuer("auth0")
                    .build();
            DecodedJWT jwt = jwtVerifier.verify(token);
            return true;
        } catch (Exception e) {
            log.info("非法token");
            return false;
        }
    }

    public static Map<String, Claim> parseToken(String token) throws Exception {
        try {
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(secret))
                    .withIssuer(issuer)
                    .build();
            DecodedJWT jwt = jwtVerifier.verify(token);
            return jwt.getClaims();
        } catch (Exception e) {
            throw new Exception("");
        }
    }
}
