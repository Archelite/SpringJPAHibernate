package train.tickets.entities;

import train.tickets.interfaces.Transport;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Archelite on 11.07.2017.
 */

@Entity
@Table(name = "train", schema = "javastudy")

public class Train implements Transport {

    private int train_id;
    private String trainNumber;
    private String full_route;
    private Date full_traveltime;
    private boolean is_active;
    private String wagon_id_sequence;
    private String route_id_sequence;

    @Id
    @Column(name = "train_id", nullable = false)
    public int getId() {
        return train_id;
    }

    public void setId(int id) {
        this.train_id = id;
    }

    @Basic
    @Column(name = "trainNumber", nullable = false, length = 10)
    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Basic
    @Column(name = "full_route", nullable = false)
    public String getRoute() {
        return full_route;
    }

    public void setRoute(String route) {
        this.full_route = route;
    }

    public Date getFull_traveltime() {
        return full_traveltime;
    }

    public void setFull_traveltime(Date full_traveltime) {
        this.full_traveltime = full_traveltime;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getWagon_id_sequence() {
        return wagon_id_sequence;
    }

    public void setWagon_id_sequence(String wagon_id_sequence) {
        this.wagon_id_sequence = wagon_id_sequence;
    }

    public String getRoute_id_sequence() {
        return route_id_sequence;
    }

    public void setRoute_id_sequence(String route_id_sequence) {
        this.route_id_sequence = route_id_sequence;
    }
}
