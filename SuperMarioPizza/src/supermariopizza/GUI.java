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
	public static Clip sound_ende;
	
	static ArrayList <Pizza> li_speisekarte = new ArrayList <Pizza>();
	static ArrayList <Getränke> li_getraenkekarte = new ArrayList <Getränke>();
	
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
		
		
		Pizza Funghi = new Pizza("Funghi\t", "6.00", 1);
		li_speisekarte.add(Funghi);
		
		Pizza Tonno = new Pizza("Tonno\t", "6.50", 1);
		li_speisekarte.add(Tonno);
				
		Pizza Margherita = new Pizza("Margherita", "5.00", 1);
		li_speisekarte.add(Margherita);
		
		Pizza Mozzarella = new Pizza("Chef\t", "7.00", 1);
		li_speisekarte.add(Mozzarella);
		
		Pizza Prosciutto = new Pizza("Prosciutto\t", "6.00", 1);
		li_speisekarte.add(Prosciutto);

		Pizza Vegetarier = new Pizza("Vegetarier\t", "6.50", 1);
		li_speisekarte.add(Vegetarier);
		
		Pizza Hawaii = new Pizza("Hawaii\t", "7.00", 1);
		li_speisekarte.add(Hawaii);
		
		Pizza Siciliana  = new Pizza("Siciliana\t", "6.50", 1);
		li_speisekarte.add(Siciliana );
		
		Pizza Salami = new Pizza("Salami\t", "6.00", 1);
		li_speisekarte.add(Salami);
		
		Pizza Peperoni = new Pizza("Peperoni\t", "6.50", 1);
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
		
		Getränke Radler   = new Getränke("Radler\t", "2.70", 1);
		li_getraenkekarte.add(Radler  );
		
		Getränke Corona  = new Getränke("Corona\t", "3.20", 1);
		li_getraenkekarte.add(Corona );
		
		Getränke ApfelschorleKlein   = new Getränke("Apfelschorle, 0,3l  ", "2.20", 0.3);
		li_getraenkekarte.add(ApfelschorleKlein  );
		
		Getränke ApfelschorleGroß = new Getränke("Apfelschorle, 0,5l", "3.20", 0.5);
		li_getraenkekarte.add(ApfelschorleGroß);
		
		Getränke ColaKlein  = new Getränke("Cola, 0,3l\t", "2.20", 0.3);
		li_getraenkekarte.add(ColaKlein );
		
		Getränke ColaGroß  = new Getränke("Cola, 0,5l\t", "3.20", 0.5);
		li_getraenkekarte.add(ColaGroß );
		
		Getränke Weinschorle   = new Getränke("Weinschorle  ", "4.20", 1);
		li_getraenkekarte.add(Weinschorle  );
		
		Getränke FantaKlein   = new Getränke("Fanta, 0,3l  ", "2.20", 1);
		li_getraenkekarte.add(FantaKlein  );
		
		Getränke FantaGroß  = new Getränke("Fanta, 0,5l  ", "3.20", 1);
		li_getraenkekarte.add(FantaGroß  );
		
		Getränke SpriteKlein  = new Getränke("Sprite, 0,3l ", "2.20", 1);
		li_getraenkekarte.add(SpriteKlein );
		
		Getränke SpriteGroß  = new Getränke("Sprite, 0,5l ", "3.20", 1);
		li_getraenkekarte.add(SpriteGroß );
				
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
	public static void endesound() throws Exception{
		//Musik erstellen
        try {
        	ClassLoader loader = Thread.currentThread().getContextClassLoader();
        	URL resource = loader.getResource("Sounds/ende.wav");
            sound_ende = AudioSystem.getClip();
            sound_ende.open(AudioSystem.getAudioInputStream(resource));
            sound_ende.start();
        //Lautstärke
            FloatControl gainControl = (FloatControl) sound_ende.getControl(FloatControl.Type.MASTER_GAIN);
                double gain = .3D;
                float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
                gainControl.setValue(dB);

                BooleanControl muteControl = (BooleanControl) sound_ende
                    .getControl(BooleanControl.Type.MUTE);
                muteControl.setValue(true);

                muteControl.setValue(false);
            }catch (IOException e){}      
		
	}
}

