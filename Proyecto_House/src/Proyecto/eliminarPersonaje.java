package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 * Clase que representa una ventana para eliminar personajes de la base de datos.
 * Permite seleccionar un personaje desde un JComboBox y eliminarlo tras confirmación.
 * Incluye opciones para volver al menú principal.
 * 
 * @author  Miguel Ceballos Sánchez y Daniel Rivera Miranda
 * @version 1.0
 */
public class eliminarPersonaje extends JFrame {

    /** ComboBox que muestra la lista de nombres de personajes disponibles */
    private JComboBox<String> comboPersonajes;
    
    /** Botón para eliminar el personaje seleccionado */
    private JButton btnEliminar;
    
    /** Botón para volver al menú principal */
    private JButton btnVolver;

    /**
     * Constructor que inicializa la ventana, configura la interfaz gráfica y carga los personajes.
     */
    public eliminarPersonaje() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\equis.png"));
        getContentPane().setBackground(new Color(0, 128, 192));
        setTitle("Eliminar Personaje");
        setSize(400, 300);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblNombrePersonaje = new JLabel("Nombre del personaje:");
        lblNombrePersonaje.setForeground(Color.WHITE);
        lblNombrePersonaje.setBounds(10, 112, 154, 25);
        getContentPane().add(lblNombrePersonaje);

        comboPersonajes = new JComboBox<>();
        comboPersonajes.setBounds(174, 112, 200, 25);
        getContentPane().add(comboPersonajes);

        // Carga los nombres de personajes en el combo
        llenarComboPersonajes();

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(36, 199, 100, 25);
        btnVolver.addActionListener(e -> {
            clasePrincipal ventana = new clasePrincipal();
            ventana.setVisible(true);
            dispose();
        });
        getContentPane().add(btnVolver);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(242, 196, 100, 30);
        getContentPane().add(btnEliminar);

        // Acción para eliminar personaje seleccionado con confirmación
        btnEliminar.addActionListener(e -> {
            if (comboPersonajes.getItemCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay personajes para eliminar.");
                return;
            }
            String seleccionado = (String) comboPersonajes.getSelectedItem();
            if (seleccionado != null) {
                int confirm = JOptionPane.showConfirmDialog(null,
                        "¿Seguro que quieres eliminar a " + seleccionado + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    if (eliminarPersonaje(seleccionado)) {
                        comboPersonajes.removeItem(seleccionado);
                    }
                }
            }
        });
    }

    /**
     * Llena el JComboBox con los nombres de los personajes almacenados en la base de datos.
     */
    private void llenarComboPersonajes() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
             PreparedStatement stmt = conn.prepareStatement("SELECT Nombre_personaje FROM personajes");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                comboPersonajes.addItem(rs.getString("Nombre_personaje"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar nombres.");
        }
    }

    /**
     * Elimina de la base de datos el personaje cuyo nombre es proporcionado.
     * 
     * @param nombre El nombre del personaje a eliminar.
     * @return true si la eliminación fue exitosa, false en caso contrario.
     */
    private boolean eliminarPersonaje(String nombre) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM personajes WHERE Nombre_personaje = ?")) {
             
            stmt.setString(1, nombre);
            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Personaje eliminado correctamente.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el personaje.");
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar personaje.");
            return false;
        }
    }
}

