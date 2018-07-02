package ua.mk.taraborkin.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "permitons")
public class Permitions implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERMITION_ID", columnDefinition = "serial")
    public String PermitionId;
    @Column(name = "PERMITION_NAME")
    public String PermitionName;

    public Permitions(){
        this.PermitionId = PermitionId;
        this.PermitionName = PermitionName;

    }
    @Override
    public String toString(){
        return  "\nPermitionId:" + PermitionId + "\nPermitionName:" + PermitionName + "\n";
    }

    public String getPermitionId() {
        return PermitionId;
    }

    public void setPermitionId(String permitionId) {
        PermitionId = permitionId;
    }

    public String getPermitionName() {
        return PermitionName;
    }

    public void setPermitionName(String permitionName) {
        PermitionName = permitionName;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Permitions that = (Permitions) object;
        return java.util.Objects.equals(PermitionId, that.PermitionId) &&
                java.util.Objects.equals(PermitionName, that.PermitionName);
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), PermitionId, PermitionName);
    }
}
