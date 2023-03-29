package ArgentinaPrograma.Clase1;

import java.util.Scanner;

public class ImprimeParesInvertido {

    public static void main(String[] args) {

        //DECLARO LAS VARIABLES A UTILIZAR 
        int inicio, fin;
        int bandera = 0;//VARIABLE QUE USO PARA INFORMAR AL USUARIO QUE NO INGRESO LOS DATOS CORRECTAMENTE  
        Scanner entrada = new Scanner(System.in);

        //SOLICITO AL USUARIO QUE INGRESE LOS VALORES DE LAS VARIABLES
        System.out.println("===> Programa que imprime los numeros pares de un rango dado, en forma decreciente  <===\n Vamos a ingresar los valores de las variables, recuerde que inicio debe ser menor a final");
        System.out.print("Ingrese el valor de inicio: ");
        inicio = entrada.nextInt();
        System.out.print("Ingrese el valor final: ");
        fin = entrada.nextInt();

        for (int x = fin; x >= inicio; x--) {
            //CON ESTE INSTRUCCION, SIN IMPORTAR SI i ES PAR O IMPAR, EL ULTIMO NUMERO QUE SE IMPRIMA NO VA A TENER UNA COMA AL FINAL
            if ((x != inicio) && ((x - 1) != inicio)) {
                // fin % 2 == 0 , COMPRUEBO SI f ES PAR
                if ((x % 2) == 0) {
                    System.out.print(x + ",");
                }
                bandera = 1;
            } else if ((x % 2) == 0) {
                System.out.print(x);
            }
            bandera = 1;
        }
        if (bandera == 1) {
            System.out.println("\n>>>>Felicitaciones, todo salio a la perfeccion<<<<\n Adios!!!");
        } else {
            System.out.println("\nLOS DATOS INGRESADOS SON INCORRECTOS. \nHASTA LA PROXIMA");
        }
    }
}
