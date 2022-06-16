package com.glucolisis.glucolisis.modelo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Glucolisis implements Runnable{
	private static int ATP = 2;
	private static int ADP = 4;
	private static int NAD = 2;
	private static int NADH = 0;//3-ATP
	private static int PIRUVATO = 0;
	Lock candado = new ReentrantLock();
	
	public Glucolisis() {
		
	}
	
	public void corre() {
		imprime();
		fosforilacion(true);
		imprime();
		System.out.println("Glucosa-6-P");
		System.out.println("Fractosa-6-P");
		fosforilacion(true);
		imprime();
		System.out.println("Fructosa-1-6-bifosfato");
		//Aqui se divide en 2
		int id = Integer.parseInt(Thread.currentThread().getName());
		if(id%2 == 0) {
			System.out.println("Gliceraldehido-3-P");
		}else {
			System.out.println("Dihidroxigenasa");
			//Enzimas
			System.out.println("Gliceraldehido-3-P");
			System.out.println("Glicerato-1,3-Bifosfato");
			fosfogliceratoQuinasa();
			imprime();
			System.out.println("Glicerato-3-P");
			//Mutasa
			System.out.println("Glicerato-2-D");
			//Enolasa
			System.out.println("Fosfo___-piruvato");
			piruvatoQuinasa();
			imprime();
			System.out.println("Piruvato");
			PIRUVATO++;
			//Oxidacion
		}
	}
	
	public void fosforilacion(boolean enzima) {
		System.out.println("Comenzando Fosforilacion");
		ATP--;
		System.out.println("Se han tomado 1 ATP");
		ADP++;
		System.out.println("Se han generado 1 ADP");
	}
	
	public void fosfogliceratoQuinasa() {
		System.out.println("Comenzando Fosfoglicerato Quinasa");
		ADP--;
		ATP++;
	}
	
	public void piruvatoQuinasa() {
		System.out.println("Comenzando Piruvato Quinasa");
		ADP--;
		ATP++;
	}
	
	public static int getATP() {
		return ATP;
	}
	
	public static int getADP() {
		return ADP;
	}

	public static void setATP(int aTP) {
		ATP = aTP;
	}

	public static void setADP(int aDP) {
		ADP = aDP;
	}
	
	public static void imprime() {
		System.out.println("ATP: " + ATP);
		System.out.println("ADP: " + ADP);
	}
	
	@Override
	public void run() {
		corre();
		
	}
	
	public static void main(String[] args) {
		Glucolisis g1, g2;
		
		g1 = new Glucolisis();
		
		g2 = new Glucolisis();
		
		for(int i=0; i< 10; ++i) {
			Thread t1 = new Thread(g1,""+i);
			t1.start();
		}
		
		
		
		
		
		//g1.getATP()+g1.getNADH()*3;
	}

	
}
