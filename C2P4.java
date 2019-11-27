import java.util.Scanner;
 
public class C2P4 {
      public static void main(String[] args) {
             double lado1, lado2, lado3, sp, area;
             Scanner lee = new Scanner(System.in);
             System.out.printf("\nIngrese el primer lado del triángulo: ");
             lado1 = lee.nextDouble();
             System.out.printf("\nIngrese el segundo lado del triángulo: ");
             lado2 = lee.nextDouble();
             System.out.printf("\nIngrese el tercer lado del triángulo: ");
             lado3 = lee.nextDouble();
             sp = (lado1 + lado2 + lado3)/2;
             area = Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
             //La función Math.sqrt() se utiliza para calcular la raíz cuadrada
             System.out.printf("\nEl área del triángulo es:  %.2f%n", area);     
             //Escribimos el área con dos decimales
             
    }
}

         
    