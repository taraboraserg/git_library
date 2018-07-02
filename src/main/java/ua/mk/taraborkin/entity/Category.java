package ua.mk.taraborkin.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID", columnDefinition = "serial")
    public Long CategoriesId;
    @Column(name = "CATEGORY_NAME")
    public String CategoryName;
    @Column(name = "PERMITION_NAME")
    public String permitions;
    @Column(name = "DESCRIPTION_NAME")
    public String description;
    @Column(name = "AUTHORID")
    private Long AuthorID;

    @ManyToMany(mappedBy = "categories")
    private List<Book> books;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category that = (Category) o;

        if (!getCategoriesId().equals(that.getCategoriesId())) return false;
        if (!getCategoryName().equals(that.getCategoryName())) return false;
        if (!getPermitions().equals(that.getPermitions())) return false;
        return getDescription().equals(that.getDescription());
    }

    @Override
    public int hashCode() {
        int result = getCategoriesId().hashCode();
        result = 31 * result + getCategoryName().hashCode();
        result = 31 * result + getPermitions().hashCode();
        result = 31 * result + getDescription().hashCode();
        return result;
    }

    public Long getCategoriesId() {
        return CategoriesId;
    }

    public void setCategoriesId(Long categoriesId) {
        CategoriesId = categoriesId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setName(String categoryName) {
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

    public Category() {
        this.CategoriesId = CategoriesId;
        this.CategoryName = CategoryName;
        this.permitions = permitions;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "CategoriesId=" + CategoriesId +
                ", CategoryName='" + CategoryName + '\'' +
                ", permitions='" + permitions + '\'' +
                ", description='" + description + '\'' +
                ", books=" + books +
                '}';
    }
}