package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clase_info extends JFrame {

    public clase_info() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno1\\Pictures\\Dr. House\\interrogacion.png"));
        setTitle("Información del Personaje");
        setBounds(100, 100, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Imagen
        JLabel lblImagen = new JLabel("IMG");
        lblImagen.setBounds(20, 20, 100, 150);
        lblImagen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        getContentPane().add(lblImagen);

        // Descripción
        JTextArea txtDescripcion = new JTextArea("Descripción del personaje House.");
        txtDescripcion.setFont(new Font("Courier New", Font.PLAIN, 13));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBounds(140, 20, 420, 80);
        txtDescripcion.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        getContentPane().add(txtDescripcion);

        // Primera Aparición
        JLabel lblPrimeraAparicion = new JLabel("Primera Aparición: Serie House M.D.");
        lblPrimeraAparicion.setFont(new Font("Courier New", Font.PLAIN, 13));
        lblPrimeraAparicion.setBounds(140, 110, 300, 20);
        getContentPane().add(lblPrimeraAparicion);

        // Nombre del personaje
        JLabel lblNombrePersonaje = new JLabel("Personaje:");
        lblNombrePersonaje.setFont(new Font("Courier New", Font.PLAIN, 13));
        lblNombrePersonaje.setBounds(20, 180, 100, 20);
        getContentPane().add(lblNombrePersonaje);

        JTextField txtNombrePersonaje = new JTextField("House");
        txtNombrePersonaje.setFont(new Font("Courier New", Font.PLAIN, 13));
        txtNombrePersonaje.setBounds(120, 181, 150, 20);
        getContentPane().add(txtNombrePersonaje);

        // Nombre real
        JLabel lblNombreReal = new JLabel("Nombre Real:");
        lblNombreReal.setFont(new Font("Courier New", Font.PLAIN, 13));
        lblNombreReal.setBounds(20, 210, 100, 20);
        getContentPane().add(lblNombreReal);

        JTextField txtNombreReal = new JTextField("Gregory House");
        txtNombreReal.setFont(new Font("Courier New", Font.PLAIN, 13));
        txtNombreReal.setBounds(120, 210, 150, 20);
        getContentPane().add(txtNombreReal);

        // Edad
        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setFont(new Font("Courier New", Font.PLAIN, 13));
        lblEdad.setBounds(20, 240, 100, 20);
        getContentPane().add(lblEdad);

        JTextField txtEdad = new JTextField("45");
        txtEdad.setFont(new Font("Courier New", Font.PLAIN, 13));
        txtEdad.setBounds(120, 240, 50, 20);
        getContentPane().add(txtEdad);

        // Botón Menú
        JButton btnMenu = new JButton("Menú");
        btnMenu.setBackground(Color.WHITE);
        btnMenu.setFont(new Font("Courier New", Font.PLAIN, 13));
        btnMenu.setForeground(SystemColor.desktop);
        btnMenu.setBounds(220, 300, 139, 30);
        getContentPane().add(btnMenu);
        
        JButton btn_Siguiente = new JButton("Siguiente");
        btn_Siguiente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btn_Siguiente.setForeground(SystemColor.desktop);
        btn_Siguiente.setFont(new Font("Courier New", Font.PLAIN, 13));
        btn_Siguiente.setBackground(Color.WHITE);
        btn_Siguiente.setBounds(421, 300, 139, 30);
        getContentPane().add(btn_Siguiente);
        
        JButton btn_anterior = new JButton("Anterior");
        btn_anterior.setForeground(SystemColor.desktop);
        btn_anterior.setFont(new Font("Courier New", Font.PLAIN, 13));
        btn_anterior.setBackground(Color.WHITE);
        btn_anterior.setBounds(20, 300, 139, 30);
        getContentPane().add(btn_anterior);

        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new claseMenu().setVisible(true);  // Volver al menú
                dispose(); // Cerrar esta ventana
            }
        });
    }
}
