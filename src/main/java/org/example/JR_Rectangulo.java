package org.example;

public class JR_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    public JR_Rectangulo(double ladoA) {
        this.ladoA = ladoA;
    }

    public JR_Rectangulo(String color) {
        this.color = color;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "JR_Rectangulo{" +
                "id=" + id +
                '}';
    }
}
