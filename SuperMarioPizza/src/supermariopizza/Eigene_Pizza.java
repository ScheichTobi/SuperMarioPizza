package supermariopizza;


public class Eigene_Pizza extends Pizza{

	public Eigene_Pizza(String name, double preis, int anzahl) {
		super(name, preis, anzahl);
	}
	
	public String[] ZutatenErmitteln(){
		String[] zutaten;
		zutaten = new String [0];//TODO Anzahl der Zutaten ermitteln
		
		for (int i = 0; i < zutaten.length; i++) {
			
			String string = zutaten[i]; //TODO Zutaten von Checkboxen dem ZutatenArray hinzufügen
			
		}
		return zutaten;
	}
	public int AnzahlErmitteln(){
		int anzahl = 0;
		//TODO Menge aus DropList ermitteln
		return anzahl;
	}
	public void NameErmitteln(){
		//TODO Name aus Textfeld ermitteln
		
	}
	

}
