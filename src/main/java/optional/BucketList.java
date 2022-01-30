package optional;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {
    private List<Destination> destinations = new ArrayList<>();

    public void addDestination(Destination destination){
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword){
        for (Destination element : destinations){
            if (element.getDescription().contains(keyword)){
                return Optional.of(element);
            }
        }
        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm){
        for (Destination element : destinations){
            if (element.getKmFromHome()<maxKm){
                return Optional.of(element);
            }
        }
        return Optional.empty();

    }

}
