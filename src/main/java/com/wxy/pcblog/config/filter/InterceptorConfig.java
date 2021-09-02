package com.wxy.pcblog.config.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: wuxueyong
 * @Description:
 * @date: 2021/9/1 16:49
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    public AuthFilterConfig getAuthFilter(){
        return new AuthFilterConfig();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] excludePathPatterns = { "/swagger-ui..html/**","/swagger-resources/**","/webjars/**","/v2/**"};

        registry.addInterceptor(getAuthFilter())
                .addPathPatterns("/**")
                .excludePathPatterns(excludePathPatterns)
                .excludePathPatterns(
                        "/**/*.js",
                        "/**/*.css",
                        "/**/*.html"
                );

    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }



}
