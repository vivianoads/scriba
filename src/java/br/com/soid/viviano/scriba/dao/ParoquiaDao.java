/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.dao;

import br.com.soid.viviano.scriba.conexao.Conexao;
import br.com.soid.viviano.scriba.entidades.Paroquia;
import javax.persistence.EntityManager;

/**
 *
 * @author viviano
 */
public class ParoquiaDao {
    EntityManager manager = Conexao.manager;
    
    public Paroquia consultaParoquia(){
        return manager.find(Paroquia.class, 2151L);
    }
}
