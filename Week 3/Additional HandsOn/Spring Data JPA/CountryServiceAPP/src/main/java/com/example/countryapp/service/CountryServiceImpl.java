package com.example.countryapp.service;

import com.example.countryapp.model.Country;
import com.example.countryapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public Country getCountryByCode(String code) {
        return repository.findById(code).orElse(null);
    }

    @Override
    public Country addCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    @Override
    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    @Override
    public List<Country> searchCountriesByName(String name) {
        return repository.findByCoNameContainingIgnoreCase(name);
    }
}
