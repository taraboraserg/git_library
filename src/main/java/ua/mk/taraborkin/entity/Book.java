package ua.mk.taraborkin.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID", columnDefinition = "serial")
    private Long BookId;
    @Column(name = "BOOK_NAME")
    private String BookName;
    @Column(name = "AUTHOR_NAME")
    private String Author;
    @Column(name = "CATEGORY_NAME")
    private String category;
    @Column(name = "RATING")
    private String rating;
    @Column(name = "PAGES")
    private String pages;
    @Column(name = "AUTHORID")
    private Long AuthorID;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "book_author", joinColumns = {@JoinColumn(name = "BOOK_ID")},
            inverseJoinColumns = {@JoinColumn(name = "AUTHOR_ID")})
    private List<Author> authors;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "book_category", joinColumns = {@JoinColumn(name = "BOOK_ID")},
            inverseJoinColumns = {@JoinColumn(name = "CATEGORY_ID")})
    private List<Category> categories;

    public Long getBookId() {
        return BookId;
    }

    public void setBookId(Long bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public Long getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(Long authorID) {
        AuthorID = authorID;
    }

    public List<ua.mk.taraborkin.entity.Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<ua.mk.taraborkin.entity.Author> authors) {
        this.authors = authors;
    }

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (!getBookId().equals(book.getBookId())) return false;
        if (!getBookName().equals(book.getBookName())) return false;
        if (!getAuthor().equals(book.getAuthor())) return false;
        if (!getCategory().equals(book.getCategory())) return false;
        if (!getRating().equals(book.getRating())) return false;
        if (!getPages().equals(book.getPages())) return false;
        if (!getAuthorID().equals(book.getAuthorID())) return false;
        if (!getAuthors().equals(book.getAuthors())) return false;
        return getCategories().equals(book.getCategories());
    }

    @Override
    public int hashCode() {
        int result = getBookId().hashCode();
        result = 31 * result + getBookName().hashCode();
        result = 31 * result + getAuthor().hashCode();
        result = 31 * result + getCategory().hashCode();
        result = 31 * result + getRating().hashCode();
        result = 31 * result + getPages().hashCode();
        result = 31 * result + getAuthorID().hashCode();
        result = 31 * result + getAuthors().hashCode();
        result = 31 * result + getCategories().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", category='" + category + '\'' +
                ", rating='" + rating + '\'' +
                ", pages='" + pages + '\'' +
                ", AuthorID=" + AuthorID +
                ", authors=" + authors +
                ", categories=" + categories +
                '}';
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;


    }
}

