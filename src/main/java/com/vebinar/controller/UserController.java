package com.vebinar.controller;

import com.vebinar.entyty.User;
import com.vebinar.mapper.UserMapper;
import com.vebinar.service.UserServices;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@Controller("userController")
@Controller
@RequestMapping("/")
public class UserController {


    @Autowired
    UserServices userServices;


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userServices.findAll());
        System.out.println(model);
        return "usersList";
    }
}
