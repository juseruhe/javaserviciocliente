/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagina.crud.desarrollo.controllers;

import com.pagina.crud.desarrollo.models.PersonaService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SQA
 */
public class Controlador extends HttpServlet {

    String index = "index.jsp";
    String create = "create.jsp";
    String show = "show.jsp";
    String edit = "edit.jsp";
    String acceso = "";
    PersonaService persona = new PersonaService();
    
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
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
       
        String accion = request.getParameter("accion");
        
        if(accion.equals("index")){
            acceso = index;
        }else if(accion.equals("create")){
            acceso = create;
        }else if(accion.equals("show")){
            acceso = show;
             request.setAttribute("idPer",request.getParameter("id"));
        } else if(accion.equals("edit")){
            acceso = edit;
            request.setAttribute("idPer",request.getParameter("id"));
        }else if(accion.equals("destroy")){
                int id = Integer.parseInt(request.getParameter("id"));
                persona.eliminarPersona(id);
                acceso= index;
            }
           else {
            acceso = index;
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
        
        dispatcher.forward(request, response);
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
       
         String accion = request.getParameter("accion");
        
        if(accion.equals("store")){
            String dni = request.getParameter("dni");
            String nombre = request.getParameter("nombre");
             persona.insertarPersona(dni,nombre);
            acceso = index;
        }else if(accion.equals("update")){
             String dni = request.getParameter("dni");
            String nombre = request.getParameter("nombre");
            int id = Integer.parseInt(request.getParameter("id"));
            persona.actualizarPersona(id,dni,nombre);
            acceso = show;
            request.setAttribute("idPer",request.getParameter("id"));
        }
                else {
            acceso = index;
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
        
        dispatcher.forward(request, response);
        
    
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
