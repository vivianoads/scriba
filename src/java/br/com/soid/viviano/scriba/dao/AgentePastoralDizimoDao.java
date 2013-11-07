/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.dao;

import br.com.soid.viviano.scriba.conexao.Conexao;
import br.com.soid.viviano.scriba.entidades.AgentePastoralDizimo;
import javax.persistence.EntityManager;
import javax.persistence.Query;



/**
 *
 * @author viviano
 */
public class AgentePastoralDizimoDao {
    
    EntityManager entityManager = Conexao.manager;
    
    public void Gravar(AgentePastoralDizimo agente){
        
        entityManager.getTransaction().begin();
        
        entityManager.persist(agente);
        
        entityManager.getTransaction().commit();
        entityManager.close();
        
    }
    
    public AgentePastoralDizimo logaAgentePastoralDizimo(String login, String senha){
        AgentePastoralDizimo agentePastoralDizimo = null;
        
        Query query = entityManager.createNamedQuery("AgentePastoralDizimo.logar");
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        try{
        agentePastoralDizimo = (AgentePastoralDizimo) query.getSingleResult();
        }catch(Exception e){
        }
        return agentePastoralDizimo;
    }
    
    public AgentePastoralDizimo buscaAgentePastoralDizimo(Long id){
        
        AgentePastoralDizimo agentePastoralDizimo = new AgentePastoralDizimo();
        
//        entityManager.getTransaction().begin();
        
        
        agentePastoralDizimo = entityManager.find(AgentePastoralDizimo.class, id);
        
        return agentePastoralDizimo;
        
        
    }
}
