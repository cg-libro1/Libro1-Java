/import java.util.Scanner;

public class C3P24 {
    public static void main(String[] args){
        int tipoP, adultos, niños;
        double costo=0, costoB; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese el tipo de paquete: ");
        tipoP = lee.nextInt();
        System.out.print("Ingrese el número de adultos: ");
        adultos = lee.nextInt();
        System.out.print("Ingrese el número de niños: ");
        niños = lee.nextInt();
        switch (tipoP) {
            case 1: costo = 615;
                break;
            case 2: costo = 790;
                break;
            case 3: costo = 1290;
                break;
        }
        costoB = costo * adultos + costo * niños * 0.60;
        if (adultos > 100)
              if (adultos > 250)
                    costoB = costoB * 0.85;
            else
                    costoB = costoB * 0.90;
        System.out.printf("\nCosto del banquete : $" + costoB);
        
    }
}

