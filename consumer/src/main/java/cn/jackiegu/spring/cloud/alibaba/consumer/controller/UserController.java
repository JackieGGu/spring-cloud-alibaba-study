package cn.jackiegu.spring.cloud.alibaba.consumer.controller;

import cn.jackiegu.spring.cloud.alibaba.consumer.model.UserEntity;
import cn.jackiegu.spring.cloud.alibaba.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public UserEntity get(Long id) {
        return userService.get(id);
    }
}
