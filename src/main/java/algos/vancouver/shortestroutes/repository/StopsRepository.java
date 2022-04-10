package algos.vancouver.shortestroutes.repository;

import algos.vancouver.shortestroutes.model.Stops;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

@Repository
public class StopsRepository {

    List<Stops> stops = new ArrayList<>();

    public StopsRepository(){

    }
    public List<Stops> makeConnection(){
        try {

            String fileName = "src/main/java/algos/vancouver/shortestroutes/repository/stops.csv";
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(",");
            scanner.nextLine();

            while (scanner.hasNext()) {
                if(scanner.hasNextInt()){
                    String stopNumber = scanner.next();
                    scanner.next();
                    String stopName = scanner.next();
                    System.out.println(stopNumber + " " + stopName);
                    stops.add(new Stops(
                            stopNumber,
                            stopName
                    ));
                    scanner.nextLine();
                }
            }
            scanner.close();
            System.out.println("Stops loaded");
            return stops;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public List<Stops> findTen(){
        makeConnection();
        return stops;
    }

    public List<Stops> findShortPath(String a, String b){
        makeConnection();
        return stops;
    }

    public void addStop(Stops stop){
        stops.add(stop);
    }

    public void removeStop(Stops stop){
        stops.remove(stop);
    }
}
