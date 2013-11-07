/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.dao;

import br.com.soid.viviano.scriba.conexao.Conexao;
import br.com.soid.viviano.scriba.entidades.AgentePastoralDizimo;
import br.com.soid.viviano.scriba.entidades.Secretario;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author viviano
 */
public class SecretarioDao {
     EntityManager entityManager = Conexao.manager;
     
     public Secretario logar(String login, String senha){
        Secretario secretario = null;
    
        Query query = entityManager.createNamedQuery("Secretario.logar");
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        try{
            secretario = (Secretario) query.getSingleResult();
        }catch(Exception e){
        }
        return secretario;
     }
}
