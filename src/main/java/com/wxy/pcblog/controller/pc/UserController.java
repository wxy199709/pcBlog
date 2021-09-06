package com.wxy.pcblog.controller.pc;


import com.wxy.pcblog.config.filter.AuthFilter;
import com.wxy.pcblog.dto.user.UserDto;
import com.wxy.pcblog.dto.user.loginDto;
import com.wxy.pcblog.service.IUserService;
import com.wxy.pcblog.vo.Result;
import com.wxy.pcblog.vo.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wuxueyong
 * @since 2021-08-30
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
@Slf4j
public class UserController {
   @Autowired
   private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "用户登录")
    public Result login(@RequestBody loginDto user) {
        return userService.login(user);
    }


    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "用户注册")
    public Result register(@RequestBody UserDto request){
        return userService.register(request);
    }

}
