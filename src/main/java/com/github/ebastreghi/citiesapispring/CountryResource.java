package com.github.ebastreghi.citiesapispring;

import com.github.ebastreghi.citiesapispring.countries.Country;
import com.github.ebastreghi.citiesapispring.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;


    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

}
