import java.util.Scanner;

public class C3P9 {
    public static void main(String[] args) {
        int n1, n2, n3, n4; 
        double resultado1, resultado2; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese los cuatro números enteros: ");
        n1 = lee.nextInt();
        n2 = lee.nextInt();
        n3 = lee.nextInt();
        n4 = lee.nextInt();
        if (n4 != 0){
                resultado1 = Math.pow(n1 - n2, 3) / n4;
                resultado2 = Math.pow(n2 * n3, 5) / n4;
                System.out.printf("\nResultado primera expresión: %.2f", resultado1);
                System.out.printf("\nResultado segunda expresión: %.2f", resultado2);
        }
        else 
              System.out.printf("\nn4 debe ser distinto de 0");
     }
}
