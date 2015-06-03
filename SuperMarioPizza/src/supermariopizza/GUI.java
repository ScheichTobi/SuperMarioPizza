package supermariopizza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		erstellungSpeisekarte();
		erstellungGetraenkekarte();
	}
	
	//Erstellung der ArrayList in der die Gerichte stehen
	static void erstellungSpeisekarte(){
		ArrayList <Bestellung> li_speisekarte = new ArrayList <Bestellung>();
		
		Bestellung Test1 = new Bestellung("Test1", 10);
		li_speisekarte.add(Test1);
		System.out.println(li_speisekarte.get(0).name);
		System.out.println(li_speisekarte.get(0).preis);
	}

	//Erstellung der ArrayList in der die Getränke stehen
	static void erstellungGetraenkekarte(){
		ArrayList <Getränke> li_getraenkekarte = new ArrayList <Getränke>();
		
		Getränke Test = new Getränke("Test2", 15, 0.5F);
		li_getraenkekarte.add(Test);
		System.out.println(li_getraenkekarte.get(0).name);
		System.out.println(li_getraenkekarte.get(0).preis);
		System.out.println(li_getraenkekarte.get(0).menge);
	}
}
