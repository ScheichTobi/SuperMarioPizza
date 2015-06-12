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
import java.io.File;
import java.io.IOException;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("facemario.png"));
		setTitle("Willkommen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 20, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\t\t\t\t\t\t\tWilkommen bei Super Mario Pizza");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 25));
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
		btnWeiter.setBounds(170, 185, 89, 23);
		contentPane.add(btnWeiter);
	}
	public static void weitersound() throws Exception{
		//Musik erstellen
        try {
            File weitersound = new File("weitersound.wav");
            sound_weiter = AudioSystem.getClip();
            sound_weiter.open(AudioSystem.getAudioInputStream(weitersound));
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
