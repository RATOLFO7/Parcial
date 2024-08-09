/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yursd
 */



public class Catedratico {
    // Este atributo es como un contador que nos sirve para asignar un código único a cada catedrático.
    // Comienza en 1 y se incrementa cada vez que creamos un nuevo catedrático.
    private static int contadorCatedratico = 1;

    // Estos atributos almacenan la información de cada catedrático.
    private int codigoCatedratico; // El código de identificación del catedrático
    private String nombre; // El nombre completo del catedrático
    private String direccion; // La dirección donde vive el catedrático
    private String telefono; // El número de teléfono del catedrático
    private String profesion; // La profesión del catedrático

    // Este es el constructor de la clase.
    // Cuando creamos un nuevo catedrático, le pasamos su nombre, dirección, teléfono y profesión.
    // El código de catedrático se asigna automáticamente usando el contador.
    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = contadorCatedratico++; // Asignamos el siguiente código y lo aumentamos en 1
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    // Este método nos permite imprimir toda la información de un catedrático en la consola.
    public void imprimirDatos() {
        System.out.println("Código de catedrático: " + codigoCatedratico);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Profesión: " + profesion);
    }
}
