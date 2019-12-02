import java.util.Scanner;
public class C3P6 {
    public static void main(String[] args) {
        double sueldo, aumento, nSueldo;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del trabajador: $");
        sueldo = lee.nextDouble();
        if (sueldo < 8000)
                 aumento = sueldo * 0.12;      
        else                
                 aumento = sueldo * 0.08;        
        nSueldo = sueldo + aumento;        
        System.out.printf("\nAumento: $%.2f", aumento); 
        System.out.printf("\nNuevo sueldo: $%.2f", nSueldo);   
   }
}

