/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArraysList {

    public static void main(String[] args) {

        ArrayList<String> animales = new ArrayList<>();

        animales.add("gato");
        animales.add("puma");
        animales.add("leopardo");
        animales.add("tigre");
        animales.add("perro");

        System.out.println("Lista de felinos:");
        for (String a : animales) {
            System.out.println(a);
        }

        System.out.println("\nEste animal no es un felino: " + animales.get(4));
        animales.remove("perro");

        System.out.println("Lista de solo felinos:");
        for (String a : animales) {
            System.out.println(a);
        }

    }

}
