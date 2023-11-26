/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class TreeSet_ {

    public static void main(String[] args) {

        Set<Double> valor = new TreeSet<>();

        valor.add(10.0);
        valor.add(98.0);
        valor.add(8.0);
        valor.add(34.0);
        valor.add(22.0);

        System.out.println("Valor en dolares");
        for (double v : valor) {
            System.out.println(v);

        }

        //Obtenemos el subConjundo de valores mayores de 30
        Set<Double> mayorQue = ((TreeSet<Double>) valor).tailSet(30.0);
        System.out.println("valores superiores a 30.0");
        for (double v : mayorQue) {
            System.out.println(v);

        }

    }

}
