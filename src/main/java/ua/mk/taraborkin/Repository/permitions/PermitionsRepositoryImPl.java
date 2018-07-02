package ua.mk.taraborkin.Repository.permitions;

import org.springframework.stereotype.Repository;
import ua.mk.taraborkin.entity.Permitions;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PermitionsRepositoryImPl implements PermitionsRepository {
    @PersistenceContext
    public EntityManager permit_em;
    // private Book id;


    public Permitions create(Permitions p) {
        permit_em.getTransaction().begin();
        Permitions bookFromDB = permit_em.merge(p);
        permit_em.getTransaction().commit();
        return bookFromDB;
    }

    public Permitions ubdate(Permitions p) {
        permit_em.getTransaction().begin();
        Permitions bookFromDB = permit_em.merge(p);
        permit_em.getTransaction().commit();
        return bookFromDB;
    }

    public int delete(Permitions p) {
        permit_em.getTransaction().begin();
        permit_em.remove(p);
        permit_em.getTransaction().commit();
        return 0;
    }

    public List<Permitions> findAll() {
        TypedQuery<Permitions> namedQuery = permit_em.createQuery("SELECT p FROM Permission p",Permitions.class  );
//        TypedQuery<Book> namedQuery = permit_em.createQuery("SELECT p FROM Book ",Book.class);
        return namedQuery.getResultList();
    }

    public Permitions find(Long id) {
        return permit_em.find(Permitions.class, id);
    }
}
