/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author viviano
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Dizimista.buscapornumero", query = "SELECT d FROM Dizimista d WHERE d.numero LIKE :numero"),
    @NamedQuery(name = "Dizimista.buscapornome", query = "SELECT d FROM Dizimista d WHERE d.nome LIKE :nome")    
})
public class Dizimista extends Pessoa{
    
    private static final String tipo = "dizimista";

    public static String getTipo() {
        return tipo;
    }
    private int numero;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Conjuge conjuge;
        
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Paroquia paroquia;
    
    @ManyToOne
    private Secretario secretarioCadastrante;
    
    @OneToMany(mappedBy = "dizimista")
    private List<Dizimo> dizimo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public List<Dizimo> getDizimo() {
        return dizimo;
    }

    public void setDizimo(List<Dizimo> dizimo) {
        this.dizimo = dizimo;
    }

    public Secretario getSecretarioCadastrante() {
        return secretarioCadastrante;
    }

    public void setSecretarioCadastrante(Secretario secretarioCadastrante) {
        this.secretarioCadastrante = secretarioCadastrante;
    }
    
    public Paroquia getParoquia() {
        return paroquia;
    }
    
    public void setParoquia(Paroquia paroquia) {
        this.paroquia = paroquia;
    }

    
    public Conjuge getConjuge() {
        return conjuge;
    }
    
    public void setConjuge(Conjuge conjuge) {
        this.conjuge = conjuge;
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    
}
