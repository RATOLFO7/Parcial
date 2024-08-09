/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yursd
 */

public class Main {

    public static void main(String[] args) {
        // Creamos varios objetos de tipo Catedrático, Curso y Alumno
        Catedratico catedratico1 = new Catedratico("Rodolfo Rmírez", "4 calle", "78569825", "ingeniero en sistemas");
        Catedratico catedratico2 = new Catedratico("Alejandro Marroquin", "7 calle ", "6785282", "Programador");
        Catedratico catedratico3 = new Catedratico("Juan Carlos", "20 calle ", "748562", "Base de datos");

        
        Curso curso1 = new Curso(30, "Base de Datos");
        Curso curso2 = new Curso(5, "Calculo II");
        Curso curso3 = new Curso(5, "Inteligencia Artificial");

        
        Alumno alumno1 = new Alumno("Nico", "4av ", "7845123");
        Alumno alumno2 = new Alumno("Benjamin ", "9 calle", "452122");
        Alumno alumno3 = new Alumno("Mbappe", "6 calle", "781264");

        
        Asignacion asignacion1 = new Asignacion(alumno1, 3);
        asignacion1.addCurso(curso1)
                ;
        asignacion1.addCurso(curso2);
        asignacion1.addCurso(curso3);

        Asignacion asignacion2 = new Asignacion(alumno2, 3);
        asignacion2.addCurso(curso2);
        asignacion2.addCurso(curso3);

        Asignacion asignacion3 = new Asignacion(alumno3, 3);
        asignacion3.addCurso(curso1);
        asignacion3.addCurso(curso2);

        
        System.out.println("Informacion de los catedraticos:");
        catedratico1.imprimirDatos();
        catedratico2.imprimirDatos();
        catedratico3.imprimirDatos();

        System.out.println("\nInformacion de los cursos:");
        System.out.println("Curso 1: " + curso1.getNombre());
        System.out.println("Curso 2: " + curso2.getNombre());
        System.out.println("Curso 3: " + curso3.getNombre());

        System.out.println("\nInformacion de los alumnos:");
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();
// Imprimimos las asignaciones de cada alumno
        System.out.println("\nAsignaciones de cursos:");
        System.out.println("Asignacion 1:");
        imprimirAsignacion(asignacion1);
        System.out.println("Asignacion 2:");
        imprimirAsignacion(asignacion2);
        System.out.println("Asignacion 3:");
        imprimirAsignacion(asignacion3);
    }

    public static void imprimirAsignacion(Asignacion asignacion) {
        Alumno alumno = asignacion.getAlumno();
        System.out.println("Alumno: " + alumno.getNombre());
        Curso[] cursos = asignacion.getCursos();
        System.out.println("Cursos asignados:");
        for (Curso curso : cursos) {
            if (curso != null) {
                System.out.println("- " + curso.getNombre());
            }
        }
    }
}