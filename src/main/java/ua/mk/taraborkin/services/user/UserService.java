package ua.mk.taraborkin.services.user;

import ua.mk.taraborkin.entity.User;

import java.util.List;

public interface UserService {
    User create(User y);

    User ubdate(User y);

    int delete(User y);

    List<User> findAll();

    User find(Long aLong);
}
