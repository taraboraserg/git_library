package ua.mk.taraborkin.services.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mk.taraborkin.Repository.publisher.PublisherRepository;
import ua.mk.taraborkin.entity.Publisher;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DefaultPublisherService implements PublisherService {
    private final PublisherRepository publisherRepository;
    @Autowired
    public DefaultPublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher create(Publisher b) {
        return publisherRepository.create(b);
    }

    @Override
    public Publisher ubdate(Publisher b) {
        return publisherRepository.ubdate(b);
    }

    @Override
    public int delete(Publisher b) {
        return publisherRepository.delete(b);
    }

    @Override
    public List<Publisher> findAll() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher find(Long id) {
        return publisherRepository.find(id);
    }
}
