package ua.mk.taraborkin.Repository.author;

import org.springframework.stereotype.Repository;
import ua.mk.taraborkin.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional

public class AuthorRepositoryImPl implements AuthorRepository{
    @PersistenceContext
    public EntityManager author_em;// private Book id;


    public Author create(Author a) {

        Author authorFromDB = author_em.merge(a);

        return authorFromDB;
    }

    public Author ubdate(Author a) {

        Author autorFromDB = author_em.merge(a);

        return autorFromDB;
    }

    public Long delete(Author a) {

        author_em.remove(a);

        return 0L;
    }

    public List<Author> findAll() {
        TypedQuery<Author> namedQuery = author_em.createQuery("SELECT a FROM Autor a",Author.class  );
//        TypedQuery<Book> namedQuery = em.createQuery("SELECT a FROM Book ",Book.class);
        return namedQuery.getResultList();
    }

    public Author find(Long id) {
        return author_em.find(Author.class, id);
    }
}
