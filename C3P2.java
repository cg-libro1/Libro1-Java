import java.util.Scanner;

public class C3P2 {
    public static void main(String[] args) {
        double sueldo, nuevoSueldo;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del trabajador:  $");
        sueldo = lee.nextDouble();
        if (sueldo < 8000){
              nuevoSueldo = sueldo * 1.12;
              System.out.printf("\nEl nuevo sueldo es:  $%.2f", nuevoSueldo);
        }
        /*Observa que, si dentro del if hay más de una instrucción, entonces éstas 
          se deben colocar entre llaves*/                 
    }
}

    
    


