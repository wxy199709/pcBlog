package com.wxy.pcblog.controller.weChat;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wuxueyong
 * @Description:
 * @date: 2021/8/30 16:43
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试管理")
public class testController {

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    @ApiOperation(value = "测试")
    public String test(){
        return "hello" ;
    }
}
