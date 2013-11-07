/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author viviano
 */
@Entity
public class Dizimista extends Pessoa{
    
    private static final String tipo = "dizimista";

    public static String getTipo() {
        return tipo;
    }
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;

    @OneToOne
    private Conjuge conjuge;
    
    @OneToMany
    private List<Filho> filho;
    
    @ManyToOne
    private Paroquia paroquia;

    @ManyToOne
    private AgentePastoralDizimo agentePastoralDizimoCadastrante;

    @ManyToOne
    private Secretario secretarioCadastrante;

    
    
    @OneToMany(mappedBy = "dizimista")
    private List<Dizimo> dizimo;

    public List<Dizimo> getDizimo() {
        return dizimo;
    }

    public void setDizimo(List<Dizimo> dizimo) {
        this.dizimo = dizimo;
    }
    
    public AgentePastoralDizimo getAgentePastoralDizimoCadastrante() {
        return agentePastoralDizimoCadastrante;
    }

    public void setAgentePastoralDizimoCadastrante(AgentePastoralDizimo agentePastoralDizimoCadastrante) {
        this.agentePastoralDizimoCadastrante = agentePastoralDizimoCadastrante;
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

    public List<Filho> getFilho() {
        return filho;
    }

    public void setFilho(List<Filho> filho) {
        this.filho = filho;
    }

    
    
    
    
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    
}
