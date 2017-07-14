package train.tickets.implementations;

import train.tickets.entities.Ticket;
import train.tickets.interfaces.DataConfirmationService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Date;

/**
 * Created by Archelite on 12.07.2017.
 */

public class DataConfirmationServiceImpl implements DataConfirmationService{

    @PersistenceContext
    private EntityManager em;

    public void setTravelParameters(String[] travelParams) {

    }

    public void setPassengerInfo(String[] passengerInfo) {

    }

    public void setRequisites(String[] requisites) {

    }

    //метод покупки билета пользователем
    public void addSoldTicket(int ticket_id, int set_number, Date first_route_point_arrival_time /*etc parameters */) {
            Ticket newTicket = new Ticket();
            em.getTransaction().begin();

            newTicket.setTicket_id(ticket_id);
            newTicket.setSeat_number(set_number);
            newTicket.setFirst_route_point_arrival_time(first_route_point_arrival_time);
            //etc. . .

            em.persist(newTicket);
            em.getTransaction().commit();

    }
}
