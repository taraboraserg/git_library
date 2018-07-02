package ua.mk.taraborkin.controller.category.Request;

import java.util.List;

public class CreateCategoryRequest {
    public Long CategoriesId;
    public String CategoryName;
    public String permitions;
    public String description;
    private List<Long> AuthorId;
    private List<Long> BookId;

    public Long getCategoriesId() {
        return CategoriesId;
    }

    public void setCategoriesId(Long categoriesId) {
        CategoriesId = categoriesId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getPermitions() {
        return permitions;
    }

    public void setPermitions(String permitions) {
        this.permitions = permitions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(List<Long> authorId) {
        AuthorId = authorId;
    }

    public List<Long> getBookId() {
        return BookId;
    }

    public void setBookId(List<Long> bookId) {
        BookId = bookId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof CreateCategoryRequest)) return false;
        if (!super.equals(object)) return false;

        CreateCategoryRequest that = (CreateCategoryRequest) object;

        if (!getCategoriesId().equals(that.getCategoriesId())) return false;
        if (!getCategoryName().equals(that.getCategoryName())) return false;
        if (!getPermitions().equals(that.getPermitions())) return false;
        if (!getDescription().equals(that.getDescription())) return false;
        if (!getAuthorId().equals(that.getAuthorId())) return false;
        return getBookId().equals(that.getBookId());
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCategoriesId().hashCode();
        result = 31 * result + getCategoryName().hashCode();
        result = 31 * result + getPermitions().hashCode();
        result = 31 * result + getDescription().hashCode();
        result = 31 * result + getAuthorId().hashCode();
        result = 31 * result + getBookId().hashCode();
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CreateCategoryRequest{" +
                "CategoriesId=" + CategoriesId +
                ", CategoryName='" + CategoryName + '\'' +
                ", permitions='" + permitions + '\'' +
                ", description='" + description + '\'' +
                ", AuthorId=" + AuthorId +
                ", BookId=" + BookId +
                '}';
    }
}
