package ua.mk.taraborkin.controller.role.Request;

import ua.mk.taraborkin.entity.User;

import javax.persistence.Column;
import javax.persistence.ManyToMany;

public class CreateRoleRequest {
    public Long RoleID;
    public String Name;

    public Long getRoleID() {
        return RoleID;
    }

    public void setRoleID(Long roleID) {
        RoleID = roleID;
    }

    public String getName() {
        return Name;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        CreateRoleRequest that = (CreateRoleRequest) object;
        return java.util.Objects.equals(RoleID, that.RoleID) &&
                java.util.Objects.equals(Name, that.Name);
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), RoleID, Name);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CreateRoleRequest{" +
                "RoleID=" + RoleID +
                ", Name='" + Name + '\'' +
                '}';
    }

    public void setName(String name) {
        Name = name;

    }
}
