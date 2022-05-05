package com.glucolisis.glucolisis.modelo;

public class Glucolisis {
	private static int ATP = 2;
	private static int ADP = 0;
	
	public Glucolisis() {
		
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
}
