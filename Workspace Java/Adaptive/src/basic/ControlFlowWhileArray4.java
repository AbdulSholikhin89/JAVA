package basic;

import java.util.Scanner;

public class ControlFlowWhileArray4{

	public static void main(String [] args){
		ControlFlowWhileArray4 controlFlowWhileArray4 = new ControlFlowWhileArray4();
		controlFlowWhileArray4.run();
	}

	public void run(){
		Scanner	scanner = new Scanner(System.in);

		Double [] arrayNilai = null;
		String [] arrayMatapel = null;

		int jumlah = 0;
		int keNilai = 0;
		int nilai = 0;
		int matapelKe = 0;	
	  	int z = 0;

		Double jmlNilai = 0.0d;
		Double nilaiTerendah = 0.0d;
		Double nilaiTertinggi = 0.0d;
		Double nilaiRata = 0.0d;

		String strJumlah = null;
		String matMax = null;
		String matMin = null;
	  	String strNilai = null;
	  	String strMatapel = null;
	  	String strNama = null;
	  		
		boolean counter = true;

	  	while (counter){
		 	try{
			 	System.out.print("Masukan jumlah Matapelajaran : ");
				strJumlah = scanner.nextLine();
				if(strJumlah.trim().isEmpty()){
					System.out.println("Jumlah tidak boleh kosong.");
				} else {
					jumlah = Integer.parseInt(strJumlah);
					if (jumlah <= 0){
						System.out.println("Jumlah harus lebih dari 0");
					} else {
						arrayMatapel = new String [jumlah];
						counter = false;	
					}
				}
			} catch (NumberFormatException nfe){
			 	System.out.println ("Jumlah matapelajaran harus angka.");
			}	
	  	}

	  	while (matapelKe < arrayMatapel.length){

	  			System.out.print("Masukan nama matapelajaran " +(matapelKe+1)+ " : " );
	  			arrayMatapel[matapelKe] = scanner.nextLine();
	  			if (arrayMatapel[matapelKe].trim().isEmpty()){
	  				System.out.println("Nilai tidak boleh kosong");
	  			} else {
	  				matapelKe ++;
	  			}
	  	}

	  		arrayNilai = new Double [jumlah];
	  		while(z < arrayMatapel.length) {
	  		try{
	  				System.out.println("Masukan nilai matapelajaran " +arrayMatapel[z]+ ":" );
	  				strNama = scanner.nextLine();
	  				if(strNama.trim().isEmpty()){
	  					System.out.println("Nilai tidak boleh kosong");
	  				} else {
	  					arrayNilai[z] = Double.parseDouble(strNama);
	  					z++;
	  				}	
	  		} catch (NumberFormatException nfe){
	  			System.out.println("nilai tidak boleh angka.");
	  		}
	  		
		}

		for (int i = 0 ; i<arrayNilai.length ; i++){
			jmlNilai = jmlNilai + arrayNilai [i];
			nilaiRata = jmlNilai/jumlah;
		}
		
		nilaiTerendah = arrayNilai[0];
		nilaiTertinggi = arrayNilai[0];
		
		for (int a = 0 ; a < arrayNilai.length ; a++){
			if (nilaiTertinggi <= arrayNilai[a]){
				nilaiTertinggi = arrayNilai[a];
				matMax = arrayMatapel[a];

			} if (nilaiTerendah >= arrayNilai[a]){
				nilaiTerendah = arrayNilai [a];
				matMin = arrayMatapel[a];
			}
		}


		System.out.println("");
		System.out.println("DAFTAR NILAI MATAPELAJARAN");
		System.out.println("==========================");
		System.out.println("");
		System.out.println("Jumlah matapelajaran yang diambil : " +jumlah);
		System.out.println("Jumlah Semua Nilai matapelajaran : " +jmlNilai);
		System.out.println("Nilai Rata - Rata : " +nilaiRata);	
		System.out.println("Nilai tertinggi adalah " +matMax+ " : " +nilaiTertinggi);
		System.out.println("Nilai terendah adalah " +matMin+ " : "  +nilaiTerendah);
	}	
}	

	  	
	
