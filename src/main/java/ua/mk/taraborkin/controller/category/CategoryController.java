package ua.mk.taraborkin.controller.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.mk.taraborkin.controller.category.Request.CreateCategoryRequest;
import ua.mk.taraborkin.entity.Category;
import ua.mk.taraborkin.services.categories.CategoriesService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path = "/category")
public class CategoryController {
    private final CategoriesService categoriesService;

    @Autowired
    public CategoryController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @RequestMapping(path = "/get/(categoryId)", method = RequestMethod.GET)
    public ResponseEntity getById(@PathVariable Long categoryId) {
        return ResponseEntity.ok("Get Category Id");
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity getAllCategories() {
        return ResponseEntity.ok("Get All Categories");
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity createCategory(ModelAndView modelAndView, @ModelAttribute(name = "category")
            CreateCategoryRequest category, BindingResult bindingResult, HttpServletRequest request) {

        Category category1 = new Category();
        category1.setName(category.getCategoryName());
        category1.setDescription(category.getDescription());
        categoriesService.create(category1);

        return ResponseEntity.ok("Category created");
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody Category category) {
        return ResponseEntity.ok("Category updated");
    }

    @RequestMapping(path = "/delete/(categoryId)", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(name = "categoryId") Long categoryId) {
        return ResponseEntity.ok("Category deleted");
    }

    @GetMapping(path = "/")
    public String home(Model m) {

        return "category";

    }


}
