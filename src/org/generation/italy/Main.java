package org.generation.italy;

import java.util.Scanner;

public class Main {

/*  modificare metodi per accettare valori validi 	e bevande disponibili	*/	
	
	
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);	
	float monetaInserita;
	String  risposta="";
	DistributoreBevande db1=new DistributoreBevande();
	int scelta, quantita;
	
	do {
		System.out.println("Bevande disponibili");
		db1.elencaBevande();
		System.out.println("\nIl tuo credito attuale: "+ db1.getCredito());
		
		System.out.println("\n\t     MENU INIZIALE");
		System.out.println("\t1 - Compra bevanda");
		System.out.println("\t2 - Inserisci monete");
		System.out.println("\t3 - Controlla disponibilita");
		System.out.println("\t4 - Carica");
		risposta=sc.nextLine();
		
		if(risposta.equals("1"))			//compra bevanda
		{
			do {
				System.out.println("\nIl tuo credito ora: "+db1.getCredito());
				System.out.println("\nScegli una bevanda");
				scelta =Integer.parseInt(sc.nextLine());
				db1.erogaBevande(scelta);
				System.out.println("\nVuoi altro?");
				risposta=sc.nextLine();
			}
			while(risposta.equalsIgnoreCase("si"));	
		}
		else if (risposta.equals("2"))		//inserisci moneta
		{
			do {
				System.out.println("Inserisci moneta");
				monetaInserita=Float.parseFloat(sc.nextLine());
				db1.inserisciMoneta(monetaInserita);
				System.out.println("\nIl tuo credito ora: "+db1.getCredito());
				System.out.println("\nVuoi inserire altre monete?");
				risposta=sc.nextLine();
			}
			while(risposta.equalsIgnoreCase("si"));
		}
		else if (risposta.equals("3"))		//controlla disponibilita
		{
			do {
				System.out.println("\nScegli una bevanda di cui controllare la quantita");
				scelta =Integer.parseInt(sc.nextLine());
				System.out.println("Hai scelto: "+scelta);
				System.out.println("\nDisponibilita: "+ db1.controlloDisponibilita(scelta));
				System.out.println("Quanti ne vuoi aggiungere?");
				quantita=Integer.parseInt(sc.nextLine());
				db1.caricaBevanda(scelta, quantita);
				System.out.println("\nVuoi controllare altro?");
				risposta=sc.nextLine();
			}
			while(risposta.equalsIgnoreCase("si"));	
		}
		else if (risposta.equals("4"))		//carica 
		{
			do {
				System.out.println("\nScegli una bevanda");
				scelta =Integer.parseInt(sc.nextLine());
				System.out.println("Qquante ne vuoi aggiungere?");
				quantita=Integer.parseInt(sc.nextLine());
				db1.caricaBevanda(scelta,quantita);;
				System.out.println("\nVuoi caricare altro?");
				risposta=sc.nextLine();
			}
			while(risposta.equalsIgnoreCase("si"));
		}
		else
		{
			System.out.println("Inserimento non valido riprova");
			risposta="si";
			continue;
		}
		
		System.out.println("vuoi tornare al menu(1) o uscire(2)?");
		risposta=sc.nextLine();
		if(risposta.equals("1"))
		{
			risposta="si";
			continue;
		}
		else if (risposta.equals("2"))
		{
			risposta="no";
			continue;
		}
		else 
		{
			System.out.println("inserimento non valito");
		}
		System.out.println("Vuoi continuare?");
		risposta=sc.nextLine();
	}
	while(risposta.equalsIgnoreCase("si"));
	
	System.out.println("ARRIVEDERCI");
}
}
