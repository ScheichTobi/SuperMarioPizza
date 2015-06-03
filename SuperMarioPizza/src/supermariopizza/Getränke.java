package supermariopizza;

public class Getränke extends Bestellung{
	float menge;
	
	Getränke(String name, int preis, float menge) {
		super(name, preis);
		this.menge = menge;
	}

}
