import java.util.Scanner;

public class C3P5 {
      public static void main(String[] args) {
            double calificacion;
            Scanner lee = new Scanner(System.in);
            System.out.print("\nIngrese la calificación del alumno: ");
            calificacion = lee.nextDouble();
            if (calificacion >= 6)
                   System.out.println("\nAprobado"); 
            else
                   System.out.println("\nReprobado");
    }
}
