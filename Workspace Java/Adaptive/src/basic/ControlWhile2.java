package basic;
import java.util.Scanner;
public class ControlWhile2 {
	public static void main(String[] args) {
		ControlWhile2 controlWhile2 = new ControlWhile2();
		controlWhile2.run();
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		String nama = null;
		String strUmur = null;
		String tempatLahir = null;
		int umur = 0;
		boolean inputNama = true;
		boolean inputUmur = false;
		boolean inputTempatLahir = false;
		
		System.out.print("\n");
			while(inputNama) {
			System.out.print("Nama : ");
			nama = scanner.nextLine();
			if (nama.trim().isEmpty()) {
				System.out.println("nama tidak boleh kosong");
			} else {
				inputNama = false;
				inputUmur = true;
			}
		
			
		}
			while(inputUmur) {
				try {
					
					System.out.print("Umur : ");
					strUmur = scanner.nextLine();
				if (strUmur.trim().isEmpty()) {
				System.out.println("Umur tidak boleh kosong");
				} else {
				umur= Integer.parseInt(strUmur);
				inputUmur = false;
				inputTempatLahir = true;
				}		
			
			
				}catch (NumberFormatException nfe){
				System.out.println("harus di isi dengan angka");
		}
	}

		
			while(inputTempatLahir) {
				System.out.print("Tempat Lahir : ");
				tempatLahir = scanner.nextLine();
			if (tempatLahir.trim().isEmpty()) {
				System.out.println("Tempat Lahir tidak boleh kosong");
			} else {
				inputTempatLahir = false;
			}
			}
		
			System.out.println("BIOADATA");
			System.out.println("Nama : " + nama);
			System.out.printf("Umur : " + umur  +"%7s","Tahun\n");
			System.out.println("Tempat Lahir : " + tempatLahir);
			}
		

}