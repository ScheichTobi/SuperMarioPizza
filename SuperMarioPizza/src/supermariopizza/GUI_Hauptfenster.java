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
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnMusikStoppen = new JButton("Musik stoppen");
		btnMusikStoppen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.myClip.stop();
			}
		});
		contentPane.add(btnMusikStoppen);
		
		
	}
}
