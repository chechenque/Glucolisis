package com.glucolisis.glucolisis.modelo;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	public static Map<String,String> aminoacidos = new HashMap<>();
	
	public Constants() {
		aminoacidos.put("AUG","Met");
		
		aminoacidos.put("UUU","Phe");
		
		aminoacidos.put("UUA","Leu");
		aminoacidos.put("UUG","Leu");
		aminoacidos.put("CUU","Leu");
		aminoacidos.put("CUC","Leu");
		aminoacidos.put("CUA","Leu");
		aminoacidos.put("CUG","Leu");
		
		aminoacidos.put("AUU","Iso");
		aminoacidos.put("AUC","Iso");
		aminoacidos.put("AUA","Iso");
		
		aminoacidos.put("GUU","Val");
		aminoacidos.put("GUC","Val");
		aminoacidos.put("GUA","Val");
		aminoacidos.put("GUG","Val");
		
		aminoacidos.put("UCU","Ser");
		aminoacidos.put("UCC","Ser");
		aminoacidos.put("UCA","Ser");
		aminoacidos.put("UCG","Ser");
		aminoacidos.put("AGU","Ser");
		aminoacidos.put("AGC","Ser");
		
		aminoacidos.put("CCU","Pro");
		aminoacidos.put("CCC","Pro");
		aminoacidos.put("CCA","Pro");
		aminoacidos.put("CCG","Pro");
		
		aminoacidos.put("ACU","Thr");
		aminoacidos.put("ACC","Thr");
		aminoacidos.put("ACA","Thr");
		aminoacidos.put("ACG","Thr");
		
		aminoacidos.put("GCU","Ala");
		aminoacidos.put("GCC","Ala");
		aminoacidos.put("GCA","Ala");
		aminoacidos.put("GCG","Ala");
		
		aminoacidos.put("UAU","Tyr");
		aminoacidos.put("UAC","Tyr");
		
		aminoacidos.put("CAU","His");
		aminoacidos.put("CAC","His");
		
		aminoacidos.put("CAA","Gln");
		aminoacidos.put("CAG","Gln");
		
		aminoacidos.put("AAU","Asn");
		aminoacidos.put("AAC","Asn");
		
		aminoacidos.put("GAU","Lys");
		aminoacidos.put("GAC","Lys");
		
		aminoacidos.put("GAU","Asp");
		aminoacidos.put("GAC","Asp");
		
		aminoacidos.put("GAA","Glu");
		aminoacidos.put("GAG","Glu");

		aminoacidos.put("UGU","Cys");
		aminoacidos.put("UGC","Cys");
		
		aminoacidos.put("UGG","Try");
		
		aminoacidos.put("CGU","Arg");
		aminoacidos.put("CGC","Arg");
		aminoacidos.put("CGA","Arg");
		aminoacidos.put("CGG","Arg");
		aminoacidos.put("AGA","Arg");
		aminoacidos.put("AGG","Arg");
		
		aminoacidos.put("GGU","Gly");
		aminoacidos.put("GCC","Gly");
		aminoacidos.put("GGA","Gly");
		aminoacidos.put("GGG","Gly");
		aminoacidos.put("GGC","Gly");
		
		aminoacidos.put("UAA","Stop");
		aminoacidos.put("UAG","Stop");
		aminoacidos.put("UGA","Stop");
	}
	
	public static void main(String[] args) {
		Constants c = new Constants();
		System.out.println(aminoacidos.get("AUG"));
	}
}