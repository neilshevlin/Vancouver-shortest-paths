package com.algos.shortestPath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algos.shortestPath.models.StopTimes;

@Repository
public interface StoptimesRepo extends JpaRepository<StopTimes, Long>  {

}
