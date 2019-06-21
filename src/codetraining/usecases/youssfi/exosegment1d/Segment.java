package codetraining.usecases.youssfi.exosegment1d;

public class Segment {
	private float extr1;
	private float extr2;

	public Segment() {

	}

	Segment(float e1, float e2) {
		extr1 = e1;
		extr2 = e2;
		ordonne();
	}

	void ordonne() {
		if (extr1 > extr2) {
			float temp = extr1;
			extr1 = extr2;
			extr2 = temp;
		}
	}

	float getLongueur() {
		return Math.abs(extr2 - extr1);
	}

	boolean appartient(float x) {
		return x > extr1 && x < extr2;
	}

	@Override
	public String toString() {
		return "Segment [extr1=" + extr1 + ", extr2=" + extr2 + "]";
	}

	public float getExtr1() {
		return extr1;
	}

	public void setExtr1(float extr1) {
		this.extr1 = extr1;
	}

	public float getExtr2() {
		return extr2;
	}

	public void setExtr2(float extr2) {
		this.extr2 = extr2;
	}

	
	
}
