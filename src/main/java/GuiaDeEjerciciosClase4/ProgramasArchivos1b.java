package GuiaDeEjerciciosClase4;

import java.io.IOException;
import java.util.Scanner;

public class ProgramasArchivos1b {

    public static void main(String[] args) throws IOException {
        int[] vec = new int[3];

        ProgramasArchivos1b.ingresarNumeros(vec);//EL USUARIO INGRESA LOS NUMEROS
        ProgramasArchivos1b.ordenar(vec);//LLAMO AL METODO PARA ORDENARLOS
        ProgramasArchivos1b.imprimirVector(vec);//MUESTRO EL RESULTADO POR PANTALLA
    }

    //METODO PARA INGRESAR LOS NUMEROS
    private static void ingresarNumeros(int vector[]) {
        int num1, num2, num3;//DECLARO LAS VARIABLES A UTILIZAR
        Scanner entrada = new Scanner(System.in);

        System.out.print("Vamos a ingresar los numeros a ordenar: \n1°: ");
        num1 = entrada.nextInt();
        vector[0] = num1;//COLOCO EL PRIMER NUMERO EN EL PRIMER LUGAR DEL ARREGLO
        System.out.print("2°: ");
        num2 = entrada.nextInt();
        vector[1] = num2;
        System.out.print("3°: ");
        num3 = entrada.nextInt();
        vector[2] = num3;
    }

    //METODO PARA ORDENAR EL VECTOR    
    private static void ordenar(int vecOrdenar[]) {
        int menor; // VA A INDICAR EL NUMERO MAS CHICO

        // itera a través de vecOrdenar.length elementos
        for (int i = 0; i < vecOrdenar.length; i++) {
            menor = i;
            // INTERA BUSCANDO EL INDICE DEL MENOR NUMERO
            for (int indice = i + 1; indice < vecOrdenar.length; indice++) {
                if (vecOrdenar[indice] < vecOrdenar[menor]) {
                    menor = indice;
                }
            }

            int temporal = vecOrdenar[i]; // almacena primero en temporal
            vecOrdenar[i] = vecOrdenar[menor]; // sustituye primero con segundo
            vecOrdenar[menor] = temporal; // coloca temporal en segundo
        }
    }

    //METODO PARA MOSTRAR POR PANTALLA EL VECTOR (ASCENDENTE O DESCENDENTE)
    private static void imprimirVector(int vecImprimir[]) throws IOException {
        System.out.print("Elija en que orden mostrar los numeros\n (a= ASCENDENTE | d= DESCENDENTE)");
        char orden =(char)System.in.read();
       
        //COMPRUEBO EN QUE ORDEN SE VAN A MOSTRAR LOS NUMEROS
        if (orden =='a') {
            for (int num : vecImprimir) {
                System.out.println(num);
            }
        } else if (orden == 'd') {
            for (int j = (vecImprimir.length) - 1; j >= 0; j--) {
                System.out.println(vecImprimir[j]);
            }
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
}


