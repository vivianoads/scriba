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
public class RetornaCadastroUsuario implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        return "secretario_cadastro_usuario.html";
    }
    
}
