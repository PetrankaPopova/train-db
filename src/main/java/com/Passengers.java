package com;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "passengers")
public class Passengers extends BaseEntity{

    private String firstName;
    private String lastName;
    private String city;
    private String country;
    private String phone;
    private Train train;
    private SeatsOccupied seatsOccupied;

    public Passengers() {
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "city", nullable = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "country", nullable = false)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "phone", nullable = false)
    @Pattern(regexp = "^\\d{10}$")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @ManyToOne
    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @ManyToOne
    public SeatsOccupied getSeatsOccupied() {
        return seatsOccupied;
    }

    public void setSeatsOccupied(SeatsOccupied seatsOccupied) {
        this.seatsOccupied = seatsOccupied;
    }
}
