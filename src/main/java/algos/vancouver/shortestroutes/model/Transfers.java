package algos.vancouver.shortestroutes.model;

public record Transfers(
        int id,
        int from_stop_id,
        int to_stop_id,
        int transfer_type,
        double min_transfer_time
) {
}