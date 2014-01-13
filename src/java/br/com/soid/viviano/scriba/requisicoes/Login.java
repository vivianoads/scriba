/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.SecretarioDao;
import br.com.soid.viviano.scriba.entidades.Pessoa;
import br.com.soid.viviano.scriba.entidades.Secretario;
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
        Pessoa u = null;
        
        SecretarioDao sd = new SecretarioDao();
        
        u = sd.logar(login, senha);
        
        if(u == null){ 
            retorno = "";
        }else{
            request.getSession().setAttribute("usuario_logado", u);
            retorno = "secretario.html";
        }
        
        return retorno;
    }
    
}
