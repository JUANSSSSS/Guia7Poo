package ejercicio_4.Services;

import ejercicio_4.Entidad.Rectangulo;
import java.util.Scanner;

public class Services {

    Scanner sc = new Scanner(System.in);
    Rectangulo rec = new Rectangulo();

    public void crearRec() {
        System.out.println("Ingresa la base");
        rec.setBase(sc.nextInt());
        System.out.println("Ingresa la altura");
        rec.setAltura(sc.nextInt());
    }
    
    public void superficie(){
        System.out.println("-----------------");
        System.out.println("La superficie del rectangulo es: " + (rec.getBase()*rec.getAltura()));
        System.out.println("-----------------");
    }
    
    public void perimetro(){
        System.out.println("-----------------");
        System.out.println("El perimetro del rectangulo es: " + ((rec.getBase()+rec.getAltura())*2));
        System.out.println("-----------------");
    }
    
    public void mostrarRec(){
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                if (i == 0 || i == rec.getAltura()-1) {
                    System.out.print("*");
                }else if(j == 0 || j == rec.getBase()-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
