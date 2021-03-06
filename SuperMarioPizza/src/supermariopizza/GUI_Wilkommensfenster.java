package supermariopizza;

import java.awt.EventQueue;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class GUI_Wilkommensfenster extends JFrame {
	public static Clip sound_weiter;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static GUI_Wilkommensfenster frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new GUI_Wilkommensfenster();
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
		setResizable(false);
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL resource3 = loader.getResource("Bilder/facemario.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(resource3));
		setTitle("Willkommen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 20, 494, 341);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\t\t\t\t\t\t\tWillkommen bei Super Mario Pizza");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(32, 21, 414, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblWollenSieEine = new JLabel("Wollen Sie eine saftige und knusprige Pizza bestellen?");
		lblWollenSieEine.setFont(new Font("Constantia", Font.ITALIC, 14));
		lblWollenSieEine.setBounds(85, 89, 361, 24);
		contentPane.add(lblWollenSieEine);
		
		JLabel lblDannDrckenSie = new JLabel("Dann dr\u00FCcken sie auf Weiter");
		lblDannDrckenSie.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblDannDrckenSie.setBounds(146, 127, 190, 14);
		contentPane.add(lblDannDrckenSie);
		
		JButton btnWeiter = new JButton("Weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					weitersound();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					GUI.fensteroeffnen();
				} catch (Exception e1) {}
				frame.setVisible(false);
				frame.dispose();
				
			}
		});
		btnWeiter.setBounds(186, 184, 89, 23);
		contentPane.add(btnWeiter);
		
		JLabel MarioL = new JLabel("");
    	MarioL.setIcon(new ImageIcon(GUI_Wilkommensfenster.class.getResource("/Bilder/MarioL.png")));
		MarioL.setBounds(0, 103, 160, 209);
		contentPane.add(MarioL);
		
		JLabel MarioR = new JLabel("");
    	MarioR.setIcon(new ImageIcon(GUI_Wilkommensfenster.class.getResource("/Bilder/MarioR.png")));
		MarioR.setBounds(328, 103, 160, 209);
		contentPane.add(MarioR);
	}
	public static void weitersound() throws Exception{
		//Musik erstellen
        try {
        	ClassLoader loader = Thread.currentThread().getContextClassLoader();
        	URL resource = loader.getResource("Sounds/weitersound.wav");
            sound_weiter = AudioSystem.getClip();
            sound_weiter.open(AudioSystem.getAudioInputStream(resource));
            sound_weiter.start();
        //Lautstärke
            FloatControl gainControl = (FloatControl) sound_weiter.getControl(FloatControl.Type.MASTER_GAIN);
                double gain = .25D;
                float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
                gainControl.setValue(dB);

                BooleanControl muteControl = (BooleanControl) sound_weiter
                    .getControl(BooleanControl.Type.MUTE);
                muteControl.setValue(true);

                muteControl.setValue(false);
            }catch (IOException e){}      
		
	}
}
