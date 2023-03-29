package ArgentinaPrograma.Clase1;

import java.util.Scanner;


public class CategoriaMonotributo {
    public static void main(String[] args) {

        //declaro las variables a utilizar 
        float ingresos;
        int superficie, energia;
          
        Scanner entrada = new Scanner(System.in);

        //solicito al usuario que ingrese los valores de las variables
        System.out.println("===> Programa que calcula la categoria del monotributo a la que pertenece el usuario");
        System.out.print("Cual es su Ingreso?: ");
        ingresos = entrada.nextInt();
        System.out.print("Con cuanta superficie cuenta?: ");
        superficie = entrada.nextInt();
        System.out.print("Cual es su consumo energetico?: ");
        energia = entrada.nextInt();
        
        if((ingresos <= 748382.07 ) && (superficie <= 30) && (energia <= 3330)){
            System.out.println("Usted pertenece a la categoria A");
        } else if((ingresos <= 1112459.83 ) && (superficie <= 45) && (energia <= 5000)){
            System.out.println("Usted pertenece a la categoria B");            
        } else if((ingresos <= 1557443.75 ) && (superficie <= 60) && (energia <= 6700)){
            System.out.println("Usted pertenece a la categoria C");            
        } else if((ingresos <= 1934273.04 ) && (superficie <= 85) && (energia <= 10000)){
            System.out.println("Usted pertenece a la categoria D");            
        } else if((ingresos <= 2277684.56 ) && (superficie <= 110) && (energia <= 13000 )){
            System.out.println("Usted pertenece a la categoria E");            
        } else if((ingresos <= 2847105.70 ) && (superficie <= 150) && (energia <= 16500)){
            System.out.println("Usted pertenece a la categoria F");            
        } else if((ingresos <= 3416526.83 ) && (superficie <= 200) && (energia <= 20000)){
            System.out.println("Usted pertenece a la categoria G");
        } else if((ingresos <= 4229985.60 ) && (superficie <= 200) && (energia <= 20000)){
            System.out.println("Usted pertenece a la categoria H");
        } else {
            System.out.println("No existe categoria del monotributo para los valores ingresados.");
        }        
    }
}
