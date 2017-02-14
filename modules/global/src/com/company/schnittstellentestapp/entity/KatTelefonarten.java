package com.company.schnittstellentestapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "SCHNITTSTELLENTESTAPP_KAT_TELEFONARTEN")
@Entity(name = "schnittstellentestapp$KatTelefonarten")
public class KatTelefonarten extends StandardEntity {
    private static final long serialVersionUID = 8853558835178726768L;

    @Column(name = "BEZEICHNUNG")
    protected String bezeichnung;

    @Column(name = "CODE")
    protected String code;

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }


}