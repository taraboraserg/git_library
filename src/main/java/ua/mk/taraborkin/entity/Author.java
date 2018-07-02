package ua.mk.taraborkin.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "author")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTHOR_ID", columnDefinition = "serial")
    public Long AuthorId;
    @Column(name = "FIRST_NAME")
    public String Firstname;
    @Column(name = "LAST_NAME")
    public String Lastname;
    @ManyToMany(mappedBy = "authors")
    private List<Book> books;

    public Long getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(Long authorId) {
        AuthorId = authorId;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorId=" + AuthorId +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", books=" + books +
                '}';
    }
}