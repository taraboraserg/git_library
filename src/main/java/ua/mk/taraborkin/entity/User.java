package ua.mk.taraborkin.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@javax.persistence.Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", columnDefinition = "serial")
    public Long USER_ID;
    @Column(name = "USER_FIRST_NAME")
    public String First_Name;
    @Column(name = "USER_LAST_NAME")
    public String Last_Name;
    @Column(name = "USER_AGE")
    public Long age;
    @Column(name = "E_Mail")
    public String E_Mail;
    @Column(name = "PASSWORD")
    public Long Password;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "USER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "ROLE_ID")})
    private List<Role> roles;

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getE_Mail() {
        return E_Mail;
    }

    public void setE_Mail(String e_Mail) {
        E_Mail = e_Mail;
    }

    public Long getPassword() {
        return Password;
    }

    public void setPassword(Long password) {
        Password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!USER_ID.equals(user.USER_ID)) return false;
        if (!First_Name.equals(user.First_Name)) return false;
        if (!Last_Name.equals(user.Last_Name)) return false;
        if (!age.equals(user.age)) return false;
        if (!E_Mail.equals(user.E_Mail)) return false;
        if (!Password.equals(user.Password)) return false;
        return roles.equals(user.roles);
    }

    @Override
    public int hashCode() {
        int result = USER_ID.hashCode();
        result = 31 * result + First_Name.hashCode();
        result = 31 * result + Last_Name.hashCode();
        result = 31 * result + age.hashCode();
        result = 31 * result + E_Mail.hashCode();
        result = 31 * result + Password.hashCode();
        result = 31 * result + roles.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "USER_ID=" + USER_ID +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", age=" + age +
                ", E_Mail='" + E_Mail + '\'' +
                ", Password=" + Password +
                ", roles=" + roles +
                '}';
    }
}
