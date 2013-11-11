/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.DizimistaDao;
import br.com.soid.viviano.scriba.entidades.Dizimista;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class BuscaDizimistaPorNome implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        String proximo = new String();
        String nome = request.getParameter("nome");
        DizimistaDao dizimistaDao = new DizimistaDao();
        
        List<Dizimista> dizimistas = new ArrayList<Dizimista>();
        
        dizimistas = dizimistaDao.consultaDizimistaPorNome(nome);
       
        if(dizimistas.size() == 0){
            proximo = "";
        }else{
            request.setAttribute("lista_dizimistas", dizimistas);
            proximo = "lista_dizimistas_consulta.html";
        }
        
       return proximo;
       
    }
    
}
