
package temperatura;

import java.util.Scanner;

public class Temperatura{
    
    private static double celsiusfarenheit(){
        
        double farenheit=0;
        System.out.println("Introduce el número de grados que quieres convertir: ");
        Scanner a = new Scanner(System.in);
        double celsius=a.nextInt();
        farenheit = (1.8)*celsius+32;
        System.out.println("El resultado es: "+farenheit);
        return celsius;  
    }
    
     private static double farenheitcelsius(){
         
        double celsius=0;
        System.out.println("Introduce el número de grados que quieres convertir: ");
        Scanner b = new Scanner(System.in);
        double farenheit=b.nextInt();
        celsius = (farenheit-32)/1.8;    
        System.out.println("El resultado es: "+celsius);
        return farenheit;  
    }
     
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        try { 
        int respuesta;
        System.out.println("Elige la conversión que quieres usar: ");
            System.out.println("1. Para convertir de Celsius a Farenheit ");
            System.out.println("2. Para convertir de Farenheit a Celsius ");
            respuesta=teclado.nextInt();
            double resultado=0;
            
            switch(respuesta){
                
                case 1:
                  resultado=celsiusfarenheit();
                break;
                case 2:
                 resultado=farenheitcelsius();
                break;
                default:
                System.out.println("Introduce un número válido");
            }
        }
        
        catch (Exception e) {
            
		System.out.println ();
		System.out.println ("No se permiten caracteres");
    }
}
}
    