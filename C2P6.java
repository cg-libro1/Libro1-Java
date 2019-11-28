import java.util.Scanner;

public class C2P6 {
      public static void main(String[] args) {
             double radio, area, volumen;
             Scanner lee = new Scanner(System.in);
             System.out.print("\nIngrese el radio de la esfera: ");
             radio = lee.nextDouble();
             area = 4 * Math.PI * Math.pow(radio,2);
             volumen = Math.PI * Math.pow(radio,3) / 3;
             System.out.printf("\nÁrea de la esfera: %.2f", area);  
             System.out.printf("\nVolumen de la esfera: %.2f",volumen);
      }
}

