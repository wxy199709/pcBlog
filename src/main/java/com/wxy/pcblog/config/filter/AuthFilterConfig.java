package com.wxy.pcblog.config.filter;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.api.R;
import com.wxy.pcblog.vo.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author: wuxueyong
 * @Description:接口拦截配置
 * @date: 2021/9/1 15:26
 */

@Slf4j
@Component
public class AuthFilterConfig implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //将带有注解的方法进行拦截
        if (handler instanceof HandlerMethod){
            HandlerMethod method= (HandlerMethod) handler;
            AuthFilter authFilter = method.getMethodAnnotation(AuthFilter.class);

            //判断是否存在注解
            if (authFilter!=null){
                log.info("存在注解，拦截接口，进行校验");
                return doFilter(request,response);
            }else return true;
        }
        return false;
    }

    private boolean doFilter(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        String token=null;
        //获取token
        try{
            token = request.getHeader("eblog-token");
        }catch (Exception e){
            e.printStackTrace();
        }
        if (StringUtils.isNotBlank(token)){
            //获取redis的token的key

            //获取token的key对应的value

            //如果存在，刷新token的有效期


            //不存在提示消息，不允许访问



        }
        return false;
    }




}
