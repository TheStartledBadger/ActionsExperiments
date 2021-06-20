package com.startledbadger;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = "/mything")
public class MyServlet extends HttpServlet {

	int i = 34;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	System.out.println("Something!");
//        String thing = request.getParameter("thing");

        response.setStatus(404);
        response.setContentType("text/xml");
        PrintWriter writer=response.getWriter();
        writer.append("this is 404");
    }
}
