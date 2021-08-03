package cn.jackiegu.spring.cloud.alibaba.provider.dao;

import cn.jackiegu.spring.cloud.alibaba.provider.model.UserEntity;

public interface UserDao {

    UserEntity findById(Long id);
}
