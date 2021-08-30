package com.wxy.pcblog.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.wxy.pcblog.entity.User;
import com.wxy.pcblog.mapper.UserMapper;
import com.wxy.pcblog.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wuxueyong
 * @since 2021-08-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
