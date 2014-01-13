/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.entidades;

import br.com.soid.viviano.scriba.conexao.Conexao;
import br.com.soid.viviano.scriba.dao.DizimistaDao;
import br.com.soid.viviano.scriba.dao.ParoquiaDao;
import br.com.soid.viviano.scriba.dao.SecretarioDao;
import br.com.soid.viviano.scriba.requisicoes.CadastraDizimista;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author viviano
 */
public class Teste {
    
     public Date formataData(String texto){
        String[] vetor = texto.split("/");
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(vetor[0]), Integer.parseInt(vetor[2]), Integer.parseInt(vetor[1]));
        return c.getTime();
    }
    
    public static void main(String[] args) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Scriba_2.0-PU");
//        EntityManager manager = factory.createEntityManager();
//        
//        
//        
//        Dizimo dizimo = new Dizimo();
//        dizimo.setDataContribuicao(new Date());
//        dizimo.setDizimista(null);
//        dizimo.setReferencia("11/2013");
//        dizimo.setValor(120.0);
//        
//        Dizimo dizimo2 = new Dizimo();
//        dizimo2.setDataContribuicao(new Date());
//        dizimo2.setDizimista(null);
//        dizimo2.setReferencia("10/2013");
//        dizimo2.setValor(120.0);
//        
//        List<Dizimo> dizimos = new ArrayList<Dizimo>();
//        dizimos.add(dizimo);
//        dizimos.add(dizimo2);
//        
//        Endereco enderecoDizimista = new Endereco();
//        enderecoDizimista.setBairro("centro");
//        enderecoDizimista.setCep("58900000");
//        enderecoDizimista.setCidade("pombal");
//        enderecoDizimista.setEstado("PB");
//        enderecoDizimista.setNumero("s/n");
//        enderecoDizimista.setRua("rua de Nossa Senhora");
//        
//        
//        
//        Endereco enderecoAgentePastoralDizimo = new Endereco();
//        enderecoAgentePastoralDizimo.setBairro("centro");
//        enderecoAgentePastoralDizimo.setCep("58900000");
//        enderecoAgentePastoralDizimo.setCidade("pombal");
//        enderecoAgentePastoralDizimo.setEstado("PB");
//        enderecoAgentePastoralDizimo.setNumero("s/n");
//        enderecoAgentePastoralDizimo.setRua("rua de Nossa Senhora");
//        
//        AgentePastoralDizimo agentePastoralDizimo = new AgentePastoralDizimo();
//        agentePastoralDizimo.setLogin("julieth");
//        agentePastoralDizimo.setSenha("123");
//        agentePastoralDizimo.setComunidade("barra");
//        agentePastoralDizimo.setDataNascimento("17/12/1992");
//        agentePastoralDizimo.setEmail("agentepastoraldizimo01@paroquia");
//        agentePastoralDizimo.setDizimos(null);
//        agentePastoralDizimo.setEndereco(enderecoAgentePastoralDizimo);
//        agentePastoralDizimo.setEstadoCivil("solteiro");
//        agentePastoralDizimo.setNome("agentepastoraldizimo01");
//        agentePastoralDizimo.setTelefone("9999-9999");
//        
//        Conjuge conjuge = new Conjuge();
//        conjuge.setComunidade("nova vida");
//        conjuge.setDataCasamento(new Date());
//        conjuge.setDataNascimento("24/08/1990");
//        conjuge.setEmail("conjuge01@paroquia");
//        conjuge.setEndereco(enderecoDizimista);
//        conjuge.setEstadoCivil("casado");
//        conjuge.setNome("conjuge01");
//        conjuge.setTelefone("9999-0001");
//        
//        Filho filho = new Filho();
//        filho.setNome("filho");
//        
//        Filho filho1 = new Filho();
//        filho1.setNome("filho1");
//        
//        List<Filho> filhos = new ArrayList<Filho>();
//        filhos.add(filho);
//        filhos.add(filho1);
//        
//        Paroquia paroquia = new Paroquia();
//        paroquia.setDiocese("cajazeiras");
//        paroquia.setEndereco(enderecoDizimista);
//        paroquia.setFundacao(new Date());
//        paroquia.setNome("Paróquia Nossa Senhora do Bom Sucesso");
//        paroquia.setPadroeiro("Nossa Senhora do Bom Sucesso");
//        
//        Secretario secretario = new Secretario();
//        secretario.setLogin("nea");
//        secretario.setSenha("123");
//        secretario.setComunidade("centro");
//        secretario.setDataNascimento("11/01/1996");
//        secretario.setDizimos(null);
//        secretario.setEmail("secretario@paroquia");
//        secretario.setEndereco(enderecoAgentePastoralDizimo);
//        secretario.setEstadoCivil("casado");
//        secretario.setNome("Antoniel");
//        secretario.setTelefone("9999-0002");
//        
//        Dizimista dizimista = new Dizimista();
//        dizimista.setAgentePastoralDizimoCadastrante(agentePastoralDizimo);
//        dizimista.setComunidade("nova vida");
//        dizimista.setConjuge(conjuge);
//        dizimista.setDataInicio(new Date());
//        dizimista.setDataNascimento("17/12/1992");
//        dizimista.setDizimo(dizimos);
//        dizimista.setEmail("dizimista01@paroquia");
//        dizimista.setEndereco(enderecoDizimista);
//        dizimista.setEstadoCivil("casado");
//        dizimista.setFilho(filhos);
//        dizimista.setNome("dizimista01");
//        dizimista.setParoquia(paroquia);
//        dizimista.setSecretarioCadastrante(null);
//        dizimista.setTelefone("9999-0000");
//        
//        Dizimista dizimista2 = new Dizimista();
//        dizimista2.setAgentePastoralDizimoCadastrante(null);
//        dizimista2.setComunidade("nova vida");
//        dizimista2.setDataInicio(new Date());
//        dizimista2.setDataNascimento("17/12/1992");
//        dizimista2.setDizimo(dizimos);
//        dizimista2.setEmail("dizimista01@paroquia");
//        dizimista2.setEndereco(enderecoDizimista);
//        dizimista2.setEstadoCivil("solteiro");
//        dizimista2.setConjuge(null);
//        dizimista2.setFilho(null);
//        dizimista2.setNome("dizimista02");
//        dizimista2.setParoquia(paroquia);
//        dizimista2.setSecretarioCadastrante(secretario);
//        dizimista2.setTelefone("9999-0000");
//        
//        manager.getTransaction().begin();
//        
//        
//        manager.persist(dizimo);
//        manager.persist(dizimo2);
//        manager.persist(enderecoDizimista);
//        manager.persist(enderecoAgentePastoralDizimo);
//        manager.persist(conjuge);
//        manager.persist(filho);
//        manager.persist(filho1);
//        manager.persist(paroquia);
//        manager.persist(secretario);
//        manager.persist(agentePastoralDizimo);
//        manager.persist(dizimista);
//        manager.persist(dizimista2);
//        manager.getTransaction().commit();
        
//        AgentePastoralDizimoDao apddao = new AgentePastoralDizimoDao();
        
//        apddao.Gravar(agentePastoralDizimo);
        
//        System.out.println(apddao.logaAgentePastoralDizimo("julieth", "123").getLogin());
        
//        System.out.println(apddao.buscaAgentePastoralDizimo(701l).getLogin());
//        Calendar c = Calendar.getInstance();
//        c.set(1992, Calendar.DECEMBER, 17);
//        Date d = c.getTime();
//        System.out.println(Calendar.JANUARY+1);
//        System.out.println(d);
        
//        Secretario s = new Secretario();
//        s.setComunidade("centro");
//        s.setDataNascimento(new Date());
//        s.setEmail("email");
//        s.setEndereco(new Endereco());
//        s.setEstadoCivil("solteiro");
//        s.setLogin("julieth");
//        s.setNome("julieth monteiro");
//        s.setSenha("123");
//        s.setTelefone("123456");
//        s.setTipo("secretario");
//        
//        Paroquia p = new Paroquia();
//        p.setDiocese("cajazeiras");
//        
//        Endereco e = new Endereco();
//        e.setBairro("Centro");
//        e.setCep("58840000");
//        e.setCidade("Pombal");
//        
//        p.setEndereco(e);
//        p.setFundacao(new Date());
//        p.setNome("Paróquia Nossa Senhora do Bom Sucesso");
//        p.setPadroeiro("Nossa Senhora do Bom Sucesso");
//        
//        EntityManager em = Conexao.manager;
//        em.getTransaction().begin();
//        em.persist(e);
//        em.persist(p);
//        em.getTransaction().commit();
        
//        Secretario s = new Secretario();
//        s.setComunidade("centro");
//        s.setDataNascimento(new Date());
//        s.setEmail("email");
//        s.setEndereco(new Endereco());
//        s.setEstadoCivil("solteiro");
//        s.setLogin("julieth");
//        s.setNome("julieth monteiro");
//        s.setSenha("123");
//        s.setTelefone("123456");
//        s.setTipo("secretario");
//        
//        Paroquia p = new Paroquia();
//        p.setDiocese("cajazeiras");
//        
//        Endereco e = new Endereco();
//        e.setBairro("Centro");
//        e.setCep("58840000");
//        e.setCidade("Pombal");
//        
//        p.setEndereco(e);
//        p.setFundacao(new Date());
//        p.setNome("Paróquia Nossa Senhora do Bom Sucesso");
//        p.setPadroeiro("Nossa Senhora do Bom Sucesso");
//        
//        EntityManager em = Conexao.manager;
//        em.getTransaction().begin();
//        em.persist(s);
//        em.persist(e);
//        em.persist(p);
//        em.getTransaction().commit();
        
        
        
//        String retorno = new String();
//        
//        String dataCasamento = "18/12/1991";
//        String dataNascimentoConjuge = "29/08/1975";
//        String nomeConjuge = "Ivaneide Maria de Sousa";
//        String emailConjuge = "email@";
//        String telefoneConjuge = "9999";
//        String dataNascimento = "04/05/1966";
//        String rua = "rua";
//        String numero = "12";
//        String bairro = "Nova Vida";
//        String cidade = "Pombal";
//        String cep = "58840000";
//        String uf = "PB";
//        String comunidade = "Nova Vida";
//        String dataInicio = "01/01/2011";
//        String email = "silvanio@";
//        String estadoCivil = "casado";
//        String nome = "Silvanio Santana de MEdeiros";
//        String telefone = "96861464";
//        
//        Dizimista dizimista = new Dizimista();
//        
//        CadastraDizimista c = new CadastraDizimista();
//        
//        Conjuge conjuge = new Conjuge();
//        conjuge.setDataCasamento(c.formataData(dataCasamento));
//        conjuge.setDataNascimento(c.formataData(dataNascimentoConjuge));
//        conjuge.setDizimista(dizimista);
//        conjuge.setEmail(emailConjuge);
//        conjuge.setEndereco(dizimista.getEndereco());
//        conjuge.setEstadoCivil(dizimista.getEstadoCivil());
//        conjuge.setNome(nomeConjuge);
//        conjuge.setTelefone(telefoneConjuge);
//        Endereco endereco = new Endereco();
//        endereco.setBairro(bairro);
//        endereco.setCep(cep);
//        endereco.setCidade(cidade);
//        endereco.setEstado(uf);
//        endereco.setNumero(numero);
//        endereco.setRua(rua);
//        
//        ParoquiaDao paroquiaDao = new ParoquiaDao();
//        
//        Paroquia paroquia = paroquiaDao.consultaParoquia();
//        
//        
//        dizimista.setComunidade(comunidade);
//        dizimista.setConjuge(conjuge);
//        dizimista.setDataInicio(c.formataData(dataInicio));
//        dizimista.setDataNascimento(c.formataData(dataNascimento));
//        dizimista.setDizimo(null);
//        dizimista.setEmail(email);
//        dizimista.setEndereco(endereco);
//        dizimista.setEstadoCivil(estadoCivil);
//        dizimista.setNome(nome);
//        dizimista.setParoquia(paroquia);
//        dizimista.setTelefone(telefone);
//        
//        DizimistaDao dizimistaDao = new DizimistaDao();
//        dizimistaDao.persisteDizimista(dizimista);
      
        
//        DizimistaDao dizimistaDao = new DizimistaDao();
//        System.out.println(dizimistaDao.consultaDizimistaPorNome("Ernaldo JosÃ© de Sousa").size());
        
//        EntityManager em = Conexao.manager;
//        em.getTransaction().begin();
//        dizimista.setSecretarioCadastrante(em.find(Secretario.class, 2801L));
//        em.persist(dizimista);
//        em.getTransaction().commit();
        
        SecretarioDao dao = new SecretarioDao();
         try {
             dao.cadastraUsuario(new Secretario());
//        System.out.println(dao.buscaSecretario(1L));
         } catch (Exception ex) {
             
             EntityManager em = Conexao.manager;
             
             em.getTransaction().begin();
             em.getTransaction().commit();
             
             System.out.println("Exception");
             System.out.println(ex.getStackTrace().toString());
         }
        
        System.out.println("finalizado com a graça de Deus.");
    }
    
}
