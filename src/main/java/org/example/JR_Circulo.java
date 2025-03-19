package org.example;

public class JR_Circulo {
    private int id;
    private double radio;
    private String color;

    public JR_Circulo(double radio) {
        this.radio = radio;
    }

    public JR_Circulo(String color) {
        this.color = color;
    }

    public JR_Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "JR_Circulo{" +
                "id=" + id +
                '}';
    }
}
