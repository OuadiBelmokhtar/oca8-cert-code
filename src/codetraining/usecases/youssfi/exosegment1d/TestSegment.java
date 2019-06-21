package codetraining.usecases.youssfi.exosegment1d;

public class TestSegment {
	public static void main(String[] args) {

		Segment segment = new Segment(24, 12);
		System.out.println(segment.toString());
		System.out.println(segment.getLongueur());
		if(segment.appartient(15)) {
			System.out.println("Appartient");	
			
		}else {
			System.out.println("N'appartient pas!");
		}
		
		segment.setExtr1(30);
		segment.setExtr2(50);
		System.out.println(segment.toString());
	}
}
