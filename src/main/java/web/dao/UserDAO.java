package web.dao;

import web.model.User;

import java.util.List;


public interface UserDAO {
    void addUsers();
    User getUser();
    List<User> getAllUsers();
}
