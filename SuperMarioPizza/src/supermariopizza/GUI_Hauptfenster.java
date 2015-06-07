
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
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;

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
		String Stückzahl;
		String Preis;
		
		Name="Name";
		Stückzahl="Stückzahl";
		Preis="Preis";
		table.setModel(new DefaultTableModel(
				
				
			new Object[][] {
				{Name, Stückzahl, Preis},
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
		
		JButton btnHinzufgen = new JButton("Getränk Hinzuf\u00FCgen");
		btnHinzufgen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHinzufgen.setBounds(542, 98, 140, 30);
		contentPane.add(btnHinzufgen);
		btnPizzaHinzufgen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnPizzaHinzufgen.setBounds(75, 98, 140, 30);
		
		contentPane.add(btnPizzaHinzufgen);
		
		JButton btnEigenePizzaErstellen = new JButton("Eigene Pizza erstellen");
		btnEigenePizzaErstellen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnEigenePizzaErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Erstellung der GUI_Hauptfenster
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GUI_EigenePizza frame = new GUI_EigenePizza();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnEigenePizzaErstellen.setBounds(302, 147, 150, 30);
		contentPane.add(btnEigenePizzaErstellen);
		
		JButton btnBetellungAbgeben = new JButton("Betellung abgeben");
		btnBetellungAbgeben.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnBetellungAbgeben.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBetellungAbgeben.setBounds(627, 620, 197, 30);
		contentPane.add(btnBetellungAbgeben);
		
		JSpinner MengePizza = new JSpinner();
		MengePizza.setBounds(289, 72, 29, 20);
		contentPane.add(MengePizza);
		
		JSpinner MengeGetränke = new JSpinner();
		MengeGetränke.setBounds(749, 72, 29, 20);
		contentPane.add(MengeGetränke);
		
		JButton btnAktuelleAuswahlEntfernen = new JButton("Aktuelle Auswahl entfernen");
		btnAktuelleAuswahlEntfernen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnAktuelleAuswahlEntfernen.setBounds(22, 555, 280, 30);
		contentPane.add(btnAktuelleAuswahlEntfernen);
		
		JLabel lblNewLabel = new JLabel("Zwischenpreis\r\n");
		lblNewLabel.setFont(new Font("Constantia", Font.ITALIC, 12));
		lblNewLabel.setBounds(666, 555, 128, 37);
		contentPane.add(lblNewLabel);
		
		JComboBox <String> pizza_Liste = new JComboBox <String>();
		pizza_Liste.setBounds(23, 72, 256, 20);
	// füllen der JComboBox pizza_Liste
		for(int i = 0; i < GUI.li_speisekarte.size(); i++){
			pizza_Liste.addItem(GUI.li_speisekarte.get(i).name);
		}
		
		contentPane.add(pizza_Liste);
		
		
		JComboBox <String>getränke_Liste = new JComboBox<String>();
		getränke_Liste.setBounds(479, 72, 256, 20);
	// füllen der JComboBox getränke Liste
		for(int i = 0; i < GUI.li_getraenkekarte.size(); i++){
			getränke_Liste.addItem(GUI.li_getraenkekarte.get(i).name);
		}
		contentPane.add(getränke_Liste);
		
		
	}
		
}
