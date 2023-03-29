package ArgentinaPrograma.Clase5;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;

public class EjemploSistemaArchivos {

    public static void main(String[] args) throws IOException {
        Path unArchivo = Paths.get("archivo2.txt");
        System.out.println("Un path: " + unArchivo.toAbsolutePath());
        System.out.println(Files.exists(unArchivo));

        Path otroArchivo = Paths.get("../../../files/archivo1.txt");

        System.out.println("Otro archivo: " + unArchivo.toAbsolutePath());
        System.out.println("Otro archivo: " + unArchivo.toAbsolutePath().normalize());
        System.out.println(Files.exists(otroArchivo));
        System.out.println("Sistema de Archivos: " + otroArchivo.toAbsolutePath().getRoot());
        System.out.println("Nombre de archivo: " + otroArchivo.getFileName());
        System.out.println("Directorio: " + otroArchivo.getParent());
        FileTime lastModifiedTime = Files.getLastModifiedTime(otroArchivo);
        System.out.println("Última modificación: " + lastModifiedTime);
        long size = Files.size(otroArchivo);
        System.out.println("Tamaño: " + size);

        Files.copy(otroArchivo, unArchivo, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Un archivo con el path: " + unArchivo.toAbsolutePath());
        System.out.println(Files.exists(otroArchivo));

        Path unArchivoMas = Paths.get("archivo3.txt");
        Files.move(unArchivo, unArchivoMas, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Un archivo con el path: " + unArchivo.toAbsolutePath());
        System.out.println(Files.exists(otroArchivo));

    }

}
