public class MetodosDos {
    public static void main(String args[]){
        int i = 0, j = 99;

        System.out.println("Prueba con ciclo for: ");

        for(i = 1; i <= 5; i++){
            if(i < 5){
                System.out.print(i + ",");
                System.out.print(j + ",");
            } else {
                System.out.print(i + ",");
                System.out.print(j);
            }
            j--;
        }


        i = 1; 
        j = 99;

        System.out.println("");
        System.out.println("Prueba con ciclo While: ");
        while(i <= 5){
            if(i < 5){
                System.out.print(i + ",");
                System.out.print(j + ",");
            }else {
                System.out.print(i + ",");
                System.out.print(j);
            }
            i++;
            j--;
        }

        i = 1; 
        j = 99;

        System.out.println("");
        System.out.println("Prueba con ciclo Do While: ");
        
        
        do{
            if(i < 5){
                System.out.print(i + ",");
                System.out.print(j + ",");
            }else {
                System.out.print(i + ",");
                System.out.print(j);
            }
            i++;
            j--;
        }while(i <= 5);
    }
}
