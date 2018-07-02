package ua.mk.taraborkin.controller.user.Requests;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class CreateUserRequest {
    private Long userID;
    private String first_name;
    private String last_name;
    private String e_mail;
    private String password;
    private String repeat_password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeat_password() {
        return repeat_password;
    }

    public void setRepeat_password(String repeat_password) {
        this.repeat_password = repeat_password;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateUserRequest that = (CreateUserRequest) o;

        if (!userID.equals(that.userID)) return false;
        if (!first_name.equals(that.first_name)) return false;
        if (!last_name.equals(that.last_name)) return false;
        if (!e_mail.equals(that.e_mail)) return false;
        if (!password.equals(that.password)) return false;
        if (!repeat_password.equals(that.repeat_password)) return false;
        return date.equals(that.date);
    }

   

    @Override
    public String toString() {
        return "CreateUserRequest{" +
                "userID=" + userID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", e_mail='" + e_mail + '\'' +
                ", password='" + password + '\'' +
                ", repeat_password='" + repeat_password + '\'' +
                ", date=" + date +
                '}';
    }
}