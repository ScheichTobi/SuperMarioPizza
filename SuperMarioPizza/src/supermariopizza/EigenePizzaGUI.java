package supermariopizza;

import java.awt.BorderLayout;
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

public class EigenePizzaGUI extends JFrame {

	private JPanel EigenePizzaGui;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public EigenePizzaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 538);
		EigenePizzaGui = new JPanel();
		EigenePizzaGui.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(EigenePizzaGui);
		EigenePizzaGui.setLayout(null);
		
		JCheckBox Zutat1 = new JCheckBox("New check box");
		Zutat1.setBounds(94, 119, 97, 23);
		EigenePizzaGui.add(Zutat1);
		
		JCheckBox Zutat2 = new JCheckBox("New check box");
		Zutat2.setBounds(94, 159, 97, 23);
		EigenePizzaGui.add(Zutat2);
		
		JCheckBox Zutat3 = new JCheckBox("New check box");
		Zutat3.setBounds(94, 205, 97, 23);
		EigenePizzaGui.add(Zutat3);
		
		JCheckBox Zutat4 = new JCheckBox("New check box");
		Zutat4.setBounds(94, 251, 97, 23);
		EigenePizzaGui.add(Zutat4);
		
		JCheckBox Zutat5 = new JCheckBox("New check box");
		Zutat5.setBounds(94, 302, 97, 23);
		EigenePizzaGui.add(Zutat5);
		
		JCheckBox Zutat6 = new JCheckBox("New check box");
		Zutat6.setBounds(495, 119, 97, 23);
		EigenePizzaGui.add(Zutat6);
		
		JCheckBox Zutat7 = new JCheckBox("New check box");
		Zutat7.setBounds(495, 159, 97, 23);
		EigenePizzaGui.add(Zutat7);
		
		JCheckBox Zutat8 = new JCheckBox("New check box");
		Zutat8.setBounds(495, 205, 97, 23);
		EigenePizzaGui.add(Zutat8);
		
		JCheckBox Zutat9 = new JCheckBox("New check box");
		Zutat9.setBounds(495, 251, 97, 23);
		EigenePizzaGui.add(Zutat9);
		
		JCheckBox Zutat10 = new JCheckBox("New check box");
		Zutat10.setBounds(495, 302, 97, 23);
		EigenePizzaGui.add(Zutat10);
		
		JLabel lblGrundprei = new JLabel("Grundprei\u00DF  5,-\u20AC + 0,30 \u20AC je Zutat");
		lblGrundprei.setForeground(Color.RED);
		lblGrundprei.setBounds(284, 39, 180, 23);
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
