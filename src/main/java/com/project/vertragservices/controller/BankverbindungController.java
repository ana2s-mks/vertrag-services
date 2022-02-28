package com.project.vertragservices.controller;

import com.project.vertragservices.model.Bankverbindung;
import com.project.vertragservices.repository.BankverbindungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BankverbindungController extends AbstractController {

    @Autowired
    private BankverbindungRepository bankverbindungRepository;

    @GetMapping("/bankverbindung/{id}")
    public ResponseEntity<Bankverbindung> getBankverbindung(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(bankverbindungRepository.findBankverbindungByKundeId(id));
    }
}
