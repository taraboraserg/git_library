package ua.mk.taraborkin.services.permitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mk.taraborkin.Repository.permitions.PermitionsRepository;
import ua.mk.taraborkin.entity.Permitions;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DefaultPermitionsService implements PermitionsService{
    private final PermitionsRepository permitionsRepository;
    @Autowired
    public DefaultPermitionsService(PermitionsRepository permitionsRepository){ this.permitionsRepository = permitionsRepository;
    }
@Override
public Permitions create(Permitions p){return permitionsRepository.create(p);}

    @Override
    public Permitions ubdate(Permitions p){return permitionsRepository.ubdate(p);}

    @Override
    public int  delete (Permitions p){return permitionsRepository.delete(p);}

    @Override
    public List<Permitions> findAll() {
        return permitionsRepository.findAll();
    }

    @Override
    public Permitions find(Long id) {
        return permitionsRepository.find(id);
    }
}
