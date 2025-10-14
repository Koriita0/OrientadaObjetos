package practica11;

public class Vehiculo {
    private String serie;
    private String marca;
    private int año;
    private double precio;

    public Vehiculo() {
        this.serie = "";
        this.marca = "";
        this.año = 0;
        this.precio = 0.0;
    }

    public Vehiculo(String serie, String marca, int año, double precio) {
        this.serie = serie;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + serie + ", Marca=" + marca + ", Año=" + año + ", Precio=" + precio + "]";
    }
}