package ua.mk.taraborkin.services.role;

import ua.mk.taraborkin.entity.Role;

import java.util.List;

public interface RoleService {
    Role create(Role r);

    Role ubdate(Role r);

    int delete(Role r);

    List<Role> findAll();

    Role find(Long aLong);
}
