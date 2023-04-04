package cn.jackiegu.spring.cloud.alibaba.provider.service;

import cn.jackiegu.spring.cloud.alibaba.provider.model.UserEntity;

public interface UserService {

    UserEntity get(Long id);
}
