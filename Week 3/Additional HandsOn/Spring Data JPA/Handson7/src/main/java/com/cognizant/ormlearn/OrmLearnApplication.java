package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testAddCountry();
    }

    void testAddCountry() {
        Country newCountry = new Country();
        newCountry.setCode("JP");
        newCountry.setName("Japan");
        countryService.addCountry(newCountry);

        Country retrieved = countryService.findCountryByCode("JP");
        System.out.println("Added Country: " + retrieved);
    }
}