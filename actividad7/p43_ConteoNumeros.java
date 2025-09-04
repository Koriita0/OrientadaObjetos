package actividad7;

import java.util.Scanner;

public class p43_ConteoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int totalNumeros = 0, suma = 0;
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Cuenta números: positivos, negativos, ceros, hasta introducir 999");

        while (true) {
            System.out.print("Dame un número ? ");
            numero = scanner.nextInt();
            if (numero == 999) {
                break;
            }
            totalNumeros++;
            suma += numero;
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nCaptura terminada");
        System.out.println("\nResumen:");
        System.out.printf("Introdujiste %d números \n", totalNumeros);
        System.out.printf("La suma de los números es : %d \n", suma);
        System.out.printf("Los positivos fueron : %d \n", positivos);
        System.out.printf("Los negativos fueron : %d \n", negativos);
        System.out.printf("Los ceros fueron : %d \n", ceros);
        System.out.println("\nProceso terminado ...");
    }
}