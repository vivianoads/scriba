/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author viviano
 */
public class Controlador {
    
    private static Controlador controlador;
    private static Map<String, IRequisicao> requisicoes;
    
    
    private Controlador(){
        requisicoes = new HashMap<String, IRequisicao>();
        
        requisicoes.put("login", new Login());
        requisicoes.put("cadastrar_dizimista", new CadastraDizimista());
        requisicoes.put("cancelar_cadastrar_usuario", new CancelarCadastroUsuario());
        requisicoes.put("cadastrar_usuario", new CadastrarUsuario());
        requisicoes.put("confirmar_usuario", new ConfirmarCadastrarUsuario());
        requisicoes.put("cadastrar_novo", new RetornaCadastroUsuario());
        requisicoes.put("retornar_pagina_secretario", new RetornaPaginaSecretario());
        requisicoes.put("secretario_cadastrar_novo_usuario", new AbrirPaginaFormularioCadastroUsuario());
        requisicoes.put("alterar_dados_usuario", new AlterarDadosCadastroUsuario());
    }
    public static Controlador getControlador(){
        if (controlador == null){
            controlador  = new Controlador();
        }
        return controlador;
    }
    public static IRequisicao getRequisicao(String chave){
        return requisicoes.get(chave);
    }
}
