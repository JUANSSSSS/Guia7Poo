package Ejercicio_2;

import Ejercicio_2.Clases.Circun;

public class Ejecicio_2 {

    public static void main(String[] args) {
        Circun cir = new Circun(0);
        cir.crearCircun();
        cir.area();
        cir.perimetro();
        System.out.println("El area del circulo es: " + cir.area);
        System.out.println("EL perimetro del circulo es: " + cir.perimetro);

    }

}
