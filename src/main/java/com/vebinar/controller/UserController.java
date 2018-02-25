package com.vebinar.controller;

import com.vebinar.entyty.User;
import com.vebinar.service.UserServices;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller("userController")
@Controller
@RequestMapping("/")
public class UserController {


    @Autowired
    UserServices userServices;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userServices.findAll());
//        System.out.println(model);
        return "usersList";
    }

    @GetMapping("/user/{id}")
    public String getByID(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userServices.getByID(id));
        return "showUser";
    }

    @GetMapping("/addUser")
    public String createUserPage() {
        return "createUser";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        userServices.save(user);
        return "redirect:/users";
    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user) {
        userServices.update(user);
        return "redirect:/user/" + user.getId();
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userServices.getByID(id));
        return "editUser";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userServices.delete(id);
        return "redirect:/users";
    }
}
