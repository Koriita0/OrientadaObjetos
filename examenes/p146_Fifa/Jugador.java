package p146_Fifa;

import java.io.Serializable;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String nacionalidad;
    private double peso;
    private String fechaNacimiento; // Formato YYYY-MM-DD
    private String posicion;
    private String pie;
    private int rating;

    public Jugador(String nombre, String nacionalidad, double peso, String fechaNacimiento, String posicion, String pie, int rating) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.pie = pie;
        this.rating = rating;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public String getPie() { return pie; }
    public void setPie(String pie) { this.pie = pie; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
}