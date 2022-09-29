package Ejercicio3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheroSecuencial {

    public static void main(String[] args) throws IOException {
        File fichero=new File("C:\\Users\\cmnbo\\IntelliJ\\AccesoDatos_Ej1\\src\\Ejercicio3\\palabras.txt");
        FileReader fic=new FileReader(fichero);
        int i;
        char[] letras=new char[(int) fichero.length()];
        while ((i = fic.read(letras,0,5)) != -1) { //se va leyendo 5 caracteres hasta que lea -1
            System.out.println(letras); //cast a char
        }

        fic.close(); //cerrar fichero
    }

}
