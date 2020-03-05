import java.util.Scanner;

public class C4P1 {
    public static void main(String[] args){
           int i;                                               
           double sueldo, nomina=0; 
           Scanner lee = new Scanner(System.in);
           for (i= 0; i < 10; i++){  // Se asigna el valor inicial, límite del ciclo e incremento
                 System.out.print("Ingresa sueldo " + (i+1) + ": $");
                 sueldo = lee.nextDouble();
                 nomina = nomina + sueldo;
            }
           System.out.print("Nómina : $" + nomina);
    }
}

