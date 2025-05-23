package Proyecto;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class claseMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel GaleriaImagenes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					claseMenu frame = new claseMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
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
		GaleriaImagenes.setBorder(new EmptyBorder(15,0,0,0));
		
		
		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.setBackground(new Color(0,128,192));
		
		//Panel superior con texto
		JPanel textoSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
		textoSuperior.setBackground(new Color(0,128,192));
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\izq.png"));
		btnVolver.addActionListener(e -> {
			clasePrincipal ventana = new clasePrincipal();
			ventana.setVisible(true);
			dispose();
		});
		textoSuperior.add(btnVolver);
		
		//Texto de bienvenida
		JTextArea menu = new JTextArea();
		menu.setBackground(new Color(0, 128, 192));
		menu.setForeground(new Color(255, 255, 255));
		menu.setFont(new Font("Courier New", Font.PLAIN, 13));
		menu.setText("\t\t¡Bienvenidos al menú de House!\r\nPara ver la información de algún personaje, pincha sobre él.");
		menu.setEditable(false);
		textoSuperior.add(menu);
		
		//Contenedor centrado con scroll
		JPanel contenedorCentrado = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
		contenedorCentrado.setBackground(new Color(0, 128, 192));
		contenedorCentrado.add(GaleriaImagenes);
		
		
		//Agregar JScrollPane
		JScrollPane scroll = new JScrollPane(contenedorCentrado);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.getVerticalScrollBar().setUnitIncrement(16); //Suaviza el scroll
		
		//Armar el panel principal
		panelPrincipal.add(textoSuperior, BorderLayout.NORTH);
		panelPrincipal.add(scroll, BorderLayout.CENTER);
		panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		setContentPane(panelPrincipal);
		
		try {
		    Connection con = ConexionBD.conectar();
		    Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("SELECT * FROM personajes");
	
		    java.util.List<String> listaNombres = new ArrayList<>();
		    
		    while (rs.next()) {
		        String nombre = rs.getString("Nombre_personaje");
		        String rutaImagen = rs.getString("imagen");
	
		        listaNombres.add(nombre);
	
		        JButton boton = new JButton();
		        boton.setIcon(new ImageIcon(rutaImagen));
		        GaleriaImagenes.add(boton);
	
		        int index = listaNombres.size() - 1;
	
		        boton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                new clase_info(listaNombres.toArray(new String[0]), index).setVisible(true);
		                setVisible(false);
		            }
		        });
		    }
	
		    rs.close();
		    stmt.close();
		    con.close();
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}
