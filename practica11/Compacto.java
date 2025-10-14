package practica11;

public class Compacto extends Vehiculo {
    private int pasajeros;
    private int puertas;

    public Compacto() {
        super();
        this.pasajeros = 0;
        this.puertas = 0;
    }

    public Compacto(String serie, String marca, int año, double precio, int pasajeros, int puertas) {
        super(serie, marca, año, precio);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto [" + super.toString() + ", Pasajeros=" + pasajeros + ", Puertas=" + puertas + "]";
    }
}