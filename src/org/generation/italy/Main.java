package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

/*Versione 2:
Aggiungere una classe Bevanda con i seguenti attributi:
codice (Integer)
nome (String)
prezzo (float)
quantitąDisponibile (int)
Scrivere per la classe Bevanda un costruttore parametrico 
con i parametri: codice, nome, prezzo. La quantitąDisponibile 
sarą sempre 5 per tutte le nuove bevande.
Gli attributi di Bevanda sono tutti public (per il momento).

I metodi della classe Bevanda sono:
eroga():   decrementa la quantitą disponibile di 1
carica(int quantitą): incrementa la quantitą disponibile del valore quantitą
Nella classe distributore modificare l'hashmap bevande in un HashMap<Integer, Bevande>  (chiave: codice della bevanda; valore: tutto l'oggetto bevanda), e modificare la classe Distributore di conseguenza, gestendo anche la quantitą disponibile
 */
	distributoreBevande db1=new distributoreBevande();
	
	db1.inserisciMoneta();
	db1.erogaBevande();
		
	}

}
