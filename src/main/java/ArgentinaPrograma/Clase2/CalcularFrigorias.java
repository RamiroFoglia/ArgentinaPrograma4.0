package ArgentinaPrograma.Clase2;

import java.util.Scanner;

public class CalcularFrigorias {

    public static void main(String[] args) {
        //DECLARO LAS VARIABLES
        Scanner entrada = new Scanner(System.in);
        double ancho, alto, largo, volumen, frigorias;

        System.out.println("Ingrese los datos de la habitacion(en metros): ");
        System.out.print("Ancho => ");
        ancho = entrada.nextDouble();
        System.out.print("Largo => ");
        largo = entrada.nextDouble();
        System.out.print("Alto => ");
        alto = entrada.nextDouble();

        //CALCULO EL VOLUMEN DE LA PIEZA 
        volumen = ancho * alto * largo;
        //CALCULO LAS FRIGORIAS
        frigorias = volumen * 40;

        System.out.println("Usted necesita un aire de " + frigorias + " frigorias");
        System.out.println("");
    }

}
