
package com.example.countryapp.service;

import com.example.countryapp.entity.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import jakarta.transaction.Transactional;

public interface CountryService {
    @Transactional
    Country findCountryByCode(String code) throws CountryNotFoundException;
}
