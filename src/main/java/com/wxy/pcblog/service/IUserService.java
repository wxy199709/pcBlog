package com.wxy.pcblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxy.pcblog.dto.user.UserDto;
import com.wxy.pcblog.dto.user.loginDto;
import com.wxy.pcblog.entity.User;
import com.wxy.pcblog.vo.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wuxueyong
 * @since 2021-08-30
 */
public interface IUserService extends IService<User> {

    Result login(loginDto user);

    Result register(UserDto request);
}
