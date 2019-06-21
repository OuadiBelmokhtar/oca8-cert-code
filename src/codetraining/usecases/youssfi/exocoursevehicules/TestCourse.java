package codetraining.usecases.youssfi.exocoursevehicules;

public class TestCourse {
	public static void main(String[] args) {
		Course course = new Course();
		Pilote pilote1 = new Pilote("Ahmed");
		Pilote pilote2 = new Pilote("Taha");
		Voiture voiture1 = new Voiture();
		try {
			voiture1.addCarburant(90);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		voiture1.setPilote(pilote1);

		Moto moto1 = new Moto();
		try {
			moto1.addCarburant(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		moto1.setPilote(pilote2);
		course.addVehicule(voiture1);
		course.addVehicule(moto1);
		System.out.println("Avant démarrage");
		course.afficher();
		course.demarrerTous();
		
		Vehicule vTrouve = course.getVehicule(2);
		
		System.out.println("Véhicule trouvé: " +vTrouve);
		
		if (vTrouve instanceof Moto) {
			try {
				vTrouve.accelerer();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		System.out.println("Après démarrage");
		course.afficher();

	}

}
