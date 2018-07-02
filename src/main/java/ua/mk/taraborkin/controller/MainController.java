package ua.mk.taraborkin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.mk.taraborkin.controller.author.Requests.AuthorCreateRequest;
import ua.mk.taraborkin.controller.book.Request.CreateBookRequest;
import ua.mk.taraborkin.controller.category.Request.CreateCategoryRequest;
import ua.mk.taraborkin.controller.puplisher.Request.CreatePublisherRequest;
import ua.mk.taraborkin.controller.user.Forms.UserForm;
import ua.mk.taraborkin.controller.user.Requests.CreateUserRequest;
import ua.mk.taraborkin.services.author.AuthorService;
import ua.mk.taraborkin.services.book.BookService;
import ua.mk.taraborkin.services.categories.CategoriesService;
import ua.mk.taraborkin.services.publisher.PublisherService;
import ua.mk.taraborkin.services.user.UserService;

@Controller
public class MainController {
    @Autowired
    private CategoriesService categoriesService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private BookService bookService;
    @Autowired
    private UserService userService;
    @Autowired
    private PublisherService publisherService;


    @GetMapping("/")
    public String root(ModelMap model) {
        model.addAttribute("books", bookService.findAll());
        model.addAttribute("user", new CreateUserRequest());
        return "index";
    }

    @GetMapping("/index")
    public String index(ModelMap model) {
        model.addAttribute("books", bookService.findAll());
        model.addAttribute("user", new CreateUserRequest());
        return "index";
    }

    @GetMapping("/signup")
    public String viewSignUp(Model model) {
        model.addAttribute("user", new CreateUserRequest());
        return "signup";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("login", new UserForm());
        return "login";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("author", new AuthorCreateRequest());
        model.addAttribute("category", new CreateCategoryRequest());
        model.addAttribute("book", new CreateBookRequest());
        model.addAttribute("publisher", new CreatePublisherRequest());

        model.addAttribute("authors", authorService.findAll());
        model.addAttribute("books", bookService.findAll());
        model.addAttribute("publisher", publisherService.findAll());
        return "admin";
    }
    @GetMapping ("/authors")
    public String author (Model model){
        model.addAttribute("author", authorService.findAll());
        return "authors";
    }
}




//@RequestMapping("/login")
//public String login(Model model) {
// model.addAttribute("login", new UserForm());
// return "login";
// }@GetMapping ("/login")
    //public String viewHome(Model model) {
   // model.addAttribute("user",new CreateUserRequest());
    //model.addAttribute("author",new AuthorCreateRequest());
   // model.addAttribute("category",new CreateCategoryRequest());
   // model.addAttribute("book", new CreateBookRequest());
   // model.addAttribute("publisher", new CreatePublisherRequest());
  //  return "login";
//}

//    @GetMapping("/admin")
//    public String admin(ModelMap model) {
//        model.addAttribute("books", bookService.findAll());
//        return "admin";
//    }