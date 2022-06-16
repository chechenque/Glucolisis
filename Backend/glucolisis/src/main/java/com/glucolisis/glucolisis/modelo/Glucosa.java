package com.glucolisis.glucolisis.modelo;

public class Glucosa {
	private int glucosa;
    private int atp;
    private int adp;
    private int nad;
    private int nadh;
    private int piruvato;

    public Glucosa(){
        this.atp = 2;
        this.adp = 4;
        this.nad = 2;
        this.nadh = 0;
        this.piruvato = 0;
    }

	public int getGlucosa() {
		return glucosa;
	}

	public void setGlucosa(int glucosa) {
		this.glucosa = glucosa;
	}

	public int getAtp() {
		return atp;
	}

	public void setAtp(int atp) {
		this.atp = atp;
	}

	public int getAdp() {
		return adp;
	}

	public void setAdp(int adp) {
		this.adp = adp;
	}

	public int getNad() {
		return nad;
	}

	public void setNad(int nad) {
		this.nad = nad;
	}

	public int getNadh() {
		return nadh;
	}

	public void setNadh(int nadh) {
		this.nadh = nadh;
	}

	public int getPiruvato() {
		return piruvato;
	}

	public void setPiruvato(int piruvato) {
		this.piruvato = piruvato;
	}
}
