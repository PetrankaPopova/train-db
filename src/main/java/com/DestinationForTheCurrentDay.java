package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
@Table(name = "destinantion_For_The_Current_Day")
public class DestinationForTheCurrentDay extends BaseEntity {


    private String nameOfDestination;
    private double distance;
    private BigDecimal price;

    public DestinationForTheCurrentDay() {
    }

    @Column(name = "name_of_destinaion", nullable = false)
    public String getNameOfDestination() {
        return nameOfDestination;
    }

    public void setNameOfDestination(String nameOfDestination) {
        this.nameOfDestination = nameOfDestination;
    }

    @Column(name = "distance", nullable = false)
    @Min(value = 0)
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Column(name = "price", nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
