package ejercicio_5.Services;

import ejercicio_5.Entidades.Cuenta;
import java.util.Scanner;

public class Services {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cuenta c = new Cuenta();
    double ingreso,retiro,n20;
    String op;
    public void crearCuenta(){
        System.out.println("Ingresa el numero de cuenta a crear");
        c.setNumeroC(sc.nextInt());
        System.out.println("Ingresa tu DNI");
        c.setDNI(sc.nextLong());
        System.out.println("Ingrese su saldo actual");
        c.setSaldo(sc.nextInt());
    }
    
    public void ingresar(){
        System.out.println("Ingrese el saldo");
        ingreso = sc.nextDouble();
        c.setSaldo(c.getSaldo()+(int)ingreso);
    }
    
    public void retirar(){
        System.out.println("Ingrese la cantidad a retirar");
        retiro = sc.nextDouble();
        if (retiro > c.getSaldo()) {
            System.out.println("retiraste: " + c.getSaldo() + " y tu saldo queda en 0");
            c.setSaldo(0);
        }else{
            System.out.println("retiraste: " + retiro);
            c.setSaldo(c.getSaldo()-(int)retiro);
        }
        
    }
    
    public void extraccionRapida(){
        n20 = c.getSaldo()*0.20;
        System.out.println("El 20% de tu saldo es: " + n20);
        System.out.println("Desea sacarlo? S/N");
        op = sc.next();
        op = op.toUpperCase();
        if (op.equals("S")) {
            System.out.println("Retirando el 20% = " + n20);
            c.setSaldo(c.getSaldo() - (int) n20);
        }else{
            System.out.println("---Saliendo---");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Tu saldo actual es: " + c.getSaldo());
    }
    public void consultarDatos(){
        System.out.println("Tu numero de cuenta es: " + c.getNumeroC());
        System.out.println("Tu DNI es: " + c.getDNI());
    }
    
}
