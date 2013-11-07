/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author viviano
 */
public class Conexao {
    
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("Scriba_2.0-PU");
    public static final EntityManager manager = factory.createEntityManager();
    
}
