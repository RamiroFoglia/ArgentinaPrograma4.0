package ArgentinaPrograma.Clase3;

import java.util.Random;
import java.util.Scanner;

public class AdNumInfinitosIntentos {
    public static void main(String[] args) {
        //DECLARO LAS VARIABLES
        Scanner entrada = new Scanner(System.in);
        Random rnd = new Random();
        //SE GENERA UN NUMERO ALEATORIO,PARA ESO SE CREA UNA INSTANCIA DE RANDOM
        int numUs, numRnd;     
        
        //SOLICITO AL USUARIO EL INGRESO DE UN NUMERO
        System.out.println("Juguemos a adivinar el numero que voy a pensar...");
        System.out.println("Ahora piensa un numero del 1 al 100");
        System.out.print("Ingresalo: ");
        numUs = entrada.nextInt();
        
        System.out.println("Pensando un numero.............");
        numRnd = rnd.nextInt(1,100);        
        
       for(int i=1; i<=10; i++ ){ 
            if (numUs==numRnd) {
                System.out.println("FELICIDADES, ADIVINASTE EL NUMERO.");
                System.out.println("HASTA LA PROXIMA!!!");
                i=11;
           } else {
                //SI EL NUMERO QUE INGRESO EL USUARIO ES MENOR AL RANDOM, LE DOY UNA PISTA AL USUARIO 
                if(numUs < numRnd ){
                     System.out.println("El numero que pense es mayor.... intentalo nuevamente!!");
                     System.out.println("Piense otro numero del 1 al 10");
                     System.out.println("TE QUEDAN " + (10-i) + " CHANCES");
                     System.out.print("Ahora ingresalo: ");
                    numUs = entrada.nextInt();
                } else if(numUs > numRnd ){
                    System.out.println("El numero que pense es menor.... intentalo nuevamente!!");
                    System.out.println("Piense otro numero del 1 al 10");
                    System.out.println("TE QUEDAN " + (10-i) + " CHANCES");
                    System.out.print("Ahora ingresalo: ");
                    numUs = entrada.nextInt();               
                }
            }
        }
    }
}
