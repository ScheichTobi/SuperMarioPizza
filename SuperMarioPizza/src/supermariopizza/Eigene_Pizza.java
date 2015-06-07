package supermariopizza;


public class Eigene_Pizza extends Pizza{
	//Konstruktor
	public Eigene_Pizza(String name, double preis, int anzahl, String[] zutaten) {
		super(name, preis, anzahl);
	}
	
	//Zutaten ermitteln
	public String[] ZutatenErmitteln(){
		String[] zutaten;
		zutaten = new String [0];//TODO Anzahl der Zutaten ermitteln
		
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
