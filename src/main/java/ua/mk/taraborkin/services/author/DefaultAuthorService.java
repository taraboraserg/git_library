package ua.mk.taraborkin.services.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mk.taraborkin.Repository.author.AuthorRepository;
import ua.mk.taraborkin.entity.Author;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DefaultAuthorService implements AuthorService{
    private final AuthorRepository authorRepository;
    @Autowired
    public DefaultAuthorService(AuthorRepository autorRepository) {
        this.authorRepository = autorRepository;
    }

    @Override
    public Author create(Author a) {
        return authorRepository.create(a);
    }

    @Override
    public Author ubdate(Author a) {
        return authorRepository.ubdate(a);
    }

    @Override
    public Long delete(Author a) {
        return authorRepository.delete(a);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author find(Long id) {
        return authorRepository.find(id);
    }

}
