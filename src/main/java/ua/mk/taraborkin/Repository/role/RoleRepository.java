package ua.mk.taraborkin.Repository.role;

import ua.mk.taraborkin.entity.Role;

import java.util.List;

public interface RoleRepository {
    Role create(Role r);
    Role ubdate(Role r);
    int delete(Role r);
    List<Role> findAll();
    Role find(Long id);
}
