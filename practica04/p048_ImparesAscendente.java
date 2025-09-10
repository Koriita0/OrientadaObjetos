package practica04;

import java.util.Scanner;

public class p048_ImparesAscendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;
        do {
            System.out.print("Introduce el número límite (n): ");
            int n = sc.nextInt();

            int suma = 0, contador = 0;
            System.out.print("Números impares entre 1 y " + n + ": ");
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
                suma += i;
                contador++;
            }
            System.out.println();
            double promedio = contador > 0 ? (double) suma / contador : 0;
            System.out.println("La suma: " + suma + ", el promedio: " + promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = sc.next().trim().toUpperCase();
        } while (continuar.equals("S"));
        sc.close();
    }
}