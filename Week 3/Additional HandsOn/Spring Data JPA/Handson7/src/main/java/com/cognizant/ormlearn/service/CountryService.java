package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Country;

public interface CountryService {
    Country findCountryByCode(String code);
    void addCountry(Country country);
}