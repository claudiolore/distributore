package org.generation.italy;

public class Bevande {
	
/*Nella classe distributore modificare l'hashmap bevande in un HashMap<Integer, Bevande>
 	(chiave: codice della bevanda; valore: tutto l'oggetto bevanda), 
 	e modificare la classe Distributore di conseguenza, 
 	gestendo anche la quantità disponibile */
	
	Integer codice;
	String nome;
	float prezzo;
	int quantita;
	
	public Bevande(Integer codice, String nome, float prezzo, int quantita) {
	
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantita = quantita;
		quantita=5;
	}
	
	public void eroga()
	{
		quantita-=1;
	}
	
	public void carica()
	{
		quantita=quantita+quantita;
	}
	
	
}
