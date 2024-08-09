/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yursd
 */

public class Alumno {
    // Este atributo es como un contador que nos sirve para asignar un número único a cada alumno.
    // Comienza en 1 y se incrementa cada vez que creamos un nuevo alumno.
    private static int contadorCarnet = 1;
    // Estos atributos almacenan la información de cada alumno.
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
// Este es el constructor de la clase.
    // Cuando creamos un nuevo alumno, le pasamos su nombre, dirección y teléfono.
    // El número de carnet se asigna automáticamente usando el contador.
    public Alumno(String nombre, String direccion, String telefono) {
        this.carnet = contadorCarnet++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void imprimirDatos() {
        System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }
// Estos métodos son especiales porque se utilizan para trabajar con el contador de carnet.
    // Son como unos "puentes" para que podamos ver o cambiar el valor del contador desde fuera de la clase.
    // Sin embargo, normalmente no es necesario usarlos directamente.
    public static int getContadorCarnet() {
        return contadorCarnet;
    }

    public static void setContadorCarnet(int contadorCarnet) {
        Alumno.contadorCarnet = contadorCarnet;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}