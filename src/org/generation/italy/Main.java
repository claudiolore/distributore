package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);	
	float monetaInserita;
	String  risposta="";
	DistributoreBevande db1=new DistributoreBevande();
	int scelta;
	
	System.out.println("Bevande disponibili");
	db1.elencaBevande();
	db1.mostraCredito();
	do {
		System.out.println("Inserisci moneta");
		monetaInserita=Float.parseFloat(sc.nextLine());
		db1.inserisciMoneta(monetaInserita);
		db1.mostraCredito();
		System.out.println("Vuoi inserire altre monete?");
		risposta=sc.nextLine();
		
	}while(risposta.equals("si"));

	do {
		System.out.println("\nScegli una bevanda");
		scelta =Integer.parseInt(sc.nextLine());
		db1.erogaBevande(scelta);
		System.out.println("\nIl tuo credito ora: ");
		db1.mostraCredito();
		System.out.println("\nVuoi altro?");
		risposta=sc.nextLine();
	} while(risposta.equals("si"));
	
	
}
}
