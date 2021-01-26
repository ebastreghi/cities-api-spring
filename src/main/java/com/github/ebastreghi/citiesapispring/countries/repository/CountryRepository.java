package com.github.ebastreghi.citiesapispring.countries.repository;

import com.github.ebastreghi.citiesapispring.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
