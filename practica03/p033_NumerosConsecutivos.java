package practica03;

public class p033_NumerosConsecutivos {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int c = 11;

        if (sonConsecutivos(a, b, c)) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Error: Los números no son consecutivos.");
        }
    }

    public static boolean sonConsecutivos(int x, int y, int z) {
        int min = Math.min(x, Math.min(y, z));
        int max = Math.max(x, Math.max(y, z));
        int mid = x + y + z - min - max;
        return (mid == min + 1) && (max == mid + 1);
    }
}