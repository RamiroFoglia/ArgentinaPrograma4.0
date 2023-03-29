package ArgentinaPrograma.Clase5;

import java.io.IOException;
import java.nio.file.*;
//import java.util.Scanner;

public class LectorArchivoTexto {

    public static void main(String[] args) throws IOException {
        if (args.length == 1) {
            String nombreArchivo = args[0];
            Path f = Paths.get(nombreArchivo);
            if (Files.exists(f) && Files.isReadable(f)) {
                // Alternativa 1, leer el contenido del archivo de una vez => SOLO PARA ARCHIVOS PEQUEÑOS
                // Usar Files.readAllLines(f) y recorrer el resultado con foreach
                for (String line : Files.readAllLines(f)) {
                    System.out.println(line);
                }
                System.out.println();
                // Y si el archivo fuera muy grande como para cargarlo en memoria
                // Usamos la clase Scanner
//                Scanner miEscaner = new Scanner(f);
//                int numeroLinea = 1;
//                while(miEscaner.hasNextLine()){
//                    String line = miEscaner.nextLine();
//                    String salida = String.format("%2d | %s", numeroLinea, line);
//                    System.out.println(salida);
//                    numeroLinea++;
//                }
//                System.out.println();

            } else {
                System.err.println("Error el archivo no existe...");
            }
        } else {
            System.out.println("Error: usar como...");
            System.out.println("java -jar PruebaCat.jar <Nombre Archivo>");
        }
    }
}
