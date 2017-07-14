package train.tickets.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by Archelite on 12.07.2017.
 */

@Entity
@Table(name = "sold_tickets", schema = "javastudy")

public class Ticket {

    private int ticket_id;
    private String trainNumber;
    private int wagonNumber;
    private TrainWagon.WagonType wagonType;
    private int seat_number;
    private String first_route_point_city;
    private String first_route_point_station;
    private Date first_route_point_arrival_time;
    private String last_route_point_city;
    private String last_route_point_station;
    private Date last_route_point_arrival_time;
    private Date travel_time;
    private String surname;
    private String name;
    private String middlename;
    private boolean sex;
    private Date birthdate;
    private int doc_type;
    private String doc_number;
    private int payment_type;
    private BigDecimal price;

    @Id
    @Column(name = "ticket_id", nullable = false)
    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
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
    @Column(name = "wagonNumber", nullable = false, length = 10)
    public int getWagonNumber() {
        return wagonNumber;
    }

    public void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }
    @Basic
    @Column(name = "wagonType", nullable = false)
    public TrainWagon.WagonType getWagonType() {
        return wagonType;
    }

    public void setWagonType(TrainWagon.WagonType wagonType) {
        this.wagonType = wagonType;
    }

    @Basic
    @Column(name = "seat_number", nullable = false)
    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }

    @Basic
    @Column(name = "first_route_point_city", nullable = false)
    public String getFirst_route_point_city() {
        return first_route_point_city;
    }

    public void setFirst_route_point_city(String first_route_point_city) {
        this.first_route_point_city = first_route_point_city;
    }

    @Basic
    @Column(name = "first_route_point_station", nullable = false)
    public String getFirst_route_point_station() {
        return first_route_point_station;
    }

    public void setFirst_route_point_station(String first_route_point_station) {
        this.first_route_point_station = first_route_point_station;
    }

    @Basic
    @Column(name = "first_route_point_arrival_time", nullable = false)
    public Date getFirst_route_point_arrival_time() {
        return first_route_point_arrival_time;
    }

    public void setFirst_route_point_arrival_time(Date first_route_point_arrival_time) {
        this.first_route_point_arrival_time = first_route_point_arrival_time;
    }

    @Basic
    @Column(name = "last_route_point_city", nullable = false)
    public String getLast_route_point_city() {
        return last_route_point_city;
    }

    public void setLast_route_point_city(String last_route_point_city) {
        this.last_route_point_city = last_route_point_city;
    }

    @Basic
    @Column(name = "last_route_point_station", nullable = false)
    public String getLast_route_point_station() {
        return last_route_point_station;
    }

    public void setLast_route_point_station(String last_route_point_station) {
        this.last_route_point_station = last_route_point_station;
    }

    @Basic
    @Column(name = "last_route_point_arrival_time", nullable = false)
    public Date getLast_route_point_arrival_time() {
        return last_route_point_arrival_time;
    }

    public void setLast_route_point_arrival_time(Date last_route_point_arrival_time) {
        this.last_route_point_arrival_time = last_route_point_arrival_time;
    }

    @Basic
    @Column(name = "travel_time", nullable = false)
    public Date getTravel_time() {
        return travel_time;
    }

    public void setTravel_time(Date travel_time) {
        this.travel_time = travel_time;
    }

    @Basic
    @Column(name = "surname", nullable = false)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "middlename", nullable = false)
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Basic
    @Column(name = "sex", nullable = false)
    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthdate", nullable = false)
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "doc_type", nullable = false)
    public int getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(int doc_type) {
        this.doc_type = doc_type;
    }

    @Basic
    @Column(name = "doc_number", nullable = false)
    public String getDoc_number() {
        return doc_number;
    }

    public void setDoc_number(String doc_number) {
        this.doc_number = doc_number;
    }

    @Basic
    @Column(name = "payment_type", nullable = false)
    public int getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(int payment_type) {
        this.payment_type = payment_type;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
