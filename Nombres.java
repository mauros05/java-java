import java.util.Scanner; // <-- IMPORTAR LA LIBRERIA 

public class Nombres {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String primerNombre = "", segundoNombre = "", res = "";

        System.out.println("Introduce el primer nombre");
        primerNombre = input.nextLine();

        System.out.println("Introduce el segundo nombre");
        segundoNombre = input.nextLine();

        res = (primerNombre == segundoNombre) ? "Los nombres son iguales" : "Los nombres no son iguales";

        System.out.println(res);
    }
}
