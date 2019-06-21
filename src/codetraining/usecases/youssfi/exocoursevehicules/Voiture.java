package codetraining.usecases.youssfi.exocoursevehicules;

public class Voiture extends Vehicule {

	protected Double capaciteReservoir = 80.0;
	public final static int NB_ROUES = 4;

	public Voiture() {
		super();
		this.carburant = 0.0;
	}

	public Voiture(Double carb, Integer vitess) {
		super();
		
		this.carburant=carb;
		this.vitesse=vitess;
	}

	@Override
	public void addCarburant(double c) throws Exception {
		double qtDeborde = (c + carburant) - capaciteReservoir;
		if (c + carburant <= capaciteReservoir) {
			carburant += c;

		} else {
			fairPlein();
			throw new Exception("Le plein a été fait mais la quantité " + qtDeborde + " a débordée");
		}

	}

	@Override
	public void fairPlein() {
		this.carburant = capaciteReservoir.doubleValue();
	}

	@Override
	public String toString() {
		return "Voiture [num=" + num + ", carburant=" + carburant + ", demare=" + demare + ", vitesse=" + vitesse
				+ ", pilote=" + pilote + "]";
	}

	
	
}
