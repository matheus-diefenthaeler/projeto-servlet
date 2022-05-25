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
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String senhaConfirmada = request.getParameter("senhaConfirmada");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Cadastro realizado com sucesso!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h4>Nome: " + nome );
        out.println("<h4>Login: " + login );
        out.println("<h4>Senha: " + senha );
        out.println("<h4>Senha Confirmada: " + senhaConfirmada );
        out.println("</body></html>");

    }
}
