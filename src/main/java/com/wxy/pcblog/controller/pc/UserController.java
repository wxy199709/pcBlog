package com.wxy.pcblog.controller.pc;


import com.wxy.pcblog.config.filter.AuthFilter;
import com.wxy.pcblog.vo.Result;
import com.wxy.pcblog.vo.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiOperation(value = "测试")
    @AuthFilter
    public String test() {
        log.info("测试");
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录")
    public Result login() {
        log.info("进入用户登录");
        if (stringRedisTemplate.opsForValue().get("redis") == null) {
            stringRedisTemplate.opsForValue().set("redis", "100", 60 * 10, TimeUnit.SECONDS);

        } else {
            String s = stringRedisTemplate.opsForValue().get("redis");
            System.out.println(s);
        }

        return ResultUtils.success();
    }

}
