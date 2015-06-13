package supermariopizza;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.net.URL;
public class GUI {
	
	public static Clip sound_background;
	public static Clip sound_hinzufuegen;
	public static Clip sound_bestellen;
	public static Clip sound_remove;
	
	static ArrayList <Pizza> li_speisekarte = new ArrayList <Pizza>();
	static ArrayList <Getränke> li_getraenkekarte = new ArrayList <Getränke>();
	static ArrayList <Bestellung> li_Rechnung = new ArrayList<Bestellung>();
	
	public static void fensteroeffnen() throws Exception{
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
		backgroundsound();
		
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
		
		
		Pizza Funghi = new Pizza("Funghi", "7.00", 1);
		li_speisekarte.add(Funghi);
		
		Pizza Tonno = new Pizza("Tonno", "8.00", 1);
		li_speisekarte.add(Tonno);
				
		Pizza Margherita = new Pizza("Margherita", "5.00", 1);
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
	
	
	
	
	
	
	
	public static void backgroundsound() throws Exception{
			//Musik erstellen
            try {
            	ClassLoader loader = Thread.currentThread().getContextClassLoader();
            	URL resource = loader.getResource("Sounds/backgroundsound.wav");
                sound_background = AudioSystem.getClip();
                sound_background.open(AudioSystem.getAudioInputStream(resource));
                sound_background.loop(Clip.LOOP_CONTINUOUSLY);
            //Lautstärke
                FloatControl gainControl = (FloatControl) sound_background.getControl(FloatControl.Type.MASTER_GAIN);
                    double gain = .08D;
                    float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
                    gainControl.setValue(dB);

                    BooleanControl muteControl = (BooleanControl) sound_background
                        .getControl(BooleanControl.Type.MUTE);
                    muteControl.setValue(true);

                    muteControl.setValue(false);
                }catch (IOException e){}      
	}
	public static void hinzufuegensound() throws Exception{
		//Musik erstellen
        try {
        	ClassLoader loader = Thread.currentThread().getContextClassLoader();
        	URL resource = loader.getResource("Sounds/hinzufuegensound.wav");
            sound_hinzufuegen = AudioSystem.getClip();
            sound_hinzufuegen.open(AudioSystem.getAudioInputStream(resource));
            sound_hinzufuegen.start();
        //Lautstärke
            FloatControl gainControl = (FloatControl) sound_hinzufuegen.getControl(FloatControl.Type.MASTER_GAIN);
                double gain = .08D;
                float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
                gainControl.setValue(dB);

                BooleanControl muteControl = (BooleanControl) sound_hinzufuegen
                    .getControl(BooleanControl.Type.MUTE);
                muteControl.setValue(true);

                muteControl.setValue(false);
            }catch (IOException e){}      
		
	}
	public static void bestellensound() throws Exception{
		//Musik erstellen
        try {
        	ClassLoader loader = Thread.currentThread().getContextClassLoader();
        	URL resource = loader.getResource("Sounds/bestellensound.wav");
            sound_bestellen = AudioSystem.getClip();
            sound_bestellen.open(AudioSystem.getAudioInputStream(resource));
            sound_bestellen.start();
        //Lautstärke
            FloatControl gainControl = (FloatControl) sound_bestellen.getControl(FloatControl.Type.MASTER_GAIN);
                double gain = .25D;
                float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
                gainControl.setValue(dB);

                BooleanControl muteControl = (BooleanControl) sound_bestellen
                    .getControl(BooleanControl.Type.MUTE);
                muteControl.setValue(true);

                muteControl.setValue(false);
            }catch (IOException e){}      
		
	}
	public static void removesound() throws Exception{
		//Musik erstellen
        try {
        	ClassLoader loader = Thread.currentThread().getContextClassLoader();
        	URL resource = loader.getResource("Sounds/removesound.wav");
            sound_remove = AudioSystem.getClip();
            sound_remove.open(AudioSystem.getAudioInputStream(resource));
            sound_remove.start();
        //Lautstärke
            FloatControl gainControl = (FloatControl) sound_remove.getControl(FloatControl.Type.MASTER_GAIN);
                double gain = .3D;
                float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
                gainControl.setValue(dB);

                BooleanControl muteControl = (BooleanControl) sound_remove
                    .getControl(BooleanControl.Type.MUTE);
                muteControl.setValue(true);

                muteControl.setValue(false);
            }catch (IOException e){}      
		
	}
}

