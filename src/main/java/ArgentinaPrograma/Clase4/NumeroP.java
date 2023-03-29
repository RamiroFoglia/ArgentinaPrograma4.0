package ArgentinaPrograma.Clase4;

import java.util.Random;
import java.util.Scanner;

public class NumeroP {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadGenerar = 0, contador = 0, acumulador = 0, res = 0;
        int[] numerosGenerados;
        Random rnd = new Random();

        System.out.println("Ingrese la cantidad de numero a generar: ");
        cantidadGenerar = entrada.nextInt();
        //creo el vector 
        numerosGenerados = new int[cantidadGenerar];

        for (int i = 0; i < cantidadGenerar; i++) {
            int num = rnd.nextInt(1, 1000);
            System.err.println(num + " -> " + NumeroP.esPrimo(num));
            if (NumeroP.esPrimo(num)) {
                contador++;
                acumulador += num;
            }
            numerosGenerados[i] = num;
        }

        //muestro por pantalla los datos solicitados.Num primos: cant, suma, promedio
        if (contador > 0) {
            float promedio = (float) acumulador / contador;
            System.out.println("==> Se generaron: " + contador + " numeros primos");
            System.out.println("==> La suma de ellos da como resultado: " + acumulador);
            System.out.println("==> Mientras que el promedio es igual a: " + promedio);
            
            res=NumeroP.NumeroPrimoMaxPromedio(numerosGenerados, promedio);
            if(res > 0){
                System.out.println("==> " + res + " numero/os primos son mayores al promedio");
            }else{
                System.out.println("==> No se encontraron numeros primos mayores al promedio");
            }

        } else {
            System.out.println("***No se genero ningun numero primo. Hasta la proxima***");
        }
    }

    //metodo que recibe un entero como parametro y devuelve un valor bool si es primo o no
    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        } else {
            int numRaiz = (int) Math.sqrt(num);
            for (int i = 2; i <= numRaiz; i++) {
                if ((num % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int NumeroPrimoMaxPromedio(int vector[], float promNum) {
        int resultado = 0;
        //calculo la cantidad de numeros primos mayor al promedio de los mismos
        for (int numero:vector) {
            if (NumeroP.esPrimo((numero)) && (numero > promNum)) {
                resultado++;                
            }
        }
        return resultado;
    }
}
