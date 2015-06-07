package supermariopizza;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.File;
public class GUI {
	
	public static Clip Mario;
	static ArrayList <Pizza> Test = new ArrayList<Pizza>();
	
	public static void main(String[] args) throws Exception {
		//Erstellung der GUI_Hauptfenster
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Hauptfenster frame = new GUI_Hauptfenster();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//Musik abspielen
		sound();
		
		erstellungSpeisekarte();
		erstellungGetraenkekarte();
	}
	/**
	 * erstellungSpeisekarte()
	 * Erstellung einer ArrayList, in der die verfügbaren Pizzen stehen.
	 * Einfügen der Standart Pizzen.
	 * Dafür sind keine Parameter notwendig
	 * @author Yannik
	 */
	//Erstellung der ArrayList in der die Gerichte stehen
	static void erstellungSpeisekarte(){
		ArrayList <Pizza> li_speisekarte = new ArrayList <Pizza>();
		
		Pizza Funghi = new Pizza("Funghi", 7, 1);
		li_speisekarte.add(Funghi);
		
		Pizza Tonno = new Pizza("Tonno", 8, 1);
		li_speisekarte.add(Tonno);
		Test.add(Funghi);
		
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
	 * Erstellung einer ArrayList, in der die verfügbaren Getränke stehen.
	 * Dafür sind keine Parameter notwendig.
	 * Einfügen der Getränke.
	 * @author Yannik
	 */
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
		//Eigene_Pizza Pizza = new Eigene_Pizza(null, 0, 0);
		
		//TODO ausgewählte Zutaten ermitteln
		//String[] li_Zutaten;
		//li_Zutaten = Pizza.ZutatenErmitteln();
		
		//TODO ausgewählte Menge ermitteln
		//Pizza.AnzahlErmitteln();
		
		//TODO ausgewählten Namen ermitteln
		//Pizza.NameErmitteln();
		
	
	}
	public static void sound() throws Exception{
			//Musik erstellen
            try {
                File MarioMusik = new File("SuperMarioSound.wav");
                Mario = AudioSystem.getClip();
                Mario.open(AudioSystem.getAudioInputStream(MarioMusik));
                Mario.loop(Clip.LOOP_CONTINUOUSLY);
            //Lautstärke
                FloatControl gainControl = (FloatControl) Mario.getControl(FloatControl.Type.MASTER_GAIN);
                    double gain = .08D;
                    float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
                    gainControl.setValue(dB);

                    BooleanControl muteControl = (BooleanControl) Mario
                        .getControl(BooleanControl.Type.MUTE);
                    muteControl.setValue(true);

                    muteControl.setValue(false);
                }catch (IOException e){}      
	}	
}

