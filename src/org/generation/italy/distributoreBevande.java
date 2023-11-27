package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
Esercizio: Distributore bevande
Scrivere una classe DistributoreBevande con i seguenti attributi:

bevande: HashMap<String,> che contiene un elenco di bevande, 
per ognuna bevanda il nome e il prezzo
credito: float che indica il denaro inserito nel distributore
e i seguenti metodi:  */

public class distributoreBevande {
	
	private float credito;
	private HashMap<String,Float> bevande=new HashMap<>();
	private ArrayList<Float> moneteAccettate= new ArrayList<>(); 
	

	public distributoreBevande() {
	
			bevande.put("coca-cola",2.0f);
			bevande.put("fanta",2.0f);
			bevande.put("sprite",1.80f);
			bevande.put("red bull",4.0f);
			bevande.put("acqua",0.5f);
			moneteAccettate.add(0.10f);
			moneteAccettate.add(0.20f);
			moneteAccettate.add(0.50f);
			moneteAccettate.add(1.0f);
			moneteAccettate.add(2.0f);
			credito=0;
	}
	
	
	public void inserisciMoneta (float monetaInserita)
	{
			
			if(moneteAccettate.contains(monetaInserita))
			{
				credito+=monetaInserita;
			}
			
	}
	
	
	public void erogaBevande (String scelta)
	{
		if(bevande.containsKey(scelta)&&credito>bevande.get(scelta))
		{
			System.out.println("Bevanda erogata: "+bevande.get(scelta));
			credito=credito-bevande.get(scelta);
		}
		else 
		{
			System.out.println("Benvanda non disponibile o credito insufficiente");
		}
	}
	
	public void elencaBevande()
	{
		for(String n:bevande.keySet())
			System.out.println(n + " " + bevande.get(n) + " " +  bevande.get(n) + "�");
	}
	
	public void mostraCredito()
	{
		System.out.println("Credito: "+credito);
	}
	
}
