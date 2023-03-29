package ArgentinaPrograma.Clase2;


import java.util.Scanner;

public class prueboEjer {
           public static void main(String[] args) {

        //declaro las variables a utilizar 
        int inicio, fin;
        int bandera = 0;//para mostrar mensaje al usuario si ingreso los datos correctos  
        Scanner entrada = new Scanner(System.in);

        //solicito al usuario que ingrese los valores de las variables
    System.out.println("===> Programa que imprime los números pares de un rango dado, recuerde que inicio debe ser menor a final");
        System.out.print("Ingrese el valor de inicio: ");
        inicio = entrada.nextInt();
        System.out.print("Ingrese el valor final: ");
        fin = entrada.nextInt();

        while (inicio <= fin) {
            bandera = 1;
            /* con inicio != fin y (inicio+1) != fin  verifico que no sea el último ni el 
               anteúltimo número para seguir mostrando la , (coma) */
            // inicio % 2 == 0 , compruebo si inicio es par 
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
            System.out.println("\nLos Datos Ingresados Son Incorrectos. \nHasta la proxima");
        }
    }


}

    

