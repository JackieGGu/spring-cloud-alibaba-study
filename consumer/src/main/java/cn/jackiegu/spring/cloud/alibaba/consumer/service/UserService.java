package cn.jackiegu.spring.cloud.alibaba.consumer.service;

import cn.jackiegu.spring.cloud.alibaba.consumer.model.UserEntity;

public interface UserService {

    UserEntity get(Long id);
}
