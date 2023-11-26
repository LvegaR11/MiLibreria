/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Enumeration_ {

    public static void main(String[] args) {
        //Ya que la clase enumeration no tinene como agregar elementos, utilisaremos el aneterior ejemplo de vector 
        Vector<Integer> numeroPar = new Vector<>();

        numeroPar.addElement(2);
        numeroPar.addElement(4);
        numeroPar.addElement(6);
        numeroPar.addElement(8);
        numeroPar.addElement(10);

        //Usamos la clase Enumeration para mostrar los elementos del vector
        Enumeration<Integer> numeros = numeroPar.elements();

        System.out.println("Numeros pares del 1 al 10:");
        while (numeros.hasMoreElements()) {
            int i = numeros.nextElement();
            System.out.println(i);

        }
    }

}
