package ua.mk.taraborkin.services.author;

import sun.security.util.AuthResources;
import ua.mk.taraborkin.entity.Author;
import ua.mk.taraborkin.entity.Book;

import java.util.List;

/**
 * Created by itschool on 22.04.2018.
 */
public interface AuthorService {

Author create (Author a);
    Author ubdate(Author a);

    Long delete(Author a);

    List<Author> findAll();

    Author find(Long aLong);
}
