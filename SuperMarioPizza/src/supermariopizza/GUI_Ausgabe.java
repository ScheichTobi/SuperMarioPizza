package supermariopizza;

import java.awt.BorderLayout;
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

public class GUI_Ausgabe extends JFrame {

	private JPanel contentPane;
	static JTable table1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(66, 104, 758, 427);
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
	
	JLabel label = new JLabel("");
	label.setBounds(636, 542, 159, 37);
	contentPane.add(label);
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
        		contentPane.setToolTipText(zwischensumme_formatiert + "€");
        	}
        	
	}
}
