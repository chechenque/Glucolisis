package com.glucolisis.glucolisis.modelo;

import java.util.ArrayList;
import java.util.List;

public class Analizador {
	private int a;
	private int c;
	private int g;
	private int t;
	private String secuencia;
	private String transcripcion;
	private List<String> traduccion;
	private List<String> codones;
	private List<String> kmeros;
	
	/**
	 * Metodo constructor
	 * @param secuencia La secuencia con la que se trabajara
	 */
	public Analizador(String secuencia) {
		this.secuencia = secuencia;
		this.transcripcion = transcripcion();
		codones = agrupa(3);
		rellena();
		this.traduccion = traduccionS("AUG"); 
	}

	public List<String> agrupa(int n){
		List <String> lista = new ArrayList<>();
		int m = 0;
		if(secuencia.length()%n == 0) {
			for(int i = 0; i < secuencia.length()/n; ++i) {
				String codon = "";
				codon += transcripcion.substring(m, m+n);
				lista.add(codon);
				m+=n;
			}
		}else{
			for(int i = 0; i < (secuencia.length()/n); ++i) {
				String codon = "";
				codon += transcripcion.substring(m, m+n);
				lista.add(codon);
				m+=n;
			}
			lista.add(transcripcion.substring(m));
		}
		return lista;
	}
	
	/**
	 * Metodo que establece la proporcion de cada base
	 */
	public void rellena() {
		this.a = apariciones('A');
		this.c = apariciones('C');
		this.g = apariciones('G');
		this.t = apariciones('T');
	}
	
	
	public double[] proporcion(){
		double[] proporciones = new double[4];
		
		proporciones[0] = a/secuencia.length()*100;
		proporciones[1] = c/secuencia.length()*100;
		proporciones[2] = g/secuencia.length()*100;
		proporciones[3] = t/secuencia.length()*100;
		
		return proporciones;
	}
	
	
	public double porcentajeGC() {
		return (c+g)/secuencia.length()*100;
	}
	
	
	public String transcripcion() {
		return secuencia.replace('T', 'U');
	}
	
	/**
	 * Metodo que calcula el numero de apariciones de un caracter en una cadena dada
	 * @param caracter El caracter con el que se hara la busqueda
	 * @return El numero de apariciones, en caso de no tener ninguna se regresa 0
	 */
	public int apariciones(char caracter) {
		int num = 0;
		for(int i = 0; i< secuencia.length(); ++i) {
			if(caracter == secuencia.charAt(i)) {
				num +=1;
			}
		}
		return num;
	}
	
	public List<String> traduccionS(String codon){
		List<String> lista = new ArrayList<>();
		Constants c = new Constants();
		
		boolean codificante = false;
		
		for(String elemento: codones) {
			if(elemento.equals(codon) && codificante == false) {
				codificante = true;
			}
			if(codificante == true) {
				lista.add(c.aminoacidos.get(elemento));
				if(elemento.equals("UAA") || elemento.equals("UAG") || elemento.equals("UGA")) {
					codificante = false;
				}
			}
		}
		return lista;
	}
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public String getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(String secuencia) {
		this.secuencia = secuencia;
	}

	public String getTranscripcion() {
		return transcripcion;
	}

	public void setTranscripcion(String transcripcion) {
		this.transcripcion = transcripcion;
	}

	public List<String> getTraduccion() {
		return traduccion;
	}

	public void setTraduccion(List<String> traduccion) {
		this.traduccion = traduccion;
	}

	public List<String> getCodones() {
		return codones;
	}

	public void setCodones(List<String> codones) {
		this.codones = codones;
	}
	
	
	
	public List<String> getKmeros() {
		return kmeros;
	}

	public void setKmeros(List<String> kmeros) {
		this.kmeros = kmeros;
	}

	public List<String> calculaKmeros(int k){
		List<String> kmeros = new ArrayList<>();
		for(int i = 0; i < secuencia.length()-k+1; ++i) {
			kmeros.add(secuencia.substring(i, i+k));
		}
		return kmeros;
	}
	
	

	public static void main(String[] args) {
		Analizador ana = new Analizador("AUGATCGATTTTUGA");
		
		System.out.println("Secuencia entrante: " + ana.getSecuencia());
		System.out.println("");
		
		System.out.println("Transcripcion: " + ana.getTranscripcion());
		System.out.println("");

		System.out.println("Sepacion de codones");
		for(int i= 0; i< ana.getCodones().size(); ++i) {
			System.out.println(ana.getCodones().get(i));
		}
		System.out.println("");
		
		System.out.println("Traduccion");
		for(int i= 0; i< ana.getTraduccion().size(); ++i) {
			System.out.println(ana.getTraduccion().get(i));
		}
		System.out.println("");
		
		System.out.println("K-meros con una k = 5");
		ana.setKmeros(ana.calculaKmeros(5));
		for(int i = 0; i<ana.getKmeros().size(); ++i) {
			System.out.println(ana.getKmeros().get(i));
		}
		
	}
	
}