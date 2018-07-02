package ua.mk.taraborkin.controller.permitions.Request;

import javax.persistence.Column;

public class CreatePermitionsRequest {
    public String PermitionId;
    public String PermitionName;

    public String getPermitionId() {
        return PermitionId;
    }

    public void setPermitionId(String permitionId) {
        PermitionId = permitionId;
    }

    public String getPermitionName() {
        return PermitionName;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        CreatePermitionsRequest that = (CreatePermitionsRequest) object;
        return java.util.Objects.equals(PermitionId, that.PermitionId) &&
                java.util.Objects.equals(PermitionName, that.PermitionName);
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), PermitionId, PermitionName);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CreatePermitionsRequest{" +
                "PermitionId='" + PermitionId + '\'' +
                ", PermitionName='" + PermitionName + '\'' +
                '}';
    }

    public void setPermitionName(String permitionName) {
        PermitionName = permitionName;


    }
}
