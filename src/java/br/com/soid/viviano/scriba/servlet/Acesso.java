/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.servlet;

import br.com.soid.viviano.scriba.entidades.Secretario;
import br.com.soid.viviano.scriba.requisicoes.Controlador;
import br.com.soid.viviano.scriba.requisicoes.IRequisicao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author viviano
 */
public class Acesso extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String acao = request.getParameter("acao");
        
        Controlador.getControlador();
        String proximaPagina = "";
        Secretario secretario = null;
        secretario = (Secretario) request.getSession().getAttribute("usuario_logado");
        
        IRequisicao requisicao = Controlador.getRequisicao(acao);
        
        if((!acao.equals("login"))&&(secretario == null)){
            proximaPagina = "";
        }else{
            proximaPagina = requisicao.requisicao(request);
        }
        
//        RequestDispatcher rd = request.getRequestDispatcher(proximaPagina);
//        rd.forward(request, response);
        response.sendRedirect(proximaPagina);
//        request.getSession().invalidate();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
