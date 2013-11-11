/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.dao;

import br.com.soid.viviano.scriba.conexao.Conexao;
import br.com.soid.viviano.scriba.entidades.Dizimista;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author viviano
 */
public class DizimistaDao {
    EntityManager manager = Conexao.manager;
    
    public Dizimista persisteDizimista(Dizimista dizimista){
        manager.getTransaction().begin();
        manager.persist(dizimista);
        manager.getTransaction().commit();
        
        Dizimista retorno = null;
        retorno = manager.find(Dizimista.class, dizimista.getId());
        return retorno;
    }
    
    public Dizimista consultaDizimistaPorNumero(Integer numero){
        Dizimista dizimista = null;
        
        Query query = manager.createNamedQuery("Dizimista.buscapornumero");
        query.setParameter("numero", numero);
        try{
            dizimista = (Dizimista)query.getSingleResult();
        }catch(Exception e){
            
        }
        return dizimista;
    }
    
    public List<Dizimista> consultaDizimistaPorNome(String nome){
        List<Dizimista> dizimistas = new ArrayList<Dizimista>();
        
        Query query = manager.createNativeQuery("select p.nome from dizimista d, pessoa p where p.id = d.id and p.nome ilike ?");//manager.createNamedQuery("Dizimista.buscapornome");
        query.setParameter(1, nome);
        dizimistas = query.getResultList();
        
        return dizimistas;
    }
}
