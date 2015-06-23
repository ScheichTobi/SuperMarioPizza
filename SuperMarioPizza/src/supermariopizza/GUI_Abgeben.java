package supermariopizza;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 20, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVielenDankFr = new JLabel("Vielen Dank f\u00FCr ihre Bestellung");
		lblVielenDankFr.setFont(new Font("Constantia", Font.ITALIC, 26));
		lblVielenDankFr.setBounds(35, 11, 377, 49);
		contentPane.add(lblVielenDankFr);
		
		JButton btnEnde = new JButton("ENDE");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Constantia", Font.ITALIC, 17));
		btnEnde.setBounds(121, 202, 175, 49);
		contentPane.add(btnEnde);
		
		JLabel lblRechnung = new JLabel("(Ihre Rechnung wurde auf dem Desktop abgelegt)");
		if(GUI_Ausgabe.chckbxSpeichern.isSelected() == false){
			lblRechnung.setText("");
		}
		lblRechnung.setFont(new Font("Constantia", Font.PLAIN, 18));
		lblRechnung.setBounds(22, 81, 402, 23);
		contentPane.add(lblRechnung);
	}
}
