package Abdul.basic;

import java.util.Scanner;

public class ControlFlowIf {
	

		public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		int Umur = 0;
		String strUmur = null;
		boolean cekUmur = true;
		
	while(!cekUmur) {
	try {
		System.out.print(" Masukan Umur : ");
		strUmur =scan.nextLine();
		if(strUmur.trim().isEmpty()) {
			System.out.print(" Umur tidak boleh kosong");
		}else {
		}
	
		if (Umur <=14) {
	
			System.out.println ("Tidak boleh ikut ujian");
	}
		else if ( Umur <=30) {
	
			System.out.println ("boleh ikut ujian");
		}
	
	} catch (NumberFormatException nfe) {
			System.err.println("Masukan Angka saja ");
		}
		
	}	
	
		
	}


}	