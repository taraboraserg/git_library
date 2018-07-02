package ua.mk.taraborkin.Repository.permitions;

import ua.mk.taraborkin.entity.Permitions;

import java.util.List;

public interface PermitionsRepository {
    Permitions create(Permitions p);
    Permitions ubdate(Permitions p);
    int delete(Permitions p);
    List<Permitions> findAll();
    Permitions find(Long id);
}
