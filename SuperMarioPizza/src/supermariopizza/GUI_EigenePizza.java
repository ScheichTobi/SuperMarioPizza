package supermariopizza;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.ImageIcon;
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

import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.SpinnerNumberModel;

import java.awt.Toolkit;
import java.net.URL;

public class GUI_EigenePizza extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	//Erstellung der GUI-Komponenten
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
	
	//Konstruktor
	public GUI_EigenePizza() {
		setResizable(false);
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL resource = loader.getResource("Bilder/facemario.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(resource));
		setTitle("Eigene Pizza erstellen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 20, 850, 538);
		EigenePizzaGui = new JPanel();
		EigenePizzaGui.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(EigenePizzaGui);
		EigenePizzaGui.setLayout(null);
		
		//Item-Listener für Checkboxen erstellen
		chb_ananas.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_rucola.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_meeresfruechte.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_schinken.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_peperoni.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_paprika.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_pilze.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_salami.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_sardellen.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		chb_zwiebeln.addItemListener(new ItemListener() {
		      public void itemStateChanged(ItemEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		      }
		    });
		//Change-Listener für JSpinner erstellen
		ChangeListener listener = new ChangeListener() {
		      public void stateChanged(ChangeEvent e) {
		    	  Eigene_Pizza.AnzahlErmitteln();
		    	  Eigene_Pizza.PreisErmitteln();
		    }
		};
		sp_pizzamenge.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		sp_pizzamenge.addChangeListener(listener);
		
		
		//Eigenschaften der Checkboxen setzen
		chb_zwiebeln.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_zwiebeln.setBounds(55, 82, 109, 23);
		EigenePizzaGui.add(chb_zwiebeln);
		
		
		chb_pilze.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_pilze.setBounds(55, 119, 97, 23);
		EigenePizzaGui.add(chb_pilze);
		
		
		chb_schinken.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_schinken.setBounds(55, 159, 109, 23);
		EigenePizzaGui.add(chb_schinken);
		
		
		chb_salami.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_salami.setBounds(55, 205, 97, 23);
		EigenePizzaGui.add(chb_salami);
		
		
		chb_sardellen.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_sardellen.setBounds(55, 251, 122, 23);
		EigenePizzaGui.add(chb_sardellen);
		
		
		chb_paprika.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_paprika.setBounds(224, 82, 97, 23);
		EigenePizzaGui.add(chb_paprika);
		
		
		chb_meeresfruechte.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_meeresfruechte.setBounds(224, 119, 147, 23);
		EigenePizzaGui.add(chb_meeresfruechte);
		
		
		chb_peperoni.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_peperoni.setBounds(224, 159, 161, 23);
		EigenePizzaGui.add(chb_peperoni);
		
		
		chb_ananas.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_ananas.setBounds(224, 205, 97, 23);
		EigenePizzaGui.add(chb_ananas);
		
		
		chb_rucola.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_rucola.setBounds(224, 251, 97, 23);
		EigenePizzaGui.add(chb_rucola);
		
		
		//Erstellung von JLabeln,Eigenschaften setzen
		JLabel lbl_ueberschrift = new JLabel("Grundpreis  5\u20AC + 0,50 \u20AC je Zutat");
		lbl_ueberschrift.setFont(new Font("Constantia", Font.BOLD, 22));
		lbl_ueberschrift.setForeground(Color.RED);
		lbl_ueberschrift.setBounds(473, 30, 335, 23);
		EigenePizzaGui.add(lbl_ueberschrift);
		
		txt_pizzaname = new JTextField();
		txt_pizzaname.setFont(new Font("Constantia", Font.PLAIN, 14));
		txt_pizzaname.setBounds(69, 357, 224, 22);
		txt_pizzaname.setColumns(10);
		EigenePizzaGui.add(txt_pizzaname);
		
		JLabel lbl_pizzaname = new JLabel("Name f\u00FCr ihre Pizza eingeben:");
		lbl_pizzaname.setForeground(Color.DARK_GRAY);
		lbl_pizzaname.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 20));
		lbl_pizzaname.setBounds(38, 323, 283, 23);
		EigenePizzaGui.add(lbl_pizzaname);
		
		JLabel lbl_pizzapreis = new JLabel("Aktueller Preis:");
		lbl_pizzapreis.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 24));
		lbl_pizzapreis.setBounds(438, 361, 180, 41);
		EigenePizzaGui.add(lbl_pizzapreis);
		
		
		//Erstellung von Buttons,Setzen von Eigenschaften und Erstellung von Action-Listenern
		JButton btn_hinzufuegen = new JButton("Zur Bestellliste hinzuf\u00FCgen");
		btn_hinzufuegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Fügt erstellte Pizza hinzu
				try {
					Eigene_Pizza.PizzaHinzufuegen();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		btn_hinzufuegen.setFont(new Font("Constantia", Font.ITALIC, 15));
		btn_hinzufuegen.setBounds(586, 415, 224, 58);
		EigenePizzaGui.add(btn_hinzufuegen);
		
		sp_pizzamenge.setBounds(303, 443, 45, 36);
		EigenePizzaGui.add(sp_pizzamenge);
		
		JLabel lbl_pizzamenge = new JLabel("Menge:");
		lbl_pizzamenge.setForeground(Color.DARK_GRAY);
		lbl_pizzamenge.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 20));
		lbl_pizzamenge.setBounds(216, 447, 77, 26);
		EigenePizzaGui.add(lbl_pizzamenge);
		
		JButton btn_zurueck = new JButton("Zur\u00FCck");
		btn_zurueck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Eigene_Pizza.FensterSchliessen();
			}
		});
		btn_zurueck.setFont(new Font("Constantia", Font.ITALIC, 15));
		btn_zurueck.setBounds(0, 463, 91, 36);
		EigenePizzaGui.add(btn_zurueck);
		lbl_pizzapreisanzeige.setForeground(Color.BLUE);
		lbl_pizzapreisanzeige.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 24));
		lbl_pizzapreisanzeige.setBounds(670, 352, 109, 58);
		
		EigenePizzaGui.add(lbl_pizzapreisanzeige);
		
		JLabel lbl_zutatenangeben = new JLabel("Bitte w\u00E4hlen sie ihre Zutaten aus:");
		lbl_zutatenangeben.setFont(new Font("Constantia", Font.BOLD, 20));
		lbl_zutatenangeben.setBounds(24, 22, 335, 41);
		EigenePizzaGui.add(lbl_zutatenangeben);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setBounds(401, 0, 22, 499);
		EigenePizzaGui.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(0, 287, 403, 16);
		EigenePizzaGui.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(401, 343, 443, 22);
		EigenePizzaGui.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(448, 64, 360, 23);
		EigenePizzaGui.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(0, 421, 403, 16);
		EigenePizzaGui.add(separator_4);
		
		URL resource2 = loader.getResource("Bilder/gif_pizza.gif");
		JLabel lbl_foto = new JLabel(new ImageIcon(resource2));
		lbl_foto.setBounds(430, 82, 380, 250);
		EigenePizzaGui.add(lbl_foto);
		
		JLabel lblenthltTomaten = new JLabel("(Enth\u00E4lt Tomaten + K\u00E4se)");
		lblenthltTomaten.setBounds(457, 48, 147, 14);
		EigenePizzaGui.add(lblenthltTomaten);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
