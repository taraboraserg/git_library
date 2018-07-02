package ua.mk.taraborkin.Repository.author;

import ua.mk.taraborkin.entity.Author;

import java.util.List;

public interface AuthorRepository {
    Author create(Author a);
    Author ubdate(Author a);
    Long delete(Author a);
    List<Author> findAll();
    Author find(Long id);

}
