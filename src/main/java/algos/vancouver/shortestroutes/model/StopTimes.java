package algos.vancouver.shortestroutes.model;

public record StopTimes(
        int id,
        int trip_id,
        String arrival_time,
        String departure_time,
        int stop_id,
        int stop_sequence,
        String stop_headsign,
        int pickup_type,
        int drop_off_type,
        double shape_dist_traveled
) {
}