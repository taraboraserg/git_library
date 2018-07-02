package ua.mk.taraborkin.Repository.publisher;

import ua.mk.taraborkin.entity.Publisher;

import java.util.List;

public interface PublisherRepository {
    Publisher create(Publisher b);
    Publisher ubdate(Publisher b);
    int delete(Publisher b);
    List<Publisher> findAll();
    Publisher find(Long id);
}
