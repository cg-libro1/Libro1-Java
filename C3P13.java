import java.util.Scanner;

public class C3P13 {
    public static void main(String[] args){
        int modelo;
        double precio, nPrecio, descuento=0;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese el modelo del automóvil: ");
        modelo = lee.nextInt();
        System.out.print("Ingrese el precio: $");
        precio = lee.nextDouble();
        switch(modelo){
              case 1: descuento = precio * 0.03 + 20000;
                  break;
              case 3: 
              case 4: descuento = precio * 0.05 + 35000;
                  break;
              case 5: descuento = precio * 0.05 + 60000;
                  break;
            case 10: descuento = precio * 0.05 + 30000;
                  break;
            case 30: descuento = precio * 0.07 + 50000;
                  break;
            case 50: descuento = precio * 0.09 + 70000;
                  break;
        }
        nPrecio = precio - descuento;
        System.out.print("\nModelo:       " + modelo);
        System.out.print("\nPrecio:       $" + precio);
        System.out.print("\nNuevo precio: $" + nPrecio);           
    }
}
