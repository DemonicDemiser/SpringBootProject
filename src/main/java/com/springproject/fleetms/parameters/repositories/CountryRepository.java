package com.springproject.fleetms.parameters.repositories;

import com.springproject.fleetms.parameters.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
