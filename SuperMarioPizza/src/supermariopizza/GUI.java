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
	
	//Erstellung der ArrayList in der die Gerichte stehen
	static void erstellungSpeisekarte(){
		ArrayList <Pizza> li_speisekarte = new ArrayList <Pizza>();
		
		Pizza Funghi = new Pizza("Funghi", 7, 1);
		li_speisekarte.add(Funghi);
		
		Pizza Tonno = new Pizza("Tonno", 8, 1);
		li_speisekarte.add(Tonno);
		
		//Test der enthaltenen Elemente
		for (int i = 0; i < li_speisekarte.size(); i++){
			System.out.println(li_speisekarte.get(i).name);
			System.out.println(li_speisekarte.get(i).preis);
			System.out.println(li_speisekarte.get(i).menge);
			
		}
	}

	//Erstellung der ArrayList in der die Getränke stehen
	static void erstellungGetraenkekarte(){
		ArrayList <Getränke> li_getraenkekarte = new ArrayList <Getränke>();
		
		Getränke Test = new Getränke("Test2", 15, 1);
		//TODO Menge im Sinne von Anzahl oder Literangabe? Oder sogar beides? :O Beides -> Konstr. ändern :P
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
		
		//TODO ausgewählte Zutaten ermitteln
		String[] li_Zutaten;
		li_Zutaten = Pizza.ZutatenErmitteln();
		
		//TODO ausgewählte Menge ermitteln
		Pizza.MengeErmitteln();
		
		//TODO ausgewählten Namen ermitteln
		Pizza.NameErmitteln();
		
	
	}
}
