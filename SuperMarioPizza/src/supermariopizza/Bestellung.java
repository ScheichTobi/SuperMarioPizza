package supermariopizza;

/**Bestellung
 * Klasse für die Bestellungen aller Art.
 * @param double preis, String name, int menge
 * @author Yannik
 *
 */
public class Bestellung{
	double preis;
	String name;
	double menge;
	
	Bestellung(String name, double preis, int menge){
		this.name = name;
		this.preis = preis;
		this.menge = menge;
	}
}
