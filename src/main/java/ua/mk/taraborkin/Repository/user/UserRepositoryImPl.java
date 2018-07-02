package ua.mk.taraborkin.Repository.user;

import org.springframework.stereotype.Repository;
import ua.mk.taraborkin.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserRepositoryImPl implements UserRepository {
    @PersistenceContext
    public EntityManager user_em;
    // private Book id;


    public User create(User y) {
//        user_em.getTransaction().begin();
        User bookFromDB = user_em.merge(y);
//        user_em.getTransaction().commit();
        return bookFromDB;
    }

    public User ubdate(User y) {
//        user_em.getTransaction().begin();
        User bookFromDB = user_em.merge(y);
//        user_em.getTransaction().commit();
        return bookFromDB;
    }

    public int delete(User y) {
        user_em.getTransaction().begin();
        user_em.remove(y);
        user_em.getTransaction().commit();
        return 0;
    }

    public List<User> findAll() {
        TypedQuery<User> namedQuery = user_em.createQuery("SELECT y FROM User y",User.class  );
//        TypedQuery<Book> namedQuery = user_em.createQuery("SELECT y FROM Book ",Book.class);
        return namedQuery.getResultList();
    }

    public User find(Long id) {
        return user_em.find(User.class, id);
    }
}
