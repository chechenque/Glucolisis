export class Calculadora{
    glucosa: number;
    piruvato: number;
    nad: number;
    nadh: number;

    atp: number;
    atpr: number;

    adp: number;
    adpr: number;
    

    constructor(glucosa:number) {
        this.glucosa = glucosa;
        
        this.atpr = 2*glucosa;
        this.atp = 0;

        this.adpr = 4*glucosa;
        this.adp = 0;

        this.nad = 2*glucosa;
        this.nadh = 0;

        this.piruvato = 0;
    }

    generaResultado(){
        this.atpr -= 2*this.glucosa;
		
		this.adp += 2*this.glucosa;
		
		this.atp = 4*this.glucosa;
		
		this.adpr -= 4*this.glucosa;
		
		this.nadh = this.nad;
		this.nad = 0;
		this.piruvato = 2*this.glucosa;

    }
}