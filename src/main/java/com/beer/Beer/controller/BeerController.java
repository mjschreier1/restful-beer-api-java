package com.beer.Beer.controller;

import com.beer.Beer.model.Beer;
import com.beer.Beer.repo.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class BeerController {

    @Autowired
    BeerRepository beerRepository;

    @GetMapping("/beers")
    public Iterable<Beer> getBeers() {
        return beerRepository.findAll();
    }

    @PostMapping("/beers")
    public Beer addBeer(@RequestBody Map<String, String> body) {
        Beer newBeer = new Beer(
                body.get("brewery"),
                body.get("name"),
                body.get("style"),
                Float.parseFloat(body.get("ABV")),
                Float.parseFloat(body.get("IBU"))
        );
        beerRepository.save(newBeer);
        return newBeer;
    }
}
