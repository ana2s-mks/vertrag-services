package com.project.vertragservices.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Table(name = "kunde")
@Entity
public class Kunde {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String vorname;

    @NotBlank
    private String versicherungsNr;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "anschrift_id", referencedColumnName = "id")
    @JsonManagedReference
    private Anschrift anschrift;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bankverbindung_id", referencedColumnName = "id")
    @JsonManagedReference
    private Bankverbindung bankverbindung;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getVersicherungsNr() {
        return versicherungsNr;
    }

    public void setVersicherungsNr(String versicherungsNr) {
        this.versicherungsNr = versicherungsNr;
    }

    public Anschrift getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Anschrift anschrift) {
        this.anschrift = anschrift;
    }

    public Bankverbindung getBankverbindung() {
        return bankverbindung;
    }

    public void setBankverbindung(Bankverbindung bankverbindung) {
        this.bankverbindung = bankverbindung;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", versicherungsNr='" + versicherungsNr + '\'' +
                ", anschrift=" + anschrift +
                ", bankverbindung=" + bankverbindung +
                '}';
    }
}
