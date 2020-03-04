import java.util.Scanner;

public class C3P17 {
    public static void main(String[] args){
        int clave;
        double sueldo, nSueldo;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese la clave: ");
        clave = lee.nextInt();
        System.out.print("Ingrese el sueldo: $");
        sueldo = lee.nextDouble();
        if (sueldo < 10000)
              nSueldo = sueldo * 1.18;
        else if (sueldo < 15000)
              nSueldo = sueldo * 1.12;
        else
              nSueldo = sueldo * 1.08;   
        System.out.printf("\nClave: " + clave);
        System.out.printf("\nNuevo sueldo: $" + nSueldo);       
    }
}
