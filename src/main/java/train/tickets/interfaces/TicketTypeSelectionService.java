package train.tickets.interfaces;

import train.tickets.entities.Airplane;
import train.tickets.entities.Bus;
import train.tickets.entities.RoutePoint;
import train.tickets.entities.Train;

import java.sql.Date;
import java.util.List;

/**
 * Created by Archelite on 11.07.2017.
 */
public interface TicketTypeSelectionService {

        List<Airplane> findAirplaneTickets(RoutePoint from, RoutePoint to, Date travelDate);
        List<Bus> findBusTickets(RoutePoint from, RoutePoint to, Date travelDate);
        List<Train> findTrainTickets(RoutePoint from, RoutePoint to, Date travelDate);
}
