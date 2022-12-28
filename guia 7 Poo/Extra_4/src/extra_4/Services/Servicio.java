package extra_4.Services;

import extra_4.Entidad.NIF;
import java.util.*;

public class Servicio {
    NIF dni = new NIF();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    String[] array = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    
    public void crearNif(){
        System.out.println("Ingrese su DNI:");
        dni.setDNI(sc.nextLong());
        dni.setLetra(array[(int)dni.getDNI()%23]);
    }
    
    public void mostrar(){
        System.out.println(dni.getDNI() + "-" + dni.getLetra());
    }
    
}
