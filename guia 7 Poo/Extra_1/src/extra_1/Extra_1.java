package extra_1;

import extra_1.Entidad.Cancion;
import java.util.Scanner;

public class Extra_1 {

    public static void main(String[] args) {
        Cancion song = new Cancion();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo de la cancion");
        song.setTitulo(sc.next());
        System.out.println("Ingrese el autor");
        song.setAutor(sc.next());
        System.out.println("El autor de " + song.getTitulo() + " es: " + song.getAutor());
    }
    
}
