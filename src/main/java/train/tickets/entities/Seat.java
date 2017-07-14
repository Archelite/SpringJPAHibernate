package train.tickets.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.math.BigDecimal;

/**
 * Created by Archelite on 11.07.2017.
 */

public class Seat {

       private int train_id;
       private int wagon_id;
       private int route_id;
       private int seat_number;
       private boolean is_occupied;
       private BigDecimal price;

       @Basic
       @Column(name = "train_id", nullable = false)
       public int getTrain_id() {
              return train_id;
       }

       public void setTrain_id(int train_id) {
              this.train_id = train_id;
       }

       @Basic
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
       @Column(name = "seat_number", nullable = false)
       public int getSeat_number() {
              return seat_number;
       }

       public void setSeat_number(int seat_number) {
              this.seat_number = seat_number;
       }

       @Basic
       @Column(name = "is_occupied", nullable = false)
       public boolean is_occupied() {
              return is_occupied;
       }

       public void setIs_occupied(boolean is_occupied) {
              this.is_occupied = is_occupied;
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
