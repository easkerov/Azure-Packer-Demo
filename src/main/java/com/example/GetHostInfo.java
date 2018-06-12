package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

@WebServlet("/gethostinfo")
public class GetHostInfo extends HttpServlet {
    private static Logger logger = Logger.getLogger(GetHostInfo.class.getName());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String localAddress = request.getLocalAddr();
        String localName = request.getLocalName();
        String localPort = Integer.toString(request.getLocalPort());
        String javaVendor = System.getProperty("java.vendor");
        String javaVersion = System.getProperty("java.version");
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<title>Host Info</title>");
        writer.println("<h1>Host Info</h1>");
        writer.println("<p>Local IP Address: " + localAddress + "</p>");
        writer.println("<p>Local Port: " + localPort + "</p>");
        writer.println("<p>Local Name: " + localName + "</p>");
        writer.println("<p>Java Vendor: " + javaVendor + "</p>");
        writer.println("<p>Java Version: " + javaVersion + "</p>");
        writer.println("<p>OS Name: " + osName + "</p>");
        writer.println("<p>OS Version: " + osVersion + "</p>");

        logger.info("Get Host Info Request");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO
    }
}
