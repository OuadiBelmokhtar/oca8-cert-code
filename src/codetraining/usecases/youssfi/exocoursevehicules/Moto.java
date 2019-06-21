package codetraining.usecases.youssfi.exocoursevehicules;

public class Moto extends Voiture {
	public final static int NB_ROUES = 2;

	public Moto() {
		super();
		capaciteReservoir = 30.0;
	}

	public Moto(Integer num, Double carb, Integer vitess) {
		super(); 
		this.num = num;
		this.carburant = carb;
		this.vitesse = vitess;
		capaciteReservoir = 30.0;
	}

	@Override
	public String toString() {
		return "Moto [num=" + num + ", carburant=" + carburant + ", demare=" + demare + ", vitesse=" + vitesse
				+ ", pilote=" + pilote + "]";
	}

}
