package extra_2.Services;

import extra_2.Entidad.Puntos;
import java.util.*;

public class Service {
    Scanner sc = new Scanner(System.in);
    Puntos puntos1 = new Puntos();
    int x1,y1,x2,y2,distancia;
    public void crearPuntos(){
        System.out.println("Ingrese el punto X1:");
        puntos1.setX1(sc.nextInt());
        System.out.println("Ingrese el punto Y1:");
        puntos1.setY1(sc.nextInt());
        System.out.println("Ingrese el punto X2:");
        puntos1.setX2(sc.nextInt());
        System.out.println("Ingrese el punto Y2:");
        puntos1.setY2(sc.nextInt());
    }
    
    public void calcularDistancia(){
        System.out.println("Ingrese de nuevo los puntos (X1)(Y1)(X2)(Y2)");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        distancia = (int)Math.sqrt(Math.pow(x1 - x2,2)+Math.pow(y1 - y2,2));
        System.out.println("La distancia es " + distancia);
    }
    
}
