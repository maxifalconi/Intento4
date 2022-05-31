/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionApp.entidades;

import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class Operacion {
    
    Scanner leer = new Scanner (System.in);
    private int numero1;
    private int numero2;
    
    //a) Método constructor con todos los atributos pasados por parámetro.
    //b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion(){
        
    }
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //c) Métodos get y set.
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
    public int getNumero1(){
        return numero1;
    }
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    public int getNumero2(){
        return numero2;
    }
    
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public void crearOperacion(){
        System.out.println("Ingresar numero 1: ");
        numero1 = leer.nextInt();
        System.out.println("Ingresar numero 2: ");
        numero2 = leer.nextInt();
    }
    
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar(){
        int sumar = numero1 + numero2;
        return sumar;
    }
    
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public int restar(){
        int restar = numero1 - numero2;
        return restar;
    }
    
    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar 
    //por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y 
    //se devuelve el resultado al main
    public int multiplicar(){
        int multiplicar = numero1 * numero2;
        if (numero1 == 0 || numero2 == 0){
            System.out.println("**");
            System.out.println("ERROR: Si uno o ambos numeros ingresados es cero, el resultado será cero.");
            return multiplicar;
        }else {
            return multiplicar;
        }
    }
    
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división 
    //por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se 
    //hace la división y se devuelve el resultado al main.
    public double dividir(){
        int dividir = numero1 / numero2;
        if (numero1 == 0 || numero2 == 0){
            System.out.println("**");
            System.out.println("ERROR: Si uno o ambos numeros ingresados es cero, el resultado será cero.");
            return dividir;
        }else {
            return dividir;
        }
    }
}
