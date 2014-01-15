<%-- 
    Document   : secretario_confirma_cadastro_usuario
    Created on : 11/11/2013, 23:35:03
    Author     : viviano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>:.SCRIBA.:</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="estilo_secretario_confirma_cadastro_usuario_html.css">
    </head>
    <body>
        <div id="container">
            <div id="conteudo_container">
                <div id="barra_topo">
                    <img src="scriba_barra_logo.png">
                </div>
                
                <div id="titulo_pagina">
                    Usuário Cadastrado com Sucesso. Confirme os dados! Usuario: ${usuario_logado.login}
                </div>
                <div id="bloco_form_cadastro_usuario">
                    <div id="conteudo_bloco_form_cadastro_usuario">
                        <div id="form_esq">
                            <div id="linha">
                                Login:
                            </div>
                            <div id="linha">
                                Senha:
                            </div>
                            <div id="linha">
                                Nome:
                            </div>
                            <div id="linha">
                                Estado Civil:
                            </div>
                            <div id="linha">
                                Data de Nascimento:
                            </div>
                            <div id="linha">
                                Rua:
                            </div>
                            <div id="linha">
                                Numero:
                            </div>
                            <div id="linha">
                                Bairro:
                            </div>
                            <div id="linha">
                                Cidade:
                            </div>
                            <div id="linha">
                                CEP:
                            </div>
                            <div id="linha">
                                UF:
                            </div>
                            <div id="linha">
                                Email:
                            </div>
                            <div id="linha">
                                Telefone:
                            </div>
                            <div id="linha">
                                Comunidade:
                            </div>
                            <div id="linha">
                                Tipo de Usuário:
                            </div>
                        </div>
                        <div id="form_dir">      
                            <div id="linha">
                                ${usuario_cadastrar.login}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.senha}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.nome}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.estadoCivil}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.dataNascimento}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.endereco.rua}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.endereco.numero}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.endereco.bairro}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.endereco.cidade}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.endereco.cep}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.endereco.estado}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.email}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.telefone1}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.comunidade}
                            </div>
                            <div id="linha">
                                ${usuario_cadastrar.tipo}
                            </div>
                        </div>
                        <div id="botoes">
                            <div id="botao_esq">
                                <form name="cancelar_cadastro_usuario" action="Acesso" method="post">
                                    <input type="hidden" name="acao" value="cancelar_cadastrar_usuario">
                                    <button class="i2Style_cancelar">Cancelar</button>
                                </form>
                            </div>
                            <div id="botao_meio">
                                <form name="formulario_cadastro_usuario" action="Acesso" method="post">
                                    <input type="hidden" name="acao" value="alterar_dados_usuario">
                                    <button class="i2Style_alterar">Alterar</button>
                                </form>
                            </div>
                            <div id="botao_dir">
                                <form name="formulario_cadastro_usuario" action="Acesso" method="post">
                                    <input type="hidden" name="acao" value="cadastrar_usuario">
                                    <button class="i2Style">Confirmar</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

