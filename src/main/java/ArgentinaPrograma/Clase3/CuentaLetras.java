package ArgentinaPrograma.Clase3;

import java.io.IOException;
import java.util.Scanner;

public class CuentaLetras {

    public static void main(String[] args) throws IOException {
        //declaro las variables 
        int contador = 0;
        String cadenaTXT = "";
        char comparaLetra;
        Scanner entrada = new Scanner(System.in);
        //SOLICITO AL USUARIO QUE INGRESE UN TEXTO Y LO GUARDO EN cadenaTXT
        System.out.println("Ingrese un texto...");
        cadenaTXT = entrada.nextLine();
        //SOLICITO AL USUARIO INGRESE LA LETRA A BUSCAR Y LA GUARDO EN comparaLetra
        System.out.println("Ingrese una letra para saber las veces que aparece en el texto...");
        comparaLetra= (char)System.in.read();
        //CONVIERTO EL LA CADENA DE TEXTO EN UN VECTOR DE CHARS
        char vectorCadena[] = cadenaTXT.toCharArray();
        //RECORRO EL VECTOR
        for (char letra : vectorCadena) {
            if(comparaLetra == letra){ //COMPARO SI LAS LETRAS SON IGUALES
                contador++;              
            }           
        }
        System.out.println("La letra " + comparaLetra + " aparece " + contador + " veces en el texto.");
    }
}
