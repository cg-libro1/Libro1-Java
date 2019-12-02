import java.util.Scanner;

public class C3P7 {
    public static void main(String[] args) {
        int distancia, dias;
        double costo;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese la distancia de punto a punto: ");
        distancia = lee.nextInt();
        System.out.print("Número de días entre el viaje de ida y vuelta: ");
        dias = lee.nextInt();
        if (distancia * 2 > 500 && dias > 10)
                costo = distancia * 2 * 1.9 * 0.80;
        else 
                costo = distancia * 2 * 1.9;
        System.out.printf("\nCosto del boleto: $%.2f", costo);
    }
}
