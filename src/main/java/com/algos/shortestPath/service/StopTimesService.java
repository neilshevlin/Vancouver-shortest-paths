package com.algos.shortestPath.service;
import com.algos.shortestPath.repository.StopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algos.shortestPath.models.StopTimes;
import com.algos.shortestPath.repository.StoptimesRepo;
import java.util.List;

@Service
public class StopTimesService {
    @Autowired
    StoptimesRepo stoptimes_repo;

    public List<StopTimes> getStopTimes(){
        return stoptimes_repo.findAll();
    }
}
