package com.vebinar.dao;

import com.vebinar.entyty.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    User getByID(int id);

    void delete(int id);

    void update(User user);

    List<User> findAll();
}
