package GuiaDeEjerciciosClase4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProgramasArchivos3 {

    static int valorLetrasInt[];
    static char[] arregloCadDesplazo;

    public static void main(String[] args) throws IOException {
        ProgramasArchivos3 objetoCoDeco = new ProgramasArchivos3();

        if (args.length == 4) {
            String opcion = args[0];
            int desplazo = Integer.parseInt(args[1]);
            String origen = args[2];
            String destino = args[3];
            //OBTENGO LAS DIRECCIONES DE LOS ARCHIVOS
            Path dirOrigen = Paths.get(origen);
            Path dirDestino = Paths.get(destino);

            if (objetoCoDeco.existeArchivo(dirOrigen)) {
                objetoCoDeco.leerArchivo(dirOrigen);
                
                if (opcion.equals("codifica")){
                    objetoCoDeco.codificaTexto(desplazo);
                } else if (opcion.equals("Decodifica")){
                    objetoCoDeco.decodificaTexto(desplazo);
                }
            
                //SI SE PUDIRON GUARDAR LOS DATOS EN EL ARCHIVO DESTINO, MUESTRO UN MENSAJE AL USUARIO
                if(objetoCoDeco.guardarResultado(dirDestino)){
                    System.out.println("Operacion realizada con exito!!");
                }
            }
        } else {
            System.out.println("Error al pasar los parametros, pasar asi:");
            System.out.println("<decodifica o codifica ><desplazamiento> <archivo origen> <archivo destino>");
        }
      
    }

    //METODO QUE VERIFICA SI EXISTE UN ARCHIVO DADO
    private boolean existeArchivo(Path dirArchivo) {
        boolean estado = false;
        if (Files.exists(dirArchivo)) {
            estado = true;
        }
        return estado;
    }

    //METODO QUE LEE UN ARCHIVO Y GUARDA EL CONTENIDO EN UN VECTOR DE CHAR 
    private void leerArchivo(Path dirArch) throws IOException {
        Scanner entrada = new Scanner(dirArch);
        Scanner entrada2 = new Scanner(dirArch);
        int contador = 0;
        while (entrada.hasNextLine()) { //RECORRO EL ARCHIVO PARA SABER EL TAMAÑO QUE TENDRA EL VECTOR DONDE SE VA ALMACENAR LOS DATOS
            String linea = entrada.nextLine();
            contador += linea.length();
        }        
        arregloCadDesplazo = new char [contador]; //CREO EL VECTOR DONDE SE VAN ALMACENAR LOS DATOS DEL ARCHIVO
        valorLetrasInt = new int[contador];        
               
        while(entrada2.hasNextLine()){
            String linea2 = entrada2.nextLine(); //REVISAR SI SE PUEDE USAR NUEVAMDENTE ENTRADA
            arregloCadDesplazo = linea2.toCharArray();           
        }        
    }
    
    //METODO QUE GUARDA LOS RESULTADOS EN EL ARCHIVO DESTINO
    private void escribirArchivo(Path DirDestino){
        
    }
    
        
    
   //METODO QUE CONVIERTE LOS CHAR EN INT
    private void letraAnumero(char[] cad) {
        for (int indice = 0; indice < cad.length; indice++) {
            int codigo = (int) cad[indice];
            valorLetrasInt[indice] = codigo;
        }
    }
    
    //METODO QUE CONVIERTE LOS INT EN CHAR
    private void numeroAletra(int[] cad) {
        for (int indice = 0; indice < cad.length; indice++) {
            arregloCadDesplazo[indice] = (char)valorLetrasInt[indice];
        }
    }

    //METODO QUE CODIFICA, REALIZA UN DESPLAZAMIENTO DEL TEXTO DADO
    private void codificaTexto(int desplazar) {
        letraAnumero(arregloCadDesplazo);
        //RECORRO EL VECTOR SUMANDOLE A CADA ELEMENTO DEL MISMO, EL VALOR DE DESPLAZAR
        for (int i = 0; i < valorLetrasInt.length; i++) {
            valorLetrasInt[i] = valorLetrasInt[i] + desplazar;
            numeroAletra(valorLetrasInt);
        }
    }

    //METODO QUE DECODIFICA, REALIZA UN DESPLAZAMIENTO DEL TEXTO DADO
    private void decodificaTexto(int desplazar) {
        letraAnumero(arregloCadDesplazo);
        //RECORRO EL VECTOR SUMANDOLE A CADA ELEMENTO DEL MISMO, EL VALOR DE DESPLAZAR
        for (int i = 0; i < valorLetrasInt.length; i++) {
            valorLetrasInt[i] = valorLetrasInt[i] - desplazar;
            arregloCadDesplazo[i] = (char) valorLetrasInt[i];
        }
    }
    
    //METODO QUE GUARDA LA OPERACION REALIZADA EN EL ARCHIVO DESTINO
    private boolean guardarResultado(Path direccionDes){
        boolean estado = false;
        if(existeArchivo(direccionDes)){
            escribirArchivo(direccionDes);
            estado = true;
        }// AQUI TENDRIA QUE IR LA CODIFICACION EN TAL CASO QUE NO EXISTA EL ARCHIVO DE DESTINO
        return estado;        
    }
    
    
}
