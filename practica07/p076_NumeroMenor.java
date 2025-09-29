package practica07;

import java.util.Scanner;

public class p076_NumeroMenor {

    // Función que pide 4 números y devuelve el menor
    public static int menorDeCuatro() {
        Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int num = sc.nextInt();
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int menor = menorDeCuatro();
        System.out.println("El menor de los cuatro números es: " + menor);
    }
}