package train.tickets.implementations;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import train.tickets.entities.Airplane;
import train.tickets.entities.Bus;
import train.tickets.entities.RoutePoint;
import train.tickets.entities.Train;
import train.tickets.interfaces.TicketTypeSelectionService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.Date;
import java.util.List;

/**
 * Created by Archelite on 12.07.2017.
 */
@Repository
@Service("jpaTrainService")
@Transactional
public class TicketTypeSelectionServiceImpl implements TicketTypeSelectionService {

    @PersistenceContext
    private EntityManager em;

    public List<Airplane> findAirplaneTickets(RoutePoint from, RoutePoint to, Date travelDate) {
        return null;
    }

    public List<Bus> findBusTickets(RoutePoint from, RoutePoint to, Date travelDate) {
        return null;
    }

    //метод получения данных о билетах на конкретную дату
    public List<Train> findTrainTickets(RoutePoint from, RoutePoint to, Date travelDate) {

        Query query = em.createNativeQuery("SELECT . . .", Train.class);  //вызов процедуры и передача параметров
        query.setParameter("RoutePoint", from);
        query.setParameter("RoutePoint", to);
        query.setParameter("Date", travelDate);
        return query.getResultList();
    }
}
