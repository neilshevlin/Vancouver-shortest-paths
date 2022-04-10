package algos.vancouver.shortestroutes.repository;

import algos.vancouver.shortestroutes.model.StopTimes;
import algos.vancouver.shortestroutes.model.Stops;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

@Repository
public class StopTimesRepository {
    List<StopTimes> times = new ArrayList<>();

    public StopTimesRepository(){

    }
    public List<StopTimes> makeConnection(){
        try {

            String fileName = "src/main/java/algos/vancouver/shortestroutes/repository/stops.csv";
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(",");
            scanner.nextLine();

            while (scanner.hasNext() ) {
                if(scanner.hasNextInt()){
                    String trip_id = scanner.next();
                    scanner.next();
                    String arrival_time = scanner.next();
                    times.add(new StopTimes(
                            trip_id,
                            arrival_time
                    ));
                    scanner.nextLine();
                }
            }
            scanner.close();
            System.out.println("Stops loaded");
            return times;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
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
