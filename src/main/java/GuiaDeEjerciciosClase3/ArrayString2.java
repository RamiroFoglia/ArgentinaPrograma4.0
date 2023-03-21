package GuiaDeEjerciciosClase3;

import java.util.Scanner;

public class ArrayString2 {

    static int valorLetrasInt[];
    static char[] arregloCadDesplazo;

    public static void main(String[] args) {
        ArrayString2 objetoAS = new ArrayString2();
        Scanner entrada = new Scanner(System.in);
        String cadena = ""; //VA A CONTENER EL TEXTO A DESPLAZAR

        System.out.print("Ingrese un texto.\n==> ");
        cadena = entrada.nextLine();
        char[] arregloCadena = cadena.toCharArray();
        arregloCadDesplazo = new char[cadena.length()];
        valorLetrasInt = new int[cadena.length()];

        objetoAS.decodificaTexto(arregloCadena);
        System.out.print("Ahora ingrese un numero para realizar el desplazamiento del texto ingresado: \n ==> ");
        int desplazaNum = entrada.nextInt();
        objetoAS.codificaTexto(desplazaNum);

        //MUESTRO COMO QUEDARIA EL TEXTO DESPUES DE REALIZAR EL DESPLAZAMIENTO
        System.out.println("El texto se desplazo " + desplazaNum + " lugar/es a la derecha,\nteniendo en cuenta el orden del abecedario!!");
        System.out.print("****Texto Original:  < " + cadena + ">****\n");
        System.out.print("****Texto desplazado:< ");
        for (char l : arregloCadDesplazo) {
            System.out.print(l);
        }
        System.out.print(" >****");

    }

    //METODO QUE CONVIERTE LOS CHAR EN INT
    private void decodificaTexto(char[] cad) {
        for (int indice = 0; indice < cad.length; indice++) {
            int codigo = (int) cad[indice];
            valorLetrasInt[indice] = codigo;
        }

    }

    //METODO QUE CONVIERTE LOS INT EN CHAR
    private void codificaTexto(int desplazar) {
        //RECORRO EL VECTOR SUMANDOLE A CADA ELEMENTO DEL MISMO, EL VALOR DE DESPLAZAR
        for (int i = 0; i < valorLetrasInt.length; i++) {
            valorLetrasInt[i] = valorLetrasInt[i] + desplazar;
            arregloCadDesplazo[i] = (char) valorLetrasInt[i];
        }
    }
}
