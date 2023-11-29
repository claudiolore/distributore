package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class DistributoreBevande {
	
	private float credito;
	private HashMap<Integer,Bevanda> bevande=new HashMap<>();
	private ArrayList<Float> moneteAccettate= new ArrayList<>(); 
	
	public DistributoreBevande() {
			bevande.put(1, new Bevanda(1, "coca", 1.50f));
			bevande.put(2, new Bevanda(2, "fanta", 1.70f));
			bevande.put(3, new Bevanda(3, "redbull", 3.50f));
			bevande.put(4, new Bevanda(4, "acqua", 0.50f));
			bevande.put(5, new Bevanda(5, "sprite", 2.50f));
			moneteAccettate.add(0.10f);
			moneteAccettate.add(0.20f);
			moneteAccettate.add(0.50f);
			moneteAccettate.add(1.0f);
			moneteAccettate.add(2.0f);
			moneteAccettate.add(15.0f);
			credito=0;
	}
	
	public void inserisciMoneta (float monetaInserita){
			if(moneteAccettate.contains(monetaInserita))
			{
				credito+=monetaInserita;
			}
			else
			{
				System.out.println("\nMoneta non supportata, ritenta");
			}
	}
	
	public void erogaBevande (Integer scelta) {
		if(bevande.containsKey(scelta)&&credito>bevande.get(scelta).getPrezzo())
		{
			if(bevande.get(scelta).getQuantitaDisponibile()>0)
			{
				System.out.println("Bevanda erogata: "+bevande.get(scelta).getNome());
				credito=credito-bevande.get(scelta).getPrezzo();
				bevande.get(scelta).eroga();
			}
			else
			{
				System.out.println("Sono finite");
			}
		}
		else 
		{
			System.out.println("Benvanda non disponibile o credito insufficiente");
		}
	}
	
	public void elencaBevande() {
		for(Integer n:bevande.keySet())
			System.out.println(n + "  " + bevande.get(n).getNome() +" "+ bevande.get(n).getPrezzo() + "€");
	}
	
	public void caricaBevanda(Integer scelta, Integer quantita) {
		if(bevande.containsKey(scelta))
		{
			bevande.get(scelta).carica(quantita);
		}
	}
	
	public void controlloDisponibilita(Integer scelta) {
		if(bevande.containsKey(scelta))
		{
			System.out.println(bevande.get(scelta).getQuantitaDisponibile());
		}
	}
	
	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}

	public HashMap<Integer, Bevanda> getBevande() {
		return bevande;
	}

	public void setBevande(HashMap<Integer, Bevanda> bevande) {
		this.bevande = bevande;
	}

	public ArrayList<Float> getMoneteAccettate() {
		return moneteAccettate;
	}

	public void setMoneteAccettate(ArrayList<Float> moneteAccettate) {
		this.moneteAccettate = moneteAccettate;
	}
	

	
}
