package supermariopizza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class GUI {

	public static void main(String[] args) {
		
		erstellungSpeisekarte();
		erstellungGetraenkekarte();
	}
	/**
	 * erstellungSpeisekarte()
	 * Erstellung einer ArrayList, in der die verf�gbaren Pizzen stehen.
	 * Einf�gen der Standart Pizzen.
	 * Daf�r sind keine Parameter notwendig
	 * @author Yannik
	 */
	//Erstellung der ArrayList in der die Gerichte stehen
	static void erstellungSpeisekarte(){
		ArrayList <Pizza> li_speisekarte = new ArrayList <Pizza>();
		
		Pizza Funghi = new Pizza("Funghi", 7, 1);
		li_speisekarte.add(Funghi);
		
		Pizza Tonno = new Pizza("Tonno", 8, 1);
		li_speisekarte.add(Tonno);
		
		Pizza Margherita = new Pizza("Margherita", 7.50, 1);
		li_speisekarte.add(Margherita);
		
		//Test der enthaltenen Elemente
		for (int i = 0; i < li_speisekarte.size(); i++){
			System.out.println(li_speisekarte.get(i).name);
			System.out.println(li_speisekarte.get(i).preis);
			System.out.println(li_speisekarte.get(i).anzahl);
			
		}
	}
	
	/**
	 * erstellungGetraenkekarte()
	 * Erstellung einer ArrayList, in der die verf�gbaren Getr�nke stehen.
	 * Daf�r sind keine Parameter notwendig.
	 * Einf�gen der Getr�nke.
	 * @author Yannik
	 */
	//Erstellung der ArrayList in der die Getr�nke stehen
	static void erstellungGetraenkekarte(){
		ArrayList <Getr�nke> li_getraenkekarte = new ArrayList <Getr�nke>();
		
		Getr�nke Test = new Getr�nke("Test2", 15, 1);
		//TODO Menge im Sinne von Anzahl oder Literangabe? Oder sogar beides? :O Beides -> Konstr. �ndern :P
		li_getraenkekarte.add(Test);
		
		//Test der enthaltenen Elemente
		for (int i = 0; i < li_getraenkekarte.size(); i++){
			System.out.println(li_getraenkekarte.get(i).name);
			System.out.println(li_getraenkekarte.get(i).preis);
			System.out.println(li_getraenkekarte.get(i).menge);
		}
	}
	static void eigenePizzahinzufuegen(){
		Eigene_Pizza Pizza = new Eigene_Pizza(null, 0, 0);
		
		//TODO ausgew�hlte Zutaten ermitteln
		String[] li_Zutaten;
		li_Zutaten = Pizza.ZutatenErmitteln();
		
		//TODO ausgew�hlte Menge ermitteln
		Pizza.AnzahlErmitteln();
		
		//TODO ausgew�hlten Namen ermitteln
		Pizza.NameErmitteln();
		
	
	}
}
