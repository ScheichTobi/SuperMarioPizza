package supermariopizza;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;

import java.awt.SystemColor;

import javax.swing.JCheckBox;

public class GUI_Ausgabe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JTable table1;
	static JLabel lblPreis;
	static JCheckBox chckbxSpeichern;
	static JLabel lblEndsumme;

	/**
	 * Launch the application.
	 */
	public static void FensterErstellen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Ausgabe frame = new GUI_Ausgabe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @return
	 */
	public GUI_Ausgabe() {
		setResizable(false);
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL resource = loader.getResource("Bilder/facemario.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(resource));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 20, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 104, 764, 427);
		contentPane.add(scrollPane);

		table1 = new JTable();
		scrollPane.setViewportView(table1);
		table1.setBackground(Color.WHITE);
		table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table1.setModel(new DefaultTableModel(new Object[][] {,}, new String[] {
				"Name", "St\u00FCckzahl", "Preis" }) {
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		lblPreis = new JLabel("Endsumme:");
		lblPreis.setForeground(Color.BLUE);
		lblPreis.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 26));
		lblPreis.setBounds(329, 580, 151, 26);
		contentPane.add(lblPreis);

		JLabel lblRechnung = new JLabel("Rechnung");
		lblRechnung.setForeground(Color.RED);
		lblRechnung
				.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 30));
		lblRechnung.setBounds(361, 11, 170, 64);
		contentPane.add(lblRechnung);

		JButton btnAbgeben = new JButton("Abgeben");
		btnAbgeben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxSpeichern.isSelected() == true) {
					dokumentspeichern();
				}
				GUI_Abgeben.Abgeben();
			}
		});
		btnAbgeben.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 21));
		btnAbgeben.setBounds(657, 594, 151, 53);
		contentPane.add(btnAbgeben);

		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnZurck.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 21));
		btnZurck.setBounds(44, 570, 151, 52);
		contentPane.add(btnZurck);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(162, 62, 566, 8);
		contentPane.add(separator);

		lblEndsumme = new JLabel("");
		lblEndsumme.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 28));
		lblEndsumme.setBounds(490, 568, 98, 38);
		lblEndsumme.setText(GUI_Hauptfenster.lblzwischensumme.getText());
		contentPane.add(lblEndsumme);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(490, 606, 98, 8);
		contentPane.add(separator_1);

		chckbxSpeichern = new JCheckBox("Bestellung speichern?");
		chckbxSpeichern.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC,
				14));
		chckbxSpeichern.setBounds(657, 564, 181, 23);
		contentPane.add(chckbxSpeichern);

		GUI_Ausgabe.table1.setSize((int) GUI_Ausgabe.table1.getBounds()
				.getWidth(), (int) GUI_Ausgabe.table1.getBounds().getHeight()
				+ GUI_Ausgabe.table1.getRowHeight());
		DefaultTableModel model = (DefaultTableModel) table1.getModel();

		for (int i = -1; i < GUI_Hauptfenster.table.getRowCount() - 1; i++) {

			model.addRow(new Object[] {
					GUI_Hauptfenster.table.getValueAt(i + 1, 0),
					GUI_Hauptfenster.table.getValueAt(i + 1, 1),
					GUI_Hauptfenster.table.getValueAt(i + 1, 2) });

		}
		table1.getColumnModel().getColumn(0).setResizable(false);
		table1.getColumnModel().getColumn(0).setPreferredWidth(457);
		table1.getColumnModel().getColumn(1).setResizable(false);
		table1.getColumnModel().getColumn(2).setResizable(false);

	}

	public void auflisten() {
		String string_preis = null;
		double double_preis = 0;
		double EndSumme = 0;

		for (int i = 0; i <= GUI_Hauptfenster.table.getRowCount(); i++) {
			string_preis = (String) GUI_Hauptfenster.table.getValueAt(i + 1, 2);
			double_preis = GUI_Hauptfenster
					.TabellenPreisUmwandeln(string_preis);
			EndSumme += double_preis;
			String zwischensumme_formatiert = String.valueOf(EndSumme);
			zwischensumme_formatiert = Eigene_Pizza.format(EndSumme);
			lblPreis.setText(zwischensumme_formatiert + "€");
		}

	}
	public void dokumentspeichern(){
		File rechnung = new File(FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath() + "\\rechnung.txt");
		
		if(!rechnung.exists()){
			try {
				rechnung.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			FileWriter fw = new FileWriter(rechnung);
			fw.write("Name\t\tStückzahl\t\tPreis");
			fw.write(System.lineSeparator());
			fw.write("---------------------------------------------------------------");
			fw.write(System.lineSeparator());
			for (int i = 0; i < table1.getRowCount(); i++) {
				fw.write((String)(table1.getValueAt(i, 0)+"\t\t"+table1.getValueAt(i, 1)+"\t\t\t"+table1.getValueAt(i, 2)));
				fw.write(System.lineSeparator());
			}
			fw.write("---------------------------------------------------------------");
			fw.write(System.lineSeparator());
			fw.write(lblPreis.getText()+"\t\t\t"+lblEndsumme.getText());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
