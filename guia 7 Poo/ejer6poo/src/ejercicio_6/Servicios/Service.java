package ejercicio_6.Servicios;

import java.util.Scanner;
import ejercicio_6.Entidad.Cafetera;

public class Service {
    Scanner sc = new Scanner(System.in);
    Cafetera cafe = new Cafetera();
    int taza,cant;
    public void llenarCafetera(){
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("La cafetera esta llena con: " + cafe.getCantidadActual() + "ml");
    }
    
    public void servirTaza(){
        System.out.println("Ingrese la cantidad de liquido de la taza (ml)");
        taza = sc.nextInt();
        if (taza > cafe.getCantidadActual()) {
            System.out.println("No tienes suficiente cafe");
            System.out.println("La taza se lleno con: " + cafe.getCantidadActual());
            cafe.setCantidadActual(0);
        }else{
            System.out.println("---Sirviendo---");
            cafe.setCantidadActual(cafe.getCantidadActual()-taza);
        }
    }
    
    public void vaciarCafetera(){
        System.out.println("---Vaciando---");
        cafe.setCantidadActual(0);
    }
    
    public void agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe que desea ingresar");
        cant = sc.nextInt();
        if (cant + cafe.getCantidadActual() > cafe.getCapacidadMaxima()) {
            System.out.println("Ingresaste mas de lo que la cafetera soporta");
            cafe.setCantidadActual(cafe.getCapacidadMaxima());
            System.out.println("Cafetera llena con " + cafe.getCantidadActual() + "ml");
        }else{
            System.out.println("---LLenando---");
            cafe.setCantidadActual(cafe.getCantidadActual()+cant);
        }  
    }
    
}
