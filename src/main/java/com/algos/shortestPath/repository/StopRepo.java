package com.algos.shortestPath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algos.shortestPath.models.Stops;

@Repository
public interface StopRepo extends JpaRepository<Stops, Long>  {

}
