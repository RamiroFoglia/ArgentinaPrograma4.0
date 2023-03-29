package GuiaDeEjerciciosClase4;

import java.io.IOException;
import java.util.Scanner;

public class ProgramasArchivos1c {

    static int vectorNum[] = new int[3];

    public static void main(String[] args) throws IOException {
        if (args.length == 4) {
            //ALMACENO LOS NUMEROS PASADOS POR PARAMETRO, EN EL ARREGLO DE ENTEROS vectorNum[]
            vectorNum[0] = Integer.parseInt(args[0]);
            vectorNum[1] = Integer.parseInt(args[1]);
            vectorNum[2] = Integer.parseInt(args[2]);
            String c = args[3];//LA VARIABLE C VA A CONTENER EL ORDEN EN EL CUAL SE IMPRIMEN LOS NUMEROS

            ProgramasArchivos1c.ordenar(vectorNum);
            ProgramasArchivos1c.imprimirVector(vectorNum, c);

        } else {
            Scanner entrada = new Scanner(System.in);
                        
            ProgramasArchivos1c.ingresarNumeros(vectorNum);
            ProgramasArchivos1c.ordenar(vectorNum);

            //SOLICITO AL USUARIO QUE ELIJA EL ORDEN EN QUE SE MOSTRARAN LOS NUMEROS
            System.out.print("Elija en que orden mostrar los numeros\n (a= ASCENDENTE | d= DESCENDENTE)");
            String ordenAsDes= entrada.nextLine();
         
            ProgramasArchivos1c.imprimirVector(vectorNum, ordenAsDes);
        }
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
        int menor; // INCICO EL NUMERO MAS CHICO

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
    private static void imprimirVector(int vecImprimir[], String orden) {
        //COMPRUEBO EN QUE ORDEN SE VAN A MOSTRAR LOS NUMEROS
        if (orden.equals("a")) {
            for (int num : vecImprimir) {
                System.out.println(num);
            }
        } else if (orden.equals("d")) {
            for (int j = (vecImprimir.length) - 1; j >= 0; j--) {
                System.out.println(vecImprimir[j]);
            }
        } else {
            System.out.println("Opcion incorrecta");
        }
    }

}
