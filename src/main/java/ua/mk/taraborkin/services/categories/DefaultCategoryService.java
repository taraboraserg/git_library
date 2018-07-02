package ua.mk.taraborkin.services.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mk.taraborkin.Repository.category.CategoryRepository;
import ua.mk.taraborkin.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional

public class DefaultCategoryService implements CategoriesService {
    private final CategoryRepository categoryRepository;
    @Autowired
    public DefaultCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category c) {
        return categoryRepository.create(c);
    }

    @Override
    public Category ubdate(Category c) {
        return categoryRepository.ubdate(c);
    }

    @Override
    public int delete(Category c) {
        return categoryRepository.delete(c);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category find(Long id) {
        return categoryRepository.find(id);
    }
    }