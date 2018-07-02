package ua.mk.taraborkin.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "publisher")
public class Publisher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PUBLISHER_ID", columnDefinition = "serial")
    public Long Id;
    @Column(name = "PUBLISHER_YEAR")
    public String Year;
    @Column(name = "PUBLISHER_NAME")
    public String Name;
    @Column(name = "PUBLISHER_CITY")
    public String City;

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Publisher publisher = (Publisher) object;
        return java.util.Objects.equals(Id, publisher.Id) &&
                java.util.Objects.equals(Year, publisher.Year) &&
                java.util.Objects.equals(Name, publisher.Name) &&
                java.util.Objects.equals(City, publisher.City);
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), Id, Year, Name, City);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
