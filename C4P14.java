import java.util.Scanner;

public class C4P14 {
    public static void main(String[] args){
          double gasto, sumaG= 0;
          Scanner lee = new Scanner(System.in);
          System.out.print("Ingresa el gasto: $");
          gasto = lee.nextDouble();
          while (gasto >= 0){
                sumaG += gasto;
                System.out.print("Ingresa el gasto: $");
                gasto = lee.nextDouble();
          }    
          System.out.println("Total de gastos: $" + sumaG);
    }
}
