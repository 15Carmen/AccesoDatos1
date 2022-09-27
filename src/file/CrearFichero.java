package file;

import java.io.*;
public class CrearFichero {
    public static void main(String[] args) {
        try {
            // Creamos el objeto que encapsula el fichero
            File fichero = new File("C:\\prueba\\miFichero.txt");

            // A partir del objeto File creamos el fichero físicamente
            if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
            else
                System.out.println("No se ha podido crear el fichero");
        } catch (Exception e){
            e.getMessage();
        }
    }
}
