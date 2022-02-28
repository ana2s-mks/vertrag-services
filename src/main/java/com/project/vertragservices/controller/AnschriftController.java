package com.project.vertragservices.controller;

import com.project.vertragservices.model.Anschrift;
import com.project.vertragservices.repository.AnschriftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class AnschriftController extends AbstractController{

    @Autowired
    private AnschriftRepository anschriftRepository;


    @GetMapping("/anschrift/{id}")
    public ResponseEntity<Anschrift> getAnschrift(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok().body(anschriftRepository.findAnschriftByKundeId(id));
    }
}
