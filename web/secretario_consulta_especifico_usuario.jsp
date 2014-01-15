<%-- 
    Document   : secretario_confirma_cadastro_usuario
    Created on : 11/11/2013, 23:35:03
    Author     : viviano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>:.SCRIBA.:</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="estilo_secretario_consulta_especifico_usuario.css">
    </head>
    <body>
        <div id="container">
            <div id="conteudo_container">
                <div id="barra_topo">
                    <img src="scriba_barra_logo_impressao.png">
                </div>
                <br/>
                <br/>
                <div id="titulo_pagina">
                    <div id="botao_voltar">
                        <form name="cancelar_cadastro_usuario" action="Acesso" method="post">
                            <input type="hidden" name="acao" value="voltar_formulario_consulta_usuario">
                            <button class="i2Style_cancelar">Menu</button>
                        </form>
                    </div>
                    <div id="titulo">
                        Lista de Usuários
                    </div>
                    <div id="botao_imprimir">
                            <button onClick="javascript:window.print()" class="i2Style_cancelar">Imprimir</button>
                    </div>
                </div>
                <br/>
                <div id="bloco_form_cadastro_usuario">
                    <div id="conteudo_bloco_form_cadastro_usuario">
                        <div id="form_esq">
                            <div id="linha">
                                Login:
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
                                ${usuario_especifico.login}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.nome}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.estadoCivil}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.dataNascimento}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.endereco.rua}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.endereco.numero}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.endereco.bairro}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.endereco.cidade}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.endereco.cep}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.endereco.estado}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.email}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.telefone1}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.comunidade}
                            </div>
                            <div id="linha">
                                ${usuario_especifico.tipo}
                            </div>
                        </div>
                        <//c:forEach items="${list_usuarios}" var="item">
<!--                            <div id="linha">
                                <div id="form_esq">
                                    ${item.nome}
                                </div>
                                <div id="form_dir">
                                    <form name="cancelar_cadastro_usuario" action="Acesso" method="post">
                                        <input type="hidden" name="acao" value="detalhes_usuario">
                                        <input type="hidden" name="id_usuario" value="${item.id}">
                                        <button class="i2Style_cancelar">Detalhes</button>
                                    </form>
                                </div>
                            </div>-->
                        <//c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

