package supermariopizza;

public class Getränke extends Bestellung{
	double menge;
	
	Getränke(String name, double preis, double menge) {
		super(name, preis);
		this.menge = menge;
	}

}
