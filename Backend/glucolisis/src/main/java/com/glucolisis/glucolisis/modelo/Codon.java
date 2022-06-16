package com.glucolisis.glucolisis.modelo;

public class Codon {
	private String codon;
	private int apariciones;
	
	public Codon(String codon, int apariciones) {
		super();
		this.codon = codon;
		this.apariciones = apariciones;
	}

	public String getCodon() {
		return codon;
	}

	public void setCodon(String codon) {
		this.codon = codon;
	}

	public int getApariciones() {
		return apariciones;
	}

	public void setApariciones(int apariciones) {
		this.apariciones = apariciones;
	}
}
