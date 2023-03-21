package GuiaDeEjerciciosClase3;

import java.util.Scanner;

public class ArrayStrin1b {

    public static void main(String[] args) {
        ArrayStrin1b objetoOrVec = new ArrayStrin1b(); //CREO OBJETO DE TIPO ArrayStrin1b
        int[] vec = new int[3];
        
        objetoOrVec.ingresarNumeros(vec);//EL USUARIO INGRESA LOS NUMEROS
        objetoOrVec.ordenar(vec);//LLAMO AL METODO PARA ORDENARLOS
        objetoOrVec.imprimirVector(vec);//MUESTRO EL RESULTADO POR PANTALLA
    }    
    
    //METODO PARA INGRESAR LOS NUMEROS
    private void ingresarNumeros(int vector[]){
        int num1, num2, num3;//DECLARO LAS VARIABLES A UTILIZAR
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Vamos a ingresar los numeros a ordenar: \n1°: ");
        num1 = entrada.nextInt();
        vector[0]=num1;//COLOCO EL PRIMER NUMERO EN EL PRIMER LUGAR DEL ARREGLO
        System.out.print("2°: ");        
        num2 = entrada.nextInt();
        vector[1]=num2;
        System.out.print("3°: ");        
        num3 = entrada.nextInt();
        vector[2]=num3;
    }
   
    //METODO PARA ORDENAR EL VECTOR    
    private void ordenar(int vecOrdenar[]) {
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
    private void imprimirVector(int vecImprimir[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija en que orden mostrar los numeros\n (1= ASCENDENTE | 2= DESCENDENTE)");
        int orden = entrada.nextInt();
        //COMPRUEBO EN QUE ORDEN SE VAN A MOSTRAR LOS NUMEROS
        if (orden == 1) {
            for (int num : vecImprimir) {
                System.out.println(num);
            }
        } else if (orden == 2) {
            for (int j = (vecImprimir.length)-1; j >= 0; j--) {
                System.out.println(vecImprimir[j]);
            }
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
}
