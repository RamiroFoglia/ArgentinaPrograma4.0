package ArgentinaPrograma.Clase3;

public class PruebasCadenas {
    public static void main(String[] args) {
        String cadenaPrueba = "Esto es una cadena de prubas";
        //TRANSFORMO EL STRING EN UN VECTOR DE LETRAS O CARACTERES
        char[] vector = cadenaPrueba.toCharArray();
 
        System.out.println("Car | Código");
        for(char letra : vector){
            int codigo= (int)letra; 
            System.out.println(letra + " | " + codigo);
        }
    }
    
}
