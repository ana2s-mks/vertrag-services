package com.project.vertragservices.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name = "bankverbindung")
@Entity
public class Bankverbindung {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotBlank
    private String institut;

    @NotBlank
    @Size(max = 12)
    private String kontoNr;

    @NotBlank
    @Size(max = 8)
    private String blz;

    @NotBlank
    @Size(max = 17)
    private String iban;

    @NotBlank
    @Size(max = 10)
    private String bic;

    @OneToOne(mappedBy = "bankverbindung")
    @JsonBackReference
    private Kunde kunde;

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public String getInstitut() {
        return institut;
    }

    public void setInstitut(String institut) {
        this.institut = institut;
    }

    public String getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(String kontoNr) {
        this.kontoNr = kontoNr;
    }

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bankverbindung{" +
                "id=" + id +
                ", institut='" + institut + '\'' +
                ", kontoNr='" + kontoNr + '\'' +
                ", blz='" + blz + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", kunde=" + kunde +
                '}';
    }
}
