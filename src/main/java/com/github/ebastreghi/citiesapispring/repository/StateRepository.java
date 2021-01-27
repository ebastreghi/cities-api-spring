package com.github.ebastreghi.citiesapispring.repository;

import com.github.ebastreghi.citiesapispring.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

