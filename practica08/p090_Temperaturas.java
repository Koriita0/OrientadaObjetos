package practica08;

public class p090_Temperaturas {
    public static void main(String[] args) {
      
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        System.out.println("Primer elemento: " + temperaturas[0]);

        System.out.println("Tercer elemento: " + temperaturas[2]);

        System.out.println("Elementos del arreglo:");
        for (float temp : temperaturas) {
            System.out.print(temp + " ");
        }
        System.out.println();

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }

        System.out.println("Elementos del arreglo después de poner a 0 los mayores a 10:");
        for (float temp : temperaturas) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}