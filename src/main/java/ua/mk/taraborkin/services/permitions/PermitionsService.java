package ua.mk.taraborkin.services.permitions;

import org.hibernate.hql.internal.ast.ParseErrorHandler;
import ua.mk.taraborkin.entity.Permitions;

import java.util.List;

public interface PermitionsService {
    Permitions create(Permitions p);

    Permitions ubdate(Permitions p);

    int delete(Permitions p);

    List<Permitions> findAll();

    Permitions find(Long aLong);
}
