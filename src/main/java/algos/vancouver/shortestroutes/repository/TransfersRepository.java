package algos.vancouver.shortestroutes.repository;

import algos.vancouver.shortestroutes.model.StopTimes;
import algos.vancouver.shortestroutes.model.Transfers;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class TransfersRepository {
    List<Transfers> transfers = new ArrayList<>();

    public TransfersRepository(){

    }
    public List<Transfers> makeConnection(){
        try {

            String fileName = "src/main/java/algos/vancouver/shortestroutes/repository/stops.csv";
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(",");
            scanner.nextLine();

            while (scanner.hasNext() ) {
                if(scanner.hasNextInt()){
                    String from_stop_id = scanner.next();
                    scanner.next();
                    String to_stop_id = scanner.next();
                    transfers.add(new Transfers(
                            from_stop_id,
                            to_stop_id
                    ));
                    scanner.nextLine();
                }
            }
            scanner.close();
            System.out.println("Stops loaded");
            return transfers;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public List<Transfers> findAll(){
        return transfers;
    }

    public Transfers getTransfers(){
        return null;
    }

}
