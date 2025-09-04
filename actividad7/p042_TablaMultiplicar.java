
package actividad7;

import java.util.Scanner;

public class p042_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Imprimir la tabla deseada de 1 a 10\n");
        System.out.print("¿Qué tabla quieres? ");
        int tabla = scanner.nextInt();
        System.out.print("¿Hasta dónde? ");
        int limite = scanner.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.printf("%d x %d = %d\n", i, tabla, i * tabla);
        }

        System.out.println("\nProceso terminado ...");
    }
}