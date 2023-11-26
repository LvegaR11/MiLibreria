/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class LinkedHashMap_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedHashMap<String, String> tareas = new LinkedHashMap<>();

        // Agregar tareas y sus fechas de vencimiento a la lista
        tareas.put("tarea1", "2023-12-01");
        tareas.put("tarea2", "2023-12-15");
        tareas.put("tarea3", "2023-11-30");

        // Mostrar la lista de tareas
        System.out.println("Lista de tareas:");
        for (Map.Entry<String, String> t : tareas.entrySet()) {
            System.out.println(t.getKey() + ": Vence el " + t.getValue());
        }

        System.out.println("\nFecha de vencimiento de tarea2: " + tareas.get("tarea2"));

        // Verificar si una tarea está en la lista
        System.out.println("\nLa lista contiene tarea3? " + tareas.containsKey("tarea3"));

    }

}
