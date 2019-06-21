package codetraining.usecases.youssfi.exosegment2d;

public class Segment2D {
	private Point p1, p2;

	public Segment2D() {

	}

	public Segment2D(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	double getLongueur() {
		return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
	}
	
	boolean appartient(Point p) {
		return (p.getX()>p1.getX() && p.getX()<p2.getX());
	}

	@Override
	public String toString() {
		return "Segment2D [p1=" + p1 + ", p2=" + p2 + "]";
	}

}
