
package supermariopizza;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;

import java.awt.Color;


public class GUI_Hauptfenster extends JFrame {
	private static final long serialVersionUID = 1L;
	static JComboBox <String> pizza_Liste = new JComboBox <String>();
	JSpinner MengePizza = new JSpinner();
	static JComboBox <String>getränke_Liste = new JComboBox<String>();
	JSpinner MengeGetränke = new JSpinner();
	
	private JPanel contentPane;
	static GUI_EigenePizza frame;
	JButton btnMusikStoppen = new JButton("Musik stoppen");
	JButton btnMusikNeuAbspielen = new JButton("Musik neu abspielen");
	static JTable table;
	private final JButton btnPizzaHinzufgen = new JButton("Pizza hinzuf\u00FCgen");
	private final JButton btnHinzufgen = new JButton("Getränk Hinzuf\u00FCgen");
	private static JLabel lblNewLabel = new JLabel();
	
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
		table.setBackground(Color.WHITE);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "St\u00FCckzahl", "Preis"},
			},
			new String[] {
				"Name", "St\u00FCckzahl", "Preis"
			}
		) {
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(457);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.setBounds(22, 224, 772, 15);
		contentPane.add(table);
		
		
		btnHinzufgen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO
				int auswahl = getränke_Liste.getSelectedIndex();
				int anzahl = (int)MengeGetränke.getValue();
				if(anzahl < 1){
					JOptionPane.showMessageDialog(new JFrame(), "Sie müssen mindestens ein Getränk bestellen", "Halt Stop!", JOptionPane.WARNING_MESSAGE);
					return;
				}
				GUI_Hauptfenster.table.setSize((int)GUI_Hauptfenster.table.getBounds().getWidth(), (int)GUI_Hauptfenster.table.getBounds().getHeight() + GUI_Hauptfenster.table.getRowHeight());
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{GUI.li_getraenkekarte.get(auswahl).name, anzahl, Integer.parseInt((GUI.li_getraenkekarte.get(auswahl).preis)) * anzahl + "€"});
				
			}
		});
		btnHinzufgen.setBounds(542, 98, 140, 30);
		contentPane.add(btnHinzufgen);
		btnPizzaHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO
				int auswahl = pizza_Liste.getSelectedIndex();
				int anzahl = (int)MengePizza.getValue();
				if(anzahl < 1){
					JOptionPane.showMessageDialog(new JFrame(), "Sie müssen mindestens eine Pizza bestellen", "Halt Stop!", JOptionPane.WARNING_MESSAGE);
					return;
				}
				GUI_Hauptfenster.table.setSize((int)GUI_Hauptfenster.table.getBounds().getWidth(), (int)GUI_Hauptfenster.table.getBounds().getHeight() + GUI_Hauptfenster.table.getRowHeight());
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{GUI.li_speisekarte.get(auswahl).name, anzahl, Integer.parseInt((GUI.li_speisekarte.get(auswahl).preis)) * anzahl + "€"});
				
			}
		});
		btnPizzaHinzufgen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnPizzaHinzufgen.setBounds(75, 98, 140, 30);
		
		contentPane.add(btnPizzaHinzufgen);
		
		JButton btnEigenePizzaErstellen = new JButton("Eigene Pizza erstellen");
		btnEigenePizzaErstellen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnEigenePizzaErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Erstellung der GUI_Hauptfenster
				
				//Zurücksetzen des GUI_EigenePizza
				GUI_EigenePizza.chb_ananas.setSelected(false);
				GUI_EigenePizza.chb_zwiebeln.setSelected(false);
				GUI_EigenePizza.chb_paprika.setSelected(false);
				GUI_EigenePizza.chb_sardellen.setSelected(false);
				GUI_EigenePizza.chb_meeresfruechte.setSelected(false);
				GUI_EigenePizza.chb_schinken.setSelected(false);
				GUI_EigenePizza.chb_peperoni.setSelected(false);
				GUI_EigenePizza.chb_salami.setSelected(false);
				GUI_EigenePizza.chb_rucola.setSelected(false);
				GUI_EigenePizza.chb_pilze.setSelected(false);
				GUI_EigenePizza.sp_pizzamenge.setValue(1);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frame = new GUI_EigenePizza();
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
		
		btnBetellungAbgeben.setBounds(627, 620, 197, 30);
		contentPane.add(btnBetellungAbgeben);
		
		
		MengePizza.setBounds(289, 72, 29, 20);
		contentPane.add(MengePizza);
		
		
		MengeGetränke.setBounds(749, 72, 29, 20);
		contentPane.add(MengeGetränke);
		
		JButton btnAktuelleAuswahlEntfernen = new JButton("Aktuelle Auswahl entfernen");
		btnAktuelleAuswahlEntfernen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnAktuelleAuswahlEntfernen.setBounds(22, 555, 280, 30);
		contentPane.add(btnAktuelleAuswahlEntfernen);
		lblNewLabel.setText("0,00\u20AC");
		
		
				
		lblNewLabel.setFont(new Font("Constantia", Font.ITALIC, 20));
		lblNewLabel.setBounds(666, 555, 128, 37);
		contentPane.add(lblNewLabel);
			 
		

		
		pizza_Liste.setBounds(23, 72, 256, 20);
	// füllen der JComboBox pizza_Liste
		for(int i = 0; i < GUI.li_speisekarte.size(); i++){
			pizza_Liste.addItem(GUI.li_speisekarte.get(i).name);
		}
		
		contentPane.add(pizza_Liste);
		
		
		
		getränke_Liste.setBounds(479, 72, 256, 20);
	// füllen der JComboBox getränke Liste
		for(int i = 0; i < GUI.li_getraenkekarte.size(); i++){
			getränke_Liste.addItem(GUI.li_getraenkekarte.get(i).name);
		}
		contentPane.add(getränke_Liste);
	}
	
	//Gibt ZwischenPreis in GUI_Hauptfenster an
	public static void ZwischenpreisRechnung() {
		String string_preis = null;
		double double_preis = 0;
		double zwischensumme = 0;
		
		for (int i=0;i<table.getRowCount() - 1;i++){
			string_preis = (String)table.getValueAt(i + 1,2);
			double_preis = TabellenPreisUmwandeln(string_preis);
			zwischensumme += double_preis;
		}
		String zwischensumme_formatiert = String.valueOf(zwischensumme);
		zwischensumme_formatiert = Eigene_Pizza.format(zwischensumme);
		lblNewLabel.setText(zwischensumme_formatiert + "€");
	}
	
	//Konvertiert String von Tabelle in einen double-Wert z.B "6,50€" -> 6.5
	public static double TabellenPreisUmwandeln(String param){
		double returnwert;
			param = param.substring(0,param.indexOf('€'));
			param = param.replace(",",".");
			returnwert = Double.parseDouble(param);
		return returnwert;
	}
}

