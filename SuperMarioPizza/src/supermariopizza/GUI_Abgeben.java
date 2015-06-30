package supermariopizza;


import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;

import java.awt.Color;
import java.net.URL;

import javax.swing.ImageIcon;

public class GUI_Abgeben extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Abgeben() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Abgeben frame = new GUI_Abgeben();
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
	public GUI_Abgeben() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL resource = loader.getResource("Bilder/facemario.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(resource));
		setBounds(300, 20, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreators = new JLabel("\u00A9 By Tobias Rackow, Daniel Vo\u00DF, Luitpold Stotzem and Yannik Fuhrmeister");
		lblCreators.setBounds(0, 258, 444, 14);
		contentPane.add(lblCreators);
		
		JLabel lblVielenDankFr = new JLabel("Vielen Dank f\u00FCr ihre Bestellung");
		lblVielenDankFr.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 25));
		lblVielenDankFr.setBounds(38, 11, 366, 49);
		contentPane.add(lblVielenDankFr);
		
		JButton btnEnde = new JButton("ENDE");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.sound_background.close();
				GUI.sound_background.stop();
				try {
					GUI.endesound();
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				try {
					Thread.sleep(2850);
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 19));
		btnEnde.setBounds(141, 176, 162, 49);
		contentPane.add(btnEnde);
		
		JLabel lblRechnung = new JLabel("(Ihre Rechnung wurde auf dem Desktop abgelegt)");
		if(GUI_Ausgabe.chckbxSpeichern.isSelected() == false){
			lblRechnung.setText("");
		}
		lblRechnung.setFont(new Font("Constantia", Font.PLAIN, 18));
		lblRechnung.setBounds(32, 71, 402, 23);
		contentPane.add(lblRechnung);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(38, 57, 366, 13);
		contentPane.add(separator);
		
		JLabel lblPizza_left = new JLabel("");
		lblPizza_left.setIcon(new ImageIcon(GUI_Abgeben.class.getResource("/Bilder/Pizza.png")));
		lblPizza_left.setBounds(0, 134, 131, 138);
		contentPane.add(lblPizza_left);
		
		JLabel lblPizza_right = new JLabel("");
		lblPizza_right.setIcon(new ImageIcon(GUI_Abgeben.class.getResource("/Bilder/Pizza.png")));
		lblPizza_right.setBounds(313, 134, 131, 138);
		contentPane.add(lblPizza_right);
	}
}
