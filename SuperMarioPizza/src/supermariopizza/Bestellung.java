package supermariopizza;

/**Bestellung
 * Klasse für die Bestellungen aller Art.
 * @param double preis, String name, double menge
 * @author Yannik
 *
 */
public class Bestellung{
	private String preis;
	private String name;
		
	Bestellung(String name, String preis){
		this.name = name;
		this.preis = preis;
	}
	
	String getName(){
		return name;
	}
	
	String getPrize(){
		return preis;
	}
}
