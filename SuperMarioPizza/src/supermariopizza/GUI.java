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
	
	static ArrayList <Pizza> li_speisekarte = new ArrayList <Pizza>();
	static ArrayList <Getränke> li_getraenkekarte = new ArrayList <Getränke>();
	
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
		
		
		Pizza Funghi = new Pizza("Funghi", "7", 1);
		li_speisekarte.add(Funghi);
		
		Pizza Tonno = new Pizza("Tonno", "8", 1);
		li_speisekarte.add(Tonno);
				
		Pizza Margherita = new Pizza("Margherita", "5", 1);
		li_speisekarte.add(Margherita);
		
		Pizza Mozzarella = new Pizza("Mozzarella", "8.20", 1);
		li_speisekarte.add(Mozzarella);
		
		Pizza Prosciutto = new Pizza("Prosciutto", "13.50", 1);
		li_speisekarte.add(Prosciutto);

		Pizza Vegetarier = new Pizza("Vegetarier", "7.50", 1);
		li_speisekarte.add(Vegetarier);
		
		Pizza Hawaii = new Pizza("Hawaii", "9.70", 1);
		li_speisekarte.add(Hawaii);
		
		Pizza Siciliana  = new Pizza("Siciliana ", "7.50", 1);
		li_speisekarte.add(Siciliana );
		
		Pizza Salami = new Pizza("Salami", "9.20", 1);
		li_speisekarte.add(Salami);
		
		Pizza Peperoni = new Pizza("Peperoni", "8.90", 1);
		li_speisekarte.add(Peperoni);
		
				
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
				
		Getränke Hefeweizen  = new Getränke("Hefeweizen ", "2.70", 1);
		li_getraenkekarte.add(Hefeweizen );
		
		Getränke Radler   = new Getränke("Radler  ", "2.70", 1);
		li_getraenkekarte.add(Radler  );
		
		Getränke Corona  = new Getränke("Corona ", "3.20", 1);
		li_getraenkekarte.add(Corona );
		
		Getränke Apfelschorle   = new Getränke("Apfelschorle  ", "2.20", 1);
		li_getraenkekarte.add(Apfelschorle  );
		
		Getränke Cola  = new Getränke("Cola ", "2.20", 1);
		li_getraenkekarte.add(Cola );
		
		Getränke Weinschorle   = new Getränke("Weinschorle  ", "4.20", 1);
		li_getraenkekarte.add(Weinschorle  );
		
		Getränke Fanta   = new Getränke("Fanta  ", "2.20", 1);
		li_getraenkekarte.add(Fanta  );
		
		Getränke Sprite  = new Getränke("Sprite ", "2.20", 1);
		li_getraenkekarte.add(Sprite );
		
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

