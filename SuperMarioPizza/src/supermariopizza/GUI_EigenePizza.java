package supermariopizza;

import java.awt.EventQueue;

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

public class GUI_EigenePizza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel EigenePizzaGui;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public GUI_EigenePizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 538);
		EigenePizzaGui = new JPanel();
		EigenePizzaGui.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(EigenePizzaGui);
		EigenePizzaGui.setLayout(null);
		
		JCheckBox chb_Zwiebeln = new JCheckBox("Zwiebeln");
		chb_Zwiebeln.setFont(new Font("Magneto", Font.PLAIN, 20));
		chb_Zwiebeln.setBounds(94, 119, 144, 23);
		EigenePizzaGui.add(chb_Zwiebeln);
		
		JCheckBox chb_Pilze = new JCheckBox("Pilze");
		chb_Pilze.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		chb_Pilze.setBounds(94, 159, 97, 23);
		EigenePizzaGui.add(chb_Pilze);
		
		JCheckBox chb_Schinken = new JCheckBox("Schinken");
		chb_Schinken.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		chb_Schinken.setBounds(94, 205, 144, 23);
		EigenePizzaGui.add(chb_Schinken);
		
		JCheckBox chb_Salami = new JCheckBox("Salami");
		chb_Salami.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		chb_Salami.setBounds(94, 251, 97, 23);
		EigenePizzaGui.add(chb_Salami);
		
		JCheckBox chb_Sardellen = new JCheckBox("Sardellen");
		chb_Sardellen.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		chb_Sardellen.setBounds(94, 302, 122, 23);
		EigenePizzaGui.add(chb_Sardellen);
		
		JCheckBox chb_Paprika = new JCheckBox("Paprika");
		chb_Paprika.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		chb_Paprika.setBounds(495, 119, 97, 23);
		EigenePizzaGui.add(chb_Paprika);
		
		JCheckBox chb_Meeresfrüchte = new JCheckBox("Meeresfr\u00FCchte");
		chb_Meeresfrüchte.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		chb_Meeresfrüchte.setBounds(495, 159, 180, 23);
		EigenePizzaGui.add(chb_Meeresfrüchte);
		
		JCheckBox chb_Peperoni = new JCheckBox("Peperoni");
		chb_Peperoni.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		chb_Peperoni.setBounds(495, 205, 161, 23);
		EigenePizzaGui.add(chb_Peperoni);
		
		JCheckBox chb_Ananas = new JCheckBox("Ananas");
		chb_Ananas.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		chb_Ananas.setBounds(495, 251, 97, 23);
		EigenePizzaGui.add(chb_Ananas);
		
		JCheckBox chb_Rucola = new JCheckBox("Rucola");
		chb_Rucola.setFont(new Font("Vijaya", Font.PLAIN, 20));
		chb_Rucola.setBounds(495, 302, 97, 23);
		EigenePizzaGui.add(chb_Rucola);
		
		JLabel lblGrundprei = new JLabel("Grundprei\u00DF  5,-\u20AC + 0,30 \u20AC je Zutat");
		lblGrundprei.setFont(new Font("Albertus Extra Bold", Font.PLAIN, 20));
		lblGrundprei.setForeground(Color.RED);
		lblGrundprei.setBounds(152, 39, 360, 23);
		EigenePizzaGui.add(lblGrundprei);
		
		textField = new JTextField();
		textField.setBounds(24, 377, 214, 20);
		EigenePizzaGui.add(textField);
		textField.setColumns(10);
		
		JLabel lblNameFrIhre = new JLabel("Name f\u00FCr ihre Pizza eingeben:");
		lblNameFrIhre.setBounds(52, 343, 214, 23);
		EigenePizzaGui.add(lblNameFrIhre);
		
		JLabel lblAktuellerPrei = new JLabel("Aktueller Preis");
		lblAktuellerPrei.setBounds(510, 376, 180, 23);
		EigenePizzaGui.add(lblAktuellerPrei);
		
		JButton btnWeiter = new JButton("Hinzuf\u00FCgen");
		btnWeiter.setBounds(586, 415, 224, 56);
		EigenePizzaGui.add(btnWeiter);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(263, 377, 29, 20);
		EigenePizzaGui.add(spinner);
		
		JLabel lblMenge = new JLabel("Menge");
		lblMenge.setBounds(264, 347, 46, 14);
		EigenePizzaGui.add(lblMenge);
	}
}
