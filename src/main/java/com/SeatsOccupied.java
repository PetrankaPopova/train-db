package com;

import javax.persistence.*;


@Entity
@Table(name = "seatsOccipied")
public class SeatsOccupied extends BaseEntity{


    private Train train;
    private WhereToSeat whereToSeat;
    private Compartment compartment;



    public SeatsOccupied() {
    }


    @ManyToOne
    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Enumerated(EnumType.STRING)
    public WhereToSeat getWhereToSeat() {
        return whereToSeat;
    }

    public void setWhereToSeat(WhereToSeat whereToSeat) {
        this.whereToSeat = whereToSeat;
    }

    @Enumerated(EnumType.STRING)
    public Compartment getCompartment() {
        return compartment;
    }

    public void setCompartment(Compartment compartment) {
        this.compartment = compartment;
    }
}
