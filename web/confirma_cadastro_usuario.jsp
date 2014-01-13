<%-- 
    Document   : confirma_cadastro_usuario
    Created on : 11/11/2013, 10:38:36
    Author     : viviano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> </head>
        <link rel="stylesheet" type="text/css" href="estilo_confirma_cadastro_usuario_html.css">
    <body>
        <div id="container">
            <div id="conteudo_container">
                <div id="barra_topo">
                    <img src="scriba_barra_logo.png">
                </div>
                <div id="bloco_form_login">
                    <div id="conteudo_bloco_form_login">
                        <div id="botao_cancelar">
                        <form name="formulario_login" action="Acesso" method="post">
                            <input type="hidden" name="acao" value="retornar_pagina_secretario">
                            <button class="i2Style_cancelar">Voltar ao Menu</button>
                        </form>
                    </div>
                        <p>Usuário Cadastrado com Sucesso</p>
                        <br/>
                        <br/>
                        <br/>
                        <form name="formulario_login" action="Acesso" method="post">
                            <input type="hidden" name="acao" value="cadastrar_novo">
                            <button class="i2Style">Cadastrar Novo Usuario</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
