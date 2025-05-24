package Proyecto;

/**
 * La clase {@code Personaje} representa un personaje de la serie "House"
 * con información detallada como su nombre, actor, edad, rol, primera aparición y ruta de imagen.
 * 
 * <p>Esta clase es utilizada para almacenar y manejar los datos individuales de cada personaje,
 * que pueden luego visualizarse en la interfaz gráfica del proyecto.</p>
 * 
 * @author Miguel Ceballos Sánchez y Daniel Rivera Miranda
 */
public class Personaje {
    
    /** Identificador único del personaje. */
    int id;

    /** Nombre del personaje. */
    String nombre;

    /** Nombre del actor que interpreta al personaje. */
    String actor;

    /** Edad del personaje. */
    int edad;

    /** Rol del personaje dentro de la serie. */
    String rol;

    /** Temporada de la primera aparición del personaje. */
    String primeraAparicion;

    /** Ruta a la imagen del personaje. */
    String rutaImagen;

    /**
     * Crea una nueva instancia de {@code Personaje} con los datos especificados.
     * 
     * @param id el identificador único del personaje
     * @param nombre el nombre del personaje
     * @param actor el actor que lo interpreta
     * @param edad la edad del personaje
     * @param rol el rol que desempeña en la serie
     * @param primeraAparicion la primera aparición del personaje en la serie
     * @param rutaImagen la ruta al archivo de imagen del personaje
     */
    public Personaje(int id, String nombre, String actor, int edad, String rol, String primeraAparicion, String rutaImagen) {
        this.id = id;
        this.nombre = nombre;
        this.actor = actor;
        this.edad = edad;
        this.rol = rol;
        this.primeraAparicion = primeraAparicion;
        this.rutaImagen = rutaImagen;
    }

    /**
     * Devuelve el nombre del personaje como representación en forma de cadena.
     * 
     * @return el nombre del personaje
     */
    @Override
    public String toString() {
        return nombre;
    }
}
