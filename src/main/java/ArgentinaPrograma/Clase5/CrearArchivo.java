package ArgentinaPrograma.Clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CrearArchivo {
    public static void main(String[] args) throws IOException {
        if (args.length == 1)
        {
            String nombreArchivo = args[0];
            Path f = Paths.get(nombreArchivo);
            if (!Files.exists(f))
            {
                Scanner miEscaner = new Scanner(System.in);
                StringBuffer buffer = new StringBuffer();
                String linea = miEscaner.nextLine();
                while (!linea.equals("!end."))
                {
                    buffer.append(linea).append("\n");
                    linea = miEscaner.nextLine();
                }

                // Por ahora solo vamos a manejar la alternativa de escribir el contenido completo en el archivo
                Files.writeString(f, buffer.toString());

                System.out.println();
                System.out.println("    1 Archivo creado con Exito!");

            }
            else
            {
                System.out.println("El archivo ya existe...");
            }
        }
        else
        {
            System.out.println("Error: usar como...");
            System.out.println("java -jar PruebaCopy.jar <Nombre Archivo>");
            System.out.println("Finalizar con !end.");
        }
    }
}
