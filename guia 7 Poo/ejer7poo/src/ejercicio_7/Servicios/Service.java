package ejercicio_7.Servicios;

import ejercicio_7.Entidad.Persona;
import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);
    Persona per = new Persona();
    int res;
    double exp;
    boolean flag;
    
    public void crearPersona(){
        System.out.print("Ingrese el Nombre de la persona: ");
        per.setNombre(sc.nextLine());
        System.out.print("Ingrese la edad de " + per.getNombre() + ": ");
        per.setEdad(sc.nextInt());
        do{
        System.out.print("Ingrese el sexo de " + per.getNombre() + " (H)(M)(O): ");
        per.setSexo(sc.nextLine());
            if(!per.getSexo().equalsIgnoreCase("M") && !per.getSexo().equalsIgnoreCase("H") && !per.getSexo().equalsIgnoreCase("O")) {
                System.out.println("Igresa de nuevo el sexo");
                per.setSexo(sc.nextLine());
            }
        }while(!per.getSexo().equalsIgnoreCase("M") && !per.getSexo().equalsIgnoreCase("H") && !per.getSexo().equalsIgnoreCase("O"));
        System.out.print("Ingrese la estatura: ");
        per.setAltura(sc.nextDouble());
        System.out.print("Ingrese el peso: ");
        per.setPeso(sc.nextInt());
    }
    
    public int calcularIMC(){
        exp = Math.pow(per.getAltura(),2);
        if(per.getPeso()/exp < 20) {
            res = -1;
        }else if(per.getPeso()/exp >= 20 && per.getPeso()/exp <= 25){
            res = 0;
        }else{
            res = 1;
        }
        return res;
    }
    
    public boolean esMayorDeEdad(){
        if (per.getEdad() >= 18) {
            flag = true;
        }
        return flag;
    }
    
}
