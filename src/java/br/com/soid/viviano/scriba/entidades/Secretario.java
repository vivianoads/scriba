/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author viviano
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Secretario.logar", query = "SELECT sec FROM Secretario sec WHERE sec.login LIKE :login AND sec.senha LIKE :senha")
})
public class Secretario extends Pessoa{
    
    private String tipo;
    
    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false)
    private String senha;
    
    @OneToMany
    private List<Dizimo> dizimos;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    public List<Dizimo> getDizimos() {
        return dizimos;
    }

    public void setDizimos(List<Dizimo> dizimos) {
        this.dizimos = dizimos;
    }   
    
}
