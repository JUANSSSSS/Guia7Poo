package ejercicio_11;

import java.util.*;

public class Ejercicio_11 {

    public static void main(String[] args) {
        int dia, mes, anio;
        Date fechaActual = new Date();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes");
        mes = sc.nextInt();
        System.out.println("Ingresa el año");
        anio = sc.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println("La diferencia de fecha es : " + (fechaActual.getYear()-fecha.getYear()));
    }
}


