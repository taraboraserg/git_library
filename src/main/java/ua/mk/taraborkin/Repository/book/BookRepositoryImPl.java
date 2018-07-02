package ua.mk.taraborkin.Repository.book;

import org.springframework.stereotype.Repository;
import ua.mk.taraborkin.entity.Book;
import ua.mk.taraborkin.services.book.BookService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BookRepositoryImPl implements BookRepository {
    @PersistenceContext
    private EntityManager book_em;
    // private Book id;


    public Book create(Book u) {
        book_em.getTransaction().begin();
        Book bookFromDB = book_em.merge(u);
        book_em.getTransaction().commit();
        return bookFromDB;
    }

    public Book ubdate(Book u) {
        book_em.getTransaction().begin();
        Book bookFromDB = book_em.merge(u);
        book_em.getTransaction().commit();
        return bookFromDB;
    }

    public int delete(Book u) {
        book_em.getTransaction().begin();
        book_em.remove(u);
        book_em.getTransaction().commit();
        return 0;
    }

    public List<Book> findAll() {
        TypedQuery<Book> namedQuery = book_em.createQuery("SELECT u FROM Book u",Book.class  );
//        TypedQuery<Book> namedQuery = book_em.createQuery("SELECT u FROM Book ",Book.class);
        return namedQuery.getResultList();
    }

    public Book find(Long id) {
        return book_em.find(Book.class, id);
    }
}
