/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_de_colecciones_java_EJEMPLOS;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class TreeMap_ {

    public static void main(String[] args) {
        TreeMap<String, Long> contactos = new TreeMap<>();

        contactos.put("luis", 3007056108L);
        contactos.put("Brigith", 3006487343L);
        contactos.put("damian", 3123476599L);
        contactos.put("estefan", 3238999876L);

        System.out.println("Contactos telefonicos");
        for (Map.Entry<String, Long> c : contactos.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }

        System.out.println("Verificamos si el contacto " + contactos.get("damian")
                + "  existe? " + contactos.containsKey("damian"));
    }

}
