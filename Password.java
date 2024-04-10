import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String user = "mauro", userInput = "", password = "banana05", passwordInput = "";
        int intentos = 1;

        System.out.println("Introduce tu nombre de usuario");
        
        userInput = input.nextLine();

        if(user.equals(userInput)){
            System.out.println("Introduce la contraseña");
            while (intentos <= 3) {
                passwordInput = input.nextLine();
                if(password.equals(passwordInput)){
                    System.out.println("Bienvenido " + user);
                    break;
                } else {
                    System.out.println("Contrasena incorrecta, intente de nuevo");
                    System.out.println("Intentos: " + intentos);
                    System.out.println("Introduce la contraseña");
                    intentos ++;
                }
            }
        } else {
            System.out.println("Usuario no encontrado");
        }

    }
}
