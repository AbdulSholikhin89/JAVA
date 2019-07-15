package basic;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TugasArray2{

	public static void main (String [] args){
		TugasArray2 tugasArray2 = new TugasArray2();
		tugasArray2.run();
		
	}

		public void run(){
			Scanner scanner = new Scanner(System.in);

			String [] namaHari;
			String strHari = null;
			String strjmlHari = null;
			int JumlahHari= 0;
			int hari = 0;
			boolean jawab = true;
			boolean inputjumlahHari = true;
			
			
			while(inputjumlahHari) {
				try {
					
					System.out.print("Masukan jumlah Hari : ");
					strjmlHari = scanner.nextLine();
					if (strjmlHari.trim().isEmpty()) {
						System.out.println("Jumlah hari tidak boleh kosong");
					} else {
						JumlahHari = Integer.parseInt(strjmlHari);
						if (JumlahHari > 7) {
						System.out.println("jumlah hari tidak ada .");
						}
						else{
							inputjumlahHari = false;
						}
					}		
			
			
				}catch (NumberFormatException nfe){
				System.out.println("harus di isi dengan angka");
		}
	}
			
				namaHari = new String[JumlahHari];
				int isi = 0;
				while(isi < JumlahHari) {
				boolean cekHari = false;;
					while(!cekHari) {
					
					
						System.out.print("Masukan Hari  : ");
						String strNamaHari= scanner.nextLine();
						try {
						int intNamaHari = Integer.parseInt(strNamaHari);
						System.out.println("Hari hanya boleh huruf");
						cekHari = false;
						
						}catch (NumberFormatException nfe){ 
						cekHari = true;}
		
						
					if (strNamaHari.trim().isEmpty()) {
						System.out.println(" Hari tidak boleh kosong");
					} else {
						namaHari[isi] = strNamaHari;
						
					}			
					
		}
		isi++;
	}
	
			
		}
			
			for (int z = 1; z >JumlahHari; z++) {
				System.out.println("" + JumlahHari);
			}
				
				
				int selectedOption = JOptionPane.showConfirmDialog(null, "Apakah anda akan menutup system?", "Tutup Menu", JOptionPane.YES_NO_OPTION);
 				if (selectedOption == JOptionPane.YES_OPTION) {
				 System.exit(0);
				 } else {
				run();		
				}			
		}
		

	
		
}