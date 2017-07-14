package train.tickets.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Archelite on 11.07.2017.
 */

@Entity
@Table(name = "route_points", schema = "javastudy")

public class RoutePoint {

    private int train_id;
    private int route_id;
    private String city;
    private String station;
    private Date arrival_forward;
    private Date arrival_backward;

    @Basic
    @Column(name = "train_id", nullable = false)
    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    @Id
    @Column(name = "route_id", nullable = false)
    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    @Basic
    @Column(name = "city", nullable = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "station", nullable = false)
    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Basic
    @Column(name = "arrival_forward", nullable = false)
    public Date getArrival_forward() {
        return arrival_forward;
    }

    public void setArrival_forward(Date arrival_forward) {
        this.arrival_forward = arrival_forward;
    }

    @Basic
    @Column(name = "arrival_backward", nullable = false)
    public Date getArrival_backward() {
        return arrival_backward;
    }

    public void setArrival_backward(Date arrival_backward) {
        this.arrival_backward = arrival_backward;
    }
}
