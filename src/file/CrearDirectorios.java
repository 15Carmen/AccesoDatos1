package file;

import java.io.*;

public class CrearDirectorios {
    public static void main(String[] args) {
        try {

            // Declaración de variables
            String directorio = "C:\\prueba";
            String varios = "carpeta1/carpeta2/carpeta3";

            // Crear un directorio
            boolean exito = (new File(directorio)).mkdir();

            if (exito)
                System.out.println("Directorio: " + directorio + " creado");

            // Crear varios directorios
            exito = (new File(varios)).mkdirs();

            if (exito)
                System.out.println("Directorios: " + varios + " creados");

        } catch (Exception e) {

            System.err.println("Error: " + e.getMessage());

        }

    }
}
