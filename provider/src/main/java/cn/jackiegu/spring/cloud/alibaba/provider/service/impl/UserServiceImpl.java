package cn.jackiegu.spring.cloud.alibaba.provider.service.impl;

import cn.jackiegu.spring.cloud.alibaba.provider.dao.UserDao;
import cn.jackiegu.spring.cloud.alibaba.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
}
