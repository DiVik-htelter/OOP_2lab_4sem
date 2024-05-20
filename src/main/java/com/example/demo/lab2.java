package com.example.demo;
import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "lab2", urlPatterns = {"/main","/work", "/about", "/contacts", "/feedback"})
public class lab2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uri = request.getRequestURI();
        if (uri.endsWith("main")) {
            response.sendRedirect("main.html");
        } else if (uri.endsWith("about")) {
            response.sendRedirect("about.html");
        } else if (uri.endsWith("contact")) {
            response.sendRedirect("contact.html");
        } else if (uri.endsWith("featback")) {
            response.sendRedirect("featback.html");
        } else if (uri.endsWith("work")) {
            response.sendRedirect("work.html");
        }
    }
}
