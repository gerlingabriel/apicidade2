package com.one.digitalinnovation.apicidade.staties;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stateis")
public class StateController {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public ResponseEntity<List<State>> listCountry(){

        List<State> lista = repository.findAll();

        return new ResponseEntity<List<State>>(lista, HttpStatus.OK);
    }
    
}
