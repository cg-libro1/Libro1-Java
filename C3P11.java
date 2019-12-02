import java.util.Scanner;

public class C3P11 {
    public static void main(String[] args){
        int nivel;
        double sueldo, nSueldo= 0.0;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el nivel del trabajador: 1..4: ");
        nivel = lee.nextInt();
        System.out.print("Ingresa el sueldo del trabajador: $");
        sueldo = lee.nextDouble();
        nSueldo= sueldo;
        switch(nivel){
              case 1: nSueldo = sueldo * 1.12;
                    break;
              case 2: nSueldo = sueldo * 1.08;
                    break;
              case 3: nSueldo = sueldo * 1.05;
                    break;
              case 4: nSueldo = sueldo * 1.038;
                    break;
        } 
        System.out.printf("\nNivel: " + nivel);
        System.out.printf("\nSueldo: $%.2f", sueldo);
        System.out.printf("\nNuevo sueldo: $%.2f", nSueldo);
    }
}
