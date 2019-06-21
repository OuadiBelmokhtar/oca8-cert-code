package codetraining.usecases.youssfi.exocoursevehicules;

public abstract class Vehicule {

	protected Integer num=0;
	protected Double carburant=0.0;// qte carburant
	protected Boolean demare=false;
	protected Integer vitesse=0;

	private static int  nbrVehicules;
	protected Pilote pilote = new Pilote();

	public Vehicule() {
		super();
		num = ++nbrVehicules;
	}

	public abstract void addCarburant(double c) throws Exception;

	public abstract void fairPlein();

	public boolean isDemarre() {
		return carburant > 0.0 ? true : false;
	}

	public void accelerer() throws Exception {
		if (isDemarre()) {
			++vitesse;
			--carburant;
			if (carburant <= 0) {
				demare = false;
				throw new Exception("Carburant insuffisant!");
			}
		}
	}

	@Override
	public String toString() {
		return "Vehicule [num=" + num + ", carburant=" + carburant + ", demare=" + demare + ", vitesse=" + vitesse
				+ ", pilote=" + pilote + "]";
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double getCarburant() {
		return carburant;
	}

	public void setCarburant(Double carburant) {
		this.carburant = carburant;
	}

	public Boolean getDemare() {
		return demare;
	}

	public void setDemare(Boolean demare) {
		this.demare = demare;
	}

	public Integer getVitesse() {
		return vitesse;
	}

	public void setVitesse(Integer vitesse) {
		this.vitesse = vitesse;
	}

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

	public int getNbrVehicules() {
		return nbrVehicules;
	}

}
