package controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Vendedor;
import model.GestorDatos;

@WebServlet(name = "RegistroExitosoServlet", value = "/RegistroExitoso")

public class RegistroExitosoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreVendedor = request.getParameter("nombreVendedor");
        String rut = request.getParameter("rut");
        String direccion = request.getParameter("direccion");
        String titulo = request.getParameter("titulo");
        String estadoCivil = request.getParameter("estadoCivil");
        Vendedor vendedor = new Vendedor(nombreVendedor, rut, direccion, titulo,estadoCivil);
        GestorDatos gd = new GestorDatos();
        gd.agregarVendedor(vendedor);
        response.sendRedirect("registroExitoso.jsp");
    }
}