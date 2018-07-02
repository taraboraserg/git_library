package ua.mk.taraborkin.Repository.publisher;

import org.springframework.stereotype.Repository;
import ua.mk.taraborkin.entity.Publisher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PublisherRepositoryImPl implements PublisherRepository {
    @PersistenceContext
    public EntityManager publish_em;
    // private Book id;


    public Publisher create(Publisher b) {
        publish_em.getTransaction().begin();
        Publisher bookFromDB = publish_em.merge(b);
        publish_em.getTransaction().commit();
        return bookFromDB;
    }

    public Publisher ubdate(Publisher b) {
        publish_em.getTransaction().begin();
        Publisher bookFromDB = publish_em.merge(b);
        publish_em.getTransaction().commit();
        return bookFromDB;
    }

    public int delete(Publisher b) {
        publish_em.getTransaction().begin();
        publish_em.remove(b);
        publish_em.getTransaction().commit();
        return 0;
    }

    public List<Publisher> findAll() {
        TypedQuery<Publisher> namedQuery = publish_em.createQuery("SELECT b FROM Publisher b",Publisher.class  );
//        TypedQuery<Book> namedQuery = publish_em.createQuery("SELECT b FROM Book ",Book.class);
        return namedQuery.getResultList();
    }

    public Publisher find(Long id) {
        return publish_em.find(Publisher.class, id);
    }
}
