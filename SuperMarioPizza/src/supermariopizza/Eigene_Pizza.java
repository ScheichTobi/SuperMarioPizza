package supermariopizza;


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
			
		System.out.println(zutatenmenge);
		
		
		
		
		
		String[] zutaten = new String [zutatenmenge];//TODO Anzahl der Zutaten ermitteln
		
		for (int i = 0; i < zutaten.length; i++) {
			
			//String string = zutaten[i]; //TODO Zutaten von Checkboxen dem ZutatenArray hinzufügen
			
		}
		return zutaten;
	}
	
	//Anzahl der eigenen Pizza ermitteln
	public int AnzahlErmitteln(){
		int anzahl = 0;
		//TODO Menge aus DropList ermitteln
		return anzahl;
	}
	
	//Name der eigenen Pizza ermitteln
	public void NameErmitteln(){
		//TODO Name aus Textfeld ermitteln
		
	}
	

}
