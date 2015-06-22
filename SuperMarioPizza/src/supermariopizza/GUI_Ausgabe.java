package supermariopizza;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Toolkit;
import java.net.URL;
import java.awt.Font;

import javax.swing.border.MatteBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Ausgabe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JTable table1;
	static JLabel lblPreis;
	
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
	 */
	public GUI_Ausgabe() {
		setResizable(false);
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL resource = loader.getResource("Bilder/facemario.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(resource));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 500, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(44, 104, 758, 427);
	contentPane.add(scrollPane);
	
	table1 = new JTable();	
	scrollPane.setViewportView(table1);
	table1.setBackground(Color.WHITE);
	table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	table1.setModel(new DefaultTableModel(
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
	
	lblPreis = new JLabel("Preis");
	lblPreis.setBounds(679, 542, 142, 26);
	contentPane.add(lblPreis);
	
	JLabel lblRechnung = new JLabel("Rechnung");
	lblRechnung.setForeground(Color.RED);
	lblRechnung.setFont(new Font("Constantia", Font.ITALIC, 30));
	lblRechnung.setBounds(315, 11, 177, 64);
	contentPane.add(lblRechnung);
	
	JButton btnAbgeben = new JButton("Abgeben");
	btnAbgeben.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			  GUI_Abgeben.Abgeben();
		}});
	btnAbgeben.setFont(new Font("Constantia", Font.ITALIC, 13));
	btnAbgeben.setBounds(713, 637, 89, 23);
	contentPane.add(btnAbgeben);
	
	JButton btnZurck = new JButton("Zur\u00FCck");
	btnZurck.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			dispose();
		}
	});
	btnZurck.setFont(new Font("Constantia", Font.ITALIC, 14));
	btnZurck.setBounds(44, 637, 102, 23);
	contentPane.add(btnZurck);
	
	GUI_Ausgabe.table1.setSize((int)GUI_Ausgabe.table1.getBounds().getWidth(), (int)GUI_Ausgabe.table1.getBounds().getHeight() + GUI_Ausgabe.table1.getRowHeight());
	DefaultTableModel model = (DefaultTableModel) table1.getModel();
	
	for(int i=-1;i<GUI_Hauptfenster.table.getRowCount()-1;i++){
		
		model.addRow(new Object[]{GUI_Hauptfenster.table.getValueAt(i+1,0),GUI_Hauptfenster.table.getValueAt(i+1,1),GUI_Hauptfenster.table.getValueAt(i+1, 2)});
		
		
	}
	table1.getColumnModel().getColumn(0).setResizable(false);
	table1.getColumnModel().getColumn(0).setPreferredWidth(457);
	table1.getColumnModel().getColumn(1).setResizable(false);
	table1.getColumnModel().getColumn(2).setResizable(false);
	
	}
        public void auflisten(){
        	String string_preis = null;
    		double double_preis = 0;
    		double EndSumme = 0;
        	
        	for(int i=0;i<=GUI_Hauptfenster.table.getRowCount();i++){
        		string_preis = (String)GUI_Hauptfenster.table.getValueAt(i+1,2);
        		double_preis = GUI_Hauptfenster.TabellenPreisUmwandeln(string_preis);
        		EndSumme += double_preis;
        		String zwischensumme_formatiert = String.valueOf(EndSumme);
        		zwischensumme_formatiert = Eigene_Pizza.format(EndSumme);
        		lblPreis.setText(zwischensumme_formatiert + "€");
        	}
        	
	}
}
