package com.github.elianroventini.citiesapi.countries.repository;

import com.github.elianroventini.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
