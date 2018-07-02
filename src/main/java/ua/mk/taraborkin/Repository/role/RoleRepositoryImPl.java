package ua.mk.taraborkin.Repository.role;

import org.springframework.stereotype.Repository;
import ua.mk.taraborkin.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RoleRepositoryImPl implements RoleRepository {
    @PersistenceContext
    public EntityManager role_em;
    // private Book id;


    public Role create(Role r) {
        role_em.getTransaction().begin();
        Role bookFromDB = role_em.merge(r);
        role_em.getTransaction().commit();
        return bookFromDB;
    }

    public Role ubdate(Role r) {
        role_em.getTransaction().begin();
        Role bookFromDB = role_em.merge(r);
        role_em.getTransaction().commit();
        return bookFromDB;
    }

    public int delete(Role r) {
        role_em.getTransaction().begin();
        role_em.remove(r);
        role_em.getTransaction().commit();
        return 0;
    }

    public List<Role> findAll() {
        TypedQuery<Role> namedQuery = role_em.createQuery("SELECT r FROM Role r ",Role.class  );
//        TypedQuery<Book> namedQuery = role_em.createQuery("SELECT r FROM Book ",Book.class);
        return namedQuery.getResultList();
    }

    public Role find(Long id) {
        return role_em.find(Role.class, id);
    }
}
