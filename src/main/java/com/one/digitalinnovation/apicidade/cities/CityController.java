package com.one.digitalinnovation.apicidade.cities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping(value = "/")
    public ResponseEntity<Page<City>> listCountry(Pageable pageable){

        Page<City> lista = cityRepository.findAll(pageable);

        return new ResponseEntity<Page<City>>(lista, HttpStatus.OK);
    }
    
}
