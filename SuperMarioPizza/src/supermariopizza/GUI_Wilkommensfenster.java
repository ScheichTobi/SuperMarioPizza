package supermariopizza;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class GUI_Wilkommensfenster extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Wilkommen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Wilkommensfenster frame = new GUI_Wilkommensfenster();
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
	public GUI_Wilkommensfenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\t\t\t\t\t\t\tWilkommen bei Super Mario Pizza");
		lblNewLabel.setFont(new Font("Constantia", Font.ITALIC, 25));
		lblNewLabel.setBounds(25, 21, 399, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblWollenSieEine = new JLabel("Wollen sie eine Bestellung t\u00E4tigen?");
		lblWollenSieEine.setFont(new Font("Constantia", Font.ITALIC, 14));
		lblWollenSieEine.setBounds(91, 89, 215, 24);
		contentPane.add(lblWollenSieEine);
		
		JLabel lblDannDrckenSie = new JLabel("Dann dr\u00FCcken sie auf Weiter");
		lblDannDrckenSie.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblDannDrckenSie.setBounds(104, 124, 190, 14);
		contentPane.add(lblDannDrckenSie);
		
		JButton btnWeiter = new JButton("Weiter");
		btnWeiter.setBounds(170, 185, 89, 23);
		contentPane.add(btnWeiter);
	}
}
