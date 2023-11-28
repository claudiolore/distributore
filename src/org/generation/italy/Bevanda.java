package org.generation.italy;

public class Bevanda {
	
/*Nella classe distributore modificare l'hashmap bevande in un HashMap<Integer, Bevande>
 	(chiave: codice della bevanda; valore: tutto l'oggetto bevanda), 
 	e modificare la classe Distributore di conseguenza, 
 	gestendo anche la quantità disponibile */
	
	Integer codice;
	String nome;
	float prezzo;
	int quantitaDisponibile;
	
	public Bevanda(Integer codice, String nome, float prezzo) {
	
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		quantitaDisponibile=5;
	}
	
	public void eroga()
	{
		quantitaDisponibile-=1;
	}
	
	public void carica(int quantita)
	{
		quantita=quantitaDisponibile+quantita; 
	}
	
	
}
