package train.tickets.interfaces;

import java.sql.Date;

/**
 * Created by Archelite on 12.07.2017.
 */

public interface DataConfirmationService {

    void setTravelParameters(String[] travelParams);
    void setPassengerInfo(String[] passengerInfo);
    void setRequisites(String[] requisites);
    void addSoldTicket(int ticket_id, int set_number, Date first_route_point_arrival_time /*etc parameters */);
}
