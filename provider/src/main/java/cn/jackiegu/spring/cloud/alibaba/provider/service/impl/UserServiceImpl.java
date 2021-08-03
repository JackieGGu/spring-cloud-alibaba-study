package cn.jackiegu.spring.cloud.alibaba.provider.service.impl;

import cn.jackiegu.spring.cloud.alibaba.provider.dao.UserDao;
import cn.jackiegu.spring.cloud.alibaba.provider.model.UserEntity;
import cn.jackiegu.spring.cloud.alibaba.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity get(Long id) {
        return userDao.findById(id);
    }
}
