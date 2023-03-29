package GuiaDeEjerciciosClase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProgramasArchivos2a {

    public static void main(String[] args) throws IOException {
        if (args.length == 2) {
            //NombreArchivo QUE VA A CONTENER LA DIRECCION DEL ARCHIVO
            String nombreArchivo = args[0];
            String operacion = args[1];
            int resultado;

            ProgramasArchivos2a objSM = new ProgramasArchivos2a();//INSTANCIO UN OBJETO DE CLASE

            Path direccion = Paths.get(nombreArchivo);//OBTENGO LA DIRECCION DEL ARCHIVO         

            if ((Files.exists(direccion) && Files.isReadable(direccion))) { //(Files.exists(direccion) && Files.isReadable(direccion))
                Scanner entrada = new Scanner(direccion);
                //LLAMO AL METODO OPERACION  
                resultado = objSM.operacionArchivo(entrada, operacion);

                if(resultado>0)
                    System.out.println("El resultado de la operacion es: " + resultado);

            } else {
                System.out.println("Error, el archivo no existe!!!");
            }

        } else {
            System.out.println("ERROR al pasar el parametro...");
            System.out.println("Pasar como: <Programa> <Archivo de numeros> <s=suma / m=multiplicacion>");
        }
    }

    private int operacionArchivo(Scanner entrada, String op) throws IOException {
        int res = 1;
        boolean suma = true, operacion= true;
        
        //LEO LAS LINEAS(NUMEROS) DEL ARCHIVO
        while (entrada.hasNextLine()) {
            //SEGUN EL VALOR DE OPERACION, SUMARA O MULTIPLICARA LOS NUMEROS
            if (op.equals("s")) {
                String linea = entrada.nextLine();
                int num = Integer.parseInt(linea);//LA CONVIETO A ENTERO
                res += num;
                operacion=false;
            } else if (op.equals("m")) {
                String linea = entrada.nextLine();
                int num = Integer.parseInt(linea);//LA CONVIETO A ENTERO
                res = res * num;
                suma=false;
                operacion=false;
            }
        }
        if(operacion){
            System.out.println("Valores incorrectos para la operacion...\n<< s=Sumar / m=Multiplicar >> ");
            return 0;
        }
        if(suma){
             res--;
        }           
        
        return res;           
    }
}
