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
e i seguenti metodi:
inserisciMoneta(float moneta)              
erogaBevanda(String nomeBevanda)    */

public class distributoreBevande {
	Scanner sc=new Scanner(System.in);
	private float credito;
	private HashMap<String,Float> bevande=new HashMap<>();
	private ArrayList<Float> moneteAccettate= new ArrayList<>(); 
	float monetaInserita;
	

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
		
	}
	
	

	/*(se esiste la bevanda e il credito è sufficiente mostra un messaggio 
	 "bevanda erogata. Il tuo resto è: ...."*/
	public void erogaBevande ()
	{
		System.out.println("Cosa vuoi bere?");
		String scelta=sc.nextLine();
		if(bevande.containsKey(scelta))
		{
			for(int i=0;i<bevande.size();i++)
			{
				if(bevande.containsValue(scelta))
				{
					System.out.println("Prezzo: "+bevande.get(scelta));
				}
			}
			System.out.println("Bevanda erogata");
			
		}
	}
	
	
	
	
}
