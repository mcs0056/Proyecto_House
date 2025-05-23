package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class eliminarPersonaje extends JFrame {
	private JComboBox<String> comboPersonajes;
    private JButton btnEliminar, btnVolver;

    public eliminarPersonaje() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\equis.png"));
    	getContentPane().setBackground(new Color(0, 128, 192));
        setTitle("Eliminar Personaje");
        setSize(400, 300);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Nombre del personaje
        JLabel lblNombrePersonaje = new JLabel("Nombre del personaje:");
        lblNombrePersonaje.setForeground(new Color(255, 255, 255));
        lblNombrePersonaje.setBounds(10, 112, 154, 25);
        getContentPane().add(lblNombrePersonaje);

        //Desplegable del nombre del personaje
        comboPersonajes = new JComboBox<>();
        comboPersonajes.setBounds(174, 112, 200, 25);
        getContentPane().add(comboPersonajes);

        //Llenar el combo con los nombres desde la base de datos
        llenarComboPersonajes();

        //Botón Volver
        btnVolver = new JButton("Volver");
        btnVolver.setBounds(36, 199, 100, 25);
      //Botón Volver
        btnVolver = new JButton("Volver");
        btnVolver.setBounds(36, 199, 100, 25);
        btnVolver.addActionListener(e -> {
        	clasePrincipal ventana = new clasePrincipal();
        	ventana.setVisible(true);
        	dispose();
        });
        getContentPane().add(btnVolver);
        getContentPane().add(btnVolver);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(242, 196, 100, 30);
        getContentPane().add(btnEliminar);

        // Acción del botón Eliminar
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String seleccionado = (String) comboPersonajes.getSelectedItem();
                if (seleccionado != null) {
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "¿Seguro que quieres eliminar a " + seleccionado + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        eliminarPersonaje(seleccionado);
                        comboPersonajes.removeItem(seleccionado); // Lo quita del combo
                    }
                }
            }
        });
    }


    private void llenarComboPersonajes() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            String sql = "SELECT Nombre_personaje FROM personajes";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                comboPersonajes.addItem(rs.getString("Nombre_personaje"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar nombres.");
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }
    }
    
    private void eliminarPersonaje(String nombre) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            String sql = "DELETE FROM personajes WHERE Nombre_personaje = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Personaje eliminado correctamente.");

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar personaje.");
        } finally {
            try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }
    }


}

