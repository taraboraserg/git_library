package ua.mk.taraborkin.services.publisher;

import ua.mk.taraborkin.entity.Publisher;

import java.util.List;

public interface PublisherService {
    Publisher create(Publisher b);

    Publisher ubdate(Publisher b);

    int delete(Publisher b);

    List<Publisher> findAll();

    Publisher find(Long aLong);
}
