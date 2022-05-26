package com.diefenthaeler.helloservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidaLogin", value = "/ValidaLogin")
public class ValidaLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        if (login != null && senha != null) {
            if (login.equals("teste") && senha.equals("123321")) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/sistema");
                requestDispatcher.forward(request, response);
            }
        }
        // response.sendRedirect("/projeto-java-web/erroLogin");
        PrintWriter out = response.getWriter();
        out.println("Erro, login errado>");

    }
}
