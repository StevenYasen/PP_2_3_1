package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
       return userDAO.getAllUsers();
    }

    @Transactional
    @Override
    public User getUserById(Long userId) {
       return userDAO.getUserById(userId);
    }

    @Transactional
    @Override
    public void deleteUserById(Long userId) {
        userDAO.deleteUserById(userId);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
}
