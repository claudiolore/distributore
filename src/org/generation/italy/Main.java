package org.generation.italy;

import java.util.Scanner;

public class Main {

/*  Modificare le classi dell'esercizio "distributore bevande" 
  		rendendo tutti gli attributi "private".
	Generare un costruttore per ogni classe, rendendo parametrico 	
		ogni parametro che non deve avere un valore predefinito
	Generare quindi per ogni attributo gli opportuni getter e 
		setter (aggiungendo eventuali controlli di validità).
	Modificare il codice per adattarlo alle modifiche fatte. 		*/	
	
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);	
	float monetaInserita;
	String  risposta="";
	DistributoreBevande db1=new DistributoreBevande();
	int scelta;
	
	do {
		System.out.println("Bevande disponibili");
		db1.elencaBevande();
		db1.getCredito();
		do {
			System.out.println("Inserisci moneta");
			monetaInserita=Float.parseFloat(sc.nextLine());
			db1.inserisciMoneta(monetaInserita);
			db1.getCredito();
			System.out.println("Vuoi inserire altre monete?");
			risposta=sc.nextLine();
		
	}while(risposta.equals("si"));

	
		System.out.println("\nScegli una bevanda");
		scelta =Integer.parseInt(sc.nextLine());
		db1.erogaBevande(scelta);
		System.out.println("\nIl tuo credito ora: ");
		db1.getCredito();
		System.out.println("\nVuoi altro?");
		risposta=sc.nextLine();
	} while(risposta.equals("si"));
	
	
}
}
