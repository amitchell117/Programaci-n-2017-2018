package data_actual;
/*Importamos las utilidades de java: Scanner para que el usuario puede introducir datos por teclado,
y el GregorianCalendar que nos permitirá ver la hora y la fecha actuales.
*/
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Data_actual {
    /*Creamos un método privado en el que se calculará si el año introducido por el usuario en bisiesto o no, 
    y lo mostrará por pantalla. 
    */
    private static int bisiesto(int anio1){
                int c=0;
                if ( ((anio1%100 == 0) && (anio1%400 == 0)) ||
                ((anio1%100 != 0) && (anio1%  4 == 0))   ){
                    c = 1;
                System.out.println("Este año es bisiesto");
                }
                else {
                System.out.println("Este año no es bisiesto");
                }
                return c;  
    }
    /*Creamos otro método privado en el que especificamos mediante un switch, la suma de los días de cada mes. 
    Por otra parte, decimos los días de cada año, además de que añadirá los días bisiestos de los años que lo sean. 
    */
    private static int suma(int anio2, int mes2, int dia4){
        int resultado=0;
        int dias_mes=0;
        double dias_anio=0;
       
           dias_anio = anio2*365.25;
           int dias_anio2=(int)dias_anio;
           
           switch (mes2){
           case 1: dias_mes = 0;
           break;
           case 2: dias_mes = 31;
           break;
           case 3: dias_mes = 59;
           break;
           case 4: dias_mes = 90;
           break;
           case 5: dias_mes = 120;
           break;
           case 6: dias_mes = 151;
           break;
           case 7: dias_mes = 181;
           break;
           case 8: dias_mes = 212;
           break;
           case 9: dias_mes = 243;
           break;
           case 10: dias_mes = 273;
           break;
           case 11: dias_mes = 304;
           break;
           case 12: dias_mes = 334;
           break;
           case 13: dias_mes = 365;
           break;
       }
       resultado = dias_anio2 + dias_mes + dia4;
       return resultado;
        }
         
    public static void main(String[] args) {
        
    GregorianCalendar data = new GregorianCalendar();
    int dia = (data.get(GregorianCalendar.DATE));
    int mes = (data.get(GregorianCalendar.MONTH)+1);
    int any = (data.get(GregorianCalendar.YEAR));
    System.out.println("La fecha actual es: "+dia+"/"+mes+"/"+any);
    System.out.println(data.getTime());
    /*Relizamos un try catch para que el usuario no pueda introducir letras.
    */
    try{
    /*Pedimos al usuario que nos introduzca una fecha y guardamos tanto el día como el mes como el año en variables 
    distintas y mostramos la fecha que nos haya introducido.
    */
    System.out.println();
    System.out.println("Introduce una fecha:");
    System.out.println("El día: ");
    Scanner teclado = new Scanner(System.in);
    int date=teclado.nextInt();
    
    System.out.println("El mes: ");
    Scanner teclado2 = new Scanner(System.in);
    int month=teclado2.nextInt();
    
    System.out.println("El año: ");
    Scanner teclado3 = new Scanner(System.in);
    int year=teclado3.nextInt();
    
    System.out.println("La fecha introducida es: " +date+"/"+month+"/"+year);
    
    int resultado=0;
    int anio=year;
    int dia1=date;
    int mes1=month;
    /*Invocamos todos los métodos creados.
    */
    resultado=bisiesto(anio);
    int anios =suma(anio, mes1, dia1);
    int dias_actual = suma (any, mes, dia);
    int dias_usuario = suma (anio, mes1, dia1);
       /*Creamos un bucle de condiciones para que según la fecha actual y la fecha introducida por el usuario nos 
       salga que las fechas introducidas son iguales, que cuántos días han pasado desde la feca introducida por 
       el usuario o que cuántos días faltan desde la fecha actual hasta la fecha del usuario.
       */
       if (dias_actual==dias_usuario){
           System.out.println("La fecha introducida: ("+date+"/"+month+"/"+year+") y la fecha actual: ("+dia+"/"+mes+"/"+any+") son iguales.");
           } 
       else if (dias_actual>dias_usuario){
           int dias = (dias_actual) - dias_usuario;
           System.out.println("Han pasado " +dias+ " días desde la fecha introducida. \n("+date+"/"+month+"/"+year+") - ("+dia+"/"+mes+"/"+any+")");
           } 
       else {
           int dias = (dias_usuario) - dias_actual;
           System.out.println("Faltan " +dias+ " días desde la fecha actual. \n("+dia+"/"+mes+"/"+any+") - ("+date+"/"+month+"/"+year+")");
           }
    }
	catch (Exception e) {
		System.out.println ();
		System.out.println ("No se permiten carcteres");
	}
    }
}