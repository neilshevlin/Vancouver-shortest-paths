package com.algos.shortestPath.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stop_times")
public class StopTimes {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="trip_id")
    private int trip_id;

    @Column(name="arrival_time")
    private int arrival_time;

    @Column(name="departure_time")
    private int departure_time;

    @Column(name="stop_id")
    private int stop_id;

    @Column(name="stop_sequence")
    private int stop_sequence;

    @Column(name="stop_headsign")
    private int stop_headsign;

    @Column(name="pickup_type")
    private int pickup_type;

    @Column(name="drop_off_type")
    private int drop_off_type;

    @Column(name="shape_dist_traveled")
    private int shape_dist_traveled;

}
