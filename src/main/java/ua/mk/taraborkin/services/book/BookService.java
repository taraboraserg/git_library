package ua.mk.taraborkin.services.book;

import ua.mk.taraborkin.entity.Book;

import java.util.List;

/**
 * Created by itschool on 20.04.2018.
 */
public interface BookService {
    Book create(Book u);

    Book ubdate(Book u);

    int delete(Book u);

    List<Book> findAll();

    Book find(Long aLong);
}
