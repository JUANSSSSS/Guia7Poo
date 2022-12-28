package Ejercicio_2.Clases;

import static java.lang.Math.PI;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Circun {

    DecimalFormat df = new DecimalFormat("#");
    Scanner sc = new Scanner(System.in);
    private double radio;
    public String area;
    public String perimetro;

    public Circun(double radio) {
        this.radio = radio;
    }

    public void setRadio() {

    }

    public double getRadio() {
        return radio;
    }

    public void crearCircun() {
        System.out.println("Ingresa el radio");
        radio = sc.nextDouble();
    }

    public void area() {
        area = df.format(PI * (radio * radio));
    }

    public void perimetro() {
        perimetro = df.format(2 * PI * radio);
    }

}
