/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Usuario
 */
public class Properties_ {

    public static void main(String[] args) throws FileNotFoundException {

        Properties libro = new Properties();

        libro.setProperty("nombre", "la peste");
        libro.setProperty("autor", "albert camus");
        libro.setProperty("editorial", "planeta");
        libro.setProperty("ano", "1947");

        //devolvemos las claves como una cadena de texto
        System.out.println("PROPIEDADES: " + libro.stringPropertyNames());

        //Dedido imprimimos los valores asociado a las claves
        System.out.println("Valor asociado a nombre: " + libro.getProperty("nombre"));
        System.out.println("Valor asociado a autor: " + libro.getProperty("autor"));
        System.out.println("Valor asociado a editorial: " + libro.getProperty("editorial"));
        System.out.println("Valor acociado a an'o: " + libro.getProperty("ano"));
        try {
            FileOutputStream salida = new FileOutputStream("config.properties");
            libro.store(salida, "Libros");
            salida.close();
            System.out.println("Exito al guardar");
        } catch (IOException e) {
            System.out.println("Error al guardar" + e.getMessage());

        }
    }

}
