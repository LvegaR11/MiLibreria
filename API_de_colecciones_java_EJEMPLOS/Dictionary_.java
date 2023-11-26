/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Usuario
 */
public class Dictionary_ {

    public static void main(String[] args) {

        Dictionary<String, Integer> diccionario = new Hashtable<>();

        diccionario.put("uno", 1);
        diccionario.put("dos", 2);
        diccionario.put("tres", 3);

        //mostar elementos
        System.out.println("Diccionario:");
        Enumeration<String> claves = diccionario.keys();
        while (claves.hasMoreElements()) {
            String clave = claves.nextElement();
            System.out.println("clave: " + clave + " valor: " + diccionario.get(clave));
        }
        //extraemos el valor de una clave  en el diccionario

        System.out.println("El valor de la clave dos es = " + diccionario.get("dos"));

        diccionario.remove("dos");

        claves = diccionario.keys();
        System.out.println("Diccionario despues de remove una clave:");

        while (claves.hasMoreElements()) {
            String clave = claves.nextElement();
            System.out.println("clave: " + clave + " valor: " + diccionario.get(clave));
        }
    }
}
