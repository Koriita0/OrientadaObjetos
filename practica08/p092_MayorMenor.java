package practica08;

import java.util.Scanner;

public class p092_MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números desea capturar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Elementos del arreglo: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        sc.close();
    }
}