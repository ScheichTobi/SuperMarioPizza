package supermariopizza;

/**Getränke
 * Klasse für Getränke im speziellen.
 * @param name 
 * 				name der Bestellung
 * @param preis
 * 				preis der Bestellung
 * @param menge 
 * 				größe des Getränks in (l)
 * @author Yannik
 *
 */
public class Getränke extends Bestellung{
	private double menge;										// Angabe des Getränke Vollumens
	/**Konstruktor der Klasse
	 * 
	 * @param name
	 * @param preis
	 * @param menge
	 * @author Yannik
	 */
	Getränke(String name, String preis, double menge) {
		super(name, preis);
		this.menge = menge;
	}
		
	/** double getMenge()
	 * 
	 * @return gibt das Vollumen des Getränks zurück
	 * @author Yannik
	 */
		double getMenge(){
			return menge;
		}
}
