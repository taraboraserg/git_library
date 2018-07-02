package ua.mk.taraborkin.controller.user.Forms;

public class UserForm {
    private String e_mail;
    private String password;

    public UserForm() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserForm)) return false;

        UserForm userForm = (UserForm) o;

        if (!getE_mail().equals(userForm.getE_mail())) return false;
        return getPassword().equals(userForm.getPassword());
    }

    @Override
    public int hashCode() {
        int result = getE_mail().hashCode();
        result = 31 * result + getPassword().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "e_mail='" + e_mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

