package com.glucolisis.glucolisis.modelo;

public class Aminoacido {
	private String codon;
	private String aminoacido;
	
	public Aminoacido(String codon, String aminoacido) {
		this.codon = codon;
		this.aminoacido = aminoacido;
	}

	public String getCodon() {
		return codon;
	}

	public void setCodon(String codon) {
		this.codon = codon;
	}

	public String getAminoacido() {
		return aminoacido;
	}

	public void setAminoacido(String aminoacido) {
		this.aminoacido = aminoacido;
	}
	
	
}
