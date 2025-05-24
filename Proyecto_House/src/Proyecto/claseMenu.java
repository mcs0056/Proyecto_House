package Proyecto;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

/**
 * La clase {@code claseMenu} representa la ventana principal del menú de personajes
 * de la serie "House", mostrando una galería de imágenes de personajes en un panel desplazable.
 * 
 * <p>Cada botón contiene una imagen representando a un personaje. Al hacer clic en un botón,
 * se abre una nueva ventana con la información detallada de ese personaje.</p>
 * 
 * <p>Los datos de los personajes se cargan desde una base de datos MySQL utilizando una conexión proporcionada
 * por la clase {@code ConexionBD}.</p>
 * 
 * <p>La ventana incluye también un mensaje de bienvenida y un botón para volver al menú principal.</p>
 * 
 * @author Miguel Ceballos Sánchez y Daniel Rivera Miranda
 */
public class claseMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel GaleriaImagenes;

    /**
     * Punto de entrada principal para lanzar la aplicación de menú.
     * 
     * @param args argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                claseMenu frame = new claseMenu();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Constructor de la clase {@code claseMenu}.
     * <p>Inicializa la interfaz de usuario, conecta a la base de datos y carga
     * los personajes dinámicamente en una galería de botones con sus respectivas imágenes.</p>
     */
    public claseMenu() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\h.jfif"));
        setTitle("Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 773, 573);

        GaleriaImagenes = new JPanel();
        GaleriaImagenes.setBackground(new Color(0, 128, 192));
        GaleriaImagenes.setForeground(new Color(0, 128, 192));
        GaleriaImagenes.setLayout(new GridLayout(5, 8, 15, 10));
        GaleriaImagenes.setBorder(new EmptyBorder(15, 0, 0, 0));

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBackground(new Color(0, 128, 192));

        // Panel superior con texto de bienvenida y botón de volver
        JPanel textoSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        textoSuperior.setBackground(new Color(0, 128, 192));

        JButton btnVolver = new JButton("Volver");
        btnVolver.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\izq.png"));
        btnVolver.addActionListener(e -> {
            clasePrincipal ventana = new clasePrincipal();
            ventana.setVisible(true);
            dispose();
        });
        textoSuperior.add(btnVolver);

        // Mensaje de bienvenida
        JTextArea menu = new JTextArea();
        menu.setBackground(new Color(0, 128, 192));
        menu.setForeground(Color.WHITE);
        menu.setFont(new Font("Courier New", Font.PLAIN, 13));
        menu.setText("\t\t¡Bienvenidos al menú de House!\r\nPara ver la información de algún personaje, pincha sobre él.");
        menu.setEditable(false);
        textoSuperior.add(menu);

        // Panel contenedor central con scroll
        JPanel contenedorCentrado = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        contenedorCentrado.setBackground(new Color(0, 128, 192));
        contenedorCentrado.add(GaleriaImagenes);

        JScrollPane scroll = new JScrollPane(contenedorCentrado);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
