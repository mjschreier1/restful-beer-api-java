package com.beer.Beer.repo;

import com.beer.Beer.model.Beer;
import org.springframework.data.repository.CrudRepository;

public interface BeerRepository extends CrudRepository<Beer, Long> {
}
