package Proyecto;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * La clase {@code GaleriaImagenes} representa una ventana que muestra una galería
 * de imágenes de personajes de la serie "House", organizada en una cuadrícula.
 * 
 * <p>Extiende de {@code claseMenu}, por lo que hereda la funcionalidad de menú,
 * y utiliza {@code GridLayout} para organizar 39 imágenes en una cuadrícula de 5 filas y 8 columnas.</p>
 * 
 * <p>Las imágenes se cargan desde rutas absolutas especificadas en el sistema de archivos local.</p>
 * 
 * <p><b>Nota:</b> Para mayor portabilidad del proyecto, se recomienda usar rutas relativas o empaquetar
 * las imágenes dentro del proyecto como recursos.</p>
 * 
 * @author Miguel Ceballos Sánchez y Daniel Rivera Miranda
 */
public class GaleriaImagenes extends claseMenu {

    /**
     * Crea una nueva instancia de la ventana de galería de imágenes.
     * 
     * <p>Configura el título, el tamaño de la ventana, el comportamiento de cierre, y
     * establece un {@code GridLayout} para organizar las imágenes en 5 filas por 8 columnas.
     * Las imágenes se añaden de forma secuencial a la ventana.</p>
     */
    public GaleriaImagenes() {
        setTitle("Galería de Imágenes");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 8));

        // Añadir imágenes a la galería
        add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\1_house.jpg"));
        add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\2_wilson.jpg"));
        add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\3_cudy.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\4_chase.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\5_cameron.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\6_foreman.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\7_taub.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\8_trece.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\9_kutner.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\10_master.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\11_chi.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\12_volakis.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\13_jessica.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\14_ali.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\15_stacy.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\16_douglas.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\17_rebecca.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\18_rachel.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\19_michael.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\20_dominika.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\21_ruby.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\22_vogler.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\23_warner.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\24_julia_cuddy.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\25_reese.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\26_valerie.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\27_melanie_landon.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\28_tracy.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\29_melinda.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\30_nataly_tavares.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\31_lola.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\32_hank.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\33_maria.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\34_theresa.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\35_benjamin.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\36_frankie.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\37_pam.jpg"));
	add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\38_alex.jpg"));
        add(crearEtiquetaImagen("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\39_jessica.jpg"));

        setVisible(true);
    }

    /**
     * Crea una etiqueta {@code JLabel} que contiene una imagen cargada desde la ruta especificada.
     * 
     * @param ruta la ruta absoluta del archivo de imagen en el sistema.
     * @return un {@code JLabel} con la imagen si se encontró; de lo contrario, un {@code JLabel} con mensaje de error.
     */
    private JLabel crearEtiquetaImagen(String ruta) {
        java.net.URL url = getClass().getResource(ruta);

        if (url != null) {
            ImageIcon icono = new ImageIcon(url);
            return new JLabel(icono);
        } else {
            return new JLabel("Imagen no encontrada: " + ruta);
        }
    }

    /**
     * Método principal que lanza la aplicación de galería de imágenes usando el hilo de eventos de Swing.
     * 
     * @param args los argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GaleriaImagenes ventana = new GaleriaImagenes();
            ventana.setVisible(true);
        });
    }
}
