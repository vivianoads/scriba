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
public class CancelarCadastroUsuario implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        Secretario secretario = (Secretario) request.getSession().getAttribute("usuario_cadastrar");
        new SecretarioDao().apagaSecretario(secretario.getId());
        request.getSession().removeAttribute("usuario_cadastrar");
        String retorno = "secretario.html";
        return retorno;
    }
    
}
