package codetraining.usecases.youssfi.exosegment2d;

public class TestSegment2D {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(50, 60);
		Segment2D segment2d = new Segment2D(p1, p2);
		System.out.println(segment2d);
		System.out.println(segment2d.getLongueur());
		if (segment2d.appartient(new Point(22, 33))) {
			System.out.println("Appartient");
		} else {
			System.out.println("N'apparient pas!");
		}

	}
}
