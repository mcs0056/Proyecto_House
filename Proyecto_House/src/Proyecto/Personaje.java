package Proyecto;

public class Personaje {
    int id;
    String nombre;
    String actor;
    int edad;
    String rol;
    String primeraAparicion;
    String rutaImagen;

    public Personaje(int id, String nombre, String actor, int edad, String rol, String primeraAparicion, String rutaImagen) {
        this.id = id;
        this.nombre = nombre;
        this.actor = actor;
        this.edad = edad;
        this.rol = rol;
        this.primeraAparicion = primeraAparicion;
        this.rutaImagen = rutaImagen;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

