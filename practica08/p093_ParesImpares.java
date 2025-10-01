package practica08;

import java.util.Random;

public class p093_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX];
        Random rand = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = rand.nextInt(21);
        }

        System.out.println("Elementos del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int cuentaPares = 0;
        System.out.println("Elementos pares:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                cuentaPares++;
            }
        }
        System.out.println("\nCantidad de pares: " + cuentaPares);

        int cuentaImpares = 0;
        System.out.println("Elementos impares:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                cuentaImpares++;
            }
        }
        System.out.println("\nCantidad de impares: " + cuentaImpares);
    }
}