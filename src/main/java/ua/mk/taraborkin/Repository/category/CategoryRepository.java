package ua.mk.taraborkin.Repository.category;

import ua.mk.taraborkin.entity.Category;

import java.util.List;

public interface CategoryRepository {
    Category create(Category c);
    Category ubdate(Category c);
    int delete(Category c);
    List<Category> findAll();
    Category find(Long id);
}
