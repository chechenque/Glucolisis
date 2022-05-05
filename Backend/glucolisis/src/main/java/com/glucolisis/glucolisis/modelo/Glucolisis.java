package com.glucolisis.glucolisis.modelo;

import java.util.concurrent.locks.Lock;


public class Glucolisis {
	private static int ATP = 2;
	private static int ADP = 0;
	Lock candado;
	
	public Glucolisis() {
		
	}
	
	public void corre() {
		fosforilacion(true);
		//Glucosa-6-P
		//Fractosa-6-P
	}
	
	public void fosforilacion(boolean enzima) {
		
		ATP--;
		ADP++;
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
	
	public static void main(String[] args) {
		Glucolisis g1, g2;
		
		g1 = new Glucolisis();
		
		g2 = new Glucolisis();
		
		g1.fosforilacion(true);
		
	}
}
