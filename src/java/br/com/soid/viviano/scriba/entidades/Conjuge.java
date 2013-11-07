/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author viviano
 */
@Entity
public class Conjuge extends Pessoa {
    private static final String tipo = "conjuge";

    public static String getTipo() {
        return tipo;
    }
    @OneToOne(mappedBy = "conjuge")
    private Dizimista dizimista;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCasamento;

    public Date getDataCasamento() {
        return dataCasamento;
    }

    public void setDataCasamento(Date dataCasamento) {
        this.dataCasamento = dataCasamento;
    }
    public Dizimista getDizimista() {
        return dizimista;
    }

    public void setDizimista(Dizimista dizimista) {
        this.dizimista = dizimista;
    }
    
    
}
