/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiLibreria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @Luis Fernando Vega Rodriguez
 */
public class Libreria {

    List<Libros> listaLibros = new ArrayList<>();

    //Creo dos filas una de mis libros de filosofi y la otra a los que no pertenecen a este genero
    Queue<Libros> filosofia = new LinkedList<>();
    Queue<Libros> otrosgeneros = new LinkedList<>();

    public Libreria() {

    }

    //ordenamos los libro con SelectionSort
    public void ordenar() {

        for (int i = 0; i < listaLibros.size() - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < listaLibros.size(); j++) {
                if (listaLibros.get(j).titulo.compareTo(listaLibros.get(indiceMenor).titulo) < 0) {
                    indiceMenor = j;
                }
            }
            if(i != indiceMenor){
            Libros temporal = listaLibros.get(indiceMenor);
            listaLibros.set(indiceMenor, listaLibros.get(i));
            listaLibros.set(i, temporal);
            }
        }

    }

    public void Imprimir() {
        System.out.println("Mis libros en el stan:");
        for (Libros libro : listaLibros) {
            System.out.println(libro.titulo + ", " + libro.autor
                    + ", " + libro.año + ", " + libro.genero);
        }
        System.out.println("\nMis libros de filosofia en el stan:");
        for (Libros libro : filosofia) {
            System.out.println(libro.titulo + ", " + libro.autor
                    + ", " + libro.año + ", " + libro.genero);
        }

        System.out.println("\nLibros de otros generos en el stan:");
        for (Libros libro : otrosgeneros) {
            System.out.println(libro.titulo + ", " + libro.autor
                    + ", " + libro.año + ", " + libro.genero);

        }
    }
}
