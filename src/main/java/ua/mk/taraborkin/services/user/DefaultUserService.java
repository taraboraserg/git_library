package ua.mk.taraborkin.services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mk.taraborkin.Repository.user.UserRepository;
import ua.mk.taraborkin.entity.User;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DefaultUserService implements UserService{
    private final UserRepository userRepository;
    @Autowired
    public DefaultUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User y) {
        return userRepository.create(y);
    }

    @Override
    public User ubdate(User y) {
        return userRepository.ubdate(y);
    }

    @Override
    public int delete(User y) {
        return userRepository.delete(y);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User find(Long id) {
        return userRepository.find(id);
    }
}
