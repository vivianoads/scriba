/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.SecretarioDao;
import br.com.soid.viviano.scriba.entidades.Secretario;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CadastrarUsuario implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        String retorno = "confirma_cadastro_usuario.jsp";
        SecretarioDao secretarioDao = new SecretarioDao();
        
        try {
            secretarioDao.cadastraUsuario((Secretario) request.getSession().getAttribute("usuario_cadastrar"));
        } catch (Exception ex) {
            System.out.println("ERRO");
            retorno = "erro.html";
        }
        
        return retorno;
    }
    
}
