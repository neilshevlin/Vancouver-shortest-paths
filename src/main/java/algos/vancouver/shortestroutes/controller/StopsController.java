package algos.vancouver.shortestroutes.controller;

import algos.vancouver.shortestroutes.model.Stops;
import algos.vancouver.shortestroutes.repository.StopsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stops")
public class StopsController {
    private final StopsRepository repository;

    public StopsController(StopsRepository stopsRepository) {
        this.repository = stopsRepository;
    }

    @GetMapping
    public List<Stops> findTen(){
        return repository.findTen();
    }

    @GetMapping("/shortpath")
    public List<Stops> findShortPath(@RequestParam("origin") String origin, @RequestParam("destination") String destination){
        return repository.findShortPath(origin, destination);
    }

}
