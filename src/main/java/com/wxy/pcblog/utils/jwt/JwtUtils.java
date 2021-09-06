package com.wxy.pcblog.utils.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.wxy.pcblog.entity.User;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * @author: wuxueyong
 * @Description:
 * @date: 2021/9/6 8:45
 */
@Component
public class JwtUtils {
    //jwt的私钥
    private static final String jwtSecret = "ads1afuygiqwudnkjand432kab1!jjsadk";


    /*
     *token创建
     * @param: user
     * @return * @return java.lang.String
     * @date 2021/9/6
     */
    public static String createToken(Optional<User> user) {
        return JWT.create().withClaim("id", user.get().getId())
                .withClaim("name", user.get().getNickname())
                .sign(Algorithm.HMAC256(jwtSecret));
    }
    
    /*
    *解析token
    * @param: null 
     * @return * @return null
     * @date 2021/9/6 2021/9/6
    */
    public static DecodedJWT verify(String token){
        return JWT.require(Algorithm.HMAC256(jwtSecret)).build().verify(token);
    }


}
