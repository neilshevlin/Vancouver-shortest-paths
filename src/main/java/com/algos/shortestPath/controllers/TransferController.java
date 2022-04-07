package com.algos.shortestPath.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.algos.shortestPath.models.Transfers;
import com.algos.shortestPath.service.TransfersService;

@RestController
@RequestMapping("/transfers")
public class TransferController {
    @Autowired
    TransfersService transfersService;
}
