/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class LinkedList_ {

    public static void main(String[] args) {
        LinkedList<String> meses = new LinkedList<>();

        meses.addFirst("enero");
        meses.add("febrero");
        meses.add("marzo");
        meses.add("abril");
        meses.add("mayo");
        meses.addLast("junio");

        System.out.println("Primer sementre del ano:");
        for (String m : meses) {
            System.out.println(m);
        }

        System.out.println("El primer mes es: " + meses.getFirst());

        System.out.println("El ultimo mes del primer sementre es: " + meses.getLast());

        //Eliminamso el primer y el ultimo elemnto de la lista
        meses.removeFirst();
        meses.removeLast();

        System.out.println("\nPrimer sementre del ano, luego de eliminar el primero y el ultimo:");
        for (String m : meses) {
            System.out.println(m);
        }

    }

}
