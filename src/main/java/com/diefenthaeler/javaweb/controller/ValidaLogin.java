package br.com.impacta.javawbe.servlets.projetojavaweb.controller;

import com.diefenthaeler.javaweb.model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "validaLogin", value = "/validaLogin")
public class ValidaLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = Usuario.builder()
                .login(request.getParameter("login"))
                .senha(request.getParameter("senha"))
                .build();

        if (usuario.getLogin() != null && usuario.getSenha() != null && usuario.getSenha().equals("123321")) {
            request.getSession().setAttribute("usuario", usuario);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/sistema");
            dispatcher.forward(request, response);
            // cria servlet da página principal.
        } else {
            response.sendRedirect("/errologin.html");
            // cria página de erro.

        }
    }
}
