
package servicios;

import ejer1pooo.entidades.libro;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner (System.in) ;
    public libro crearlibro (){
        System.out.println("ingrese isbn ");
        int isbn = leer.nextInt();
        System.out.println("ingrese titulo");
        String titulo = leer.next();
        System.out.println("ingrese autor");
        String autor =leer.next();
        System.out.println("ingrese paginas");
        int paginas =leer.nextInt();
        System.out.println(isbn +" "+ titulo +" "+ autor + " "+ paginas);
        return null;
        
    }

  
}
