package Abdul.basic;
import java.util.Scanner;

public class ControlSwitchWhileValidation {

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
		
			case 0 : keterangan = "tidak bergerak";
					  break;
			case 1  : keterangan = "mulai bergerak";
					  break;
			case 2  : keterangan = "keceptan rendah";
					  break;
			case 3  : keterangan = "keceptan sedang";
					  break;
			case 4 : keterangan = "keceptan tinggi";
					  break;
			default : keterangan =" mohon input 0-4";		  
					  break;
	}
			System.out.println(keterangan);
	} catch (NumberFormatException nfe) {
		System.err.println("input harus angka");
	}
			
}
}