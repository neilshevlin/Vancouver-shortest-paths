package com.algos.shortestPath.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transfers")
public class Transfers {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="from_stop_id")
    private int from_stop_id;

    @Column(name="to_stop_id")
    private int to_stop_id;

    @Column(name="transfer_type")
    private int transfer_type;

    @Column(name="min_transfer_time")
    private int min_transfer_time;
}

