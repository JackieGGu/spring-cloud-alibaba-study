package cn.jackiegu.spring.cloud.alibaba.provider.service.impl;

import cn.jackiegu.spring.cloud.alibaba.provider.dao.UserDao;
import cn.jackiegu.spring.cloud.alibaba.provider.model.UserEntity;
import cn.jackiegu.spring.cloud.alibaba.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class UserServiceImpl implements UserService {

    @Value("${user.sex}")
    private String userSex;

    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity get(Long id) {
        UserEntity user = userDao.findById(id);
        user.setName(user.getName() + ":" + userSex);
        return user;
    }
}
