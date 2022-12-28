package extra_3;

import extra_3.Services.Servicio;
import java.util.Scanner;

public class Extra_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Servicio operacion = new Servicio();
        int op;
        do{
            System.out.println("--------------");
            System.out.println(""
                    + "1.Crear Objeto\n"
                    + "2.Obtener Discriminante\n"
                    + "3.Tiene Raices\n"
                    + "4.Tiene Raiz\n"
                    + "5.Obtener Raices\n"
                    + "6.Obtener Raiz\n"
                    + "7.Calcular\n"
                    + "8.Salir");
            op = sc.nextInt();
            System.out.println("--------------");
            switch(op){
                case 1:
                    operacion.crearObj();
                    break;
                case 2:
                    System.out.println("El Discriminante es: " + operacion.getDiscriminante());
                    break;
                case 3:
                    if (operacion.tieneRaices()) {
                        System.out.println("Tiene una o mas Solucines");
                    }else{
                        System.out.println("No tiene esta solucion");
                    }
                    break;
                case 4:
                    if (operacion.tieneRaiz()) {
                        System.out.println("Tiene solo una Solucion");
                    }else{
                        System.out.println("No tiene esta solucion");
                    }
                    break;
                case 5:
                    operacion.obtenerRaices();
                    break;
                case 6:
                    operacion.obtenerRaiz();
                    break;
                case 7:
                    operacion.calcular();
                    break;
                case 8:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("Numero ingresado no valido");
            }
        }while(op != 8);
    }

}
