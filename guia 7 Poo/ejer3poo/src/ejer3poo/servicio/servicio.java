
package ejer3poo.servicio;

import ejer3poo.entidades.entidades;
import java.util.Scanner;


public class servicio {
    Scanner leer = new Scanner (System.in);
    public entidades crearentidades (){
    entidades suma = new entidades();
        System.out.println("ingrese el primer numero ");
        suma.setN1(leer.nextInt());
        System.out.println("ingrese el segundo numero ");
        suma.setN2(leer.nextInt());
        return suma;
        }
    public void suma(entidades suma) {
        System.out.println("la suma es = "+ (suma.getN1()+(suma.getN2())));
    }
    public void resta (entidades suma){
    System.out.println("su resta es " + (suma.getN1( )- suma.getN2()));
    }
   public void multi (entidades suma){
       if ((suma.getN1()== 0)|| (suma.getN2()== 0)){
           System.out.println("error uno de los num es cero no se puede multiplicar");
       }else { 
           System.out.println("su multiplicacion es " + (suma.getN1()*(suma.getN2())));
       }
   }
   public void divi (entidades suma) {
       if ((suma.getN1()== 0)||(suma.getN2()== 0)) {
       System.out.println("error uno de los numeros es cero");   
       }else {
         System.out.println("su division es " + (suma.getN1()/suma.getN2()));
   }
                
   } 
}
