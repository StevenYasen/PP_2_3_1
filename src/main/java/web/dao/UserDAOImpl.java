package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void addUsers() {
        System.out.println("зашел в метод addUser()");
        entityManager.persist(new User("Igor", "Prokofiev", "ig@mail.ru"));
        entityManager.persist(new User("Vitya", "Malishev", "vm@mail.ru"));
    }

    @Transactional
    @Override
    public User getUser() {
        System.out.println("getUser()");
        User u = entityManager.find(User.class, 1L);
        return u;
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        System.out.println("getAllUsers()");
        List<User> users = entityManager.createNativeQuery("select * from users", User.class).getResultList();
        return users;
    }
}
