package ArgentinaPrograma.Clase4;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        String nombre;
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        if (esPar(numero)) {            
            imprimePar(nombre);
        } else {
            imprimeImpar(nombre);
        } 
            
    }

    public static boolean esPar(int num) {
        return (num % 2) == 0;
    }
    public static void imprimePar(String nom){
        System.out.println(nom + ": el numero es PAR");
    }
    public static void imprimeImpar(String nom){
        System.out.println(nom + ": el numero es IMPAR");
    }
}
