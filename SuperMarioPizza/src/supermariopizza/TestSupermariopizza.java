package supermariopizza;


import junit.framework.TestCase;


@SuppressWarnings("static-access")
public class TestSupermariopizza extends TestCase {
	
	public void testPizza(){
		
	
		// vorbereitungen
		GUI_Hauptfenster GUIH =new GUI_Hauptfenster();
		
		
		GUI G = new GUI();
		G.erstellungSpeisekarte();
		G.erstellungGetraenkekarte();
			
		
		Pizza PizzaAuswahl = new Pizza("-- Bitte wählen sie --", "", 1);
		GUIH.pizza_Liste.addItem(PizzaAuswahl.getName());
		
		for(int i = 0; i < GUI.li_speisekarte.size(); i++){
			GUIH.pizza_Liste.addItem(G.li_speisekarte.get(i).getName());
		}
		
		
		// Chef pizza wird ausgewählt
		GUIH.pizza_Liste.setSelectedIndex(4);
				
		// Menge wird auf 3 gesetzt
		GUIH.MengePizza.setValue(3);
		
				try{
		GUIH.pizzaHinzufügen();
		
		}catch(Exception e)
		{
			fail();

		}

		assertEquals(GUI_Hauptfenster.table.getValueAt(0, 0).toString(),"Chef	");
		assertTrue("Anzahl stimmt nicht", (int)GUI_Hauptfenster.table.getValueAt(0, 1) == 3);
		
	}
	
	
	public void testGetränk(){
		
		

		// vorbereitungen
		GUI_Hauptfenster GUIH =new GUI_Hauptfenster();
		
		
		GUI G = new GUI();
		//G.erstellungSpeisekarte();
		G.erstellungGetraenkekarte();
			
		
		Getränke GetraenkeAuswahl = new Getränke("-- Bitte wählen sie --", "0.00", 0.00);
		GUIH.getränke_Liste.addItem(GetraenkeAuswahl.getName());
		
		for(int i = 0; i < GUI.li_getraenkekarte.size(); i++){
			GUIH.getränke_Liste.addItem(GUI.li_getraenkekarte.get(i).getName());
		}
		
		
		// Corona wird ausgewählt
		GUIH.getränke_Liste.setSelectedIndex(3);
				
		// Menge wird auf 2 gesetzt
		GUIH.MengeGetränke.setValue(2);
		
				try{
		GUIH.getränkeHinzufügen();
		
		}catch(Exception e)
		{
			fail();
		}

		assertEquals(GUI_Hauptfenster.table.getValueAt(0, 0).toString(),"Corona	");
		assertTrue("Anzahl stimmt nicht", (int)GUI_Hauptfenster.table.getValueAt(0, 1) == 2);
		
	}
	
	
	@SuppressWarnings("unused")
	public void testEigenePizza(){
		
		

		// vorbereitungen
		GUI_Hauptfenster GUIH =new GUI_Hauptfenster();
		
		
					
		GUI_EigenePizza GUIE = new GUI_EigenePizza();
		
				
		GUIE.chb_ananas.setSelected(true);
		GUIE.chb_meeresfruechte.setSelected(true); // mit meeresfrüchte und ananas
		GUIE.txt_pizzaname.setText("Test");//Name ist Test
		GUIE.sp_pizzamenge.setValue(3);// 3 dieser pizzen
		
		try{
		Eigene_Pizza.PizzaHinzufuegen();
		}catch(Exception e)
		{
			
		}
		

		assertEquals("Name Stimmt nicht",GUI_Hauptfenster.table.getValueAt(0, 0).toString(),"Test");
		assertTrue("Anzahl stimmt nicht", (int)GUI_Hauptfenster.table.getValueAt(0, 1) == 3);
		assertEquals("Preis stimmt nicht",GUI_Hauptfenster.table.getValueAt(0, 2).toString() , "18,00€");
		
		
	}
	
	
	public void testGroßeBestellung(){
		
		

		// vorbereitungen
		GUI_Hauptfenster GUIH =new GUI_Hauptfenster();
		
		
		GUI G = new GUI();
		G.erstellungSpeisekarte();
		G.erstellungGetraenkekarte();
			
		
		Pizza PizzaAuswahl = new Pizza("-- Bitte wählen sie --", "", 1);
		GUIH.pizza_Liste.addItem(PizzaAuswahl.getName());
		
		for(int i = 0; i < GUI.li_speisekarte.size(); i++){
			GUIH.pizza_Liste.addItem(G.li_speisekarte.get(i).getName());
		}

		
		Getränke GetraenkeAuswahl = new Getränke("-- Bitte wählen sie --", "0.00", 0.00);
		GUIH.getränke_Liste.addItem(GetraenkeAuswahl.getName());
		
		for(int i = 0; i < GUI.li_getraenkekarte.size(); i++){
			GUIH.getränke_Liste.addItem(GUI.li_getraenkekarte.get(i).getName());
		}
		
		
		// Radler wird ausgewählt
		GUIH.getränke_Liste.setSelectedIndex(2);
				
		// Menge wird auf 2 gesetzt
		GUIH.MengeGetränke.setValue(2);
		
				try{
		GUIH.getränkeHinzufügen();
		
		}catch(Exception e)
		{
			fail();
			
		}
				
		// Sprite, 0,5l wird ausgewählt
		GUIH.getränke_Liste.setSelectedIndex(12);
						
		// Menge wird auf 1 gesetzt
		GUIH.MengeGetränke.setValue(1);
				
				try{
		GUIH.getränkeHinzufügen();
				
		}catch(Exception e)
		{
			fail();
					
		}			
				
		// Peperoni pizza wird ausgewählt
		GUIH.pizza_Liste.setSelectedIndex(10);
						
		// Menge wird auf 15 gesetzt
		GUIH.MengePizza.setValue(15);
				
				try{
		GUIH.pizzaHinzufügen();
				
		}catch(Exception e)
		{
			fail();
		}				
		
				
		GUI_EigenePizza GUIE = new GUI_EigenePizza();
				
		GUIE.chb_peperoni.setSelected(true);
		GUIE.chb_paprika.setSelected(true);
		GUIE.chb_salami.setSelected(true); // mit peperoni paprika und salami
		GUIE.txt_pizzaname.setText("Testpizza");//Name ist Test
		GUIE.sp_pizzamenge.setValue(1);// 1 dieser pizzen
				
		try{
			Eigene_Pizza.PizzaHinzufuegen();
		}catch(Exception e)
		{
		}
		

		assertEquals(GUI_Hauptfenster.table.getValueAt(0, 0).toString(),"Radler	");
		assertTrue("Anzahl stimmt nicht", (int)GUI_Hauptfenster.table.getValueAt(0, 1) == 2);
		
		assertEquals(GUI_Hauptfenster.table.getValueAt(1, 0).toString(),"Sprite, 0,5l ");
		assertTrue("Anzahl stimmt nicht", (int)GUI_Hauptfenster.table.getValueAt(1, 1) == 1);

		assertEquals(GUI_Hauptfenster.table.getValueAt(2, 0).toString(),"Peperoni	");
		assertTrue("Anzahl stimmt nicht", (int)GUI_Hauptfenster.table.getValueAt(2, 1) == 15);

		assertEquals("Name Stimmt nicht",GUI_Hauptfenster.table.getValueAt(3, 0).toString(),"Testpizza");
		assertTrue("Anzahl stimmt nicht", (int)GUI_Hauptfenster.table.getValueAt(3, 1) == 1);
		assertEquals("Preis stimmt nicht",GUI_Hauptfenster.table.getValueAt(3, 2).toString() , "7,50€");
		
		assertEquals("Gesamtpreis stimmt nicht",GUIH.lblzwischensumme.getText(),"113,60€");

		
	}
	

}
