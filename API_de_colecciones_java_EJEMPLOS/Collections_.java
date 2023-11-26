/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Collections_ {

    public static void main(String[] args) {
        //Cramos una lista en la que implementara la intercas collection para organizarla
        List<Integer> numeros = new ArrayList<>();
        numeros.add(82);
        numeros.add(12);
        numeros.add(21);
        numeros.add(79);
        numeros.add(56);
        numeros.add(34);

        System.out.println("Lista sin ordenar:\n" + numeros);

        //ordenamos en orden acendente usando la interfaz de collections
        Collections.sort(numeros);

        System.out.println("Lista ordenada por Collections:\n" + numeros);
    }

}
