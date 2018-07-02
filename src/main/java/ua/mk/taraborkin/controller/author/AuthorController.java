package ua.mk.taraborkin.controller.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.mk.taraborkin.controller.author.Requests.AuthorCreateRequest;
import ua.mk.taraborkin.entity.Author;
import ua.mk.taraborkin.services.author.AuthorService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(path= "/author")
public class AuthorController {
    private final AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService){this.authorService = authorService;}

        @RequestMapping(path = "/get/(authorId)", method = RequestMethod.GET)
        public ResponseEntity getById(@PathVariable Long authorId){
            return ResponseEntity.ok("Get Author Id");
        }

        @RequestMapping(path = "/get", method = RequestMethod.GET)
        public ResponseEntity getAllAuthors(){
            return ResponseEntity.ok("Get All Authors");
        }

        @RequestMapping(path = "/create", method = RequestMethod.POST)
        public ResponseEntity createAuthor(ModelAndView modelAndView, @ModelAttribute(name = "author")
                AuthorCreateRequest author, BindingResult bindingResult, HttpServletRequest request) {
            Author author1 = new Author();
            author1.setFirstname(author.getAuthorFirstName());
            author1.setLastname(author.getAuthorLastName());
            authorService.create(author1);

            return ResponseEntity.ok("Author created");
        }

        @RequestMapping(path = "/update", method = RequestMethod.PUT)
        public ResponseEntity update(@RequestBody Author author) {
            return ResponseEntity.ok("Author updated");
        }

        @RequestMapping(path = "/delete/(authorId)", method = RequestMethod.DELETE)
        public ResponseEntity delete(@PathVariable(name = "authorId") Long authorId){
            return ResponseEntity.ok("Author deleted");
        }
    }
