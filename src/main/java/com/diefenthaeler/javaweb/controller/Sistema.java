package com.diefenthaeler.javaweb.controller;

import com.diefenthaeler.javaweb.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sistema", value = "/sistema")
public class Sistema extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie[] cookies = request.getCookies();
        String email = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("email")) {
                    email = cookie.getValue();
                }
            }
        }
        if (email == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/coletaEmail");
            dispatcher.forward(request, response);
        } else {
            Usuario usuarioSistema = (Usuario) request.getSession().getAttribute("usuario");

            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sitema - Home </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bem Vindo " + usuarioSistema.getLogin() + "!" + "</h1>");
            out.println("<h3>Esta é a página principal do sistema </h3>");
            out.println("<h3><a href=\"login.html\">Logout</a></h3>");
            out.println("<body>");
            out.println("</html>");
        }
    }
}
