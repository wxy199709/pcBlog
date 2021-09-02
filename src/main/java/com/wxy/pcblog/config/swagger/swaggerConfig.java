package com.wxy.pcblog.config.swagger;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: wuxueyong
 * @Description:
 * @date: 2021/8/30 15:59
 */
@Component
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class swaggerConfig {
    private ApiInfo ApiInfo(){
        return new ApiInfoBuilder()
                .title("易知博客Api")
                .version("1.0")
                .build();
    }


    @Bean(value = "pcApi")
    public Docket pcApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(ApiInfo())
                .groupName("pc-API")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wxy.pcblog.controller.pc"))
                .paths(PathSelectors.any())
                .build();
    }


    @Bean(value = "wechatApi")
    public Docket wechatApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(ApiInfo())
                .groupName("wechat-API")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wxy.pcblog.controller.weChat"))
                .paths(PathSelectors.any())
                .build();
    }
}
