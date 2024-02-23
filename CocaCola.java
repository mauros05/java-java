import java.util.Scanner;

public class CocaCola {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nombre =  "", mensaje = "";
        int clave_departamento = 0, antiguedad = 0, dias_vacaciones = 0;

        System.out.println("Cual es tu nombre?");
        nombre = input.nextLine();

        System.out.println("Cual es la clave de tu departamento?");
        clave_departamento = input.nextInt();

        System.out.println("Cuantos años llevas trabajando?");
        antiguedad = input.nextInt();


        if(clave_departamento == 1){
            if(antiguedad == 1){
                dias_vacaciones = 6;
            } else if (antiguedad >= 2 && antiguedad <= 6){
                dias_vacaciones = 14;
            } else if (antiguedad >= 7){
                dias_vacaciones = 20;
            } else {
                dias_vacaciones = 0;
            }
            mensaje = "Tu nombre es "+nombre+" Tu departamento es: "+clave_departamento+" Llevas trabajando (años): "+antiguedad+" Tus dias de vacaciones son: "+dias_vacaciones;
        }else if (clave_departamento == 2){
            if(antiguedad == 1){
                dias_vacaciones = 7;
            } else if (antiguedad >= 2 && antiguedad <= 6){
                dias_vacaciones = 15;
            } else if (antiguedad >= 7){
                dias_vacaciones = 22;
            } else {
                dias_vacaciones = 0;
            }
            mensaje = "Tu nombre es "+nombre+" Tu departamento es: "+clave_departamento+" Llevas trabajando (años): "+antiguedad+" Tus dias de vacaciones son: "+dias_vacaciones;
        }else if (clave_departamento == 3){
            if(antiguedad == 1){
                dias_vacaciones = 10;
            } else if (antiguedad >= 2 && antiguedad <= 6){
                dias_vacaciones = 20;
            } else if (antiguedad >= 7){
                dias_vacaciones = 30;
            } else {
                dias_vacaciones = 0;
            }
            mensaje = "Tu nombre es "+nombre+" Tu departamento es: "+clave_departamento+" Llevas trabajando (años): "+antiguedad+" Tus dias de vacaciones son: "+dias_vacaciones;
        } else {
            mensaje = "No se reconoce tu clave, porfavor intente de nuevo";
        }
        
        System.out.println(mensaje);
    }
}