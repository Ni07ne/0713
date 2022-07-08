package com.nine.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nine.entity.User;
import com.nine.mapper.UserMapper;
import com.nine.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: nine
 * @version: 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
