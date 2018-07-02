package ua.mk.taraborkin.controller.book.Request;

import java.util.List;

public class CreateBookRequest {
    private Long BookId;
    private String BookName;
    private String Author;
    private String category;
    private String rating;
    private String pages;
    private List<Long> AuthorId;
    private List<Long> CategoryId;
    private List<Long> PublisherId;

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

    public List<Long> getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(List<Long> authorId) {
        AuthorId = authorId;
    }

    public List<Long> getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(List<Long> categoryId) {
        CategoryId = categoryId;
    }

    public List<Long> getPublisherId() {
        return PublisherId;
    }

    public void setPublisherId(List<Long> publisherId) {
        PublisherId = publisherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateBookRequest)) return false;

        CreateBookRequest that = (CreateBookRequest) o;

        if (!getBookId().equals(that.getBookId())) return false;
        if (!getBookName().equals(that.getBookName())) return false;
        if (!getAuthor().equals(that.getAuthor())) return false;
        if (!getCategory().equals(that.getCategory())) return false;
        if (!getRating().equals(that.getRating())) return false;
        if (!getPages().equals(that.getPages())) return false;
        if (!getAuthorId().equals(that.getAuthorId())) return false;
        if (!getCategoryId().equals(that.getCategoryId())) return false;
        return getPublisherId().equals(that.getPublisherId());
    }

    @Override
    public int hashCode() {
        int result = getBookId().hashCode();
        result = 31 * result + getBookName().hashCode();
        result = 31 * result + getAuthor().hashCode();
        result = 31 * result + getCategory().hashCode();
        result = 31 * result + getRating().hashCode();
        result = 31 * result + getPages().hashCode();
        result = 31 * result + getAuthorId().hashCode();
        result = 31 * result + getCategoryId().hashCode();
        result = 31 * result + getPublisherId().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CreateBookRequest{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", category='" + category + '\'' +
                ", rating='" + rating + '\'' +
                ", pages='" + pages + '\'' +
                ", AuthorId=" + AuthorId +
                ", CategoryId=" + CategoryId +
                ", PublisherId=" + PublisherId +
                '}';
    }


}
