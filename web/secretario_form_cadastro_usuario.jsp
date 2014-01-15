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
        <link rel="stylesheet" type="text/css" href="estilo_formularios_de_cadastro.css">
    </head>
    <body>
        <div id="container">
            <div id="conteudo_container">
                <div id="barra_topo">
                    <img src="scriba_barra_logo.png">
                </div>
                <div id="titulo_pagina">
                    Formulário de Cadastro de Usuários do Sistema
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
                            <form name="formulario_cadastro_usuario" action="Acesso" method="post">
                                <input class="inputtext" type="text" name="login" size="40" value="${usuario_cadastrar.login}"></br>
                                <input class="inputtext" type="password" name="senha" size="40" value="${usuario_cadastrar.senha}"></br>
                                <input class="inputtext" type="text" name="nome" size="80" value="${usuario_cadastrar.nome}"></br>
                                <input class="inputtext" type="text" name="estado_civil" size="40" value="${usuario_cadastrar.estadoCivil}"></br>
                                <input class="inputtext" type="text" name="data_nascimento" size="10"value=" ${usuario_cadastrar.dataNascimento}"></br>
                                <input class="inputtext" type="text" name="rua" size="80" value="${usuario_cadastrar.endereco.rua}"></br>
                                <input class="inputtext" type="text" name="numero" size="10" value="${usuario_cadastrar.endereco.numero}"></br>
                                <input class="inputtext" type="text" name="bairro" size="80" value="${usuario_cadastrar.endereco.bairro}"></br>
                                <input class="inputtext" type="text" name="cidade" size="80" value="${usuario_cadastrar.endereco.cidade}"></br>
                                <input class="inputtext" type="text" name="cep" size="10" value="${usuario_cadastrar.endereco.cep}"></br>
                                <input class="inputtext" type="text" name="uf" size="2" value="${usuario_cadastrar.endereco.estado}"></br>
                                <input class="inputtext" type="text" name="email" size="80" value="${usuario_cadastrar.email}"></br>
                                <input class="inputtext" type="text" name="telefone" size="40" value="${usuario_cadastrar.telefone1}"></br>
                                <input class="inputtext" type="text" name="comunidade" size="40" value="${usuario_cadastrar.comunidade}"></br>
                                ${usuario_cadastrar.tipo}
                                <input type="radio" name="tipo_usuario" value="secretario">Secretario
                                <input type="radio" name="tipo_usuario" value="agente" checked>Agente da Pastoral do Dízimo 
                                <input type="hidden" name="acao" value="confirmar_usuario">
                                <br/>
                                <button class="i2Style">Salvar</button>
                            </form>

                        </div>


                        <!--                            
                        -->




                        <!--                            <table>
                                                        <tr>
                                                            <td>
                                                                Login
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="login" size="40"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Senha
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="password" name="senha" size="40"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Nome
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="nome" size="80"></p> 
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Estado Civil
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="estado_civil" size="40"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Data de Nascimento
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="data_nascimento" size="10"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Rua
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="rua" size="80"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Numero
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="numero" size="10"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Bairro
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="bairro" size="80"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Cidade
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="cidade" size="80"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                CEP
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="cep" size="10"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                UF
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="uf" size="2"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Email
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="email" size="80"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Telefone
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="telefone" size="40"></p>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                Comunidade
                                                            </td>
                                                            <td>
                                                                <p><input class="inputtext" type="text" name="comunidade" size="40"></p>
                                                            </td>
                                                        </tr>
                                                    </table>-->
                        <!--                            Login: 
                                                    <input class="inputtext" type="text" name="login" size="80">
                                                    Senha: 
                                                    <input class="inputtext" type="password" name="senha" size="80">
                                                    Nome
                                                    <input class="inputtext" type="text" name="nome" size="80">
                                                    Estado Civil
                                                    <input class="inputtext" type="text" name="estado_civil" size="80">
                                                    Data de Nascimento
                                                    <input class="inputtext" type="text" name="data_nascimento" size="80">
                                                    Rua
                                                    <input class="inputtext" type="text" name="rua" size="80">
                                                    Numero
                                                    <input class="inputtext" type="text" name="numero" size="80">
                                                    Bairro
                                                    <input class="inputtext" type="text" name="bairro" size="80">
                                                    Cidade
                                                    <input class="inputtext" type="text" name="cidade" size="80">
                                                    CEP
                                                    <input class="inputtext" type="text" name="cep" size="80">
                                                    UF
                                                    <input class="inputtext" type="text" name="uf" size="80">
                                                    Email
                                                    <input class="inputtext" type="text" name="email" size="80">
                                                    Telefone
                                                    <input class="inputtext" type="text" name="telefone" size="80">
                                                    Comunidade
                                                    <input class="inputtext" type="text" name="comunidade" size="80">-->

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

