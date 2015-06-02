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
	}
	
	static void erstellungSpeisekarte(){
		ArrayList <Bestellung> li_speisekarte = new ArrayList <Bestellung>();
		Bestellung test = new Bestellung("test", 10);
		li_speisekarte.add(test);
		System.out.println(li_speisekarte.get(0).name);
	}

}
