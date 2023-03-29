package ArgentinaPrograma.Clase5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;



public class EjerciciosClase5 {
    public static void main(String[] args) throws IOException {
        //IMPRIME POR PANTALLA LA DIRECION ABSOLUTA DE DONDE ESTOY PARADO MAS EL 
        // TEXTO "../recursos/algo.txt"
        Path unArchivo = Paths.get("../../RAMIROFOGLIA");
        System.out.println(unArchivo);
        System.out.println(unArchivo.toAbsolutePath());
        
        //EN LA RUTA "archivoPrueba" SE GUARDA LA RUTA DE LA CARPETA "Clases4"
        Path archivoPrueba = Paths.get("C:\\Users\\RamiroFoglia\\Documents\\NetBeansProjects\\ArgentinaPrograma\\src\\main\\java\\Practica\\Clase4");
       //EN "lastModifiedTime" SE VA ALMACENAR LA ULTIMA MODIFICACION DE "Clases4" 
        FileTime lastModifiedTime = Files.getLastModifiedTime(archivoPrueba);
        System.out.println(lastModifiedTime);
        
        Path otroArch = Paths.get("../rama.txt");
        System.out.println(Files.exists(otroArch));
        Files.createFile(otroArch);
        System.out.println(Files.exists(otroArch));
       
        //CREA UN ARCHIVO TEMPORAL, LE AGREGA "unPrefijo...".txt
        Path unTemporal = Files.createTempFile("unPrefijo",".txt");
        //MUESTRA LA DIRECCION ABSOLUTA DE unTemporal
        System.out.println(unTemporal);
        //VERIFICA SI ES UN DIRECTORIO O NO
        System.out.println( Files.isDirectory(unTemporal) );
      
        //Files.copy(arch1, arch2);
        //Files.move(arch1, arch3);

    }
    
}
