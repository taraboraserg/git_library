package ua.mk.taraborkin.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="`role`")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID", columnDefinition = "serial")
    public Long RoleID;
    @Column(name = "ROLE_NAME")
    public String Name;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Long getRoleID() {
        return RoleID;
    }

    public void setRoleID(Long roleID) {
        RoleID = roleID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (!RoleID.equals(role.RoleID)) return false;
        if (!Name.equals(role.Name)) return false;
        return users.equals(role.users);
    }

    @Override
    public int hashCode() {
        int result = RoleID.hashCode();
        result = 31 * result + Name.hashCode();
        result = 31 * result + users.hashCode();
        return result;
    }
}
