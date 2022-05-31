/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package OperacionApp;

import OperacionApp.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1, numero2;
        Scanner leer1 = new Scanner (System.in);
        
        Operacion O1 = new Operacion();
        
        O1.crearOperacion();
        O1.sumar();
        O1.restar();
        O1.multiplicar();
        O1.dividir();
        System.out.println("------------------------------------------");
        System.out.println("La suma del numero 1 y el numero 2 es: " + O1.sumar());
        System.out.println("La resta del numero 1 y el numero 2 es: " + O1.restar());
        System.out.println("La multiplicacion del numero 1 y el numero 2 es: " + O1.multiplicar());
        System.out.println("La division del numero 1 y el numero 2 es: " + O1.dividir());
    }
    
}
