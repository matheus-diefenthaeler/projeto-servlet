package com.diefenthaeler.helloservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroUsuario", value = "/CadastroUsuario")
public class CadastroUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nome + " " + sobrenome + "</h1>");
        out.println("<h1>" + request.getMethod() + "</h1>");
        out.println("</body></html>");

    }
}
