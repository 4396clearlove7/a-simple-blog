package com.yeriri.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yeriri.entity.User;
import com.yeriri.mapper.UserMapper;
import com.yeriri.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author y_eriri
 * @since 2021-02-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
