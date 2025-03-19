package org.example;

public class Main {
    public static void main(String[] args) {
        // Instanciar un cuadrado y un círculo con color
        Circulo circulo1 = new Circulo(3, "verde");
        Cuadrado cuadrado1 = new Cuadrado(3, 3, "rojo");

        // Calcular área del cuadrado (ladoA * ladoB)
        double area1 = getArea1(cuadrado1);

        // Calcular área del círculo (pi * r^2)
        double area2 = getArea2(circulo1);

        // Calcular diferencia entre áreas
        double diferencia = getDiferencia(area1 - area2, "Diferencia áreas: ");

        // Imprimir datos de las figuras
        System.out.println("Cuadrado: " + cuadrado1);
        System.out.println("Círculo: " + circulo1);
        System.out.println("Diferencia: " + diferencia);
    }

    private static double getDiferencia(double area1, String x) {
        double diferencia = area1;
        System.out.println(x + diferencia);
        return diferencia;
    }

    private static double getArea1(Cuadrado cuadrado1) {
        double ladoA = cuadrado1.getLadoA();
        double ladoB = cuadrado1.getLadoB();
        double area1 = getDiferencia(ladoA * ladoB, "Área cuadrado: ");
        return area1;
    }

    private static double getArea2(Circulo circulo1) {
        double radio1 = circulo1.getRadio();
        double area2 = getDiferencia(radio1 * Math.PI * radio1, "Área círculo: ");
        return area2;
    }
}

class Cuadrado {
    private double ladoA;
    private double ladoB;
    private String color;

    public Cuadrado(double ladoA, double ladoB, String color) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    @Override
    public String toString() {
        return "Cuadrado[color=" + color + ", ladoA=" + ladoA + ", ladoB=" + ladoB + "]";
    }
}

class Circulo {
    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Círculo[color=" + color + ", radio=" + radio + "]";
    }
}