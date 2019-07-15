package basic;
import java.util.Scanner;

public class ControlFor2 {
	public static void main(String[] args) {
		ControlFor2 controlFor2 = new ControlFor2();
		controlFor2.run();
	}
	
	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		String kalimat = null;
		String strpengulangan = null;
		int pengulangan = 0;
		boolean inputkalimat = true;
		boolean inputpengulangan = false;
		
		
		System.out.print("\n");
		
			while(inputkalimat) {
			System.out.print("Kalimat : ");
			kalimat = scanner.nextLine();
			if (kalimat.trim().isEmpty()) {
				System.out.println("kalimat tidak boleh kosong");
			
			} else {
				inputkalimat = false;
				inputpengulangan = true;
			}
			
		}
			while(inputpengulangan) {
				try {
					
					System.out.print("Pengulangan : ");
					strpengulangan = scanner.nextLine();
					if (strpengulangan.trim().isEmpty()) {
						System.out.println("pengulangan tidak boleh kosong");
					} else {
						pengulangan = Integer.parseInt(strpengulangan);
						if (pengulangan <= 0) {
						System.out.println("jumlah pengulangan lebih dari nol.");
						}
						else{
							inputpengulangan = false;
						}
					}		
			
			
				}catch (NumberFormatException nfe){
				System.out.println("harus di isi dengan angka");
		}
	}

			for (int z = 1; z <=pengulangan; z++) {
				System.out.println("" + kalimat);
		
			
			}
		

	}
}
