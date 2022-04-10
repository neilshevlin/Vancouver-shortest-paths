package algos.vancouver.shortestroutes.repository;

import algos.vancouver.shortestroutes.model.StopTimes;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
@Repository
public class StopTimesRepository {
    List<StopTimes> times = new ArrayList<>();

    public StopTimesRepository(){
        times.add(new StopTimes(
                0,
                9017927,
                "5:25:00",
                "5:25:00",
                646,
                1,
                null,
                0,
                0,
                0
        ));
    }

    public List<StopTimes> findAll(){
        return times;
    }

    public StopTimes getStopTimes(int stopId){
        return null;
    }

    public void addStopTimes(StopTimes stopTimes){
        times.add(stopTimes);
    }
}
