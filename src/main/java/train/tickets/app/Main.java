package train.tickets.app;

import org.springframework.context.support.GenericXmlApplicationContext;
import train.tickets.entities.RoutePoint;
import train.tickets.entities.Ticket;
import train.tickets.entities.Train;
import train.tickets.interfaces.DataConfirmationService;
import train.tickets.interfaces.TicketTypeSelectionService;

import java.sql.Date;
import java.util.List;

/**
 * Created by Archelite on 11.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring-config.xml");
        ctx.refresh();

        TicketTypeSelectionService ticketTypeSelectionService = ctx.getBean("jpaTrainService", TicketTypeSelectionService.class);
        List<Train> trains = ticketTypeSelectionService.findTrainTickets(new RoutePoint(), new RoutePoint(), new Date(1493590447));

        DataConfirmationService dataConfirmationService = ctx.getBean("jpaTicketService", DataConfirmationService.class);
        dataConfirmationService.addSoldTicket(100, 18, new Date(1493590447) /*etc parameters*/);
    }
}
