/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class HashMap_ {

    public static void main(String[] args) {
        Map<String, Double> ropa = new HashMap<>();

        ropa.put("chaqueta", 129.99);
        ropa.put("jeans", 89.99);
        ropa.put("sueter", 29.99);
        ropa.put("zapato", 200.0);

        System.out.println("Prendas de vestir:");
        for (Map.Entry<String, Double> e : ropa.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());

        }
        System.out.println("El conjuto esta vacio? " + ropa.isEmpty());

        System.out.println("Tamano del conjunto: " + ropa.size());

        ropa.remove("zapato");

        System.out.println("Prendas de vestir luego de eliminar un elemento:");
        for (Map.Entry<String, Double> e : ropa.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());

        }
        System.out.println("Nuevo tamano del conjunto: " + ropa.size());
    }

}
