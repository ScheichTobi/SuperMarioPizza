package supermariopizza;

/**Getr�nke
 * Klasse f�r Getr�nke im speziellen.
 * @param String name, double preis, double menge (in l)
 * @author Yannik
 *
 */
public class Getr�nke extends Bestellung{
	double menge;										// Angabe des Getr�nke Vollumens
	
	Getr�nke(String name, String preis, double menge) {
		super(name, preis);
		this.menge = menge;
	}

}
