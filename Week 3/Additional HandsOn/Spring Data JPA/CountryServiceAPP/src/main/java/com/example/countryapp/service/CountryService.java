package com.example.countryapp.service;

import com.example.countryapp.model.Country;

import java.util.List;

public interface CountryService {
    Country getCountryByCode(String code);
    Country addCountry(Country country);
    Country updateCountry(Country country);
    void deleteCountry(String code);
    List<Country> searchCountriesByName(String name);
}
