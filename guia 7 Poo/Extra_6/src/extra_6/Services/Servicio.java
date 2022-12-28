package extra_6.Services;

import java.util.*;
import extra_6.Entidad.Ahorcado;

public class Servicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Ahorcado colgao = new Ahorcado();
    String palabra, letr;
    String[] letras;
    boolean flag = false;
    
    public void crearJuego() {
        System.out.println("Ingresa la palabra");
        palabra = sc.next();
        letras = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.substring(i,i+1);
        }
        colgao.setPalabraABuscar(letras);
        System.out.println("Ingresa los intentos para ver la palabra");
        colgao.setJugadas(sc.nextInt());
        colgao.setLetras(0);
    }

    public void longitud() {
        System.out.println("La longitud de la palabra es: " + palabra.length());
    }

    public boolean buscar(String letra) {
        flag = false;
        letras = colgao.getPalabraABuscar();
        for (int i = 0; i < colgao.getPalabraABuscar().length; i++) {
            if (letras[i].equalsIgnoreCase(letra)) {
                colgao.setLetras(colgao.getLetras() + 1);
                flag = true;
            }
        }
        return flag;
    }

    public void encontradas() {
        System.out.println("Letras encontradas: " + colgao.getLetras() + "/" + colgao.getPalabraABuscar().length);
    }

    public void intentos() {
        System.out.println("Te quedan " + colgao.getJugadas() + " intentos");
    }

    public void juego() {
        crearJuego();
        do {
            longitud();
            System.out.println("------------------");
            System.out.println("Ingresa una Letra:");
            letr = sc.next();
            if (buscar(letr)) {
                System.out.println("Se encontro la letra");
            }else{
                System.out.println("No se encontro la letra");
                colgao.setJugadas(colgao.getJugadas()-1);
            }
            encontradas();
            intentos();
            System.out.println("------------------");
            if (colgao.getLetras() == colgao.getPalabraABuscar().length) {
                System.out.println("Encontraste la palabra: " + Arrays.toString(colgao.getPalabraABuscar()));
                colgao.setJugadas(0);
            }else if(colgao.getJugadas() == 0){
                System.out.println("---Ahorcado---");
            } else {
                System.out.println("Sigue intentando");
            }
        } while (colgao.getJugadas() != 0);
    }

}
