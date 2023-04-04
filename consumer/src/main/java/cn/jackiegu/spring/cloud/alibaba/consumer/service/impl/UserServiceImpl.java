package cn.jackiegu.spring.cloud.alibaba.consumer.service.impl;

import cn.jackiegu.spring.cloud.alibaba.consumer.model.UserEntity;
import cn.jackiegu.spring.cloud.alibaba.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public UserEntity get(Long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("userId", id);
        return restTemplate.getForObject("http://provider/user?id={userId}", UserEntity.class, params);
    }
}
