package actividad11;

import java.util.Scanner;

public class p067_ConversionTemperaturas {
    public static float Farenheit(float t) {
        return (t * 9 / 5) + 32;
    }

    public static float Celcius(float t) {
        return (t - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        int op;
        float temp, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("[1] farenheit\n[2] celcius\nElige ? ");
        op = obj.nextInt();
        if (op == 1) {
            System.out.print("Dame la temperatura ? ");
            temp = obj.nextFloat();
            res = Farenheit(temp);
            System.out.printf("\n%.2f grados celcius equivale a %.2f grandos farenheit ..", temp, res);
        } else if (op == 2) {
            System.out.print("Dame la temperatura ? ");
            temp = obj.nextFloat();
            res = Celcius(temp);
            System.out.printf("\n%.2f grados farenheit equivale a %.2f grandos celcius ..", temp, res);
        } else
            System.out.println("Opción inválida");
    }
}