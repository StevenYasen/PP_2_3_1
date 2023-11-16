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

//    public void addUsers() {
//        entityManager.persist(new User("Igor", "Prokofiev", "ig@mail.ru"));
//        entityManager.persist(new User("Vitya", "Malishev", "vm@mail.ru"));
//        entityManager.persist(new User("Nina", "Kolosova", "nk@mail.ru"));
//        entityManager.persist(new User("Zina", "Borodkina", "zb@mail.ru"));
//    }


    @Override
    public User getUserById(Long userId) {
        return entityManager.find(User.class, userId);
    }

    @Override
    public void deleteUserById(Long userId) {
        entityManager.createNativeQuery("delete from users where id=:id").setParameter("id", userId).executeUpdate();
    }

    @Override
    public void saveUser(User u) {
        entityManager.merge(u);
    }


    @Override
    public List<User> getAllUsers() {
        List<User> users = entityManager.createNativeQuery("select * from users", User.class).getResultList();
        return users;
    }
}
