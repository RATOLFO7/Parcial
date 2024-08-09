/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yursd
 */
import java.util.List;

public class Curso {
    // Este atributo representa el nombre del curso.
    private String nombre;

    // Este atributo indica el número máximo de alumnos que pueden inscribirse en el curso.
    private int espacioMaximo;

    // Este atributo cuenta cuántos alumnos ya están inscritos en el curso.
    private int alumnosInscritos;

    // Este es el constructor de la clase. 
    // Cuando creamos un nuevo curso, le pasamos su nombre y el número máximo de estudiantes.
    public Curso(int espacioMaximo, String nombre) {
        this.nombre = nombre;
        this.espacioMaximo = espacioMaximo;
        // Inicializamos el contador de alumnos inscritos a 0, ya que al principio no hay nadie inscrito.
        this.alumnosInscritos = 0;
    }

    // Estos métodos nos permiten obtener y modificar el nombre del curso.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Estos métodos nos permiten obtener y modificar el espacio máximo del curso.
    public int getEspacioMaximo() {
        return espacioMaximo;
    }

    public void setEspacioMaximo(int espacioMaximo) {
        this.espacioMaximo = espacioMaximo;
    }

    // Este método verifica si hay espacio disponible para inscribir a un nuevo alumno.
    public boolean verificaEspacio() {
        // Si el número de alumnos inscritos es menor al espacio máximo, entonces hay espacio disponible.
        return alumnosInscritos < espacioMaximo;
    }
}
