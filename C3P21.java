import java.util.Scanner;

public class C3P21 {
    public static void main(String[] args){
        double sueldo, nuevoS, valorHE;
        int categoria, horasE;
        Scanner lee = new Scanner(System.in);
        System.out.print("Sueldo del empleado: $");
        sueldo = lee.nextDouble();
        System.out.print("Categoría: ");
        categoria = lee.nextInt ();
        System.out.print("Número de horas extras: ");
        horasE = lee.nextInt ();
        switch (categoria) {
               case 1: valorHE = 120;
                      break;
               case 2: valorHE = 150;
                      break;
               case 3: valorHE = 195;
                      break;
               case 4: valorHE = 245;
                      break;
               default: valorHE = 0;
                      break;
        }
        if (horasE > 30)
               nuevoS = sueldo + 30 * valorHE;
        else
               nuevoS = sueldo + horasE * valorHE;
        System.out.printf("\nNuevo sueldo del trabajador: $%.2f", nuevoS);    
    }
} 

