package ua.mk.taraborkin.Repository.category;

import org.springframework.stereotype.Repository;
import ua.mk.taraborkin.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryRepositoryImPl implements CategoryRepository{
    @PersistenceContext
    public EntityManager cat_em;
    // private Book id;


    public Category create(Category c) {
        cat_em.getTransaction().begin();
        Category bookFromDB = cat_em.merge(c);
        cat_em.getTransaction().commit();
        return bookFromDB;
    }

    public Category ubdate(Category c) {
        cat_em.getTransaction().begin();
        Category bookFromDB = cat_em.merge(c);
        cat_em.getTransaction().commit();
        return bookFromDB;
    }

    public int delete(Category c) {
        cat_em.getTransaction().begin();
        cat_em.remove(c);
        cat_em.getTransaction().commit();
        return 0;
    }

    public List<Category> findAll() {
        TypedQuery<Category> namedQuery = cat_em.createQuery("SELECT c FROM Category c",Category.class  );
//        TypedQuery<Book> namedQuery = em.createQuery("SELECT c FROM Book ",Book.class);
        return namedQuery.getResultList();
    }

    public Category find(Long id) {
        return cat_em.find(Category.class, id);
    }
}
