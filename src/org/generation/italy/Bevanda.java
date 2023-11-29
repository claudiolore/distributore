package org.generation.italy;

public class Bevanda {
	
	private Integer codice;
	private String nome;
	private float prezzo;
	private int quantitaDisponibile;
	
	public Bevanda(Integer codice, String nome, float prezzo, int quantitaDisponibile) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantitaDisponibile = quantitaDisponibile;
		quantitaDisponibile=5;
	}

	public Integer getCodice() {
		return codice;
	}

	public void setCodice(Integer codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantitaDisponibile() {
		return quantitaDisponibile;
	}

	public void setQuantitaDisponibile(int quantitaDisponibile) {
		this.quantitaDisponibile = quantitaDisponibile;
	}

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
