package supermariopizza;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Hauptfenster extends JFrame {

	private JPanel contentPane;
	JButton btnMusikStoppen = new JButton("Musik stoppen");
	JButton btnMusikNeuAbspielen = new JButton("Musik neu abspielen");
	JButton btnNextSong = new JButton("Naechster Song");
	public GUI_Hauptfenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		btnMusikStoppen.setBounds(10, 11, 165, 46);
		btnMusikStoppen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.Mario.close();
				GUI.Mario.stop();
				GUI.Money.close();
				GUI.Money.stop();
				GUI.Spongy.close();
				GUI.Spongy.stop();
				btnMusikStoppen.setEnabled(false);
				btnNextSong.setEnabled(true);
				//btnMusikNeuAbspielen.setEnabled(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnMusikStoppen);
		
		
		btnMusikNeuAbspielen.setEnabled(false);
		btnMusikNeuAbspielen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				btnMusikStoppen.setEnabled(true);
				try {
					GUI.sound();
				} catch (Exception e1) {}
			}
		});
		btnMusikNeuAbspielen.setBounds(199, 11, 200, 50);
		contentPane.add(btnMusikNeuAbspielen);
		btnNextSong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					GUI.sound();
				} catch (Exception e1) {}
			}
		});
		btnNextSong.setBounds(20, 112, 200, 50);
		
		contentPane.add(btnNextSong);
		
		
	}
}
