package ArgentinaPrograma.Clase3;

import java.util.Arrays;

public class practica {

    public static void main(String[] args) {
        String[] separado = "3_tristes tigres_del_13".split("_");
        System.out.println(Arrays.toString(separado));
        System.out.println((separado[1]) + " <== Separado 1");
        System.out.println((separado.length) + " <== Length()");
        System.out.println("---------------------------------------");
        char letras[] = {'a', 'b','c','d'};
        int numeros[] = new int[]{1,37,16};
        
        for(int i=0;i<numeros.length;i++){
            if (numeros[i] < 30) {
                System.out.println(letras[i+1]);
            } else {
                System.out.println(numeros[i]);
            }
        } 
      
        System.out.println("\" ==> " + numeros[2]);
        String cadena = "hola que tal?".toUpperCase().replace("hola", "chau");
        System.out.println(cadena);
        cadena = "hola que tal?".toUpperCase().replace("HOLA", "chau");
        System.out.println(cadena);

    }

}
