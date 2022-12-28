package ejercicio_8;

import java.util.Scanner;
import ejercicio_8.Services.Service;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Service frase1 = new Service();
        int op;
        String letra,frase;
        boolean flag;
        do {
            System.out.println("--------------");
            System.out.println(""
                    + "1.Crear una frase\n"
                    + "2.Mostrar Vocales\n"
                    + "3.Invertir Frase\n"
                    + "4.Veces Repetido\n"
                    + "5.Comparar longitud\n"
                    + "6.Unir frases\n"
                    + "7.Reemplazar Caracter\n"
                    + "8.Revisar un caracter\n"
                    + "9.Salir");
            System.out.print("Ingresa una opcion: ");
            op = sc.nextInt();
            System.out.println("--------------");
            switch (op) {
                case 1:
                    frase1.crearFrase();
                    break;
                case 2:
                    frase1.mostrarVocales();
                    break;
                case 3:
                    frase1.invertirFrase();
                    break;
                case 4:
                    System.out.println("Ingresa una letra para buscar");
                    letra = sc.next();
                    frase1.vecesRepetido(letra);
                    break;
                case 5:
                    System.out.println("Ingresa la una frase para cambiar longitud");
                    frase = sc.next();
                    frase1.compararLongitud(frase);
                    break;
                case 6:
                    System.out.println("Ingresa la frase nueva para unirla");
                    frase = sc.next();
                    frase1.unirFrases(frase);
                    break;
                case 7:
                    System.out.println("Ingresa el caracter que quieres reemplazar");
                    letra = sc.next();
                    frase1.reemplazar(letra);
                    break;
                case 8:
                    System.out.println("Ingresa el caracter a revisar");
                    letra = sc.next();
                    flag = frase1.contiene(letra);
                    if (flag == true) {
                        System.out.println("Tu caracter si se encuentra en la frase");
                    }else{
                        System.out.println("Tu caracter no se encuentra en la frase");
                    }
                    break;
                case 9:
                    System.out.println("---Saliendo---");
                    break;
                default:
                    System.out.println("Numero ingresado no valido");
            }
        } while (op != 9);

    }

}
