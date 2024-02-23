import java.util.Scanner; // <-- IMPORTAR LA LIBRERIA 

/**
 * Librerias
 */
public class Librerias {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);// Invocar la libreria eh introducir datos desde el teclado
        String nombre = "";
        int numUno = 0, numDos = 0, resultado = 0;


        System.out.println("Cual es tu nombre?");
        nombre = input.nextLine(); // para string

        System.out.println("Dame el primer valor para sumar: ");
        numUno = input.nextInt(); // para int

        System.out.println("Dame el segundo valor para sumar: ");
        numDos = input.nextInt(); // para int

        resultado = numUno + numDos;

        System.out.println("Hola " + nombre + " el resultado de la suma es: " + resultado);
    }
}