
package com.example.countryapp;

import com.example.countryapp.entity.Country;
import com.example.countryapp.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CountryCodeServiceAppApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryCodeServiceAppApplication.class);

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryCodeServiceAppApplication.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            getAllCountriesTest();
        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
        }
    }

    private void getAllCountriesTest() throws CountryNotFoundException {
        LOGGER.info("Start");
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country: {}", country);
        LOGGER.info("End");
    }
}
