package model;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GestorDatos {
    public void agregarVendedor(Vendedor vendedor) {
        try {
            FileWriter fw = new FileWriter("vendedores.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(vendedor.getNombre() + "," + vendedor.getRut() + "," + vendedor.getDireccion() + "," + vendedor.getTituloProfesional() + "," + vendedor.getEstadoCivil());
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarInmueble(Inmueble inmueble) {
        try {
            FileWriter fw = new FileWriter("inmuebles.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(inmueble.getTipoConstruccion() + "," + inmueble.getUbicacionGeografica() + "," + inmueble.getPrecio());
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Inmueble> buscarInmueble(String criterio) {
        List<Inmueble> inmueblesEncontrados = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("inmuebles.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] datos = linea.split(",");
                Inmueble inmueble = new Inmueble(datos[0], datos[1], Integer.parseInt(datos[2]));
                if (criterio.equalsIgnoreCase(inmueble.getTipoConstruccion())) {
                    inmueblesEncontrados.add(inmueble);
                } else {
                    try {
                        int precio = Integer.parseInt(criterio);
                        if (sc.hasNextDouble() && sc.nextDouble() == precio) {
                            inmueblesEncontrados.add(inmueble);
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inmueblesEncontrados;
    }
}