package basic;
import java.util.Scanner;

public class ControlSwitch {

public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	try {
		int perseneling = 0;
		String str = null;
		String keterangan = null;
		
	
	
		System.out.print("MASUKAN PERSENELING : ");
		str = scanner.nextLine();
		perseneling = Integer.parseInt(str);
	
		switch (perseneling) {
		
			case 1 : keterangan = "mulai bergerak";
					  break;
			case 2  : keterangan = "keceptan rendah";
					  break;
			case 3  : keterangan = "keceptan sedang";
					  break;
			case 4  : keterangan = "keceptan tinggi";
					  break;
			default : keterangan = "tidak bergerak";
					  break;
	}
			System.out.println(keterangan);
	} catch (NumberFormatException nfe) {
		System.err.println("input harus angka");
	}
	
		
		String strGrade = null;
		char grade;
		String keterangan = null;
		
		System.out.print("\n masukan grade : ");
		strGrade= scanner.nextLine();
		
		if (strGrade.length() == 1) {

			grade = strGrade.charAt(0);
		
		switch (Character.toUpperCase(grade)) {
			
		

			case 'A' : keterangan = "nilai diatas 80";
						break;
			case 'B' : keterangan = "nilai diatas 60";
						break;
			case 'C' : keterangan = "nilai diatas 50";
						break;
			case 'D' : keterangan = "nilai diatas 40";
						break;
			default : keterangan = "nilai tidak ada";
						break;
		}
		
		} else {
			System.out.println("input tidak boleh lebih dari 2 karakater");
		}
			System.out.println(keterangan);
			
		
	}	
}



	
