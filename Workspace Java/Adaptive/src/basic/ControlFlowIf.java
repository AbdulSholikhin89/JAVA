package basic;

import java.util.Scanner;

public class ControlFlowIf {

public static void main(String[] args) {
	ControlFlowIf controlFlowIf = new ControlFlowIf ();
	controlFlowIf.run();
	}

	public void run() {
		try {
		Scanner scanner = new Scanner(System.in);
		
		String input= null;
			int hasilakhir;
			int hasil;
		
		System.out.print("Masukan Nama : ");
		input = scanner.nextLine();
		
		

		
		System.out.print("Masukan umur : ");
			input = scanner.nextLine();
			hasil = Integer.parseInt(input);
			hasilakhir = huruf(hasil);

		
		}catch(NumberFormatException nfe){
			System.out.println("Harap Masukan Angka");
			run();
			
		}
	}

		
	
		public Integer huruf(int hasil){
		
		if (hasil <=14) {
			System.out.println("tidak ikut ujian");
			
			
		} else if(hasil <=30) {
			System.out.println("boleh ikut ujian ");
			
		
		}

	}

}