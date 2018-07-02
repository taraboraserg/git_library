package ua.mk.taraborkin.controller.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.mk.taraborkin.controller.book.Request.CreateBookRequest;
import ua.mk.taraborkin.entity.Author;
import ua.mk.taraborkin.entity.Book;
import ua.mk.taraborkin.entity.Category;
import ua.mk.taraborkin.entity.Publisher;
import ua.mk.taraborkin.services.author.AuthorService;
import ua.mk.taraborkin.services.book.BookService;
import ua.mk.taraborkin.services.categories.CategoriesService;
import ua.mk.taraborkin.services.publisher.PublisherService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path= "/book")
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;
    private final CategoriesService categoryService;
    private final PublisherService publisherService;

    @Autowired
    public BookController(BookService bookService, AuthorService authorService, CategoriesService categoryService, PublisherService publisherService, BookService bookService1) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.categoryService = categoryService;
        this.publisherService = publisherService;

    }

    @RequestMapping(path = "/get/(bookId)", method = RequestMethod.GET)
    public ResponseEntity getById(@PathVariable Long bookId){
        return ResponseEntity.ok("Get Book Id");
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ResponseEntity getAllBooks(){
        return ResponseEntity.ok("Get All Books");
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public ResponseEntity createBook(ModelAndView modelAndView, @ModelAttribute(name = "book")CreateBookRequest book,
                                     BindingResult bindingResult, HttpServletRequest request) {
    Book book1 = new Book();
    book1.setBookName(book.getBookName());
        List<Author> authors = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        List<Publisher> publishers = new ArrayList<>();

        for (Long authorId: book.getAuthorId()){
            authors.add(authorService.find(authorId));
        }
        book1.setAuthors(authors);
        for (Long catId: book.getCategoryId()) {
            categories.add(categoryService.find(catId));
        }
        book1.setCategories(categories);
        for (Long pubId: book.getPublisherId()) {
            publishers.add(publisherService.find(pubId));
        }
       // book1.setRating(rating);
       // book1.setPages(pages);
        bookService.create(book1);
        return ResponseEntity.ok("Book created");
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody Book book) {
        return ResponseEntity.ok("Book updated");
    }

    @RequestMapping(path = "/delete/(bookId)", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(name = "bookId") Long bookId){
        return ResponseEntity.ok("Book deleted");
    }
}
