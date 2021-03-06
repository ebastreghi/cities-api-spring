package com.github.ebastreghi.citiesapispring.repository;

import com.github.ebastreghi.citiesapispring.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
