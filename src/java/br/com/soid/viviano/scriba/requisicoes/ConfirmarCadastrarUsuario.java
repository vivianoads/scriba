/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.SecretarioDao;
import br.com.soid.viviano.scriba.entidades.Endereco;
import br.com.soid.viviano.scriba.entidades.Secretario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class ConfirmarCadastrarUsuario implements IRequisicao{

    @Override
    public String requisicao(HttpServletRequest request) {
        String retorno = "";
        
        Util util = new Util();
        
        String nome = request.getParameter("nome");
        String dataNascimento = request.getParameter("data_nascimento");
        String rua = request.getParameter("rua");
        String numero = request.getParameter("numero");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String cep = request.getParameter("cep");
        String uf = request.getParameter("uf");
        String estadoCivil = request.getParameter("estado_civil");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String comunidade = request.getParameter("comunidade");
        String tipo = request.getParameter("tipo_usuario");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        Endereco e = new Endereco();
        e.setBairro(bairro);
        e.setCep(cep);
        e.setCidade(cidade);
        e.setEstado(uf);
        e.setNumero(numero);
        e.setRua(rua);
        
        Secretario s = new Secretario();
        s.setComunidade(comunidade);
        s.setDataNascimento(util.formataData(dataNascimento));
        s.setEmail(email);
        s.setEndereco(e);
        s.setEstadoCivil(estadoCivil);
        s.setLogin(login);
        s.setNome(nome);
        s.setSenha(senha);
        s.setTelefone1(telefone);
        s.setTipo(tipo);
        
        String opcao = (String) request.getSession().getAttribute("opcao");
        
        SecretarioDao secretarioDao = new SecretarioDao();
        try {
            if(opcao == null){
                secretarioDao.cadastraUsuario(s);
                
            }else{
                Secretario secretario = (Secretario) request.getSession().getAttribute("usuario_cadastrar");
                s.setId(secretario.getId());
                secretarioDao.alterarUsuario(s);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ConfirmarCadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.getSession().setAttribute("usuario_cadastrar", s);
//        try {
//            request.setAttribute("usuario_cadastrado", secretarioDao.cadastraUsuario(s));
//        } catch (Exception ex) {
//            retorno = "erro.html";
//        }
//        System.out.println(request.getAttribute("usuario_cadastrado.nome"));
//        
        retorno = "secretario_confirma_cadastro_usuario.jsp";
        return retorno;
    }
}
