package Proyecto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class PersonajesPage extends JFrame {
	private JTable table;

    public PersonajesPage() {
        setTitle("Lista de Personajes");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        table = new JTable();
        add(new JScrollPane(table), BorderLayout.CENTER);

        cargarPersonajes();
    }

    private void cargarPersonajes() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Nombre del Personaje", "Nombre del Actor", "Edad"}, 0);
        table.setModel(model);

        try (Connection conn = ConexionBD.conectar()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Nombre_personaje, Nombre_actor, Edad FROM personajes");

            while (rs.next()) {
                String personaje = rs.getString("Nombre_personaje");
                String actor = rs.getString("Nombre_actor");
                int edad = rs.getInt("Edad");

                model.addRow(new Object[]{personaje, actor, edad});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
        }
    }

    // Para probarlo directamente
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PersonajesPage().setVisible(true));
    }
}
