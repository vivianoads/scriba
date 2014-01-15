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
public class AlterarDadosCadastroUsuario implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        request.getSession().setAttribute("opcao", "alterar");
        Secretario secretario = (Secretario) request.getSession().getAttribute("usuario_cadastrar");
        secretario = new SecretarioDao().atualizaSecretario(secretario.getId());
        
        request.getSession().setAttribute("usuario_cadastrar", secretario);
        
        String retorno = "secretario_form_cadastro_usuario.jsp";
        return retorno;
    }
    
}
