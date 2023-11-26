/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class HashSet_ {

    public static void main(String[] args) {
        Set<String> apellidos = new HashSet<>();

        apellidos.add("vega");
        apellidos.add("Rodriguez");
        apellidos.add("Arrieta");

        System.out.println("Conjunto de apellidos");
        for (String a : apellidos) {
            System.out.println(a);

        }

        System.out.println("El apellido vega esta en el conjunto? " + apellidos.contains("vega"));

        //Eliminamos los elementos del conjunto
        apellidos.clear();

        //Verificamos si el conjunto esta vacio
        System.out.println("El conjunto esta vacio? " + apellidos.isEmpty());

    }

}
