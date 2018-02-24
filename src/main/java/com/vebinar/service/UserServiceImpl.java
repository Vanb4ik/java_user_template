package com.vebinar.service;

import com.vebinar.dao.UserDao;
import com.vebinar.entyty.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("userServices")
@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    public UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
