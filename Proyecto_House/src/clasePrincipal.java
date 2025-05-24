import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * La clase {@code clasePrincipal} representa la ventana principal o de bienvenida de la aplicación
 * FanZone de la serie "Dr. House".
 * 
 * <p>Desde esta ventana se puede acceder a:</p>
 * <ul>
 *   <li>La galería de personajes mediante el botón "Ver Personajes".</li>
 *   <li>La interfaz para añadir un nuevo personaje.</li>
 *   <li>La interfaz para eliminar personajes.</li>
 * </ul>
 * 
 * <p>Incluye un mensaje introductorio y un logotipo decorativo de la serie.</p>
 * 
 * @author Miguel Ceballos Sánchez y Daniel Rivera Miranda
 */
public class clasePrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                clasePrincipal frame = new clasePrincipal();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Constructor de la clase {@code clasePrincipal}.
     * <p>Inicializa la interfaz de bienvenida, incluyendo un mensaje introductorio,
     * el logotipo de la serie y botones de navegación hacia otras funcionalidades de la aplicación.</p>
     */
    public clasePrincipal() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\h.jfif"));
        setTitle("Dr. House FanZone");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Texto de bienvenida
        JTextArea txtrEstaEsLa = new JTextArea();
        txtrEstaEsLa.setEditable(false);
        txtrEstaEsLa.setForeground(Color.WHITE);
        txtrEstaEsLa.setLineWrap(true);
        txtrEstaEsLa.setBackground(new Color(0, 128, 192));
        txtrEstaEsLa.setBounds(114, 101, 213, 76);
        txtrEstaEsLa.setWrapStyleWord(true);
        txtrEstaEsLa.setFont(new Font("Courier New", Font.PLAIN, 13));
        txtrEstaEsLa.setText("Esta es la Fan Zone de Dr.House. Aquí encontrarás toda la información sobre la serie.");
        contentPane.add(txtrEstaEsLa);

        // Logo
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(41, -21, 348, 123);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\logo.png"));
        contentPane.add(lblNewLabel);

        // Botón: Ver Personajes
        JButton verPersonajes = new JButton("Ver Personajes");
        verPersonajes.setBounds(124, 188, 180, 23);
        verPersonajes.setBackground(Color.WHITE);
        verPersonajes.setForeground(Color.BLACK);
        verPersonajes.setFont(new Font("Courier New", Font.PLAIN, 13));
        verPersonajes.addActionListener(e -> {
            claseMenu ventana = new claseMenu();
            ventana.setVisible(true);
            dispose();
        });
        contentPane.add(verPersonajes);

        // Botón: Añadir Personaje
        JButton aniadirPersonaje = new JButton("Añadir Personaje");
        aniadirPersonaje.setForeground(Color.BLACK);
        aniadirPersonaje.setFont(new Font("Courier New", Font.PLAIN, 13));
        aniadirPersonaje.setBounds(30, 222, 180, 23);
        aniadirPersonaje.addActionListener(e -> {
            aniadirPersonaje ventana = new aniadirPersonaje();
            ventana.setVisible(true);
            dispose();
        });
        contentPane.add(aniadirPersonaje);

        // Botón: Eliminar Personaje
        JButton eliminarPersonaje = new JButton("Eliminar Personaje");
        eliminarPersonaje.setForeground(Color.BLACK);
        eliminarPersonaje.setFont(new Font("Courier New", Font.PLAIN, 13));
        eliminarPersonaje.setBounds(220, 222, 180, 23);
        eliminarPersonaje.addActionListener(e -> {
            eliminarPersonaje ventana = new eliminarPersonaje();
            ventana.setVisible(true);
            dispose();
        });
        contentPane.add(eliminarPersonaje);
    }
}
