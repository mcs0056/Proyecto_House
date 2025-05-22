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
import java.awt.GridLayout;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JSeparator;

public class claseMenu2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel GaleriaImagenes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					claseMenu2 frame = new claseMenu2();
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
	public claseMenu2() {
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
		
		JButton wilson_2 = new JButton("");
		wilson_2.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\2_wilson.jpg"));
		GaleriaImagenes.add(wilson_2);
				
		JButton cudy_3 = new JButton("");
		cudy_3.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\3_cudy.jpg"));
		GaleriaImagenes.add(cudy_3);
		
		JButton chase_4 = new JButton("");
		chase_4.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\4_chase.jpg"));
		GaleriaImagenes.add(chase_4);
		
		JButton cameron_5 = new JButton("");
		cameron_5.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\5_cameron.jpg"));
		GaleriaImagenes.add(cameron_5);
		
		JButton foreman_6 = new JButton("");
		foreman_6.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\6_foreman.jpg"));
		GaleriaImagenes.add(foreman_6);
		
		JButton taub_7 = new JButton("");
		taub_7.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\7_taub.jpg"));
		GaleriaImagenes.add(taub_7);
		
		JButton trece_8 = new JButton("");
		trece_8.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\8_trece.jpg"));
		GaleriaImagenes.add(trece_8);
		
		JButton kutner_9 = new JButton("");
		kutner_9.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\9_kutner.jpg"));
		GaleriaImagenes.add(kutner_9);
		
		JButton master_10 = new JButton("");
		master_10.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\10_master.jpg"));
		GaleriaImagenes.add(master_10);
		
		JButton chi_11 = new JButton("");
		chi_11.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\11_chi.jpg"));
		GaleriaImagenes.add(chi_11);
		
		JButton volakis_12 = new JButton("");
		volakis_12.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\12_volakis.jpg"));
		GaleriaImagenes.add(volakis_12);
		
		JButton jessica_13 = new JButton("");
		jessica_13.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\13_jessica.jpg"));
		GaleriaImagenes.add(jessica_13);
		
		JButton ali_14 = new JButton("");
		ali_14.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\14_ali.jpg"));
		GaleriaImagenes.add(ali_14);
		
		JButton stacy_15 = new JButton("");
		stacy_15.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\15_stacy.jpg"));
		GaleriaImagenes.add(stacy_15);
		
		JButton douglas_16 = new JButton("");
		douglas_16.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\16_douglas.jpg"));
		GaleriaImagenes.add(douglas_16);
		
		JButton rebecca_17 = new JButton("");
		rebecca_17.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\17_rebecca.jpg"));
		GaleriaImagenes.add(rebecca_17);
		
		JButton rachel_18 = new JButton("");
		rachel_18.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\18_rachel.jpg"));
		GaleriaImagenes.add(rachel_18);
		
		JButton michael_19 = new JButton("");
		michael_19.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\19_michael.jpg"));
		GaleriaImagenes.add(michael_19);
		
		JButton dominika_20 = new JButton("");
		dominika_20.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\20_dominika.jpg"));
		GaleriaImagenes.add(dominika_20);
		
		JButton ruby_21 = new JButton("");
		ruby_21.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\21_ruby.jpg"));
		GaleriaImagenes.add(ruby_21);
		
		JButton vogler_22 = new JButton("");
		vogler_22.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\22_vogler.jpg"));
		GaleriaImagenes.add(vogler_22);
		
		JButton warner_23 = new JButton("");
		warner_23.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\23_warner.jpg"));
		GaleriaImagenes.add(warner_23);
		
		JButton julia_cuddy_24 = new JButton("");
		julia_cuddy_24.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\24_julia_cuddy.jpg"));
		GaleriaImagenes.add(julia_cuddy_24);
		
		JButton reese_25 = new JButton("");
		reese_25.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\25_reese.jpg"));
		GaleriaImagenes.add(reese_25);
		
		JButton valerie_26 = new JButton("");
		valerie_26.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\26_valerie.jpg"));
		GaleriaImagenes.add(valerie_26);
		
		JButton melanie_27 = new JButton("");
		melanie_27.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\27_melanie_landon.jpg"));
		GaleriaImagenes.add(melanie_27);
		
		JButton tracy_28 = new JButton("");
		tracy_28.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\28_tracy.jpg"));
		GaleriaImagenes.add(tracy_28);
		
		JButton melinda_29 = new JButton("");
		melinda_29.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\29_melinda.jpg"));
		GaleriaImagenes.add(melinda_29);
		
		JButton nataly_30 = new JButton("");
		nataly_30.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\30_nataly_tavares.jpg"));
		GaleriaImagenes.add(nataly_30);
		
		JButton lola_31 = new JButton("");
		lola_31.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\31_lola.jpg"));
		GaleriaImagenes.add(lola_31);
		
		JButton hank_32 = new JButton("");
		hank_32.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\32_hank.jpg"));
		GaleriaImagenes.add(hank_32);
		
		JButton maria_33 = new JButton("");
		maria_33.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\33_maria.jpg"));
		GaleriaImagenes.add(maria_33);
		
		JButton theresa_34 = new JButton("");
		theresa_34.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\34_theresa.jpg"));
		GaleriaImagenes.add(theresa_34);
		
		JButton benjamin_35 = new JButton("");
		benjamin_35.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\35_benjamin.jpg"));
		GaleriaImagenes.add(benjamin_35);
		
		JButton frankie_36 = new JButton("");
		frankie_36.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\36_frankie.jpg"));
		GaleriaImagenes.add(frankie_36);
		
		JButton pam_37 = new JButton("");
		pam_37.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\37_pam.jpg"));
		GaleriaImagenes.add(pam_37);
		
		JButton alex_38 = new JButton("");
		alex_38.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\38_alex.jpg"));
		GaleriaImagenes.add(alex_38);
		
		JButton jessica_39 = new JButton("");
		jessica_39.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Desktop\\Proyecto\\Dr. House\\39_jessica.jpg"));
		GaleriaImagenes.add(jessica_39);
		
	}
}
