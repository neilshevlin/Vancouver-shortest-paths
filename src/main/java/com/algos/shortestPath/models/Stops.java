package com.algos.shortestPath.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stops")
public class Stops {
    @Id
    @Column(name="stop_id")
        private Long stop_id;

    @Column(name="stop_code")
        private int stop_code;
    
    @Column(name="stop_name")
        private String stop_name;
    
    @Column(name="stop_name")
        private String stop_desc;
    
    @Column(name="stop_lat")
        private String stop_lat;
    
    @Column(name="stop_lon")
        private String stop_lon;
    
    @Column(name="zone_id")
        private String zone_id;
    
    @Column(name="stop_url")
        private String stop_url;
    
    @Column(name="location_type")
        private int location_type;

    @Column(name="parent_station")
        private int parent_station;
}
