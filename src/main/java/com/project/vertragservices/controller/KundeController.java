package com.project.vertragservices.controller;

import com.project.vertragservices.model.Kunde;
import com.project.vertragservices.repository.KundeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class KundeController extends AbstractController {

    @Autowired
    private KundeRepository kundeRepository;

    @PostMapping("/addKunde")
    public Kunde addKunde(@RequestBody Kunde kunde) {
        return kundeRepository.save(kunde);
    }

    @GetMapping("/kunden")
    public ResponseEntity<List<Kunde>> getAllKunde() {
        List<Kunde> k = kundeRepository.findAll();
        return ResponseEntity.ok(k);
    }

    @GetMapping("/kunden/{id}")
    public ResponseEntity<Optional<Kunde>> getKundeById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(kundeRepository.findById(id));
    }

    @PutMapping("/kunden/{id}")
    public ResponseEntity<Kunde> updateEmployee(@PathVariable(value = "id") Long id,
                                                @RequestBody Kunde kunde) {
        Kunde k = kundeRepository.findById(id).orElseThrow();

        k.setName(kunde.getName());
        k.setVorname(kunde.getVorname());
        k.setVersicherungsNr(kunde.getVersicherungsNr());
        k.setAnschrift(kunde.getAnschrift());
        k.setBankverbindung(kunde.getBankverbindung());

        final Kunde updatedKunde = kundeRepository.save(k);
        return ResponseEntity.ok(updatedKunde);
    }

    @DeleteMapping("/kunden/{id}")
    public Map<String, Boolean> deleteKunde(@PathVariable(value = "id") Long id) {
        Kunde kunde = kundeRepository.findById(id)
                .orElseThrow();

        kundeRepository.delete(kunde);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
