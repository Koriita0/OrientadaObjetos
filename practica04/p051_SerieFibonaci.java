package practica04;

import java.util.Scanner;

public class p051_SerieFibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("¿Número de términos que deseas imprimir ?: ");
            int n = sc.nextInt();

            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:");
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + (i < n - 1 ? " " : "\n"));
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = sc.next().trim().toUpperCase();
        } while (continuar.equals("S"));

        sc.close();
    }
}