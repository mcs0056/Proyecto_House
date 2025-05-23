package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class aniadirPersonaje extends JFrame {

    private JTextField txtId, txtNombrePersonaje, txtNombreActor, txtEdad, txtRol, txtPrimeraAparicion, txtImagen;
    private JButton btnGuardar, btnVolver;

    public aniadirPersonaje() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\+.png"));
    	getContentPane().setBackground(new Color(0, 128, 192));
        setTitle("Añadir Nuevo Personaje");
        setSize(400, 300);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //id
        JLabel lblId = new JLabel("Id:");
        lblId.setForeground(new Color(255, 255, 255));
        lblId.setBounds(20, 20, 144, 25);
        getContentPane().add(lblId);
        txtId = new JTextField();
        txtId.setBounds(174, 20, 200, 25);
        getContentPane().add(txtId);
        
        //Nombre del personaje
        JLabel lblNombrePersonaje = new JLabel("Nombre del personaje:");
        lblNombrePersonaje.setForeground(new Color(255, 255, 255));
        lblNombrePersonaje.setBounds(20, 50, 144, 25);
        getContentPane().add(lblNombrePersonaje);
        txtNombrePersonaje = new JTextField();
        txtNombrePersonaje.setBounds(174, 50, 200, 25);
        getContentPane().add(txtNombrePersonaje);

        //Nombre del actor
        JLabel lblNombreActor = new JLabel("Nombre del actor:");
        lblNombreActor.setForeground(new Color(255, 255, 255));
        lblNombreActor.setBounds(20, 80, 144, 25);
        getContentPane().add(lblNombreActor);
        txtNombreActor = new JTextField();
        txtNombreActor.setBounds(174, 80, 200, 25);
        getContentPane().add(txtNombreActor);
        
        //Edad
        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setForeground(new Color(255, 255, 255));
        lblEdad.setBounds(20, 110, 144, 25);
        getContentPane().add(lblEdad);
        txtEdad = new JTextField();
        txtEdad.setBounds(174, 110, 200, 25);
        getContentPane().add(txtEdad);
        
        //Rol
        JLabel lblRol = new JLabel("Rol:");
        lblRol.setForeground(new Color(255, 255, 255));
        lblRol.setBounds(20, 140, 144, 25);
        getContentPane().add(lblRol);
        txtRol = new JTextField();
        txtRol.setBounds(174, 140, 200, 25);
        getContentPane().add(txtRol);
        
        //Primera aparicion
        JLabel lblPrimeraAparicion = new JLabel("Primera Aparición:");
        lblPrimeraAparicion.setForeground(new Color(255, 255, 255));
        lblPrimeraAparicion.setBounds(20, 170, 144, 25);
        getContentPane().add(lblPrimeraAparicion);
        txtPrimeraAparicion = new JTextField();
        txtPrimeraAparicion.setBounds(174, 170, 200, 25);
        getContentPane().add(txtPrimeraAparicion);
        
        //Imagen
        JLabel lblImagen = new JLabel("Ruta de la imagen: ");
        lblImagen.setForeground(new Color(255, 255, 255));
        lblImagen.setBounds(20, 200, 144, 25);
        getContentPane().add(lblImagen);
        txtImagen = new JTextField();
        txtImagen.setBounds(174, 200, 200, 25);
        getContentPane().add(txtImagen);
     

      //Botón Volver
        btnVolver = new JButton("Volver");
        btnVolver.setBounds(36, 231, 100, 25);
        btnVolver.addActionListener(e -> {
        	clasePrincipal ventana = new clasePrincipal();
        	ventana.setVisible(true);
        	dispose();
        });
        getContentPane().add(btnVolver);

        //Botón Guardar
        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(236, 231, 100, 25);
        getContentPane().add(btnGuardar);

        // Acción del botón Guardar
        btnGuardar.addActionListener(e -> guardarPersonaje());
        setVisible(true);
        
    }

    private void guardarPersonaje() {
    	String id = txtId.getText().trim();
        String nombrePersonaje = txtNombrePersonaje.getText().trim();
        String nombreActor = txtNombreActor.getText().trim();
        String edad = txtEdad.getText().trim();
        String rol = txtRol.getText().trim();
        String primeraAparicion = txtPrimeraAparicion.getText().trim();
    	String imagen = txtImagen.getText().trim();
        

        if (id.isEmpty() || nombrePersonaje.isEmpty() || nombreActor.isEmpty() || edad.isEmpty() || rol.isEmpty() || primeraAparicion.isEmpty() || imagen.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
            String sql = "INSERT INTO personajes (id, Nombre_personaje, Nombre_actor, Edad, Rol, Primera_Aparicion, imagen) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, nombrePersonaje);
            stmt.setString(3, nombreActor);
            stmt.setString(4, edad);
            stmt.setString(5, rol);
            stmt.setString(6, primeraAparicion);
            stmt.setString(7, imagen);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Personaje añadido con éxito.");
            aniadirPersonaje ventana = new aniadirPersonaje();
            ventana.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar el personaje.");
        }
    }
}

