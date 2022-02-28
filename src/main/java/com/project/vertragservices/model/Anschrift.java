package com.project.vertragservices.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name = "anschrift")
@Entity
public class Anschrift {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotBlank
    private String land;

    @NotBlank
    private String ort;

    @NotBlank
    private String strasse;

    @NotBlank
    private String hausNr;

    @Size(max = 5)
    @NotBlank
    private String plz;

    @OneToOne(mappedBy = "anschrift")
    @JsonBackReference
    private Kunde kunde;

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNr() {
        return hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Anschrift{" +
                "id=" + id +
                ", land='" + land + '\'' +
                ", ort='" + ort + '\'' +
                ", strasse='" + strasse + '\'' +
                ", hausNr='" + hausNr + '\'' +
                ", plz='" + plz + '\'' +
                ", kunde=" + kunde +
                '}';
    }
}
