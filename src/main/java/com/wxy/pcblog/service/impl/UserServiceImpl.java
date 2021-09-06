package com.wxy.pcblog.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.wxy.pcblog.constant.Constants;
import com.wxy.pcblog.dto.user.UserDto;
import com.wxy.pcblog.dto.user.loginDto;
import com.wxy.pcblog.entity.User;
import com.wxy.pcblog.mapper.UserMapper;
import com.wxy.pcblog.service.IUserService;
import com.wxy.pcblog.utils.jwt.JwtUtils;
import com.wxy.pcblog.vo.Result;
import com.wxy.pcblog.vo.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wuxueyong
 * @since 2021-08-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    @SuppressWarnings("all")
    private UserMapper userMapper;

    @Override
    public Result login(loginDto user) {
        try {
            Optional<User> loginUser = Optional.ofNullable(userMapper.selectOne(new LambdaQueryWrapper<>(User.class)
                    .eq(User::getUserCode, user.getUserCode())
                    .eq(User::getPassword, user.getPassword())));
            if (loginUser.isPresent()) {
                String token = JwtUtils.createToken(loginUser);
                stringRedisTemplate.opsForValue().set(Constants.EBLOG_TOKEN + loginUser.get().getId(), token);
                Map<String, Object> map = new HashMap<>();
                map.put("eblog-token", token);
                return ResultUtils.success(map);
            }


        } catch (Exception e) {
            e.printStackTrace();
            log.error("登录异常{}", e);
        }

        return ResultUtils.error("登录出现异常");
    }

    @Override
    public Result register(UserDto request) {
        try{

        }catch (Exception e){
            e.printStackTrace();
            log.error("注册异常",e);
        }
        return null;
    }
}
