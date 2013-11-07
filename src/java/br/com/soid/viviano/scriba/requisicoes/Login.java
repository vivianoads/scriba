/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.AgentePastoralDizimoDao;
import br.com.soid.viviano.scriba.dao.SecretarioDao;
import br.com.soid.viviano.scriba.entidades.Usuario;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class Login implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String retorno = new String();
        Usuario u = null;
        
        AgentePastoralDizimoDao apdd = new AgentePastoralDizimoDao();
        SecretarioDao sd = new SecretarioDao();
        
        u = apdd.logaAgentePastoralDizimo(login, senha);
        if(u == null){
            u = sd.logar(login, senha);
        }
        if(u == null) retorno = "";
        else retorno = u.tipo() + ".html";
        
        return retorno;
    }
    
}
