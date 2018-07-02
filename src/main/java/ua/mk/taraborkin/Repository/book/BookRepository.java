package ua.mk.taraborkin.Repository.book;

import ua.mk.taraborkin.entity.Book;

import java.util.List;

public interface BookRepository {
    Book create(Book u);
    Book ubdate(Book u);
    int delete(Book u);
    List<Book> findAll();
    Book find(Long id);
}
