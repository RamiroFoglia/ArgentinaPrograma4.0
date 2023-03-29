package ArgentinaPrograma.Clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProcesadorArchivoDatos
{

    public static void main(String[] args) throws IOException {

        String nombreArchivo = "datos.txt";
        Path f = Paths.get(nombreArchivo);
        if (Files.exists(f) && Files.isReadable(f)) {
            System.out.println("Procesando archivo ...");
            // Y si el archivo fuera muy grande como para cargarlo en memoria
            // Usamos la clase Scanner
            Scanner miEscaner = new Scanner(f);
//            Scanner miEscaner = new Scanner(f,"UTF-16");
            int contadorNumeros = 0;
            int suma = 0;
            while(miEscaner.hasNextLine()){
                String linea = miEscaner.nextLine();
                int numero = Integer.parseInt(linea);
                contadorNumeros++;
                suma += numero;
            }
            System.out.println();
            System.out.println("Procesados " + contadorNumeros + " números.");
            System.out.println("Suma total: " + suma);

        }
        else {
            System.err.println("Error el archivo no existe...");
        }
    }
}
