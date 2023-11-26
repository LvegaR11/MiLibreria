package API_de_colecciones_java_EJEMPLOS;

import java.util.Hashtable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class HashTable_ {

    public static void main(String[] args) {
        /*Creamos una instancia de la clase HashTable
        llamada usuarios la cual recibira la clave y numero asignado al usiario*/
        Hashtable<String, Integer> claveValor = new Hashtable<>();

        //Agrgamos los usuarios 
        claveValor.put("uno", 1);
        claveValor.put("dos", 2);
        claveValor.put("tres", 3);

        //Mostramos las claves
        System.out.println("Claves y valores contedidos en Hashtable:" + claveValor);

        //verificamos si existe una clave asociada
        System.out.println("la clave uno existe? " + claveValor.containsKey("uno"));

        //removemos una clave
        claveValor.remove("uno");
        //mostramos las claves 
        System.out.println("HashTablo despues de eliminar una clave - valor:" + claveValor);
        
        //Verificamos si esta vacia
        System.out.println("HashTable esta vacia? :" + claveValor.isEmpty());
    }

}
