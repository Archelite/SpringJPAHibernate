package train.tickets.entities;


import javax.persistence.*;

/**
 * Created by Archelite on 12.07.2017.
 */

@Entity
@Table(name = "train_wagon", schema = "javastudy")

public class TrainWagon {

    private int train_id;
    private int wagon_id;
    private int route_id;
    private int wagonNumber;
    private WagonType wagonType;

    @Basic
    @Column(name = "train_id", nullable = false)
    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    @Id
    @Column(name = "wagon_id", nullable = false)
    public int getWagon_id() {
        return wagon_id;
    }

    public void setWagon_id(int wagon_id) {
        this.wagon_id = wagon_id;
    }

    @Basic
    @Column(name = "route_id", nullable = false)
    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    @Basic
    @Column(name = "wagonNumber", nullable = false)
    public int getWagonNumber() {
        return wagonNumber;
    }

    public void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    @Basic
    @Column(name = "wagonType", nullable = false)
    public WagonType getWagonType() {
        return wagonType;
    }

    public void setWagonType(WagonType wagonType) {
        this.wagonType = wagonType;
    }

    public enum WagonType {
        SEAT, RESERVED_SEAT, COMPARTMENT, SUITE
    }
}
