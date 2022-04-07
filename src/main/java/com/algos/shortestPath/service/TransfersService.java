package com.algos.shortestPath.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algos.shortestPath.models.Transfers;
import com.algos.shortestPath.repository.TransfersRepo;
import java.util.List;

@Service
public class TransfersService {
    @Autowired
    TransfersRepo transfers_repo;

    public List<Transfers> getTransfers(){
        return transfers_repo.findAll();
    }
}
