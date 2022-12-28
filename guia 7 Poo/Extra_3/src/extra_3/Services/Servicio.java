package extra_3.Services;

import java.util.*;
import extra_3.Entidad.Raices;

public class Servicio {
    Scanner sc = new Scanner(System.in);
    Raices op = new Raices();
    double x1, x2,xA;

    public void crearObj(){
        System.out.println("Ingrese A:");
        op.setA(sc.nextInt());
        System.out.println("Ingrese B:");
        op.setB(sc.nextInt());
        System.out.println("Ingrese C:");
        op.setC(sc.nextInt());
    }
    
    public double getDiscriminante() {
        return Math.pow(op.getB(), 2) - 4 * op.getA() * op.getC();
    }

    public boolean tieneRaices() {
        return Math.pow(op.getB(), 2) - 4 * op.getA() * op.getC() >= 0;
    }

    public boolean tieneRaiz() {
        return Math.pow(op.getB(), 2) - 4 * op.getA() * op.getC() == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            x1 = (op.getB() - Math.sqrt(Math.pow(op.getB(),2)-4*op.getA()*op.getC()));//(2*op.getA())));
            x2 = (op.getB() + Math.sqrt(Math.pow(op.getB(),2)-4*op.getA()*op.getC()));//(2*op.getA())));
            System.out.println("Solucion 1 = " + x1 + " Solucion 2 = " + x2);
        } else {
            System.out.println("No es posible");
        }

    }
    
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            x1 = op.getB()/(2*op.getA());
        }else{
            System.out.println("No es posible");
        }
    }
    
    public void calcular(){
        if (tieneRaices()) {
            x1 = (op.getB() - Math.sqrt(Math.pow(op.getB(),2)-4*op.getA()*op.getC()));//(2*op.getA())));
            x2 = (op.getB() + Math.sqrt(Math.pow(op.getB(),2)-4*op.getA()*op.getC()));//(2*op.getA())));
            System.out.println("Solucion 1 = " + x1 + " Solucion 2 = " + x2);
        }else if(tieneRaiz()){
            xA = op.getB()/(2*op.getA());
        }else {
            System.out.println("No es posible");
        }
    }
    
}
