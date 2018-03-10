package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello.html")
public class Teste extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("É o meu maior prazer, vê-lo brilhar (Hello World, server)");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Uma vez Flamengo, sempre Flamengo (client)</h1>");
    }

}
