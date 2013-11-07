/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author viviano
 */
@Entity
public class Dizimo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "gen_dizimo", sequenceName = "seq_dizimo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_dizimo")
    private Long id;
    
    @ManyToOne
    private Dizimista dizimista;
    
    private Double valor;
    
    @Temporal(TemporalType.DATE)
    private Date dataContribuicao;
    
    @Column(nullable = false, length = 7)
    private String referencia;

    public Dizimista getDizimista() {
        return dizimista;
    }

    public void setDizimista(Dizimista dizimista) {
        this.dizimista = dizimista;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataContribuicao() {
        return dataContribuicao;
    }

    public void setDataContribuicao(Date dataContribuicao) {
        this.dataContribuicao = dataContribuicao;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dizimo)) {
            return false;
        }
        Dizimo other = (Dizimo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.soid.viviano.scriba.Dizimo[ id=" + id + " ]";
    }
    
}
