package actividad1;

import java.util.Scanner;

public class p003_AreaTriangulo {
    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la base? ");
        base = obj.nextInt();

        System.out.print("Dame la altura? ");
        altura = obj.nextInt();

        area = base * altura / 2;

        System.out.println(String.format("Un triangulo de base %d y altura de %d tiene un area de porcentaje %f", base, altura, area));
    }
}