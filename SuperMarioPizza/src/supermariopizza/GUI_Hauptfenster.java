
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

import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;



import java.awt.Color;
import java.awt.SystemColor;

public class GUI_Hauptfenster extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	static GUI_EigenePizza frame;
	JButton btnMusikStoppen = new JButton("Musik stoppen");
	JButton btnMusikNeuAbspielen = new JButton("Musik neu abspielen");
	static JTable table;
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
		
		JButton btnHinzufgen = new JButton("Getr�nk Hinzuf\u00FCgen");
		btnHinzufgen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO
			}
		});
		btnHinzufgen.setBounds(542, 98, 140, 30);
		contentPane.add(btnHinzufgen);
		btnPizzaHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO
				//String name = pizza_Liste....;
				//DefaultTableModel model = (DefaultTableModel) table.getModel();
				//model.addRow(new Object[]{GUI.li_speisekarte.get(0).name, GUI.li_speisekarte.get(0).anzahl, GUI.li_speisekarte.get(0).preis + "�"});
				
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
				
				//Zur�cksetzen des GUI_EigenePizza
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
		
		JSpinner MengePizza = new JSpinner();
		MengePizza.setBounds(289, 72, 29, 20);
		contentPane.add(MengePizza);
		
		JSpinner MengeGetr�nke = new JSpinner();
		MengeGetr�nke.setBounds(749, 72, 29, 20);
		contentPane.add(MengeGetr�nke);
		
		JButton btnAktuelleAuswahlEntfernen = new JButton("Aktuelle Auswahl entfernen");
		btnAktuelleAuswahlEntfernen.setFont(new Font("Constantia", Font.ITALIC, 12));
		btnAktuelleAuswahlEntfernen.setBounds(22, 555, 280, 30);
		contentPane.add(btnAktuelleAuswahlEntfernen);
		
		
		JLabel lblNewLabel = new JLabel(ZwischenpreisRechnung());		
		lblNewLabel.setFont(new Font("Constantia", Font.ITALIC, 12));
		lblNewLabel.setBounds(666, 555, 128, 37);
		contentPane.add(lblNewLabel);
			 
		

		JComboBox <String> pizza_Liste = new JComboBox <String>();
		pizza_Liste.setBounds(23, 72, 256, 20);
	// f�llen der JComboBox pizza_Liste
		for(int i = 0; i < GUI.li_speisekarte.size(); i++){
			pizza_Liste.addItem(GUI.li_speisekarte.get(i).name);
		}
		
		contentPane.add(pizza_Liste);
		
		
		JComboBox <String>getr�nke_Liste = new JComboBox<String>();
		getr�nke_Liste.setBounds(479, 72, 256, 20);
	// f�llen der JComboBox getr�nke Liste
		for(int i = 0; i < GUI.li_getraenkekarte.size(); i++){
			getr�nke_Liste.addItem(GUI.li_getraenkekarte.get(i).name);
		}
		contentPane.add(getr�nke_Liste);
		

		
	}
	private String ZwischenpreisRechnung() {
		String Ergebnis="0";
		
		
		for (int i=2;i<=table.getRowCount()-1;i++){
		
			Ergebnis= (String) table.getValueAt(i,3) + (String) table.getValueAt(i++,3);
			}
		
		return Ergebnis;
	}
		


	}



