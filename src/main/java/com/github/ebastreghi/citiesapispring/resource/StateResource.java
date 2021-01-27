package com.github.ebastreghi.citiesapispring.resource;

import com.github.ebastreghi.citiesapispring.entity.State;
import com.github.ebastreghi.citiesapispring.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public List<State> staties(){
        return repository.findAll();
    }
}
