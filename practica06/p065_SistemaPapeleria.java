package practica06;

import java.util.Scanner;

public class p065_SistemaPapeleria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ventasRealizadas = 0;
        int totalCarta = 0, totalOficio = 0, totalDobleOficio = 0;
        int cantidadCarta = 0, cantidadOficio = 0, cantidadDobleOficio = 0;
        int precioCarta = 3, precioOficio = 4, precioDobleOficio = 6;

        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------");

        String otraVenta;
        int ventaNum = 1;
        do {
            System.out.println("Venta: " + ventaNum);
            System.out.print("Tipo de copia (C)arta $3,(O)ficio $4,(D)oble Of $6? ");
            String tipo = sc.next().trim().toUpperCase();
            System.out.print("Cantidad ? ");
            int cantidad = sc.nextInt();

            if (tipo.equals("C")) {
                cantidadCarta += cantidad;
                totalCarta += cantidad * precioCarta;
            } else if (tipo.equals("O")) {
                cantidadOficio += cantidad;
                totalOficio += cantidad * precioOficio;
            } else if (tipo.equals("D")) {
                cantidadDobleOficio += cantidad;
                totalDobleOficio += cantidad * precioDobleOficio;
            }

            ventasRealizadas++;
            ventaNum++;
            System.out.print("Otra venta (S/N) ? ");
            otraVenta = sc.next().trim().toUpperCase();
        } while (otraVenta.equals("S"));

        int totalCopias = cantidadCarta + cantidadOficio + cantidadDobleOficio;
        int totalVentas = totalCarta + totalOficio + totalDobleOficio;

        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + ventasRealizadas);
        System.out.println("-------------------------");
        System.out.printf("Carta : %d - $ %d\n", cantidadCarta, totalCarta);
        System.out.printf("Oficio : %d - $ %d\n", cantidadOficio, totalOficio);
        System.out.printf("Doble Of. : %d - $ %d\n", cantidadDobleOficio, totalDobleOficio);
        System.out.println("-------------------------");
        System.out.printf("Tot. Ventas : %d - $ %d\n", totalCopias, totalVentas);

        String mensaje;
        if (totalVentas < 50) {
            mensaje = "Venta moderada";
        } else if (totalVentas <= 100) {
            mensaje = "Venta frecuente";
        } else {
            mensaje = "Venta superada";
        }
        System.out.println("Esta venta es una : " + mensaje);

        sc.close();
    }
}