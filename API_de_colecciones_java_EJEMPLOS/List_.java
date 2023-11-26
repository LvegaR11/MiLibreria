/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class List_ {

    public static void main(String[] args) {
        List<String> colores = new ArrayList<>();

        colores.add("amarillo");
        colores.add("rojo");
        colores.add("azul");

        //mostramos los elemntos de la interfaz List usando un ciclo for 
        System.out.println("Colores Primarios:");
        for (String c : colores) {
            System.out.println(c);
        }

        System.out.println("Elemnentos en la lista: " + colores.size());

        colores.remove("rojo");

        System.out.println("Colores Primarios despues de eliminar un elemento:");
        for (String c : colores) {
            System.out.println(c);
        }

    }

}
