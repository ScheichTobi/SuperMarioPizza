
package supermariopizza;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Choice;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.JLabel;

public class GUI_Hauptfenster extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	JButton btnMusikStoppen = new JButton("Musik stoppen");
	JButton btnMusikNeuAbspielen = new JButton("Musik neu abspielen");
	private JTable table;
	private final JButton btnPizzaHinzufgen = new JButton("Pizza hinzuf\u00FCgen");
	public GUI_Hauptfenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		btnMusikStoppen.setBounds(158, 646, 150, 15);
		btnMusikStoppen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.Mario.close();
				GUI.Mario.stop();
				btnMusikStoppen.setEnabled(false);
				btnMusikNeuAbspielen.setEnabled(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnMusikStoppen);
		
		
		btnMusikNeuAbspielen.setEnabled(false);
		btnMusikNeuAbspielen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMusikNeuAbspielen.setEnabled(false);
				btnMusikStoppen.setEnabled(true);
				try {
					GUI.sound();
				} catch (Exception e1) {}
			}
		});
		btnMusikNeuAbspielen.setBounds(0, 646, 150, 15);
		contentPane.add(btnMusikNeuAbspielen);
		
		table = new JTable();
		String Name;
		String St�ckzahl;
		String Preis;
		
		Name="Name";
		St�ckzahl="St�ckzahl";
		Preis="Preis";
		table.setModel(new DefaultTableModel(
				
				
			new Object[][] {
				{Name, St�ckzahl, Preis},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Name", "St\u00FCckzahl", "Preis"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(457);
		table.setBounds(22, 224, 772, 320);
		contentPane.add(table);
		
		JButton btnHinzufgen = new JButton("Getr�nk Hinzuf\u00FCgen");
		btnHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHinzufgen.setBounds(542, 98, 140, 30);
		contentPane.add(btnHinzufgen);
		btnPizzaHinzufgen.setBounds(75, 98, 140, 30);
		
		contentPane.add(btnPizzaHinzufgen);
		
		Choice Getr�nke_Liste = new Choice();
		Getr�nke_Liste.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Getr�nke_Liste.setBounds(478, 72, 250, 20);
		contentPane.add(Getr�nke_Liste);
		
		Choice Pizza_Liste = new Choice();
		Pizza_Liste.setBounds(22, 72, 250, 20);
		contentPane.add(Pizza_Liste);
		
		JButton btnEigenePizzaErstellen = new JButton("Eigene Pizza erstellen");
		btnEigenePizzaErstellen.setBounds(307, 147, 140, 30);
		contentPane.add(btnEigenePizzaErstellen);
		
		JButton btnBetellungAbgeben = new JButton("Betellung abgeben");
		btnBetellungAbgeben.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBetellungAbgeben.setBounds(627, 620, 197, 30);
		contentPane.add(btnBetellungAbgeben);
		
		JSpinner MengePizza = new JSpinner();
		MengePizza.setBounds(289, 72, 29, 20);
		contentPane.add(MengePizza);
		
		JSpinner MengeGetr�nke = new JSpinner();
		MengeGetr�nke.setBounds(749, 72, 29, 20);
		contentPane.add(MengeGetr�nke);
		
		JButton btnAktuelleAuswahlEntfernen = new JButton("Aktuelle Auswahl entfernen");
		btnAktuelleAuswahlEntfernen.setBounds(22, 555, 280, 30);
		contentPane.add(btnAktuelleAuswahlEntfernen);
		
		JLabel lblNewLabel = new JLabel("Zwischenprei\u00DF\r\n");
		lblNewLabel.setBounds(666, 555, 128, 37);
		contentPane.add(lblNewLabel);
		
		
	}
}
