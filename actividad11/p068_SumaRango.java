package actividad11;

import java.util.Scanner;

public class p068_SumaRango {
    public static float SumaRango(float ini, float fin) {
        float s = 0;
        for (float i = ini; i <= fin; i++)
            s += i;

        return s;
    }

    public static void main(String[] args) {
        float i, f, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do {

            System.out.print("Dame inicio : ");
            i = obj.nextFloat();
            System.out.print("Dame fin : ");
            f = obj.nextFloat();

        } while (i > f);
        res = SumaRango(i, f);
        System.out.printf("\nLa suma del rango es %.2f", res);
    }
}