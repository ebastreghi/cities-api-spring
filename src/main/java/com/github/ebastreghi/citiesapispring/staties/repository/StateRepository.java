package com.github.ebastreghi.citiesapispring.staties.repository;

import com.github.ebastreghi.citiesapispring.staties.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

