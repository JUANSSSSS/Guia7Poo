
package ejer3poo;

//Crear una clase llamada Operacion que tenga como atributos privados numero1 y

import ejer3poo.entidades.entidades;
import ejer3poo.servicio.servicio;

//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main

public class Ejer3poo {

    
    public static void main(String[] args) {
        servicio g1 = new servicio ();
        entidades e1 = g1.crearentidades();
        g1.suma(e1);
        g1.resta(e1);
        g1.multi(e1);
        g1.divi(e1);
    }
    }
    

