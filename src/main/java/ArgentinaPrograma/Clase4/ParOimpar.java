package ArgentinaPrograma.Clase4;

import java.util.Scanner;

public class ParOimpar {   

    public static void main(String[] args) {
        //DECLARO LAS VARIABLES A UTILIZAR
        int numero;
        Scanner entrada = new Scanner(System.in);

        //solicito al usuario que ingrese los valores de las variables
        System.out.println("===> Programa que calcula si un numero es par o impar <===");
        System.out.print("Ingrese un valor: ");
        numero = entrada.nextInt();
        if(ParOimpar.esPar(numero)){
            System.out.println("ES PAR");
        } else {
            System.out.println("ES IMPAR");
        }

    }
    //metodo que recibe un numero como parametro y devuelce un verdadero o falso
    public static boolean esPar(int num) {
        return (num % 2) == 0;
    }

}
