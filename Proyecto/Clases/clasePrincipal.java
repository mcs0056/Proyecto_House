package Proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class clasePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clasePrincipal frame = new clasePrincipal();
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
	public clasePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrEstaEsLa = new JTextArea();
		txtrEstaEsLa.setBackground(new Color(0, 128, 192));
		txtrEstaEsLa.setBounds(114, 101, 213, 76);
		txtrEstaEsLa.setWrapStyleWord(true);
		txtrEstaEsLa.setLineWrap(true);
		txtrEstaEsLa.setFont(new Font("Courier New", Font.PLAIN, 13));
		txtrEstaEsLa.setText("Esta es la Fan Zone de Dr.House. Aquí encontrarás toda la información sobre la serie.");
		contentPane.add(txtrEstaEsLa);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(41, -21, 348, 123);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alumno1\\Pictures\\Dr. House\\png-clipart-tv-series-logo-icons-dr-house-thumbnail-removebg-preview.png"));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ver Personajes");
		btnNewButton.setBounds(147, 188, 145, 23);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Courier New", Font.PLAIN, 13));
		contentPane.add(btnNewButton);
	}
}
