package cn.jackiegu.spring.cloud.alibaba.provider.dao.impl;

import cn.jackiegu.spring.cloud.alibaba.provider.dao.UserDao;
import cn.jackiegu.spring.cloud.alibaba.provider.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public UserEntity findById(Long id) {
        String sql = "SELECT * FROM spring_cloud_alibaba_user WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(UserEntity.class), id);
    }
}
