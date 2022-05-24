package com.diefenthaeler.helloservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServletasldhk", value = "/hello")
public class HelloWorld extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String email = request.getParameter("email");
        String login = request.getParameter("login");


        // Hello
        response.getWriter()
                .append("Nome: ")
                .append(nome)
                .append("\nSobrenome: ")
                .append(sobrenome)
                .append("\nEmail: ")
                .append(email)
                .append("\nlogin: ")
                .append(login);
    }
}