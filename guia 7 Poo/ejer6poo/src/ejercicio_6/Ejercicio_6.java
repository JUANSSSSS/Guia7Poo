package ejercicio_6;

import java.util.Scanner;
import ejercicio_6.Servicios.Service;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Service cafe = new Service();
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("-------------");
            System.out.println(""
                    + "1.Llenar Cafetera\n"
                    + "2.Servir Taza\n"
                    + "3.Vaciar Cafetera\n"
                    + "4.Agregar Cafe\n"
                    + "5.Salir");
            System.out.print("Ingresa una opcion: ");
            op = sc.nextInt();
            System.out.println("-------------");
            switch(op){
                case 1:
                    cafe.llenarCafetera();
                    break;
                case 2:
                    cafe.servirTaza();
                    break;
                case 3:
                    cafe.vaciarCafetera();
                    break;
                case 4:
                    cafe.agregarCafe();
                    break;
                case 5:
                    System.out.println("---Saliendo---");
                    break;
            }        
        }while(op != 5);
    }

}
