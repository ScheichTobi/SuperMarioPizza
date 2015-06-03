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
		
		Bestellung Funghi = new Bestellung("Funghi", 7);
		li_speisekarte.add(Funghi);
		
		Bestellung Tonno = new Bestellung("Tonno", 8);
		li_speisekarte.add(Tonno);
		
		//Test der enthaltenen Elemente
		for (int i = 0; i < li_speisekarte.size(); i++){
			System.out.println(li_speisekarte.get(i).name);
		}
	}

	//Erstellung der ArrayList in der die Getränke stehen
	static void erstellungGetraenkekarte(){
		ArrayList <Getränke> li_getraenkekarte = new ArrayList <Getränke>();
		
		Getränke Test = new Getränke("Test2", 15, 0.5);
		li_getraenkekarte.add(Test);
		
		//Test der enthaltenen Elemente
		for (int i = 0; i < li_getraenkekarte.size(); i++){
			System.out.println(li_getraenkekarte.get(i).name);
		}
	}
}
