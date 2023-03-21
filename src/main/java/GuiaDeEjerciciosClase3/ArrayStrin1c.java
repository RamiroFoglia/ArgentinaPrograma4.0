package GuiaDeEjerciciosClase3;

import java.util.Random;
import java.util.Scanner;

public class ArrayStrin1c {

    static int numeroX =0, acumulador=0;
    
    public static void main(String[] args) {
        ArrayStrin1c objetoOrVec = new ArrayStrin1c(); //CREO OBJETO DE TIPO ArrayStrin1b        
        int[] vec;
       
        vec = objetoOrVec.ingresarNumeros();       
         
        objetoOrVec.sumarMayores(vec);//LLAMO AL METODO SUMAR LOS NUMEROS MAYORES
        objetoOrVec.mostrarResultado(vec);//MUESTRO EL RESULTADO POR PANTALLA
    }

    
    //METODO PARA INGRESAR LOS NUMEROS EN FORMA ALEATORIA
    private int[] ingresarNumeros() {
        System.out.println("Vamos a generar 15 numeros aleatorios(rango de 1 a 100) ");
        int vector[] = new int[15];
        Random aleatorio = new Random();
        int numAleatorio;
        for (int i = 0; i < vector.length; i++) {
            numAleatorio = aleatorio.nextInt(1, 100);//GENERO EL NUMERO ALEATORIO 
            vector[i] = numAleatorio; //LO ALMACENO EN EL VECTOR
        }
        return vector;
    }

    //METODO SUMAR NUMEROS MAYORES QUE UNO DADO
    private void sumarMayores(int vector[]) {        
        Scanner entrada = new Scanner(System.in);        
               
        System.out.print("Ingrese un numero(rango del 1 al 100): ");
        numeroX= entrada.nextInt();
        
        //RECORRO EL VECTOR VIENDO SI EL VALOR SE SUMA A ACUMULADOR O NO        
        for (int i = 0; i < vector.length; i++) {             
             if(numeroX < vector[i]){
                acumulador=acumulador+vector[i];                
            }
        }        
    }  


    //METODO PARA MOSTRAR POR PANTALLA EL VECTOR (ASCENDENTE O DESCENDENTE)
    private void mostrarResultado(int vecImprimir[]) {
        System.out.println("*********************************************************");
        System.out.println("** Dado el numero ingresado, "+numeroX+", se calculara la suma  **");
        System.out.println("** de los numeros mayores a este, del siguiente vector **");
        System.out.println("*********************************************************");
     
        //MUESTO EL VECTOR 
        for(int n : vecImprimir){
            System.out.print("["+ n +"] ");       
        }
        System.out.print("\nEl resultado de la suma es ==> "+acumulador+" <==");
    }
}
