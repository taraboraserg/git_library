package ua.mk.taraborkin.Repository.user;

import ua.mk.taraborkin.entity.User;

import java.util.List;

public interface UserRepository {
    User create(User y);
    User ubdate(User y);
    int delete(User y);
    List<User> findAll();
    User find(Long id);

}
