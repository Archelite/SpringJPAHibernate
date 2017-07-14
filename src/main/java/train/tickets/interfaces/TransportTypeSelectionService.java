package train.tickets.interfaces;

import train.tickets.entities.Train;
import train.tickets.entities.TrainWagon;

import java.util.List;

/**
 * Created by Archelite on 11.07.2017.
 */
public interface TransportTypeSelectionService {

       List<TrainWagon> findFreeSeats(Train selectedTrain);
}
