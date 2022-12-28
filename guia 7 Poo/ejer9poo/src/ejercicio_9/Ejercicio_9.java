package ejercicio_9;

import ejercicio_9.Entidad.Matematicas;
import ejercicio_9.Services.Servicio;
import java.text.DecimalFormat;
import java.util.Scanner;
        
public class Ejercicio_9 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        Matematicas nums = new Matematicas(Math.random()*11,Math.random()*11);
        Servicio op = new Servicio();
        int menu;
        
        System.out.println("Los numeros generados son: " + df.format(nums.getNum1()) + "  " + df.format(nums.getNum2()));
        do{
            System.out.println("------------");
            System.out.println(""
                    + "1.Devolver Mayor\n"
                    + "2.Calcular Potencia\n"
                    + "3.Raiz Cuadrada\n"
                    + "4.Salir");
            System.out.print("Ingresa una opcion ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("El numero mayor es: " + df.format(op.devolverMayor(nums.getNum1(), nums.getNum2())));
                    break;
                case 2:
                    System.out.println("El numero menor elevado al mayor es: " + df.format(op.calcularPotencia(nums.getNum1(), nums.getNum2())));
                    break;
                case 3:
                    System.out.println("La raiz cuadrada de el numero menor es: " + df.format(op.raizCuadrada(nums.getNum1(), nums.getNum2())));
                    break;
                case 4:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("Numero ingresado no valido");
            }
        }while(menu != 4);
    }
    
}
