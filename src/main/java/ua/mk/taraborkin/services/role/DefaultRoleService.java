package ua.mk.taraborkin.services.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mk.taraborkin.Repository.role.RoleRepository;
import ua.mk.taraborkin.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DefaultRoleService implements RoleService{
    private final RoleRepository roleRepository;

    @Autowired
    public DefaultRoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role create(Role r) {
        return roleRepository.create(r);
    }

    @Override
    public Role ubdate(Role r) {
        return roleRepository.ubdate(r);
    }

    @Override
    public int delete(Role r) {
        return roleRepository.delete(r);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role find(Long id) {
        return roleRepository.find(id);
    }
}
