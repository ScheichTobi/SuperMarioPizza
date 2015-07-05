package supermariopizza;

/**Bestellung
 * Klasse für die Bestellungen aller Art.
 * @param preis
 * 				preis der Bestellung
 * @param name
 * 				name der Bestellung
 * @author Yannik
 *
 */
public class Bestellung{
	private String preis;					//Preis der Bestellung
	private String name;					//Name der Bestellung
	
	/** Konstruktor der Klasse
	 * 
	 * @param name 
	 * @param preis
	 * @author Yannik
	 */
	Bestellung(String name, String preis){
		this.name = name;
		this.preis = preis;
	}
	/** String getName()
	 * 
	 * @return gibt den Namen der Bestellung zurück
	 * @author Yannik
	 */
	String getName(){
		return name;
	}
	/** String getPrize()
	 * 
	 * @return gibt den Preis der Bestellung zurück
	 * @author Yannik
	 */
	String getPrize(){
		return preis;
	}
}
