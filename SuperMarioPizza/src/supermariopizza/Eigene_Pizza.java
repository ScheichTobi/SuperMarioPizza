package supermariopizza;

import java.text.DecimalFormat;


public class Eigene_Pizza extends Pizza{
	//Konstruktor
	public Eigene_Pizza(String name, double preis, int anzahl, String[] zutaten) {
		super(name, preis, anzahl);
	}
	
	//Zutaten ermitteln
	public static String[] ZutatenErmitteln(){
		int zutatenmenge = 0;
		
		if(GUI_EigenePizza.chb_ananas.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_zwiebeln.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_pilze.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_schinken.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_salami.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_sardellen.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_peperoni.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_rucola.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_meeresfrüchte.isSelected()== true)zutatenmenge ++;
		if(GUI_EigenePizza.chb_paprika.isSelected()== true)zutatenmenge ++;
			
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
		
		
		
		
		
		String[] zutaten = new String [zutatenmenge];
		
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
			if(GUI_EigenePizza.chb_meeresfrüchte.isSelected()== true){
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
		anzahl = (int) GUI_EigenePizza.sp_pizzamenge.getValue();
		return anzahl;
	}
	
	//Name der eigenen Pizza ermitteln
	public static String NameErmitteln(){
		String name = null;
		name = GUI_EigenePizza.txt_pizzaname.getText();
		return name;
	}
	//Preis der eigenen Pizze ermitteln
	public static double PreisErmitteln(){
		double preis = 5.0;
		if(GUI_EigenePizza.chb_ananas.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_zwiebeln.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_pilze.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_schinken.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_salami.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_sardellen.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_peperoni.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_rucola.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_meeresfrüchte.isSelected()== true)preis += 0.5;
		if(GUI_EigenePizza.chb_paprika.isSelected()== true)preis += 0.5;
		
		String preis2 = String.valueOf(preis);
		preis2 = format(preis);
		
		GUI_EigenePizza.lbl_pizzapreisanzeige.setText(preis2 + "€");
		return preis;
	}
	public static String format(double i)
	{
		DecimalFormat f = new DecimalFormat("#0.00");
		double toFormat = ((double)Math.round(i*100))/100;
		return f.format(toFormat);
	}
}
