
import java.util.Scanner;
 
public class C2P3 {
      public static void main(String[] args) {
             double base, altura, perimetro, area; 
             Scanner lee = new Scanner(System.in);
             System.out.println("Ingresa la base del rectángulo: ");
             base = lee.nextDouble();
             System.out.println("Ingresa la altura del rectángulo: ");
             altura = lee.nextDouble();
             perimetro = 2*base + 2*altura;
             area = base * altura;
             System.out.println("Perímetro: " + perimetro);
             System.out.println("Área: " + area);
    }  
}
