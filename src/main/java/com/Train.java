package com;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "trains")
public class Train extends BaseEntity {


    private String numberOfTrain;
    private String name;
    private List<SeatsOccupied> seatsOccupied;
    private DestinationForTheCurrentDay destinationForTheCurrentDay;

    public Train() {
    }

    @Column(name = "number_of_train", nullable = false)

    public String getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(String numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    public List<SeatsOccupied> getSeatsOccupied() {
        return seatsOccupied;
    }

    public void setSeatsOccupied(List<SeatsOccupied> seatsOccupied) {
        this.seatsOccupied = seatsOccupied;
    }

    @ManyToOne
    public DestinationForTheCurrentDay getDestinationForTheCurrentDay() {
        return destinationForTheCurrentDay;
    }

    public void setDestinationForTheCurrentDay(DestinationForTheCurrentDay destinationForTheCurrentDay) {
        this.destinationForTheCurrentDay = destinationForTheCurrentDay;
    }
}
