package ejercicio_12;

import java.util.Scanner;
import ejercicio_12.Services.Service;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Service per1 = new Service();
        Scanner sc = new Scanner(System.in);
        int op,edad;
        boolean menor;
        
        do{
            System.out.println("--------------");
            System.out.print(""
                    + "1.Crear Persona\n"
                    + "2.Calcular Edad\n"
                    + "3.Menor Que\n"
                    + "4.Mostrar Pesona\n"
                    + "5.Salir\n"
                    + "Ingresa una Opcion\n");
            op = sc.nextInt();
            System.out.println("--------------");
            switch(op){
                case 1:
                    per1.crearPersona();
                    break;
                case 2:
                    per1.calcularEdad();
                    break;
                case 3:
                    System.out.println("Ingresa una edad para comparar");
                    edad = sc.nextInt();
                    menor = per1.menorQue(edad);
                    if (menor == true) {
                        System.out.println("La edad ingresada es menor que la persona");
                    }else{
                        System.out.println("La edad de la ingresada es mayor que la persona");
                    }
                    break;
                case 4:
                    per1.mostrarPersona();
                    break;
                case 5:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("Numero ingresado no valido");
            }
        }while(op != 5);
        
    }
    
}
