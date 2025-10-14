package actividad14;

public class p87_ArregloTemperaturas {
    public static void Mostrar(double[] t) {
        for (double v : t)

            System.out.print(v + " ");

    }

    public static double Mayor(double[] t) {
        double m = t[0];
        for (int i = 0; i < t.length; i++)
            if (t[i] > m)
                m = t[i];

        return m;
    }

    public static double Promedio(double t[]) {
        double s = 0;
        for (int i = 0; i < t.length; i++)
            s += t[i];
        return s / t.length;
    }

    public static int Buscar(double t[], double b) {
        int pos = -1;
        for (int i = 0; i < t.length; i++)
            if (t[i] == b)

                pos = i;

        return pos;
    }

    public static void main(String[] args) {
        double[] temps = { 12.34, 56.22, 56.78, 0.0, 10.25, 60.22 };
        double temp = 10.25;
        int pos = 0;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nLas temperaturas son:");
        Mostrar(temps);
        System.out.printf("\nLa temperatura mayor es : %.2f", Mayor(temps));
        System.out.printf("\nLa promedio es : %.2f", Promedio(temps));
        pos = Buscar(temps, temp);
        if (pos != -1)

            System.out.printf("\nLa temperatura %.2f fue encontrado en la posición %d", temp, pos);

        else

            System.out.println("\nEl elemento no existe");

    }
}