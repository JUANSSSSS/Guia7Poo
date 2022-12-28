package ejercicio_9.Services;

public class Servicio {
    double R,num1,num2;
    public double devolverMayor(double n1,double n2){
        R = Math.max(n1,n2);
        return R;
    }
    
    public double calcularPotencia(double n1,double n2){
        num1 = Math.floor(n1);
        num2 = Math.floor(n2);
        num1 = Math.max(num1, num2);
        num2 = Math.min(num1, num2);
        R = Math.pow(num1, num2);
        return R;
    }
    
    public double raizCuadrada(double n1,double n2){
        R = Math.min(n1, n2);
        R = Math.sqrt(R);
        return R;
    }
    
}
