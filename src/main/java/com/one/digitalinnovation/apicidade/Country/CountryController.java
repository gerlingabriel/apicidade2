package com.one.digitalinnovation.apicidade.Country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/countries")
@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public ResponseEntity<List<Country>> listCountry(){

        List<Country> lista = countryRepository.findAll();

        return new ResponseEntity<List<Country>>(lista, HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public ResponseEntity<Page<Country>> listCountry(Pageable pageable){

        Page<Country> lista = countryRepository.findAll(pageable);

        return new ResponseEntity<Page<Country>>(lista, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Country> buscaPais(@PathVariable Long id){

         Optional<Country> optinal = countryRepository.findById(id);

        if(optinal.isPresent()){
            return new ResponseEntity<Country>(optinal.get(), HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
        
    }
    
}
