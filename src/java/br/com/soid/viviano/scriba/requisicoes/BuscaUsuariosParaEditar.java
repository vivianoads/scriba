/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.SecretarioDao;
import br.com.soid.viviano.scriba.entidades.Secretario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class BuscaUsuariosParaEditar implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        String retorno = "secretario_lista_usuarios_alterar.jsp";
        List<Secretario> secretarios = new SecretarioDao().buscaTodosSecretarios();
        request.getSession().setAttribute("list_usuarios_editar", secretarios);
        return retorno;
    }
    
}
