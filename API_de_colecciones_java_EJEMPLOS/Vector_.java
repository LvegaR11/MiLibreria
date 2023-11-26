/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Vector_ {

    public static void main(String[] args) {
        Vector<Integer> numeroPar = new Vector<>();

        numeroPar.addElement(2);
        numeroPar.addElement(4);
        numeroPar.addElement(6);
        numeroPar.addElement(8);
        numeroPar.addElement(10);

        System.out.println("Vector de numeros pares del 1 al 10: " + numeroPar);

        System.out.println("Primer elemento del vector: " + numeroPar.elementAt(0));

        System.out.println("Tamaño del vector es: " + numeroPar.size());

        numeroPar.clear();
        System.out.println("Vector luego de eliminar los elementos: " + numeroPar);

    }

}
