package algos.vancouver.shortestroutes.repository;

import algos.vancouver.shortestroutes.model.Stops;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class StopsRepository {

    List<Stops> stops = new ArrayList<>();

    public StopsRepository(){
        stops.add(new Stops(
                1,
                1888,
                518784,
                "WB HASTINGS ST FS HOLDOM AVE-",
                "HASTINGS ST @ HOLDOM AVE",
                49.280436,
                -122.981419,
                "ZN 99",
                null,
                0,
                null
        ));
    }

    public List<Stops> findAll(){
        return stops;
    }

    public void addStop(Stops stop){
        stops.add(stop);
    }

    public void removeStop(Stops stop){
        stops.remove(stop);
    }
}
