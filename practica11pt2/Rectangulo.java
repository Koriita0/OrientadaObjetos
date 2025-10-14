package practica11pt2;

public class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    public Rectangulo() {
        super();
        this.largo = 1.0;
        this.ancho = 1.0;
    }

    public Rectangulo(String color, boolean relleno, double largo, double ancho) {
        super(color, relleno);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return largo * ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + ",Largo=" + largo + ", Ancho=" + ancho + "]";
    }
}