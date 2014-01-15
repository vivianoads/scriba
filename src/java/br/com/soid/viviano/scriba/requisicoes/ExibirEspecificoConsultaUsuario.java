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
public class ExibirEspecificoConsultaUsuario implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        String retorno = "secretario_consulta_especifico_usuario.jsp";
        Long id = new Long(request.getParameter("id_usuario"));
        Secretario secretario = new SecretarioDao().buscaSecretario(id);
        request.getSession().removeAttribute("list_usuarios");
        request.getSession().setAttribute("usuario_especifico", secretario);
        return retorno;
    }
    
}
