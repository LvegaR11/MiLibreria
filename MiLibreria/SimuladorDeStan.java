/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MiLibreria;

/**
 *
 * @author Usuario
 */
public class SimuladorDeStan {

    public static void main(String[] args) {
        Libreria misLibros = new Libreria();

        misLibros.listaLibros.add(new Libros("la peste", "albert camus", 1947, "filosofia"));
        misLibros.listaLibros.add(new Libros("Asi hablo zaratrusta", "friedrich nietzsche", 1878, "filosofia"));
        misLibros.listaLibros.add(new Libros("pedro paramo", "juan rulfo", 1955, "otrosgeneros"));
        misLibros.listaLibros.add(new Libros("el discurso del metodo", "rene descarte", 1637, "filosofia"));
        misLibros.listaLibros.add(new Libros("en esta noche, en este mundo", "alejandra pizarnik", 1972, "otrosgeneros"));
        misLibros.listaLibros.add(new Libros("el extrangero", "albert camus", 1942, "filosofia"));
        misLibros.listaLibros.add(new Libros("el resplandor", "stephen king", 1977, "otrosgeneros"));
        
        
        misLibros.ordenar();
        
        for(Libros libro : misLibros.listaLibros){
            if("filosofia".equals(libro.genero)){
                misLibros.filosofia.offer(libro);
            
            }else if ("otrosgeneros".equals(libro.genero)){
                misLibros.otrosgeneros.offer(libro);
            
            }
         misLibros.ordenar();
        }
        misLibros.Imprimir();
    }
}
