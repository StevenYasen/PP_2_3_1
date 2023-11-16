package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long userId);
    void deleteUserById(Long userId);
    void saveUser(User user);
}
