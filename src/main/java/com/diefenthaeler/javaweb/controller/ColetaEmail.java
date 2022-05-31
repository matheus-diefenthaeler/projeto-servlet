package com.diefenthaeler.javaweb.controller;

import com.diefenthaeler.javaweb.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ColetaEmail", value = "/coletaEmail")
public class ColetaEmail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Usuario usuarioSistema = (Usuario) request.getSession().getAttribute("usuario");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro de email </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + usuarioSistema.getLogin() + " Informe seu email: " + "</h1>");
        out.println("<form method=\"post\" action=\"adicionaEmailCookie\">");
        out.println("Email: <input type=\"text\" name=\"email\" size=\"50\"><br>");
        out.println("<input type=\"Submit\" value=\"Enviar\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }
}
