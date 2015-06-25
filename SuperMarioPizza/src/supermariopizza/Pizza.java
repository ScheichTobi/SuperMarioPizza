package supermariopizza;
/**Pizza
 * Klasse zur speziellen Erstellung einer Pizza.
 * @param String name, double preis, int anzahl
 * @author Yannik
 *
 */

public class Pizza extends Bestellung {
	private int anzahl;
	Pizza(String name, String preis, int anzahl) {
		super(name, preis);
		this.anzahl = anzahl;
	}
	int getAnzahl(){
		return anzahl;
	}
}
