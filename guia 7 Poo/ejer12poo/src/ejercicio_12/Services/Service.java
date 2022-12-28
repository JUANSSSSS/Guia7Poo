package ejercicio_12.Services;

import java.util.*;
import ejercicio_12.Entidad.Persona;

public class Service {
    Persona per1 = new Persona();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    int año,mes,dia,anios;
    Date fechaActual = new Date();
    
    public void crearPersona(){
        System.out.print("Ingresa el nombre de la persona: ");
        per1.setNombre(sc.next());
        System.out.println("Ingresa la fecha (Año)(Mes)(Dia) de nacimiento de la persona: ");
        año = sc.nextInt();
        mes = sc.nextInt();
        dia = sc.nextInt();
        Date fecha = new Date(año-1900,mes-1,dia);
        per1.setFecha(fecha);
    }
    
    public void calcularEdad(){
        anios = fechaActual.getYear() - per1.getFecha().getYear();
        mes = fechaActual.getMonth() - per1.getFecha().getMonth();   
        dia = fechaActual.getDay() - per1.getFecha().getDay();
        if (mes < 0 || dia < fechaActual.getDay()) {
            anios--;
        }
        System.out.println("La edad de la persona es: " + anios + " Años " + mes + " Meses " + dia +" Dias");
    }
    
    public boolean menorQue(int edad){
        return edad <= anios;
    }
    
    public void mostrarPersona(){
        System.out.println("El nombre de la persona: " + per1.getNombre());
        System.out.println("La fecha de nacimiento de la persona: " + per1.getFecha());
    }
    
}
