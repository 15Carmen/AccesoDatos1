package Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class CarpetaDeEjercicios {
    public static void main(String[] args) {

        try{
            File fichero = new File("C:\\Users\\cmartin\\eclipse-workspace\\AccesoDatos1\\src\\Ejercicio1\\carpeta.txt");
            Scanner sc = new Scanner(new File(String.valueOf(fichero)));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                File fic = new File(line);
                fic.mkdirs();
            }


        } catch (Exception e){
            System.out.println("Error!! "+e.getMessage());
        }


    }
}
