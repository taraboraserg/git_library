package ua.mk.taraborkin.services.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mk.taraborkin.Repository.book.BookRepository;
import ua.mk.taraborkin.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class DefaultBookService implements BookService{
    private final BookRepository bookRepository;

    @Autowired
    public DefaultBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book u) {
        return bookRepository.create(u);
    }

    @Override
    public Book ubdate(Book u) {
        return bookRepository.ubdate(u);
    }

    @Override
    public int delete(Book u) {
        return bookRepository.delete(u);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book find(Long id) {
        return bookRepository.find(id);
    }

}
