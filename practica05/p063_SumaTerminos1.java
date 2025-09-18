package practica05;

import java.util.Scanner;

public class p063_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int n = sc.nextInt();

        double suma = 0.0;
        String secuencia = "";

        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
            if (i == 1) {
                secuencia = "1";
            } else {
                secuencia += "+1/" + i;
            }
        }

        System.out.println("Salida: " + secuencia);
        System.out.println("Suma " + suma);
    }
}