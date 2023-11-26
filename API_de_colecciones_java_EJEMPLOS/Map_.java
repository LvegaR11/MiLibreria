/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Map_ {

    public static void main(String[] args) {
        Map<String, String> principios = new HashMap<>();

        principios.put("FIFO", "primero en entrar, primero en salir");
        principios.put("LIFO", "primero en entrar, ultimo en salir");

        System.out.println("Principios de ordemaniento");
        for (Map.Entry<String, String> e : principios.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());

        }
        System.out.println("El conjuto esta vacio? " + principios.isEmpty());

        System.out.println("Tamano del conjunto: " + principios.size());

    }

}
