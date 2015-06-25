package supermariopizza;

/**Getränke
 * Klasse für Getränke im speziellen.
 * @param String name, double preis, double menge (in l)
 * @author Yannik
 *
 */
public class Getränke extends Bestellung{
	private double menge;										// Angabe des Getränke Vollumens
	
	Getränke(String name, String preis, double menge) {
		super(name, preis);
		this.menge = menge;
	}
		double getMenge(){
			return menge;
		}
}
