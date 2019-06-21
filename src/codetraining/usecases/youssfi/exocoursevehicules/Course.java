package codetraining.usecases.youssfi.exocoursevehicules;

import java.util.ArrayList;
import java.util.List;

public class Course {

	public List<Vehicule> vehicules = new ArrayList<Vehicule>();

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addVehicule(Vehicule v) {
		vehicules.add(v);
	}

	public Vehicule getVehicule(Integer num) {
		Vehicule vTrouve = null;
		for (Vehicule v : vehicules) {
			if (v.getNum() == num) {
				vTrouve = v;
			}
		}
		return vTrouve;
	}

	public void demarrerTous() {
		for (Vehicule v : vehicules) {

			v.demare = true;

		}
	}

	public void demarrerVoitures() {
		for (Vehicule v : vehicules) {
			if (v instanceof Voiture) {
				if (!v.isDemarre()) {
					v.demare = true;
				}
			}
		}
	}

	public void afficher() {
		double sumCarburant = 0;

		for (Vehicule v : vehicules) {
			System.out.println(v.toString());
			sumCarburant += v.getCarburant();
		}
		System.out.println("Total carburant: " + sumCarburant);
	}

}
