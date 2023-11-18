package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public User getUserById(Long userId) {
        return entityManager.find(User.class, userId);
    }

    @Override
    public void deleteUserById(Long userId) {
        entityManager.remove(entityManager.find(User.class, userId));
    }

    @Override
    public void saveUser(User u) {
        entityManager.merge(u);
    }


    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }
}
