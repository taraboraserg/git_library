package ua.mk.taraborkin.controller.author.Requests;

import java.util.Date;

/**
 * Created by IT school on 05.06.2018.
 */
public class AuthorCreateRequest {
    private Long AuthorId;
    private String authorFirstName;
    private String authorLastName;
    private Date date;
    private String description;

public AuthorCreateRequest() {

}

    public Long getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(Long authorId) {
        AuthorId = authorId;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthorCreateRequest)) return false;

        AuthorCreateRequest that = (AuthorCreateRequest) o;

        if (getAuthorId() != null ? !getAuthorId().equals(that.getAuthorId()) : that.getAuthorId() != null)
            return false;
        if (getAuthorFirstName() != null ? !getAuthorFirstName().equals(that.getAuthorFirstName()) : that.getAuthorFirstName() != null)
            return false;
        return getAuthorLastName() != null ? getAuthorLastName().equals(that.getAuthorLastName()) : that.getAuthorLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getAuthorId() != null ? getAuthorId().hashCode() : 0;
        result = 31 * result + (getAuthorFirstName() != null ? getAuthorFirstName().hashCode() : 0);
        result = 31 * result + (getAuthorLastName() != null ? getAuthorLastName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AuthorCreateRequest{" +
                "AuthorId=" + AuthorId +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                '}';
    }
}
