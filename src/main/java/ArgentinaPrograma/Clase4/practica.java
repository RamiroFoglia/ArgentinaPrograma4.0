package ArgentinaPrograma.Clase4;


public class practica {
    public static void main(String[] args) {
        String cadena = "Hola Ramiro, buen diaa";
        char le = 'i';
        
        
        System.out.println("**** " + practica.contarLetra(cadena, le));
        
    }
    
    private static int contarLetra(String unaPalabra, char letra){
        int cuenta = 0;
        
        for (int i = 0; i<(unaPalabra.length()); i++){
            if( unaPalabra.charAt(i)  == letra){
                cuenta = cuenta + 1;
            }       
        }
        return cuenta;
    }

    
}
