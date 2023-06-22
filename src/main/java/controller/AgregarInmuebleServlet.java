package controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Inmueble;
import model.GestorDatos;

@WebServlet(name = "AgregarInmuebleServlet", value = "/AgregarInmueble")

public class AgregarInmuebleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tipoConstruccion = request.getParameter("tipoConstruccion");
        String ubicacionGeografica = request.getParameter("ubicacionGeografica");
        int precio = Integer.parseInt(request.getParameter("precio"));
        Inmueble inmueble = new Inmueble(tipoConstruccion, ubicacionGeografica, precio);
        GestorDatos gd = new GestorDatos();
        gd.agregarInmueble(inmueble);
    }
}
