package practica10pt2;

import practica10.Punto;

public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo() {
        this.v1 = new Punto();
        this.v2 = new Punto();
        this.v3 = new Punto();
    }

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto v1) {
        this.v1 = v1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto v2) {
        this.v2 = v2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    public double getPerimetro() {
        double d1 = v1.getDistancia(v2);
        double d2 = v2.getDistancia(v3);
        double d3 = v3.getDistancia(v1);
        return d1 + d2 + d3;
    }

    public String getTipo() {
        double d1 = v1.getDistancia(v2);
        double d2 = v2.getDistancia(v3);
        double d3 = v3.getDistancia(v1);
        final double EPSILON = 1e-6;

        if (Math.abs(d1 - d2) < EPSILON && Math.abs(d2 - d3) < EPSILON) {
            return "Equilatero";
        } else if (Math.abs(d1 - d2) < EPSILON || Math.abs(d2 - d3) < EPSILON || Math.abs(d1 - d3) < EPSILON) {
            return "Isoseles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + v1 + ", V2=" + v2 + ", V3=" + v3 + "]";
    }
}