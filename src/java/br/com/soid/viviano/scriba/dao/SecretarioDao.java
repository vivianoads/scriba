/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.dao;

import br.com.soid.viviano.scriba.conexao.Conexao;
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
//            System.out.println("entrou na exception");
        }
        return secretario;
     }
     
     public Secretario cadastraUsuario(Secretario secretario)throws Exception{
         entityManager.getTransaction().begin();
         entityManager.persist(secretario);
         entityManager.getTransaction().commit();
         return this.buscaSecretario(secretario.getId());
     }
     
     public Secretario buscaSecretario(Long id){
         
         Secretario secretario = null;
         
         entityManager.getTransaction().begin();
         secretario = entityManager.find(Secretario.class, id);
         entityManager.getTransaction().commit();
         
         return secretario;
     }
     
     public void apagaSecretario(Long id){
         entityManager.getTransaction().begin();
         Secretario secretario = entityManager.find(Secretario.class, id);
         entityManager.remove(secretario);
         entityManager.getTransaction().commit();
     }
     
     public Secretario atualizaSecretario(Long id){
         entityManager.getTransaction().begin();
         Secretario secretario = entityManager.find(Secretario.class, id);
         entityManager.refresh(secretario);
         entityManager.getTransaction().commit();
         return secretario;
     }
     
     public void alterarUsuario(Secretario secretario){
         entityManager.getTransaction().begin();
         entityManager.merge(secretario);
         entityManager.getTransaction().commit();
     }
}
