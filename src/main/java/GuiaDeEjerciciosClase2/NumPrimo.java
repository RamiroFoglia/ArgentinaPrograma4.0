package GuiaDeEjerciciosClase2;

import java.util.Scanner;

public class NumPrimo {

    public static void main(String[] args) {
        //DECLARO LAS VARIABLES 
        int numero, i, bandera = 0;
        Scanner entrada = new Scanner(System.in);

        //SOLICITO AL USUARIO QUE INGRESE UN VALOR ENTERO
        System.out.println("Vamos a comprobar si un numero dado es primo o no: \n Ingrese un numero entero: ");
        numero = entrada.nextInt();

        //VERIFICO SI ES UN NUM PRIMO O NO
        if (numero <= 1) {
            bandera = 1; 
        } else {
            int numeroRaiz = (int) Math.sqrt(numero);
            for (i = 2; i <= numeroRaiz; i++) {
                if ((numero % i) == 0) {
                    bandera = 1;
                    break;
                }
            }
        }
        if(bandera == 1){
            System.out.println("El " + numero + " no es un numero PRIMO!!! ");
        } else {
            System.out.println("El " + numero + " es un numero PRIMO!!! ");
        }
    }
}
