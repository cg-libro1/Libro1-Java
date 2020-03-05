import java.util.Scanner;

public class C3P22 {
    public static void main(String[] args){
        double costoD, costoP;
        int edadP, tipoE, numeroD; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Edad del paciente: ");
        edadP = lee.nextInt();
        System.out.print("Tipo de enfermedad 1..4: ");
        tipoE = lee.nextInt ();
        System.out.print("Número de días de internación: ");
        numeroD = lee.nextInt ();
        switch (tipoE) {
               case 1: costoD = 3150;
                      break;
               case 2: costoD = 3980;
                      break;
               case 3: costoD = 5500;
                      break;
               case 4: costoD = 7150; 
                      break;
               default: costoD = 0;
        }
        if (costoD == 0)
               System.out.printf("\nEl tipo de enfermedad ingresado es incorrecto");
        else {
               costoP = costoD * numeroD;
               if (edadP < 16)
                     costoP = costoP * 1.08;
               else if (edadP > 70)
                     costoP = costoP * 1.17;
               System.out.printf("\nCosto estimado del paciente: $%.2f", costoP);
        }           
    }
}
