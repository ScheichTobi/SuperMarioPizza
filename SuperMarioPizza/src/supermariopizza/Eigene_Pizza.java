package supermariopizza;

import java.text.DecimalFormat;







import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Eigene_Pizza extends Pizza{
	
	private static int zutatenmenge;
	static int pizzaanzahl = 1;
	
	//Konstruktor
	public Eigene_Pizza(String name, String preis, int anzahl, String[] zutaten) {
		super(name, preis, anzahl);
	}
	
	//Zutaten ermitteln
	public static String[] ZutatenErmitteln(){
		
		//Überprüfen wie viele Zutaten ausgewählt wurden
		zutatenmenge = 0;
		if(GUI_EigenePizza.chb_ananas.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_zwiebeln.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_pilze.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_schinken.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_salami.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_sardellen.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_peperoni.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_rucola.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_meeresfruechte.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_paprika.isSelected()== true)zutatenmenge ++;
		
		//Erstellung von Zutaten-Strings, die jeder eigenen Pizza mitgegeben werden
		String ananas = "ananas";
		String zwiebeln = "zwiebeln";
		String pilze = "pilze";
		String schinken = "schinken";
		String salami = "salami";
		String sardellen = "sardellen";
		String peperoni = "peperoni";
		String rucola = "rucola";
		String meeresfruechte = "meeresfruechte";
		String paprika = "paprika";
		
		//Erstellung eines String-Arrays mit der Größe der ausgewählten Zutaten
		String[] zutaten = new String [zutatenmenge];
		
		//Wenn Zutat ausgewählt, füge sie in das String-Array ein
		for (int i = 0; i < zutaten.length; i++) {
			if(GUI_EigenePizza.chb_ananas.isSelected()== true){
				zutaten[i] = ananas;
				i++;
			}
			if(GUI_EigenePizza.chb_zwiebeln.isSelected()== true){
				zutaten[i] = zwiebeln;
				i++;
			}
			if(GUI_EigenePizza.chb_pilze.isSelected()== true){
				zutaten[i] = pilze;
				i++;
			}
			if(GUI_EigenePizza.chb_schinken.isSelected()== true){
				zutaten[i] = schinken;
				i++;
			}
			if(GUI_EigenePizza.chb_salami.isSelected()== true){
				zutaten[i] = salami;
				i++;
			}
			if(GUI_EigenePizza.chb_sardellen.isSelected()== true){
				zutaten[i] = sardellen;
				i++;
			}
			if(GUI_EigenePizza.chb_peperoni.isSelected()== true){
				zutaten[i] = peperoni;
				i++;
			}
			if(GUI_EigenePizza.chb_rucola.isSelected()== true){
				zutaten[i] = rucola;
				i++;
			}
			if(GUI_EigenePizza.chb_meeresfruechte.isSelected()== true){
				zutaten[i] = meeresfruechte;
				i++;
			}
			if(GUI_EigenePizza.chb_paprika.isSelected()== true){
				zutaten[i] = paprika;
				i++;
			}
		}
		return zutaten;
	}
	
	//Anzahl der eigenen Pizza ermitteln
	public static int AnzahlErmitteln(){
		int anzahl = 0;
		//Zahl im JSpinner ermitteln
		anzahl = (int) GUI_EigenePizza.sp_pizzamenge.getValue();
		pizzaanzahl = anzahl;
		return anzahl;
	}
	
	//Name der eigenen Pizza ermitteln
	public static String NameErmitteln(){
		//String im JTextField ermitteln
		String name = null;
		name = GUI_EigenePizza.txt_pizzaname.getText();
		return name;
	}
	//Preis der eigenen Pizze ermitteln
	public static String PreisErmitteln(){
		//Grundpreis
		double preis = 5.0;
		
		//Preis pro Zutat
		double zutatenpreis = 0.5;
		
		//Falls Zutat ausgewählt, Preis um Zutatenpreis erhöhen
		if(GUI_EigenePizza.chb_ananas.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_zwiebeln.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_pilze.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_schinken.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_salami.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_sardellen.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_peperoni.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_rucola.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_meeresfruechte.isSelected()== true)preis += zutatenpreis;
		if(GUI_EigenePizza.chb_paprika.isSelected()== true)preis += zutatenpreis;
		
		//Mit ausgewählter Anzahl multiplizieren
		preis *= pizzaanzahl;
		
		//Pizzaanzahl zurücksetzen
		pizzaanzahl = 1;
		
		//Preis von Double in String verwandeln
		String preis2 = String.valueOf(preis);
		preis2 = format(preis);
		
		//Aktuellen Preis in GUI_EigenePizza anzeigen lassen
		GUI_EigenePizza.lbl_pizzapreisanzeige.setText(preis2 + "€");
		
		return preis2;
	}
	
	//Wandeln einen double Wert z.B 6.5 in 6.50 um
	public static String format(double i)
	{
		DecimalFormat f = new DecimalFormat("#0.00");
		double toFormat = ((double)Math.round(i*100))/100;
		return f.format(toFormat);
	}
	
	//Fehlerroutine
	public static Boolean CheckForErrors(){
		
		//JSpinner kleiner als 1
		if((int)GUI_EigenePizza.sp_pizzamenge.getValue() < 1){
			JOptionPane.showMessageDialog(new JFrame(), "Sie müssen mindestens eine Pizza bestellen", "Halt Stop!", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		//Keinen Namen eingegeben
		if(GUI_EigenePizza.txt_pizzaname.getText().equals("") == true) {
			JOptionPane.showMessageDialog(new JFrame(), "Sie müssen ihrer Pizza einen Namen geben", "Halt Stop!", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		//Keine Zutat ausgewählt
		if(zutatenmenge == 0){
			JOptionPane.showMessageDialog(new JFrame(), "Sie müssen eine Zutat auswählen", "Halt Stop!", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
	public static void PizzaHinzufuegen() throws Exception{
		//Variablen einer eigenen Pizza definieren
		int anzahl = 0;
		String[] zutaten;
		String preis = null;
		String name = null;
		
		//Checkboxen überprüfen
		zutaten = Eigene_Pizza.ZutatenErmitteln();
		
		//Auf korrekte Eingabe überprüfen
		if(Eigene_Pizza.CheckForErrors() == false){
			return;
		}
		
		//Anzahl der selbst erstellen Pizza ermitteln
		anzahl = Eigene_Pizza.AnzahlErmitteln();
		
		//Preis der selbst erstellten Pizza ermitteln
		preis = Eigene_Pizza.PreisErmitteln();
		
		//Name der erstellen Pizza ermitteln
		name = Eigene_Pizza.NameErmitteln();
		
		//Eigene Pizza erstellen
		Eigene_Pizza Pizza = new Eigene_Pizza(name, preis, anzahl, zutaten);
		
		//Erweitern der Tabelle im GUI_Hauptfenster um eine Zeile für den neuen Eintrag
		GUI_Hauptfenster.table.setSize((int)GUI_Hauptfenster.table.getBounds().getWidth(), (int)GUI_Hauptfenster.table.getBounds().getHeight() + GUI_Hauptfenster.table.getRowHeight());
		
		//Pizza in die Tabelle einfügen
		DefaultTableModel model = (DefaultTableModel) GUI_Hauptfenster.table.getModel();
		model.addRow(new Object[]{Pizza.name, Pizza.anzahl, Pizza.preis + "€"});
		GUI.li_Rechnung.add(Pizza);
		
		//Preis im GUI_Hauptfenster aktualisieren
		GUI_Hauptfenster.ZwischenpreisRechnung();
		
		//hinzufuegensound
		GUI.hinzufuegensound();
		
		//GUI_EigenePizza schließen
		GUI_Hauptfenster.frame.setVisible(false);
		GUI_Hauptfenster.frame.dispose();
	}
	public static void FensterSchliessen(){
		GUI_Hauptfenster.frame.setVisible(false);
		GUI_Hauptfenster.frame.dispose();
	}
	
}
