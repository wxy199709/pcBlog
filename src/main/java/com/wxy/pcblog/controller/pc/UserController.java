package com.wxy.pcblog.controller.pc;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wuxueyong
 * @since 2021-08-30
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ApiOperation(value = "测试")
    public String test(){
        return "hello" ;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "用户登录")
    public String login(){
        return "hello" ;
    }

}
