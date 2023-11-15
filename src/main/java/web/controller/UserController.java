package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Controller
public class UserController {
    public UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping("/user")
    public String getUsers() {
        System.out.println("hello");
        userDAO.addUsers();
        User u = userDAO.getUser();
        List<User> us = userDAO.getAllUsers();
        return "users";
    }
}
