/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.SecretarioDao;
import br.com.soid.viviano.scriba.entidades.Secretario;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class ListarUsuarios implements IRequisicao {

    @Override
    public String requisicao(HttpServletRequest request) {
        String retorno = "secretario_consulta_lista_usuarios.jsp";
        String tipoSecretario = request.getParameter("tipo_secretario");
        Integer tipoConsulta = new Integer(request.getParameter("tipo_consulta"));
        String nomeConsulta = request.getParameter("nome_consulta");
        SecretarioDao secretarioDao = new SecretarioDao();
        List<Secretario> secretarios = new ArrayList<Secretario>();
        switch (tipoConsulta) {
            case 1: secretarios = secretarioDao.buscaTodosSecretarios(); break;
            case 2: secretarios = secretarioDao.buscaSecretariosTipo(tipoSecretario); break;
            case 3: secretarios = secretarioDao.buscaSecretariosPorNome(nomeConsulta); break;
        }
        System.out.println("secretarios " + secretarios.size());
        request.getSession().setAttribute("list_usuarios", secretarios);
        for (Secretario s : secretarios) {
            System.out.println(s.getNome());
        }
        return retorno;
    }

}
