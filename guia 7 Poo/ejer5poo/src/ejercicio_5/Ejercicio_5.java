package ejercicio_5;

import ejercicio_5.Services.Services;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Services cuenta = new Services();
        int num;
        do {
            System.out.println("------------");
            System.out.println("----Menu----");
            System.out.println("1.Crear Cuenta \n2.Ingresar Saldo \n3.Retirar \n4.Extraccion Rapida \n5.Consultar saldo \n6.Consultar datos \n7.Salir");
            num = sc.nextInt();
            switch(num){
                case 1:
                    cuenta.crearCuenta();
                    break;
                case 2:
                    cuenta.ingresar();
                    break;
                case 3:
                    cuenta.retirar(); 
                    break;
                case 4:
                    cuenta.extraccionRapida();
                    break;
                case 5:
                    cuenta.consultarSaldo();
                    break;
                case 6:
                    cuenta.consultarDatos();
                    break;
                case 7:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("El numero ingresado es incorrecto");
            }
        } while (num != 7);
        
    }

}
