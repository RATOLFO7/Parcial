/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yursd
 */

public class Asignacion {
    // Este es como un registro de la asignatura de un alumno.
    // Cada asignación tiene un alumno y una lista de cursos.

    // El alumno que está inscrito en esta asignación.
    private final Alumno alumno;

    // Un arreglo para almacenar los cursos que el alumno tiene asignados.
    private Curso[] cursos;

    // Un contador para llevar la cuenta de cuántos cursos se han agregado.
    private int contadorCursos;

    // Este es el constructor de la clase Asignación.
    // Cuando creamos una nueva asignación, le damos el alumno y el número máximo de cursos.
    public Asignacion(Alumno alumno, int cantidadMaximaCursos) {
        // Guardamos el alumno que nos pasaron.
        this.alumno = alumno;
        // Creamos un arreglo de cursos con el tamaño máximo que nos dieron.
        this.cursos = new Curso[cantidadMaximaCursos];
        // Inicializamos el contador de cursos en 0, porque al principio no hay ningún curso agregado.
        this.contadorCursos = 0;
    }

    // Este método sirve para agregar un curso a la asignación.
    public void addCurso(Curso curso) {
        // Si todavía hay espacio en el arreglo de cursos...
        if (contadorCursos < cursos.length) {
            // Agregamos el curso al siguiente espacio disponible en el arreglo.
            cursos[contadorCursos] = curso;
            // Aumentamos el contador de cursos en 1, para indicar que hemos agregado un nuevo curso.
            contadorCursos++;
        } else {
            // Si no hay espacio, simplemente imprimimos un punto por ahora (puedes cambiar esto por un mensaje más claro).
            System.out.println(".");
        }
    }

    // Estos métodos nos permiten obtener información sobre la asignación.
    // Por ejemplo, podemos usar getAlumno() para obtener el alumno de la asignación
    // y getCursos() para obtener todos los cursos asignados.

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso[] getCursos() {
        return cursos;
    }
}
