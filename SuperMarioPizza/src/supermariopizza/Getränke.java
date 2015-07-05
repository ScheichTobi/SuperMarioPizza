package supermariopizza;

/**Getr�nke
 * Klasse f�r Getr�nke im speziellen.
 * @param name 
 * 				name der Bestellung
 * @param preis
 * 				preis der Bestellung
 * @param menge 
 * 				gr��e des Getr�nks in (l)
 * @author Yannik
 *
 */
public class Getr�nke extends Bestellung{
	private double menge;										// Angabe des Getr�nke Vollumens
	/**Konstruktor der Klasse
	 * 
	 * @param name
	 * @param preis
	 * @param menge
	 * @author Yannik
	 */
	Getr�nke(String name, String preis, double menge) {
		super(name, preis);
		this.menge = menge;
	}
		
	/** double getMenge()
	 * 
	 * @return gibt das Vollumen des Getr�nks zur�ck
	 * @author Yannik
	 */
		double getMenge(){
			return menge;
		}
}
