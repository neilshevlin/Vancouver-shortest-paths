package algos.vancouver.shortestroutes.repository;

import algos.vancouver.shortestroutes.model.Transfers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransfersRepository {
    List<Transfers> stops = new ArrayList<>();

    public TransfersRepository(){
        stops.add(new Transfers(
                0,
                1888,
                9043,
                0,
                0
        ));
    }

    public List<Transfers> findAll(){
        return stops;
    }

    public Transfers getTransfers(){
        return null;
    }

    public void addStopTimes(Transfers transfers){
        stops.add(transfers);
    }
}
