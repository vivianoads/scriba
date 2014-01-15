/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.SecretarioDao;
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
        String retorno = "";
        Secretario u = null;
        
        SecretarioDao sd = new SecretarioDao();
        
        u = sd.logar(login, senha);
        try{
            request.getSession().setAttribute("usuario_logado", u);
            System.out.println(u.getTipo());
            if(u.getTipo().equals("secretario")){
                retorno = "secretario.html";
            }else{
                retorno = "agente_pastoral_do_dizimo.html";
            }
            }catch(Exception e){
            }
        return retorno;
    }
    
}
