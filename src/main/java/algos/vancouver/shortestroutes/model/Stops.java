package algos.vancouver.shortestroutes.model;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
public record Stops(
        int id,
        int stop_id,
        int stop_code,
        String stop_name,
        String stop_desc,
        double stop_lat,
        double stop_lon,
        String zone_id,
        String stop_url,
        int location_type,
        String parent_station

) {

}