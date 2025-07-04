
package com.example.countryapp.repository;

import com.example.countryapp.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByCoNameContainingIgnoreCase(String name);
}
