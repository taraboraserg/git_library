package ua.mk.taraborkin.services.categories;

import ua.mk.taraborkin.entity.Category;

import java.util.List;

public interface CategoriesService {
    Category create(Category c);

    Category ubdate(Category c);

    int delete(Category c);

    List<Category> findAll();

    Category find(Long aLong);
}
