package ua.mk.taraborkin.controller.puplisher.Request;

import javax.persistence.Column;

public class CreatePublisherRequest {
    public Long Id;
    public String Year;
    public String Name;
    public String City;

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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        CreatePublisherRequest that = (CreatePublisherRequest) object;
        return java.util.Objects.equals(Id, that.Id) &&
                java.util.Objects.equals(Year, that.Year) &&
                java.util.Objects.equals(Name, that.Name) &&
                java.util.Objects.equals(City, that.City);
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), Id, Year, Name, City);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CreatePublisherRequest{" +
                "Id=" + Id +
                ", Year='" + Year + '\'' +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public void setCity(String city) {
        City = city;



    }
}
