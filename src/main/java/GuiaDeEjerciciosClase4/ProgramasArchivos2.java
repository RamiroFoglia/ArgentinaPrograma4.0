package GuiaDeEjerciciosClase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProgramasArchivos2 {

    public static void main(String[] args) throws IOException {
        if (args.length == 1) {
            //NombreArchivo QUE VA A CONTENER LA DIRECCION DEL ARCHIVO
            String nombreArchivo = args[0];
            Path direccion = Paths.get(nombreArchivo);         
            
            ProgramasArchivos2 objSumaArchivo = new ProgramasArchivos2();
            
            //LLAMO AL METODO sumaArchivo pasandole la direccion del archivo
            objSumaArchivo.sumaArchivo(direccion);     
        } else {
            System.out.println("ERROR al pasar el parametro...");
            System.out.println("Pasar como: <Nombre del programa> <Archivo de numeros>");
        }
    }
    
    private void sumaArchivo(Path direccion) throws IOException{
         if ((Files.exists(direccion) && Files.isReadable(direccion))) { //(Files.exists(direccion) && Files.isReadable(direccion))
               // System.out.println(Files.exists(direccion));
                
                Scanner entrada = new Scanner(direccion);                
                int acumulador = 0, contadorNumeros = 0;                
                
                //LEO LAS LINEAS(NUMEROS) DEL ARCHIVO
                while (entrada.hasNextLine()) {
                    String linea = entrada.nextLine();
                    int num = Integer.parseInt(linea);//LA CONVIETO A ENTERO
                    acumulador += num;
                    contadorNumeros++;
                }                
                System.out.println("Se sumaron " + contadorNumeros + " lineas, y el resultado es: " + acumulador);
                
            } else {
                System.out.println("Error, el archivo no existe!!!");
            }
    }
}
