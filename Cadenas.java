import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = "";
        int number = 0;

        System.out.println("Introduce una palabra: ");
        word = input.nextLine();
        System.out.println("La palabra tiene " + word.length() + " caracteres");

        System.out.println("Que parte de la cadena deseas obtener?");
        number = input.nextInt();
        word = word.substring(0, number);
        System.out.println("La palabra seria ahora: " + word);

    }
}
