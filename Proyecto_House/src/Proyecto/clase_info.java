package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Ventana que muestra la información detallada de un personaje de la serie Dr. House.
 * Permite navegar entre personajes con botones "Anterior" y "Siguiente", 
 * y regresar al menú principal.
 * 
 * @author Miguel Ceballos Sánchez y Daniel Rivera Miranda
 * @version 1.0
 */
public class clase_info extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private JPanel contentPane;
    private JLabel lblImagen;
    private JTextField txtNombrePersonaje, txtNombreActor, txtEdad, txtRol, txtPrimeraAparicion;
    private String[] personajes;
    private int indiceActual;

    /**
     * Crea una nueva ventana con la información del personaje indicado.
     * 
     * @param personajes Array con los nombres de todos los personajes disponibles.
     * @param indiceActual Índice del personaje actualmente mostrado dentro del array personajes.
     */
    public clase_info(String[] personajes, int indiceActual) {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\interrogacion.png"));
        this.personajes = personajes;
        this.indiceActual = indiceActual;
        String nombrePersonaje = personajes[indiceActual];
        
        setTitle("Información del personaje");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 839, 534);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 192));
        setContentPane(contentPane);

        cargarInformacion(nombrePersonaje);
        contentPane.setLayout(new BorderLayout(0, 0));

        JLabel titulo = new JLabel("Detalles de " + nombrePersonaje);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(titulo, BorderLayout.NORTH);

        // Panel y botones de navegación
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(0, 128, 192));
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Botón Anterior
        JButton btn_Anterior = new JButton("Anterior");
        btn_Anterior.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\izq.png"));
        btn_Anterior.setForeground(SystemColor.desktop);
        btn_Anterior.setFont(new Font("Courier New", Font.PLAIN, 13));
        btn_Anterior.setBackground(Color.WHITE);
        btn_Anterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (indiceActual > 0) {
                    new clase_info(personajes, indiceActual - 1).setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(clase_info.this, "Ya estás en el primer personaje.");
                }
            }
        });

        // Botón Menú
        JButton btn_Menu = new JButton("Menú");
        btn_Menu.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\menu.png"));
        btn_Menu.setBackground(Color.WHITE);
        btn_Menu.setFont(new Font("Courier New", Font.PLAIN, 13));
        btn_Menu.setForeground(SystemColor.desktop);
        btn_Menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new claseMenu().setVisible(true);  // Volver al menú
                dispose(); // Cerrar esta ventana
            }
        });

        // Botón Siguiente
        JButton btn_Siguiente = new JButton("Siguiente");
        btn_Siguiente.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\dcha.png"));
        btn_Siguiente.setHorizontalTextPosition(SwingConstants.LEFT);
        btn_Siguiente.setForeground(SystemColor.desktop);
        btn_Siguiente.setFont(new Font("Courier New", Font.PLAIN, 13));
        btn_Siguiente.setBackground(Color.WHITE);
        btn_Siguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (indiceActual < personajes.length - 1) {
                    new clase_info(personajes, indiceActual + 1).setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(clase_info.this, "Ya estás en el último personaje");
                }
            }
        });

        panelBotones.add(btn_Anterior);
        panelBotones.add(btn_Menu);
        panelBotones.add(btn_Siguiente);
        contentPane.add(panelBotones, BorderLayout.SOUTH);
    }

    /**
     * Carga la información del personaje especificado desde la base de datos
     * y actualiza los campos de la interfaz gráfica.
     * 
     * @param nombrePersonaje Nombre del personaje cuya información se va a cargar.
     */
    private void cargarInformacion(String nombrePersonaje) {
        try (Connection con = ConexionBD.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM personajes WHERE nombre_personaje = '" + nombrePersonaje + "'")) {

            if (rs.next()) {
                String nombre_personaje = rs.getString("Nombre_personaje");
                String nombre_actor = rs.getString("Nombre_actor");
                int edad = rs.getInt("Edad");
                String rol = rs.getString("Rol");
                String primeraAparicion = rs.getString("Primera_Aparicion");
                String imagen = rs.getString("imagen");

                // Crear y mostrar la imagen escalada
                ImageIcon iconoOriginal = new ImageIcon(imagen);
                Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
                lblImagen = new JLabel();
                lblImagen.setIcon(iconoEscalado);
                lblImagen.setBounds(20, 40, 100, 150);
                lblImagen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                getContentPane().add(lblImagen);

                // Crear y añadir etiquetas y campos de texto para mostrar la información
                JLabel lblNombrePersonaje = new JLabel("- Nombre del personaje:");
                lblNombrePersonaje.setForeground(Color.WHITE);
                lblNombrePersonaje.setFont(new Font("Courier New", Font.PLAIN, 13));
                lblNombrePersonaje.setBounds(20, 200, 200, 20);
                getContentPane().add(lblNombrePersonaje);

                txtNombrePersonaje = new JTextField(nombre_personaje);
                txtNombrePersonaje.setEditable(false);
                txtNombrePersonaje.setFont(new Font("Courier New", Font.PLAIN, 13));
                txtNombrePersonaje.setBounds(220, 200, 150, 20);
                getContentPane().add(txtNombrePersonaje);

                JLabel lblNombreActor = new JLabel("- Nombre del actor:");
                lblNombreActor.setForeground(Color.WHITE);
                lblNombreActor.setFont(new Font("Courier New", Font.PLAIN, 13));
                lblNombreActor.setBounds(20, 230, 170, 20);
                getContentPane().add(lblNombreActor);

                txtNombreActor = new JTextField(nombre_actor);
                txtNombreActor.setEditable(false);
                txtNombreActor.setFont(new Font("Courier New", Font.PLAIN, 13));
                txtNombreActor.setBounds(180, 230, 175, 20);
                getContentPane().add(txtNombreActor);

                JLabel lblEdad = new JLabel("- Edad:");
                lblEdad.setForeground(Color.WHITE);
                lblEdad.setFont(new Font("Courier New", Font.PLAIN, 13));
                lblEdad.setBounds(20, 260, 120, 20);
                getContentPane().add(lblEdad);

                txtEdad = new JTextField(String.valueOf(edad));
                txtEdad.setEditable(false);
                txtEdad.setFont(new Font("Courier New", Font.PLAIN, 13));
                txtEdad.setBounds(90, 260, 25, 20);
                getContentPane().add(txtEdad);

                JLabel lblRol = new JLabel("- Rol:");
                lblRol.setForeground(Color.WHITE);
                lblRol.setFont(new Font("Courier New", Font.PLAIN, 13));
                lblRol.setBounds(20, 290, 120, 20);
                getContentPane().add(lblRol);

                txtRol = new JTextField(rol);
                txtRol.setEditable(false);
                txtRol.setFont(new Font("Courier New", Font.PLAIN, 13));
                txtRol.setBounds(80, 290, 300, 20);
                getContentPane().add(txtRol);

                JLabel lblPrimeraAparicion = new JLabel("- Primera Aparición: ");
                lblPrimeraAparicion.setForeground(Color.WHITE);
                lblPrimeraAparicion.setFont(new Font("Courier New", Font.PLAIN, 13));
                lblPrimeraAparicion.setBounds(20, 320, 320, 20);
                getContentPane().add(lblPrimeraAparicion);

                txtPrimeraAparicion = new JTextField(primeraAparicion);
                txtPrimeraAparicion.setEditable(false);
                txtPrimeraAparicion.setFont(new Font("Courier New", Font.PLAIN, 13));
                txtPrimeraAparicion.setBounds(190, 320, 200, 20);
                getContentPane().add(txtPrimeraAparicion);

                repaint();

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró información.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los datos.");
        }
    }
}
