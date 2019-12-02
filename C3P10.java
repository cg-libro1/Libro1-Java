import java.util.Scanner;

public class C3P10 {
      public static void main(String[] args) {
            int entero;
            Scanner lee = new Scanner(System.in);
            System.out.print("Ingresa el número entero: ");
            entero = lee.nextInt();
            if (entero % 2 == 0)
                 System.out.println("\nPar");
            else
                 System.out.println("\nImpar");
    }
}


