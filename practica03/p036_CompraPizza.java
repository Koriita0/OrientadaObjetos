package practica03;

import java.util.Scanner;

public class p036_CompraPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elija el tamaño de la pizza:");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        String tamaño = "";
        double precio = 0;

        switch (opcion) {
            case 1:
                tamaño = "Chica";
                precio = 5;
                break;
            case 2:
                tamaño = "Mediana";
                precio = 10;
                break;
            case 3:
                tamaño = "Grande";
                precio = 20;
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.print("Ingrese la cantidad de pizzas: ");
        int cantidad = sc.nextInt();

        double totalCompra = precio * cantidad;
        double descuento = 0;

        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
        }

        double totalConDescuento = totalCompra - descuento;

        System.out.println("\nResumen de compra:");
        System.out.println("Tamaño de la pizza: " + tamaño);
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
    }
}