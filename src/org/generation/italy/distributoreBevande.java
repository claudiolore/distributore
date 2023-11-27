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
	Scanner sc=new Scanner(System.in);
	private float credito;
	private HashMap<String,Float> bevande=new HashMap<>();
	private ArrayList<Float> moneteAccettate= new ArrayList<>(); 
	float monetaInserita;
	String scelta, risposta;

	public distributoreBevande(float credito,  HashMap<String, Float> bevande,
			ArrayList<Float> moneteAccettate) {
		super();
		this.credito = credito;
		this.bevande = bevande;
		this.moneteAccettate = moneteAccettate;
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
	



	/*(inserisce una moneta nel ditributore incrementando il credito)*/
	public void inserisciMoneta ()
	{
		do {
			System.out.println("Inserisci una moneta (0.10/0.20/0.50/1.0/2.0)");
			monetaInserita=Float.parseFloat(sc.nextLine());
			
			if(moneteAccettate.contains(monetaInserita))
			{
				credito+=monetaInserita;
				System.out.println("Il tuo credito è: "+credito);
			}
			else
			{
				System.out.println("Moneta non esistente o accettata");
			}
			System.out.println("Vuoi inserire una nuova moneta?");
			risposta=sc.nextLine();
		}while(risposta.equals("si"));
	}
	
	

	/*(se esiste la bevanda e il credito è sufficiente mostra un messaggio 
	 "bevanda erogata. Il tuo resto è: ...."*/
	public void erogaBevande ()
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
	
	
	
	
}
