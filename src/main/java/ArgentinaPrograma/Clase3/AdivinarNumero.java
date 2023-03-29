package ArgentinaPrograma.Clase3;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        //DECLARO LAS VARIABLES
        Scanner entrada = new Scanner(System.in);
        Random rnd = new Random();
        //SE GENERA UN NUMERO ALEATORIO,PARA ESO SE CREA UNA INSTANCIA DE RANDOM
        int numUs, numRnd;     
        
        //SOLICITO AL USUARIO EL INGRESO DE UN NUMERO
        System.out.println("Juguemos a adivinar el numero que va a pensar la PC");
        System.out.println("Piense un numero del 1 al 10");
        System.out.print("Ingrese un numero: ");
        numUs = entrada.nextInt();
        
        System.out.println("Pensando un numero.............");
        numRnd = rnd.nextInt(1,10);        
        
        if(numUs == numRnd ){
            System.out.println("Felicidades, usted adivino el numero!!");
        } else {
            System.out.println("Suerte para la proxima, el numero era " + numRnd);
        }
    }
}
