import java.util.Scanner;

public class C3P4 {
    public static void main(String[] args) {
        double gasto, descuento = 0, pago;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese el gasto del cliente:  $");
        gasto = lee.nextDouble();
        descuento = 0;
        pago = gasto;
        if (gasto > 3000){
              descuento = gasto * 0.15;
              pago = gasto - descuento;
        }
        System.out.printf("\nGasto:  $%.2f", gasto);
        System.out.printf("\nDescuento:  $%.2f", descuento);
        System.out.printf("\nPago:  $%.2f", pago);              
    }
}
