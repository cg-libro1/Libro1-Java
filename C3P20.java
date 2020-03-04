import java.util.Scanner;

public class C3P20 {
    public static void main(String[] args){
        double ingreso, retencion, ingresoNeto;
        Scanner lee = new Scanner(System.in);
        System.out.print("Proporcione el ingreso correspondiente: ");
        ingreso = lee.nextDouble();
        if (ingreso <= 20000)
               retencion = 0;
        else if (ingreso <= 40000)
               retencion = (ingreso - 20000) * 0.15;
        else if (ingreso <= 70000)
               retencion = (ingreso - 20000) * 0.25;
        else if (ingreso <= 100000)
               retencion = (ingreso - 20000) * 0.30;
        else 
               retencion = (ingreso - 20000) * 0.30;
        ingresoNeto = ingreso - retencion;
        System.out.printf("\nRetención: $%.2f", retencion);
        System.out.printf("\nIngreso neto: $%.2f", ingresoNeto);  
    }
}    
