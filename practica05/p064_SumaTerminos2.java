package practica05;

import java.util.Scanner;

public class p064_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int n = sc.nextInt();

        int term = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            term = term * 10 + 1;
            System.out.print(term);
            if (i < n) {
                System.out.print("+");
            }
            sum += term;
        }
        System.out.println();
        System.out.println("suma " + sum);
    }
}