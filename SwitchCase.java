public class SwitchCase {
    public static void main(String[] args){
        String mensaje = "";
        int num_uno = 5, num_dos = 3, resultado = 0;
        int parametro = 5;

        switch (parametro) {
            case 1:
                resultado = num_uno + num_dos;
                mensaje = "El resultado de la suma es: "+ resultado;
                break;
            case 2:
                resultado = num_uno - num_dos;
                mensaje = "El resultado de la resta es: "+ resultado;
                break;
            case 3:
                resultado = num_uno * num_dos;
                mensaje = "El resultado de la multiplicacion es: "+ resultado;
                break;
            case 4:
                resultado = num_uno / num_dos;
                mensaje = "El resultado de la division es: "+ resultado;
                break;
            default:
                mensaje ="Comando no reconocido, intente de nuevo porfavor :)";
                break;
        }

        System.out.println(mensaje);
    }
}
