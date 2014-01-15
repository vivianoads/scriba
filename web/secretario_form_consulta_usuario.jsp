<%-- 
    Document   : secretario_form_cadastro_usuario
    Created on : 14/01/2014, 15:49:35
    Author     : viviano
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>:.SCRIBA.:</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" type="text/css" href="estilo_formulario_de_consulta_usuario.css">
    </head>
    <body>
        <div id="container">
            <div id="conteudo_container">
                <div id="barra_topo">
                    <img src="scriba_barra_logo.png">
                </div>
                <div id="titulo_pagina">
                    Formulário de Consulta de Usuários do Sistema
                </div>
                <div id="bloco_form_cadastro_usuario">
                    <div id="conteudo_bloco_form_cadastro_usuario">
                        <div id="form_esq">
                            <br/>
                            <div id="linha">
                                Todos os Usuários: 
                            </div>
                            <br/>
                            <div id="linha">
                                Apenas Secretários:
                            </div>
                            <br/>
                            <div id="linha">
                                Apenas Agentes:
                            </div>
                            <br/>
                            <div id="linha">
                                Por Nome:
                            </div>
                        </div>
                        <div id="form_dir">
                            <br/>
                            <div id="linha">
                                <form name="formulario_cadastro_usuario" action="Acesso" method="post">
                                    <input type="hidden" name="acao" value="secretario_consultar_todos_usuarios">
                                    <button class="i2Style">Buscar</button>
                                </form>
                            </div>
                            <br/>
                            <div id="linha">
                                <form name="formulario_cadastro_usuario" action="Acesso" method="post">
                                    <input type="hidden" name="acao" value="secretario_consultar_todos_secretarios">
                                    <button class="i2Style">Buscar</button>
                                </form>
                            </div>
                            <br/>
                            <div id="linha">
                                <form name="formulario_cadastro_usuario" action="Acesso" method="post">
                                    <input type="hidden" name="acao" value="secretario_consultar_todos_agentes">
                                    <button class="i2Style">Buscar</button>
                                </form>
                            </div>
                            <br/>
                            <div id="linha">
                                <form name="formulario_cadastro_usuario" action="Acesso" method="post">
                                    <input type="hidden" name="acao" value="secretario_consultar_todos_agentes">
                                    <input class="inputtext" type="text" name="nome_buscar" size="40">
                                    <button class="i2Style">Buscar</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

