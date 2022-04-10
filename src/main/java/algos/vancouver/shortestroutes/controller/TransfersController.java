package algos.vancouver.shortestroutes.controller;

import algos.vancouver.shortestroutes.model.Transfers;
import algos.vancouver.shortestroutes.repository.TransfersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transfers")
public class TransfersController {
    private final TransfersRepository repository;

    public TransfersController(TransfersRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Transfers> findAll(){
        return repository.findAll();
    }
}
