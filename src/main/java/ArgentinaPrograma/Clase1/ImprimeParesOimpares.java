package ArgentinaPrograma.Clase1;

import java.util.Scanner;

public class ImprimeParesOimpares {

    public static void main(String[] args) {

        //DECLARO LAS VARIABLES A UTILIZAR
        int inicio, fin, parimpar;
        Scanner entrada = new Scanner(System.in);
        int bandera = 0;//para mostrar mensaje al usuario si ingreso los datos correctos

        //solicito al usuario que ingrese los valores de las variables
        System.out.println("===> Programa que imprime los números pares o impares de un rango dado, recuerde que inicio debe ser menor a final");
        System.out.print("Ingrese el valor de inicio: ");
        inicio = entrada.nextInt();
        System.out.print("Ingrese el valor final: ");
        fin = entrada.nextInt();
        System.out.print("Que numeros desea que se impriman?(1 = impar / 2 = par))");
        parimpar = entrada.nextInt();

        while (inicio <= fin) {
            switch (parimpar) {
                case 2://EL USUARIO ELIGIO VER LOS NUMEROS PARES
                    //CON i!=f VERIFICO QUE NO SEA EL ULTIMO NUMERO PARA SEGUIR MOSTRANDO LA , (COMA)
                    // i % 2 == 0 , COMPRUEBO SI i ES PAR 
                    if (inicio != fin && (inicio + 1) != fin && ((inicio % 2) == 0)) {
                        System.out.print(inicio + ",");
                    } else if ((inicio % 2) == 0) {
                        System.out.print(inicio);
                    }
                    inicio++;
                    break;
                case 1: //EL USUARIO ELIGIO VER LOS NUMEROS IMPARES
                    //CON (i+1)!=f VERIFICO QUE NO SEA EL ULTIMO NUMERO PARA SEGUIR MOSTRANDO LA , (COMA)                    
                    if (inicio != fin && (inicio + 1) != fin && ((inicio % 2) != 0)) {
                        System.out.print(inicio + ",");
                    } else if ((inicio % 2) != 0) {
                        System.out.print(inicio);
                    }
                    inicio++;
                    break;
                default: //EL USUARIO INGRESA DATOS INCORRECTOS A LOS QUE SOLICITA EL PROGRAMA
                    System.out.println("DATOS INGRESADOS INCORRECTOS, intente nuevamente");
                    System.out.print("Que numero desea que se impriman?(1 = par / 2 = impar))");
                    parimpar = entrada.nextInt();
                    break;
            }
        }

        if (bandera == 1) {
            System.out.println("\n>>>>Felicitaciones, todo salio a la perfeccion<<<<\n Adios!!!");
        } else {
            System.out.println("\nLos Datos Ingresados Son Incorrectos. \nHasta la proxima");
        }
    }

}
