/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class SortedSet_ {

    public static void main(String[] args) {
        //Usamos la instancia treeSet para almacenar elemntos
        SortedSet<Double> valor = new TreeSet<>();

        valor.add(10.0);
        valor.add(98.0);
        valor.add(8.0);
        valor.add(34.0);
        valor.add(22.0);

        System.out.println("Valor en dolares");
        for (double v : valor) {
            System.out.println(v);

        }

        //Obtenemos el subConjundo de valores mayores de 20
        System.out.println("valores superiores a 20");
        for (double v : valor.tailSet(20.0)) {
            System.out.println(v);

        }

    }

}
