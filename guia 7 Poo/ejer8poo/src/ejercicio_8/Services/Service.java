package ejercicio_8.Services;

import java.util.Scanner;
import ejercicio_8.Entidad.Cadena;

public class Service {

    Cadena frase = new Cadena();
    Scanner sc = new Scanner(System.in);
    String letra;
    int cont = 0, cont1 = 0, len;

    public void crearFrase() {
        System.out.println("Ingrese una o varias palabras separadas por un espacio");
        frase.setFrase(sc.nextLine());
        frase.setLen(frase.getFrase().length());
    }

    public void mostrarVocales() {
        for (int i = 0; i < frase.getLen(); i++) {
            letra = frase.getFrase().substring(i,i+1);
            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
                cont++;
            }
        }
        System.out.println("Esta frase tiene: " + cont + " vocales");
    }

    public void invertirFrase() {
        for (int i = frase.getLen(); i > 0; i--) {
            letra = frase.getFrase().substring(i-1,i);
            System.out.print(letra);
        }
        System.out.println("");
    }

    public void vecesRepetido(String letr) {
        for (int i = 0; i < frase.getLen(); i++) {
            letra = frase.getFrase().substring(i,i+1);
            if (letra.equals(letr)) {
                cont1++;
            }
        }
        System.out.println("Se encontro el caracter '" + letr + "' " + cont1 + " veces");
    }

    public void compararLongitud(String fra) {
        len = fra.length();
        if (len == frase.getLen()) {
            System.out.println("Las frases tiene la misma longitud");
        }else if(len > frase.getLen()){
            System.out.println("La frase nueva tiene un amayor longitud");
        }else{
            System.out.println("La frase nueva tiene menor longitud");
        }
    }

    public void unirFrases(String fra){
        frase.setFrase(frase.getFrase().concat(fra));
        System.out.println("La frase unida es: " + frase.getFrase());
    }
    
    public void reemplazar(String letr){
        System.out.print("La frase cambiada es: ");
        for (int i = 0; i < frase.getLen(); i++) {
            letra = frase.getFrase().substring(i,i+1);
            if (letra.equals("a")) {
                System.out.print(letr);
            }else{
                System.out.print(letra);
            }
        }
        System.out.println("");
    }
    
    public boolean contiene(String letr){
        boolean flag = false;
        if (frase.getFrase().contains(letr)) {
            flag = true;
        }
        return flag;
    }
    
}
