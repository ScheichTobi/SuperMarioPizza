package supermariopizza;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JSpinner;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI_EigenePizza extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel EigenePizzaGui;
	static JTextField txt_pizzaname;


	static JCheckBox chb_zwiebeln = new JCheckBox("Zwiebeln");
	static JCheckBox chb_pilze = new JCheckBox("Pilze");
	static JCheckBox chb_schinken = new JCheckBox("Schinken");
	static JCheckBox chb_salami = new JCheckBox("Salami");
	static JCheckBox chb_sardellen = new JCheckBox("Sardellen");
	static JCheckBox chb_paprika = new JCheckBox("Paprika");
	static JCheckBox chb_meeresfruechte = new JCheckBox("Meeresfr\u00FCchte");
	static JCheckBox chb_peperoni = new JCheckBox("Peperoni");
	static JCheckBox chb_ananas = new JCheckBox("Ananas");
	static JCheckBox chb_rucola = new JCheckBox("Rucola");
	static JSpinner sp_pizzamenge = new JSpinner();
	static JLabel lbl_pizzapreisanzeige = new JLabel("5,00\u20AC");
	
	
	public GUI_EigenePizza() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 500, 850, 538);
		EigenePizzaGui = new JPanel();
		EigenePizzaGui.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(EigenePizzaGui);
		EigenePizzaGui.setLayout(null);
		
		chb_ananas.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_rucola.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_meeresfruechte.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_schinken.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_peperoni.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_paprika.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_pilze.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_salami.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_sardellen.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_zwiebeln.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		        Eigene_Pizza.PreisErmitteln();
		      }
		    });
		ChangeListener listener = new ChangeListener() {
		      public void stateChanged(ChangeEvent e) {
		    	Eigene_Pizza.AnzahlErmitteln();
		        Eigene_Pizza.PreisErmitteln();
		    }

		};
		sp_pizzamenge.addChangeListener(listener);
		
		chb_zwiebeln.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_zwiebeln.setBounds(94, 119, 144, 23);
		EigenePizzaGui.add(chb_zwiebeln);
		
		
		chb_pilze.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_pilze.setBounds(94, 159, 97, 23);
		EigenePizzaGui.add(chb_pilze);
		
		
		chb_schinken.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_schinken.setBounds(94, 205, 144, 23);
		EigenePizzaGui.add(chb_schinken);
		
		
		chb_salami.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_salami.setBounds(94, 251, 97, 23);
		EigenePizzaGui.add(chb_salami);
		
		
		chb_sardellen.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_sardellen.setBounds(94, 302, 122, 23);
		EigenePizzaGui.add(chb_sardellen);
		
		
		chb_paprika.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_paprika.setBounds(495, 119, 97, 23);
		EigenePizzaGui.add(chb_paprika);
		
		
		chb_meeresfruechte.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_meeresfruechte.setBounds(495, 159, 180, 23);
		EigenePizzaGui.add(chb_meeresfruechte);
		
		
		chb_peperoni.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_peperoni.setBounds(495, 205, 161, 23);
		EigenePizzaGui.add(chb_peperoni);
		
		
		chb_ananas.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_ananas.setBounds(495, 251, 97, 23);
		EigenePizzaGui.add(chb_ananas);
		
		
		chb_rucola.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_rucola.setBounds(495, 302, 97, 23);
		EigenePizzaGui.add(chb_rucola);
		
		JLabel lbl_ueberschrift = new JLabel("Grundpreis  5,-\u20AC + 0,50 \u20AC je Zutat");
		lbl_ueberschrift.setFont(new Font("Constantia", Font.ITALIC, 20));
		lbl_ueberschrift.setForeground(Color.RED);
		lbl_ueberschrift.setBounds(152, 39, 360, 23);
		EigenePizzaGui.add(lbl_ueberschrift);
		
		txt_pizzaname = new JTextField();
		txt_pizzaname.setBounds(24, 377, 214, 20);
		EigenePizzaGui.add(txt_pizzaname);
		txt_pizzaname.setColumns(10);
		
		JLabel lbl_pizzaname = new JLabel("Name f\u00FCr ihre Pizza eingeben:");
		lbl_pizzaname.setFont(new Font("Constantia", Font.ITALIC, 11));
		lbl_pizzaname.setBounds(52, 343, 214, 23);
		EigenePizzaGui.add(lbl_pizzaname);
		
		JLabel lbl_pizzapreis = new JLabel("Aktueller Preis");
		lbl_pizzapreis.setFont(new Font("Constantia", Font.ITALIC, 11));
		lbl_pizzapreis.setBounds(510, 376, 180, 23);
		EigenePizzaGui.add(lbl_pizzapreis);
		
		JButton btn_hinzufuegen = new JButton("Hinzuf\u00FCgen");
		btn_hinzufuegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int anzahl = 0;
				String[] zutaten;
				String preis = null;
				String name = null;
				zutaten = Eigene_Pizza.ZutatenErmitteln();
				//Auf fehler überprüfen
				if(Eigene_Pizza.CheckForErrors() == false){
					return;
				}
				
				
				anzahl = Eigene_Pizza.AnzahlErmitteln();
				
				preis = Eigene_Pizza.PreisErmitteln();
				name = Eigene_Pizza.NameErmitteln();
				
				Eigene_Pizza Pizza = new Eigene_Pizza(name, preis, anzahl, zutaten);
				DefaultTableModel model = (DefaultTableModel) GUI_Hauptfenster.table.getModel();
				model.addRow(new Object[]{Pizza.name, Pizza.anzahl, Pizza.preis + "€"});
				
				GUI_Hauptfenster.frame.setVisible(false);
				GUI_Hauptfenster.frame.dispose();
				
			}
		});
		
		btn_hinzufuegen.setFont(new Font("Constantia", Font.ITALIC, 15));
		btn_hinzufuegen.setBounds(586, 415, 224, 58);
		EigenePizzaGui.add(btn_hinzufuegen);
		
		
		sp_pizzamenge.setBounds(263, 374, 29, 36);
		EigenePizzaGui.add(sp_pizzamenge);
		
		JLabel lbl_pizzamenge = new JLabel("Menge");
		lbl_pizzamenge.setFont(new Font("Constantia", Font.ITALIC, 11));
		lbl_pizzamenge.setBounds(264, 347, 46, 14);
		EigenePizzaGui.add(lbl_pizzamenge);
		
		JButton btn_zurueck = new JButton("Zur\u00FCck");
		btn_zurueck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUI_Hauptfenster.frame.setVisible(false);
				GUI_Hauptfenster.frame.dispose();
			}
		});
		btn_zurueck.setFont(new Font("Constantia", Font.ITALIC, 15));
		btn_zurueck.setBounds(24, 415, 224, 58);
		EigenePizzaGui.add(btn_zurueck);
		lbl_pizzapreisanzeige.setFont(new Font("Constantia", Font.PLAIN, 20));
		lbl_pizzapreisanzeige.setBounds(629, 358, 85, 36);
		
		EigenePizzaGui.add(lbl_pizzapreisanzeige);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
