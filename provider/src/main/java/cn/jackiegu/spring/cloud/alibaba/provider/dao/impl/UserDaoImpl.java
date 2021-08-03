package cn.jackiegu.spring.cloud.alibaba.provider.dao.impl;

import cn.jackiegu.spring.cloud.alibaba.provider.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


}
