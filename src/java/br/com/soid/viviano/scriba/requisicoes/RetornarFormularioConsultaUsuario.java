/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class RetornarFormularioConsultaUsuario implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        String retorno = "secretario_form_consulta_usuario.jsp";
        return retorno;
    }
    
}
