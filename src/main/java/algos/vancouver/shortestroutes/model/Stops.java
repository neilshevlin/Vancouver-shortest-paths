package algos.vancouver.shortestroutes.model;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
public record Stops(
        String stop_id,
        String stop_name
) {

}