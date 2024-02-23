public class NuevasOperaciones {
    public static void main(String[] args){
        int operacion = 1;
        int num_uno = 8;
        int num_dos = 4;
        int resultado = 0;

        if(operacion == 1){
            resultado = num_uno + num_dos;
            System.out.println(resultado);
        } else if(operacion == 2) {
            resultado = num_uno - num_dos;
            System.out.println(resultado);
        } else if(operacion == 3) {
            resultado = num_uno * num_dos;
            System.out.println(resultado);
        } else if(operacion == 4) {
            resultado = num_uno / num_dos;
            System.out.println(resultado);
        } else {
            System.out.println("Se desconoce la operacion");
        }
    }
}
