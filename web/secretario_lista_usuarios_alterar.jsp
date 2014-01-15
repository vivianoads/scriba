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
        <link rel="stylesheet" type="text/css" href="estilo_secretario_consulta_lista_usuarios.css">
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
                        <c:forEach items="${list_usuarios}" var="item">
                            <div id="linha">
                                <div id="form_esq">
                                    ${item.nome}
                                </div>
                                <div id="form_dir">
                                    <form name="cancelar_cadastro_usuario" action="Acesso" method="post">
                                        <input type="hidden" name="acao" value="exibir_especifico_usuario">
                                        <input type="hidden" name="id_usuario" value="${item.id}">
                                        <button class="i2Style_cancelar">Detalhes</button>
                                    </form>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

