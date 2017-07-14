package train.tickets.entities;

import javax.persistence.*;

/**
 * Created by Archelite on 12.07.2017.
 */

@Entity
@Table(name = "payment_types", schema = "javastudy")

public class PaymentType {

    private int payment_type_id;
    private String payment_type_name;

    @Id
    @Column(name = "payment_type_id", nullable = false)
    public int getPayment_type_id() {
        return payment_type_id;
    }

    public void setPayment_type_id(int payment_type_id) {
        this.payment_type_id = payment_type_id;
    }

    @Basic
    @Column(name = "payment_type_name", nullable = false)
    public String getPayment_type_name() {
        return payment_type_name;
    }

    public void setPayment_type_name(String payment_type_name) {
        this.payment_type_name = payment_type_name;
    }
}
