package com.vebinar.service;

import com.vebinar.entyty.User;

import java.util.List;

public interface UserServices {
    void save(User user);

    User getByID(int id);

    void delete(int id);

    void update(User user);

    List<User> findAll();
}
