
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
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;

import java.awt.Color;

import javax.swing.SpinnerNumberModel;

import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class GUI_Hauptfenster extends JFrame {
	private static final long serialVersionUID = 1L;
	static JComboBox <String> pizza_Liste = new JComboBox <String>();
	JSpinner MengePizza = new JSpinner();
	static JComboBox <String>getränke_Liste = new JComboBox<String>();
	JSpinner MengeGetränke = new JSpinner();
	
	private JPanel contentPane;
	static GUI_EigenePizza frame;
	static GUI_Hauptfenster frame2;
	JButton btnMusikStoppen = new JButton("Musik stoppen");
	JButton btnMusikNeuAbspielen = new JButton("Musik neu abspielen");
	static JTable table;
	private final JButton btnPizzaHinzufgen = new JButton("Hinzuf\u00FCgen");
	private final JButton btnHinzufgen = new JButton("Hinzuf\u00FCgen");
	private static JLabel lblNewLabel = new JLabel();
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();
	private final JSeparator separator_4 = new JSeparator();
	
	public GUI_Hauptfenster() {
		setResizable(false);
		setBackground(Color.WHITE);
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL resource = loader.getResource("Bilder/facemario.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(resource));
		setTitle("Super Mario Pizza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 20, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		btnMusikStoppen.setBounds(158, 646, 150, 15);
		btnMusikStoppen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI.sound_background.close();
				GUI.sound_background.stop();
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
					GUI.backgroundsound();
				} catch (Exception e1) {}
			}
		});
		btnMusikNeuAbspielen.setBounds(0, 646, 150, 15);
		contentPane.add(btnMusikNeuAbspielen);
		
		
		btnHinzufgen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					getränkeHinzufügen();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ZwischenpreisRechnung();
			}
		});
		btnHinzufgen.setBounds(293, 220, 140, 43);
		contentPane.add(btnHinzufgen);
		btnPizzaHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					pizzaHinzufügen();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ZwischenpreisRechnung();
			}
			
		});
		btnPizzaHinzufgen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnPizzaHinzufgen.setBounds(23, 220, 140, 43);
		
		contentPane.add(btnPizzaHinzufgen);
		
		JButton btnEigenePizzaErstellen = new JButton("Erstellen");
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
		btnEigenePizzaErstellen.setBounds(583, 220, 140, 43);
		contentPane.add(btnEigenePizzaErstellen);
		
		JButton btnBetellungAbgeben = new JButton("Weiter\r\n");
		btnBetellungAbgeben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					GUI_Ausgabe.FensterErstellen();
					
					try {
						GUI.bestellensound();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
							
							
			}
		});		btnBetellungAbgeben.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 20));
		
		btnBetellungAbgeben.setBounds(595, 583, 204, 47);
		contentPane.add(btnBetellungAbgeben);
		MengePizza.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		
		
		MengePizza.setBounds(194, 188, 29, 20);
		contentPane.add(MengePizza);
		MengeGetränke.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		
		
		MengeGetränke.setBounds(464, 188, 29, 20);
		contentPane.add(MengeGetränke);
		
		JButton btnAktuelleAuswahlEntfernen = new JButton("Aktuelle Auswahl entfernen");
		btnAktuelleAuswahlEntfernen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Entfernt Eintrag aus Liste
				DefaultTableModel model = (DefaultTableModel) GUI_Hauptfenster.table.getModel();
				if(GUI_Hauptfenster.table.getSelectedRow() == -1){
					if(GUI_Hauptfenster.table.getRowCount() == 0){
						
						JOptionPane.showMessageDialog(new JFrame(), "Die Liste is leer", "Halt Stop", JOptionPane.WARNING_MESSAGE);
						
					}else{ 
						JOptionPane.showMessageDialog(new JFrame(), "Sie müssen einen Eintrag auswählen", "Halt Stop!", JOptionPane.WARNING_MESSAGE);	
					}
						
				}else{
					int index=table.getSelectedRow();
					GUI.li_Rechnung.remove(index);
					model.removeRow(table.getSelectedRow());
					GUI_Hauptfenster.ZwischenpreisRechnung();
										try {
						GUI.removesound();
					} catch (Exception e) {}
				}
			}
			
		});
		btnAktuelleAuswahlEntfernen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnAktuelleAuswahlEntfernen.setBounds(35, 516, 239, 43);
		contentPane.add(btnAktuelleAuswahlEntfernen);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setText("0,00\u20AC");
		
		
				
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(730, 535, 128, 37);
		contentPane.add(lblNewLabel);
			 
		

		
		pizza_Liste.setBounds(23, 189, 161, 20);
	// füllen der JComboBox pizza_Liste
		speisenLaden();
		
		contentPane.add(pizza_Liste);
		
		
		
		getränke_Liste.setBounds(293, 188, 161, 20);
	// füllen der JComboBox getränke Liste
		getränkeLaden();
		contentPane.add(getränke_Liste);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 317, 764, 198);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(Color.WHITE);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {,},
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
		
		JLabel lblPizzaHinzufgen = new JLabel("Pizza hinzuf\u00FCgen:");
		lblPizzaHinzufgen.setForeground(Color.BLACK);
		lblPizzaHinzufgen.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 18));
		lblPizzaHinzufgen.setBounds(23, 145, 156, 29);
		contentPane.add(lblPizzaHinzufgen);
		
		JLabel lblGetrnkHinzufgen = new JLabel("Getr\u00E4nk hinzuf\u00FCgen:");
		lblGetrnkHinzufgen.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 18));
		lblGetrnkHinzufgen.setBounds(293, 145, 202, 29);
		contentPane.add(lblGetrnkHinzufgen);
		
		JLabel lblEigenePizzaErstellen = new JLabel("Eigene Pizza erstellen:");
		lblEigenePizzaErstellen.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 18));
		lblEigenePizzaErstellen.setBounds(583, 145, 187, 29);
		contentPane.add(lblEigenePizzaErstellen);
		
		JLabel lblGesamtpreis = new JLabel("Gesamtpreis:");
		lblGesamtpreis.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 20));
		lblGesamtpreis.setBounds(595, 537, 128, 37);
		contentPane.add(lblGesamtpreis);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(246, 93, 216, -58);
		contentPane.add(separator);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(265, 123, 15, 164);
		
		contentPane.add(separator_1);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(0, 123, 844, 20);
		
		contentPane.add(separator_2);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(528, 123, 15, 164);
		
		contentPane.add(separator_3);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(0, 286, 844, 20);
		
		contentPane.add(separator_4);
		
		JLabel lblwhlenSieIhre = new JLabel("(W\u00E4hlen Sie ihre eigenen Zutaten aus)");
		lblwhlenSieIhre.setFont(new Font("Constantia", Font.PLAIN, 13));
		lblwhlenSieIhre.setBounds(583, 189, 222, 18);
		contentPane.add(lblwhlenSieIhre);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GUI_Hauptfenster.class.getResource("/Bilder/PizzaOfen2.png")));
		label.setBounds(454, 522, 131, 127);
		contentPane.add(label);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(457);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
	}
	
	//Gibt ZwischenPreis in GUI_Hauptfenster an
	public static void ZwischenpreisRechnung() {
		String string_preis = null;
		double double_preis = 0;
		double zwischensumme = 0;
		
		for (int i=-1;i<table.getRowCount()-1;i++){
			string_preis = (String)table.getValueAt(i+1,2);
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
	/** pizzaHinzufügen()
	 * die ausgewählte Pizza soll in die Tabelle eingefügt werden	 
	 * @author Yannik
	 *  
	 */
	void pizzaHinzufügen() throws Exception{
		int auswahl = pizza_Liste.getSelectedIndex() - 1;		//-1 da das erste Element nicht ausgewählt werden darf
		if(auswahl<0){
			JOptionPane.showMessageDialog(new JFrame(), "Bitte wählen sie eine Pizza aus", "Halt  Stop!", JOptionPane.WARNING_MESSAGE);
			return;
		}
		int anzahl = (int)MengePizza.getValue();
		
		GUI_Hauptfenster.table.setSize((int)GUI_Hauptfenster.table.getBounds().getWidth(), (int)GUI_Hauptfenster.table.getBounds().getHeight() + GUI_Hauptfenster.table.getRowHeight());
		GUI.li_Rechnung.add(GUI.li_speisekarte.get(auswahl));
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[]{GUI.li_speisekarte.get(auswahl).name, anzahl, Eigene_Pizza.format(Double.parseDouble((GUI.li_speisekarte.get(auswahl).preis)) * anzahl) + "€"});
		GUI.hinzufuegensound();
		
		
		
		
	}
	/** getränkeHinzufügen
	 * das ausgewählte Getränk soll in die Tabelle eingefügt werden
	 * @author Yannik 
	 * 
	 */
	void getränkeHinzufügen() throws Exception{
		int auswahl = getränke_Liste.getSelectedIndex() - 1; //-1 da das erste Element nicht ausgewählt werden soll
		if(auswahl<0){
			JOptionPane.showMessageDialog(new JFrame(), "Bitte wählen sie ein Getränk aus", "Halt  Stop!", JOptionPane.WARNING_MESSAGE);
			return;
		}
		int anzahl = (int)MengeGetränke.getValue();
		
		GUI_Hauptfenster.table.setSize((int)GUI_Hauptfenster.table.getBounds().getWidth(), (int)GUI_Hauptfenster.table.getBounds().getHeight() + GUI_Hauptfenster.table.getRowHeight());
		GUI.li_Rechnung.add(GUI.li_getraenkekarte.get(auswahl));
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[]{GUI.li_getraenkekarte.get(auswahl).name, anzahl, Eigene_Pizza.format(Double.parseDouble((GUI.li_getraenkekarte.get(auswahl).preis)) * anzahl) + "€"});
		
		GUI.hinzufuegensound();
	}
	/** speisenLaden
	 * die Speisen aus der Liste sollen in die JComboBox geladen werden
	 * @author Yannik
	 */
	void speisenLaden(){
		Pizza PizzaAuswahl = new Pizza("-- Bitte wählen sie --", "", 1);
		pizza_Liste.addItem(PizzaAuswahl.name);
		
		for(int i = 0; i < GUI.li_speisekarte.size(); i++){
			pizza_Liste.addItem(GUI.li_speisekarte.get(i).name);
		}
	}
	/** getränkeLaden
	 * die Getränke aus der Liste sollen in die JComboBox geladen werden
	 * @author Yannik
	 */
	void getränkeLaden(){
		Getränke GetraenkeAuswahl = new Getränke("-- Bitte wählen sie --", "0.00", 0.00);
		getränke_Liste.addItem(GetraenkeAuswahl.name);
		
		for(int i = 0; i < GUI.li_getraenkekarte.size(); i++){
			getränke_Liste.addItem(GUI.li_getraenkekarte.get(i).name);
		}
	}
}

