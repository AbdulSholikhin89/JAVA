package Abdul.basic;

import java.util.Scanner;


public class Array2 {

	public static void main (String [] args){
		Array2 array2 = new Array2();
		array2.run();
		
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
				
			while (jawab){
				try {
					
					
					System.out.print ( "\n\n Masukan urutan hari: ");
						strHari = scanner.nextLine();

					if (strHari.trim().isEmpty()){
						System.out.println("Urutan tidak boleh kosong");
					} else {
						hari = Integer.parseInt(strHari);
						
						if (hari > 7 || hari <= 0){
							System.out.println("Urutan Harus diisi antara 1-7");
						} else {
							hari--;
							jawab = false;
							System.out.println("Hari ke "  + (hari + 1) + " adalah " + namaHari[hari]);
							hari++;
						}
					}

					} catch (NumberFormatException nfe){
						System.out.println("Urutan Harus Bilangan Bulat");
					}
				
				
			}
			
			System.out.println("Kelompok Hari Ganjil :");
				for (int z = 0 ; z < JumlahHari ; z++){
					if(z %2 ==0){
						System.out.println("Hari: " + namaHari[z]);
					}
				}
				
				System.out.println("");	
				System.out.println("==================");
				System.out.println("Kelompok Hari Genap :");
				for (int z = 0 ; z < JumlahHari ; z++){
					if(z % 2 !=0){
						System.out.println("Hari: " +namaHari[z]);
					}
					
				}
				
				
			
			for (int z = 1; z >JumlahHari;) {
				System.out.println("" + JumlahHari);
			}
				
				
				
				
				 
				}			
		}

	
		
