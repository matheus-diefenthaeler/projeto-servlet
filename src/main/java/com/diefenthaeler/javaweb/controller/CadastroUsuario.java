package com.diefenthaeler.javaweb.controller;

import com.diefenthaeler.javaweb.model.Usuario;

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

        Usuario usuario = Usuario.builder()
                .nome(request.getParameter("nome"))
                .email(request.getParameter("email"))
                .login(request.getParameter("login"))
                .senha(request.getParameter("senha"))
                .build();

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Cadastro realizado com sucesso!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h4>Nome: " + usuario.getNome());
        out.println("<h4>Login: " + usuario.getLogin());
        out.println("<h4>Email: " + usuario.getEmail());
        out.println("</body></html>");

    }
}
