package com.glucolisis.glucolisis.modelo;

public class Calculadora {
	private int glucosa;
	private int piruvato;
	private int NAD;
	private int NADH;
	
	
	private int ATPr;
	private int ATP;
	
	private int ADPr;
	private int ADP;
	
	
	
	
	public Calculadora(int glucosa) {
		this.glucosa = glucosa;
		
		this.ATPr = 2*glucosa;
		this.ATP = 0;
		
		this.ADPr = 4*glucosa;
		this.ADP = 0;
		
		this.NAD = 2*glucosa;
		this.NADH = 0;
		
		this.piruvato =0;
	}


	/**
	 * Metodo que nos ayudara mas adelante con otras rutas
	 * @return El calculo total de ATP
	 */
	public int calculaTotal() {
		return this.ATP+3*this.NADH;
	}
	
	public void generaResultado() {
		this.ATPr -= 2*glucosa;
		
		this.ADP += 2*glucosa;
		
		this.ATP = 4*glucosa;
		
		this.ADPr -= 4*glucosa;
		
		this.NADH = NAD;
		this.NAD = 0;
		this.piruvato = 2*glucosa;
		
	}
	
	public void corre() {
		generaResultado();
		System.out.println(toString());
		calculaTotal();
	}
	
	public String reactivos() {
		return "Moleculas de Glucosa: "+ glucosa + "\nATP Reactivos: " + ATPr + "\nADP Reactivos: " + ADPr + "\nNAD: " + NAD + "\nNADH: " + NADH + "\nPiruvato: " + piruvato;
	}
	
	@Override
	public String toString() {
		return "Moleculas de Glucosa: "+ glucosa + "\nATP Reactivos: " + ATPr + "\nADP Reactivos: " + ADPr + "\nATP: "+ ATP + "\nADP: " + ADP +  "\nNADH: " + NADH + "\nPiruvato: " + piruvato;
	}
	public static void main(String[] args) {
		Calculadora cal = new Calculadora(5);
		System.out.println("Antes de Ejecutar");
		System.out.println(cal.reactivos()+ "\n");
		System.out.println("Despues de Ejecutar");
		cal.corre();
	}
}
