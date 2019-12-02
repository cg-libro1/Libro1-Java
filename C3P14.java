import java.util.Scanner;

public class C3P14 {
    public static void main(String[] args){
        int clave, nMinutos, costo;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese la clave del área geográfica: ");
        clave = lee.nextInt();
        System.out.print("Ingrese número de minutos: ");
        nMinutos = lee.nextInt();   
        costo = 0;
        switch(clave){
               case 12: costo = nMinutos * 9;
                   break;
               case 15: costo = nMinutos * 8;
                   break; 
               case 18: costo = nMinutos * 12;
                   break;
               case 21: costo = nMinutos * 16;
                   break;
               case 23: costo = nMinutos * 19;
                   break;
               case 29: costo = nMinutos * 24;
        }
        System.out.printf("\nCosto de la llamada: $" + costo);           
    }
}
