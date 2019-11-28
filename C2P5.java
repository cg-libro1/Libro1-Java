import java.util.Scanner;

public class C2P5 {
      public static void main(String[] args) {
             double x1, y1, x2, y2, distancia;
             Scanner lee = new Scanner(System.in);
             System.out.println("\nIngrese las coordenadas del primer punto: ");
             x1 = lee.nextDouble();
             y1 = lee.nextDouble();
             System.out.println("\nIngrese las coordenadas del segundo punto: ");
             x2 = lee.nextDouble();
             y2 = lee.nextDouble();
             distancia = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1 - y2), 2));
             System.out.printf("\nLa distancia es: %.2f", distancia);      
      }
}
