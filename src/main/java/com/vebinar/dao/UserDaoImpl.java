package com.vebinar.dao;

import com.vebinar.entyty.User;
import com.vebinar.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;
//@Repository("userDao")
@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void save(User user) {
        String sql = "INSERT INTO user (name, age, email) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(),user.getAge(),user.getEmail());
    }

    public User getByID(int id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    public void delete(int id) {
        String sql = "DELETE FROM user WHERE  id = ?";
        jdbcTemplate.update(sql, id);
    }

    public void update(User user) {
        String sql = "UPDATE user SET name = ?, email = ?, age =? WHERE id = ?";
       jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }


}
