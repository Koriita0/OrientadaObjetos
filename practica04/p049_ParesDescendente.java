package practica04;

import java.util.Scanner;

public class p049_ParesDescendente {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String continuar;
    do {
        System.out.print("Introduce el número límite inferior (n): ");
        int n = sc.nextInt();
        int suma = 0, contador = 0;

        System.out.print("Números pares entre 100 y " + n + ": ");
        for (int i = 100; i >= n; i -= 2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                suma += i;
                contador++;
            }
        }
        System.out.println();
        System.out.println("La suma: " + suma);
        if (contador > 0) {
            System.out.println("Promedio: " + (suma / contador));
        } else {
            System.out.println("Promedio: 0");
        }
        System.out.print("¿Deseas continuar (S/N)? ");
        continuar = sc.next().trim().toUpperCase();
    } while (continuar.equals("S"));
    sc.close();
}
}