package supermariopizza;
/**Pizza
 * Klasse zur speziellen Erstellung einer Pizza.
 * @param name 
 * 				enth�lt den Namen der Pizza
 * @param preis 
 * 				enth�lt den Preis der Pizza
 * @param anzahl 
 * 				enth�lt die Anzahl der Pizzen
 * @author Yannik
 *
 */

public class Pizza extends Bestellung {
	private int anzahl;					// Anzahl der Pizzen
	/** Konstruktor der Klasse 
	 * 
	 * @param name
	 * @param preis
	 * @param anzahl
	 * @author Yannik
	 */
	Pizza(String name, String preis, int anzahl) {
		super(name, preis);
		this.anzahl = anzahl;
	}
	/** int getAnzahl()
	 * 
	 * @return gibt die Anzahl der Pizzen zur�ck
	 * @author Yannik
	 */
	int getAnzahl(){
		return anzahl;
	}
}
