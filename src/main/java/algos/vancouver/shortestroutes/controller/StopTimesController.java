package algos.vancouver.shortestroutes.controller;

import algos.vancouver.shortestroutes.model.StopTimes;
import algos.vancouver.shortestroutes.repository.StopTimesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/times")
public class StopTimesController {

    private final StopTimesRepository repository;

    public StopTimesController(StopTimesRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<StopTimes> findAll(){
        return repository.findAll();
    }
}
