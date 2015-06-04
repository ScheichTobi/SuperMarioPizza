package supermariopizza;

/**Getränke
 * Klasse für Getränke im speziellen.
 * @param String name, double preis, double menge
 * @author Yannik
 *
 */
public class Getränke extends Bestellung{
	double menge;
	
	Getränke(String name, double preis, double menge) {
		super(name, preis);
		this.menge = menge;
	}

}
