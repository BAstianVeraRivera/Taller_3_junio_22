package controller;
import java.io.*;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Inmueble;
import model.GestorDatos;
@WebServlet(name = "BuscarInmuebleServlet", value = "/BuscarInmueble")
public class BuscarInmuebleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String criterio = request.getParameter("criterio");
        GestorDatos gd = new GestorDatos();
        List<Inmueble> inmueblesEncontrados = gd.buscarInmueble(criterio);
        request.setAttribute("inmueblesEncontrados", inmueblesEncontrados);
        request.getRequestDispatcher("resultados.jsp").forward(request, response);
    }
}