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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		JTextArea menu = new JTextArea();
		menu.setBackground(new Color(0, 128, 192));
		menu.setForeground(new Color(255, 255, 255));
		menu.setFont(new Font("Courier New", Font.PLAIN, 13));
		menu.setText("\t\t¡Bienvenidos al menú de House!\r\nPara ver la información de algún personaje, clica sobre él.");
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
		
		setContentPane(panelPrincipal);
		
		
		JButton house_1 = new JButton("");
		house_1.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\1 _house.jpg"));
		GaleriaImagenes.add(house_1);
		house_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton wilson_2 = new JButton("");
		wilson_2.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\2_wilson.jpg"));
		GaleriaImagenes.add(wilson_2);	
		wilson_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton cudy_3 = new JButton("");
		cudy_3.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\3_cudy.jpg"));
		GaleriaImagenes.add(cudy_3);
		cudy_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton chase_4 = new JButton("");
		chase_4.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\4_chase.jpg"));
		GaleriaImagenes.add(chase_4);
		chase_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton cameron_5 = new JButton("");
		cameron_5.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\5_cameron.jpg"));
		GaleriaImagenes.add(cameron_5);
		cameron_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton foreman_6 = new JButton("");
		foreman_6.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\6_foreman.jpg"));
		GaleriaImagenes.add(foreman_6);
		foreman_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton taub_7 = new JButton("");
		taub_7.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\7_taub.jpg"));
		GaleriaImagenes.add(taub_7);
		taub_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton trece_8 = new JButton("");
		trece_8.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\8_trece.jpg"));
		GaleriaImagenes.add(trece_8);
		trece_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton kutner_9 = new JButton("");
		kutner_9.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\9_kutner.jpg"));
		GaleriaImagenes.add(kutner_9);
		kutner_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton master_10 = new JButton("");
		master_10.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\10_master.jpg"));
		GaleriaImagenes.add(master_10);
		master_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton chi_11 = new JButton("");
		chi_11.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\11_chi.jpg"));
		GaleriaImagenes.add(chi_11);
		chi_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton volakis_12 = new JButton("");
		volakis_12.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\12_volakis.jpg"));
		GaleriaImagenes.add(volakis_12);
		volakis_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton jessica_13 = new JButton("");
		jessica_13.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\13_jessica.jpg"));
		GaleriaImagenes.add(jessica_13);
		jessica_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton ali_14 = new JButton("");
		ali_14.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\14_ali.jpg"));
		GaleriaImagenes.add(ali_14);
		ali_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton stacy_15 = new JButton("");
		stacy_15.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\15_stacy.jpg"));
		GaleriaImagenes.add(stacy_15);
		stacy_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton douglas_16 = new JButton("");
		douglas_16.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\16_douglas.jpg"));
		GaleriaImagenes.add(douglas_16);
		douglas_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton rebecca_17 = new JButton("");
		rebecca_17.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\17_rebecca.jpg"));
		GaleriaImagenes.add(rebecca_17);
		rebecca_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton rachel_18 = new JButton("");
		rachel_18.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\18_rachel.jpg"));
		GaleriaImagenes.add(rachel_18);
		rachel_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton michael_19 = new JButton("");
		michael_19.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\19_michael.jpg"));
		GaleriaImagenes.add(michael_19);
		michael_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton dominika_20 = new JButton("");
		dominika_20.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\20_dominika.jpg"));
		GaleriaImagenes.add(dominika_20);
		dominika_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton ruby_21 = new JButton("");
		ruby_21.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\21_ruby.jpg"));
		GaleriaImagenes.add(ruby_21);
		ruby_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton vogler_22 = new JButton("");
		vogler_22.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\22_vogler.jpg"));
		GaleriaImagenes.add(vogler_22);
		vogler_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton warner_23 = new JButton("");
		warner_23.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\23_warner.jpg"));
		GaleriaImagenes.add(warner_23);
		warner_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton julia_cuddy_24 = new JButton("");
		julia_cuddy_24.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\24_julia_cuddy.jpg"));
		GaleriaImagenes.add(julia_cuddy_24);
		julia_cuddy_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton reese_25 = new JButton("");
		reese_25.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\25_reese.jpg"));
		GaleriaImagenes.add(reese_25);
		reese_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton valerie_26 = new JButton("");
		valerie_26.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\26_valerie.jpg"));
		GaleriaImagenes.add(valerie_26);
		valerie_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton melanie_27 = new JButton("");
		melanie_27.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\27_melanie_landon.jpg"));
		GaleriaImagenes.add(melanie_27);
		melanie_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton tracy_28 = new JButton("");
		tracy_28.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\28_tracy.jpg"));
		GaleriaImagenes.add(tracy_28);
		tracy_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton melinda_29 = new JButton("");
		melinda_29.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\29_melinda.jpg"));
		GaleriaImagenes.add(melinda_29);
		melinda_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton nataly_30 = new JButton("");
		nataly_30.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\30_nataly_tavares.jpg"));
		GaleriaImagenes.add(nataly_30);
		nataly_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton lola_31 = new JButton("");
		lola_31.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\31_lola.jpg"));
		GaleriaImagenes.add(lola_31);
		lola_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton hank_32 = new JButton("");
		hank_32.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\32_hank.jpg"));
		GaleriaImagenes.add(hank_32);
		hank_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton maria_33 = new JButton("");
		maria_33.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\33_maria.jpg"));
		GaleriaImagenes.add(maria_33);
		maria_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton theresa_34 = new JButton("");
		theresa_34.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\34_theresa.jpg"));
		GaleriaImagenes.add(theresa_34);
		theresa_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton benjamin_35 = new JButton("");
		benjamin_35.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\35_benjamin.jpg"));
		GaleriaImagenes.add(benjamin_35);
		benjamin_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton frankie_36 = new JButton("");
		frankie_36.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\36_frankie.jpg"));
		GaleriaImagenes.add(frankie_36);
		frankie_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton pam_37 = new JButton("");
		pam_37.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\37_pam.jpg"));
		GaleriaImagenes.add(pam_37);
		pam_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton alex_38 = new JButton("");
		alex_38.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\38_alex.jpg"));
		GaleriaImagenes.add(alex_38);
		alex_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
			}
		});
		
		JButton jessica_39 = new JButton("");
		jessica_39.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\39_jessica.jpg"));
		GaleriaImagenes.add(jessica_39);
		jessica_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new clase_info().setVisible(true);
				setVisible(false);
				PersonajesPage dataPage = new PersonajesPage();
				dataPage.setVisible(true);
			}
		});
		
//		try (Connection conn = ConexionBD.conectar()) {
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT Nombre_personaje, Nombre_actor, Edad FROM personajes");
//
//            while (rs.next()) {
//                String personaje = rs.getString("Nombre_personaje");
//                String actor = rs.getString("Nombre_actor");
//                int edad = rs.getInt("Edad");
//
//				model.addRow(new Object[]{personaje, actor, edad});
//            }
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
//        }
	}
}
