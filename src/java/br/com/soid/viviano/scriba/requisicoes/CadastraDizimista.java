/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import br.com.soid.viviano.scriba.dao.DizimistaDao;
import br.com.soid.viviano.scriba.dao.ParoquiaDao;
import br.com.soid.viviano.scriba.entidades.Conjuge;
import br.com.soid.viviano.scriba.entidades.Dizimista;
import br.com.soid.viviano.scriba.entidades.Endereco;
import br.com.soid.viviano.scriba.entidades.Paroquia;
import br.com.soid.viviano.scriba.entidades.Secretario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author viviano
 */
public class CadastraDizimista implements IRequisicao{    
    @Override
    public String requisicao(HttpServletRequest request) {
        String retorno = new String();
        
        Util util = new Util();
        
        String dataCasamento = request.getParameter("data_casamento");
        String dataNascimentoConjuge = request.getParameter("data_nascimento_conjuge");
        String nomeConjuge = request.getParameter("nome_conjuge");
        String emailConjuge = request.getParameter("email_conjuge");
        String telefoneConjuge = request.getParameter("telefone_conjuge");
        String dataNascimento = request.getParameter("data_nascimento");
        String rua = request.getParameter("rua");
        String numero = request.getParameter("numero");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String cep = request.getParameter("cep");
        String uf = request.getParameter("uf");
        String comunidade = request.getParameter("comunidade");
        String dataInicio = request.getParameter("data_de_dizimista");
        String email = request.getParameter("email");
        String estadoCivil = request.getParameter("estado_civil");
        String nome = request.getParameter("nome");
        String telefone = request.getParameter("telefone");
        
        Dizimista dizimista = new Dizimista();
        
       
        Endereco endereco = new Endereco();
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
        endereco.setEstado(uf);
        endereco.setNumero(numero);
        endereco.setRua(rua);
        
        ParoquiaDao paroquiaDao = new ParoquiaDao();
        Paroquia paroquia = paroquiaDao.consultaParoquia();
        
        Secretario secretario = (Secretario) request.getSession().getAttribute("usuario_logado");
        dizimista.setSecretarioCadastrante(secretario);
        dizimista.setComunidade(comunidade);
        
        dizimista.setDataInicio(util.formataData(dataInicio));
        dizimista.setDataNascimento(util.formataData(dataNascimento));
        dizimista.setDizimo(null);
        dizimista.setEmail(email);
        dizimista.setEndereco(endereco);
        dizimista.setEstadoCivil(estadoCivil);
        
        if(dizimista.getEstadoCivil().equals("casado")){
            
            if((dataCasamento.isEmpty()) || (dataNascimentoConjuge.isEmpty())||(nomeConjuge.isEmpty())) retorno = "#";
            
            Conjuge conjuge = new Conjuge();
            conjuge.setDataCasamento(util.formataData(dataCasamento));
            conjuge.setDataNascimento(util.formataData(dataNascimentoConjuge));
            conjuge.setDizimista(dizimista);
            conjuge.setEmail(emailConjuge);
            conjuge.setEndereco(dizimista.getEndereco());
            conjuge.setEstadoCivil(dizimista.getEstadoCivil());
            conjuge.setNome(nomeConjuge);
            conjuge.setTelefone(telefoneConjuge);
            dizimista.setConjuge(conjuge);
        }    
        dizimista.setNome(nome);
        dizimista.setParoquia(paroquia);
        dizimista.setTelefone(telefone);
        
        DizimistaDao dizimistaDao = new DizimistaDao();
        dizimistaDao.persisteDizimista(dizimista);
        
        return retorno;
    }
    
}
