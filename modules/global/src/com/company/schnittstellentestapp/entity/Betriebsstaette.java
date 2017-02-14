package com.company.schnittstellentestapp.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "SCHNITTSTELLENTESTAPP_BETRIEBSSTAETTE")
@Entity(name = "schnittstellentestapp$Betriebsstaette")
public class Betriebsstaette extends StandardEntity {
    private static final long serialVersionUID = 5569508123155959100L;

    @Transient
    @MetaProperty
    protected String name;

    @Column(name = "ADRESSE")
    protected String adresse;

    @Column(name = "TELEFONNUMMER")
    protected String telefonnummer;

    @Column(name = "BEZEICHNUNG")
    protected String bezeichnung;

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }


    public void setName(String name) {
        this.bezeichnung = name;
    }

    public String getName() {
        return bezeichnung;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }


}