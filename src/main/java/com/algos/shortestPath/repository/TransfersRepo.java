package com.algos.shortestPath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algos.shortestPath.models.Transfers;

@Repository
public interface TransfersRepo extends JpaRepository<Transfers, Long>  {

}
