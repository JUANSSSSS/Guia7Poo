package extra_4;

import java.util.*;
import extra_4.Services.Servicio;

public class Extra_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Servicio dni = new Servicio();
        int op;
        do{ 
            System.out.println("-----------------------");    
            System.out.print(""
                    + "1.Crear DNI\n"
                    + "2.Mostrar\n"
                    + "3.Salir\n"
                    + "Ingrese una opcion:");
            op = sc.nextInt();
            System.out.println("-----------------------");
            switch(op){
                case 1:
                    dni.crearNif();
                    break;
                case 2:
                    dni.mostrar();
                    break;
                case 3:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("Numero ingresado no valido");
            }
        }while(op != 3);
             
    }

}
