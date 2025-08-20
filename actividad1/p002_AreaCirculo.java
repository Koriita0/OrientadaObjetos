package actividad1;

import java.util.Scanner;

public class p002_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner iradio = new Scanner(System.in);
        System.out.print("Dame el radio del circulo? ");
        radio = iradio.nextFloat();
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El circulo de radio " + radio + " tiene un area de " + area);

    }
}