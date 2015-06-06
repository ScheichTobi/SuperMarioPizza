package supermariopizza;



import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class GUI_Hauptfenster extends JFrame {

	private JPanel contentPane;

	public GUI_Hauptfenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnMusikStoppen = new JButton("Musik stoppen");
		btnMusikStoppen.setBounds(10, 11, 165, 46);
		btnMusikStoppen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.myClip.stop();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnMusikStoppen);
		
		JButton btnMusikNeuAbspielen = new JButton("Musik neu abspielen");
		btnMusikNeuAbspielen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI.sound();
				} catch (Exception e1) {}
			}
		});
		btnMusikNeuAbspielen.setBounds(199, 11, 200, 50);
		contentPane.add(btnMusikNeuAbspielen);
		
		
	}
}
