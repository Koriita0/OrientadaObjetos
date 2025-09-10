package practica04;

import java.util.Scanner;

public class p050_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            int inicial, fin;

            // Solicitar temperaturas y validar rango
            do {
                System.out.print("Temperatura Inicial: ");
                inicial = sc.nextInt();
                System.out.print("Temperatura Final: ");
                fin = sc.nextInt();
                if (fin < inicial) {
                    System.out.println("Error: La temperatura final no puede ser menor a la inicial.");
                }
            } while (fin < inicial);

            System.out.println("------------------------------------");
            System.out.println("Centígrados\tFarenheit");
            System.out.println("------------------------------------");
            for (int c = inicial; c <= fin; c++) {
                double f = c * 9.0 / 5.0 + 32;
                System.out.printf("%d\t\t%.1f\n", c, f);
            }
            System.out.println("------------------------------------");

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = sc.next().trim().toUpperCase();
        } while (continuar.equals("S"));

        sc.close();
    }
}