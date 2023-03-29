package GuiaDeEjerciciosClase4;

import java.io.IOException;

public class ProgramasArchivos1a {

    public static void main(String[] args) throws IOException {
        if (args.length == 4) {
            int vectorNum[]= new int[3];
            vectorNum[0] = Integer.parseInt(args[0]);
            vectorNum[1] = Integer.parseInt(args[1]);
            vectorNum[2] = Integer.parseInt(args[2]);
            String c = args[3];
            
            ProgramasArchivos1a.ordenar(vectorNum);
            ProgramasArchivos1a.imprimirVector(vectorNum, c);
        } else {
            System.out.println("Error al pasar los parametros!!");
            System.out.println("Pasar como...\n <numero1> <numero2> <numero3> <a=ascendente/d=descendente>");
        }
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
        if(orden.equals("a")) {
            for (int num : vecImprimir) {
                System.out.println(num);
            }
        } else if (orden.equals("d")) {
            for (int j = (vecImprimir.length)-1; j >= 0; j--) {
                System.out.println(vecImprimir[j]);
            }
        } else {
            System.out.println("Opcion incorrecta");
        }
    }   
 }






    
