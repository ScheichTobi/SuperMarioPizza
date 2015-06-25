package supermariopizza;
/**Pizza
 * Klasse zur speziellen Erstellung einer Pizza.
 * @param String name, String preis, int anzahl
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
	 * @return gibt die Anzahl der Pizzen zurück
	 * @author Yannik
	 */
	int getAnzahl(){
		return anzahl;
	}
}
