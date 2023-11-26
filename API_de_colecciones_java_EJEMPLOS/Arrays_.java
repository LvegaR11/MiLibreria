/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Arrays_ {

    public static void main(String[] args) {
        //Creamos la matriz con valores por defectos
        int[] numImpar = {9, 5, 7, 3, 1};

        System.out.println("Matriz de mumeros impares del 1 al 10:\n" + Arrays.toString(numImpar));

        //Ordenamos usando la calse Arrays
        Arrays.sort(numImpar);

        System.out.println("Matriz de numeros impares del 1 al 10 ordenada:\n" + Arrays.toString(numImpar));
    }

}
