package supermariopizza;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_EigenePizza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel EigenePizzaGui;
	private JTextField txt_pizzaname;


	static JCheckBox chb_zwiebeln = new JCheckBox("Zwiebeln");
	static JCheckBox chb_pilze = new JCheckBox("Pilze");
	static JCheckBox chb_schinken = new JCheckBox("Schinken");
	static JCheckBox chb_salami = new JCheckBox("Salami");
	static JCheckBox chb_sardellen = new JCheckBox("Sardellen");
	static JCheckBox chb_paprika = new JCheckBox("Paprika");
	static JCheckBox chb_meeresfr�chte = new JCheckBox("Meeresfr\u00FCchte");
	static JCheckBox chb_peperoni = new JCheckBox("Peperoni");
	static JCheckBox chb_ananas = new JCheckBox("Ananas");
	static JCheckBox chb_rucola = new JCheckBox("Rucola");
	
	public GUI_EigenePizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 538);
		EigenePizzaGui = new JPanel();
		EigenePizzaGui.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(EigenePizzaGui);
		EigenePizzaGui.setLayout(null);
		
		
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
		
		
		chb_meeresfr�chte.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_meeresfr�chte.setBounds(495, 159, 180, 23);
		EigenePizzaGui.add(chb_meeresfr�chte);
		
		
		chb_peperoni.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_peperoni.setBounds(495, 205, 161, 23);
		EigenePizzaGui.add(chb_peperoni);
		
		
		chb_ananas.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_ananas.setBounds(495, 251, 97, 23);
		EigenePizzaGui.add(chb_ananas);
		
		
		chb_rucola.setFont(new Font("Constantia", Font.ITALIC, 20));
		chb_rucola.setBounds(495, 302, 97, 23);
		EigenePizzaGui.add(chb_rucola);
		
		JLabel lbl_ueberschrift = new JLabel("Grundpreis  5,-\u20AC + 0,30 \u20AC je Zutat");
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
				Eigene_Pizza.ZutatenErmitteln();
			}
		});
		btn_hinzufuegen.setFont(new Font("Constantia", Font.ITALIC, 15));
		btn_hinzufuegen.setBounds(586, 415, 224, 56);
		EigenePizzaGui.add(btn_hinzufuegen);
		
		JSpinner sp_pizzamenge = new JSpinner();
		sp_pizzamenge.setBounds(263, 377, 29, 20);
		EigenePizzaGui.add(sp_pizzamenge);
		
		JLabel lbl_pizzamenge = new JLabel("Menge");
		lbl_pizzamenge.setFont(new Font("Constantia", Font.ITALIC, 11));
		lbl_pizzamenge.setBounds(264, 347, 46, 14);
		EigenePizzaGui.add(lbl_pizzamenge);
	}
}