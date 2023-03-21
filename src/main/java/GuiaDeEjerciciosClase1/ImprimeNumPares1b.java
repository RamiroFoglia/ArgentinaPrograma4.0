package GuiaDeEjerciciosClase1;

import java.util.Scanner;

public class ImprimeNumPares1b {

    public static void main(String[] args) {

        //DECLARO LAS VARIABLES A UTILIZAR 
        int inicio, fin;
        int bandera = 0;//VARIABLE QUE USO PARA INFORMAR AL USUARIO QUE NO INGRESO LOS DATOS CORRECTAMENTE  
        Scanner entrada = new Scanner(System.in);

        //SOLICITO AL USUARIO QUE INGRESE LOS VALORES DE LAS VARIABLES
        System.out.println("===> Programa que imprime los numeros pares de un rango entre dos numeros <===\n Vamos a ingresar los valores de las variables, recuerde que inicio debe ser menor a final");
        System.out.print("Ingrese el valor de inicio: ");
        inicio = entrada.nextInt();
        System.out.print("Ingrese el valor final: ");
        fin = entrada.nextInt();

        while (inicio <= fin) {
            bandera = 1;
            //CON i!=f VERIFICO QUE NO SEA EL ULTIMO NUMERO PARA SEGUIR MOSTRANDO LA , (COMA)
            // i % 2 == 0 , COMPRUEBO SI i ES PAR 
            if (inicio != fin && (inicio+1) != fin && ((inicio % 2) == 0)) {
                System.out.print(inicio + ",");
            } else if ((inicio % 2) == 0) {
                System.out.print(inicio);
            }
            inicio++;
        }
        if(bandera == 1){
            System.out.println("\n>>>>Felicitaciones, todo salio a la perfeccion<<<<\n Adios!!!");
        }else {
            System.out.println("\nLOS DATOS INGRESADOS SON INCORRECTOS. \nHASTA LA PROXIMA");
        }
    }

}
