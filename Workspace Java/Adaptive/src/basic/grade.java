package basic;
public class grade {

public static void main(String[] args) {
	grade c = new grade ();
	grade.run();
	}
	
		

	int nilai = 60;
	
	
	System.out.print("input nilai : ");
	
	if (nilai >= 90) {
	System.out.println("A");
	} else if (nilai >=80) {
		
	System.out.println("B");
	} else if (nilai >=70) {
	System.out.println("C");
	
	} else if (nilai >=60) {
	System.out.println("D");
	}
	System.out.println("Grade Anda" + nilai);
	
	}	
}