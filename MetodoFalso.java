
import static java.lang.Math.sin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jenny
 */
public class MetodoFalso {
    public double raiz(Funcion f, double xu, double xi, int n, double error){
        double r = 0; //VALOR FLOTANTE 
        double x = 0; // INICIACION DE LA VARIABLE XR
        int k = 0;

        while (Math.abs(f.eval(x)) > error && k < n){ // EVALUACION FUNCION > TOLERANCIA
            
            x = xu - (((f.eval(xu)) * (xi-xu)) / (f.eval(xi) - f.eval(xu))); //FORMULA APROXIMACION DE LA RAIZ
        
            if((f.eval(xi) * f.eval(x)) < 0){ // EVALUACION FXI * FXU < 0
                xu = x;
                k++;
            } else {
                xi = x;
            }
        }

        if (k < n) {
            r = x;   
        } 

       return r;               
    }
    public static void main(String[] args) {
        Funcion f = new Funcion() {
            @Override
            public double eval(double x) {
                //3x + sen(x) - e^x
                return (3 * x) + sin(x) - Math.exp(x);
            }
        };
        
        MetodoFalso rf = new MetodoFalso();
        double raiz = rf.raiz(f, 0, 1, 9, 0.01);
        System.out.println("RAIZ: " + raiz);
    }
}