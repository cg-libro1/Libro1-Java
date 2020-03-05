import java.util.Scanner;

public class C4P2{
    public static void main(String[] args){
        double sue1, sue2, sue3, sue4, sue5, sue6, sue7, sue8, sue9, sue10, nomina; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa sueldo empleado 1" + ": $");
        sue1 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 2" + ": $");
        sue2 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 3" + ": $");
        sue3 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 4" + ": $");
        sue4 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 5" + ": $");
        sue5 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 6" + ": $");
        sue6 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 7" + ": $");
        sue7 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 8" + ": $");
        sue8 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 9" + ": $");
        sue9 = lee.nextDouble();
        System.out.print("Ingresa sueldo empleado 10" + ": $");
        sue10 = lee.nextDouble();
        nomina = sue1 + sue2 + sue3 + sue4 + sue5 + sue6 + sue7 + sue8 + sue9 + 
             sue10;
        System.out.print("Nómina : $" + nomina);
    }
}

