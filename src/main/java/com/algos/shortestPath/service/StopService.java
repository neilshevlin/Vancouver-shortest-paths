package com.algos.shortestPath.service;
import com.algos.shortestPath.models.Transfers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algos.shortestPath.models.Stops;
import com.algos.shortestPath.repository.StopRepo;
import java.util.List;

@Service
public class StopService {
    @Autowired
        StopRepo stop_repo;
    public List<Stops> getStops(){
        return stop_repo.findAll();
    }
}


