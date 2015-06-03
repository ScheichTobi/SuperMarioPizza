package supermariopizza;

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
