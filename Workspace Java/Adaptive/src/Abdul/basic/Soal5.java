package Abdul.basic;
import java.util.Scanner;

public class Soal5{

	public static void main(String [] args){
		Soal5 soal5 = new Soal5();
		soal5.run();
	}

	public void run(){
	
		Scanner scanner = new Scanner (System.in);

		int [][] matriksA = null;
		int [][] matriksB = null;
		
		String strBaris = null;
		int baris = 0;
		String strKolom = null;
		int kolom = 0;
		int aKolom = 0;
		int aBaris = 0;
		String strNilai = null;
		int nilai = 0;
		
		


		while(baris <=0){
			try {
				System.out.print("Ukuran Baris Matrix : ");
				strBaris = scanner.nextLine();
					if(strBaris.trim().isEmpty()){
						System.out.println("Ukuran Baris Tidak Boleh Kosong.");
					} else{
						baris = Integer.parseInt(strBaris);
						if( baris <=0){
							System.out.println("Ukuran Baris Harus Lebih Dari 0.");
						}
					}
			} catch (NumberFormatException nfe){
				System.out.println("Ukuran Baris Harus Angka.");
			}
		}

		while(kolom <=0){
			try {
				System.out.print("Ukuran Kolom Matrix : ");
				strKolom = scanner.nextLine();
					if(strKolom.trim().isEmpty()){
						System.out.println("Ukuran Kolom Tidak Boleh Kosong.");
					} else{
						kolom = Integer.parseInt(strKolom);
						if( kolom <=0){
							System.out.println("Ukuran Kolom Harus Lebih Dari 0.");
						}
					}
			} catch (NumberFormatException nfe){
				System.out.println("Ukuran Kolom Harus Angka.");
			}
		}		

		System.out.println("");
		matriksA = new int [baris][kolom];
		matriksB = new int [baris][kolom];

		System.out.println("=============");
		System.out.println("Matrix ke-1");
		System.out.println("=============");
		
		while(aBaris < baris){
				System.out.println("Baris " +(aBaris+1));
				try{

				while(aKolom < kolom){
				System.out.print("Kolom ke-" + (aKolom+1) + " = " );
				strNilai = scanner.nextLine();
				if(strNilai.trim().isEmpty()){
					System.out.println("Kolom Tidak Boleh kosong.");
				} else {
					nilai = Integer.parseInt(strNilai);
				}
				matriksA[aBaris][aKolom] = nilai;
				aKolom++;	
			}
			aKolom = 0;
			aBaris++;
			
		} catch(NumberFormatException nfe){
			System.out.println("Inputan Harus Angka.");
		}
		System.out.println("");
		}


		System.out.println("=============");
		System.out.println("Matrix ke-2");
		System.out.println("=============");

		aBaris = 0;
		while(aBaris < baris){
				System.out.println("Baris " +(aBaris+1));
				try{

				while(aKolom < kolom){
				System.out.print("Kolom ke-" + (aKolom+1) + " = " );
				strNilai = scanner.nextLine();
				if(strNilai.trim().isEmpty()){
					System.out.println("Kolom Tidak Boleh kosong.");
				} else {
					nilai = Integer.parseInt(strNilai);
				}
				matriksB[aBaris][aKolom] = nilai;
				aKolom++;	
			}
			aKolom = 0;
			aBaris++;
			
		} catch(NumberFormatException nfe){
			System.out.println("Inputan Harus Angka.");
		}
		System.out.println("\n");
		}
		for(int z = 0 ; z < baris ; z++ ){
			for(int  i = 0 ; i < kolom ; i++){
				System.out.print(matriksA[z][i] + " ");
			}
			System.out.print(" + ");
			for( int i = 0 ; i < kolom ; i++){
				System.out.print(matriksB[z][i] + " ");
			}
			System.out.print(" = ");
			for( int i = 0 ; i < kolom ; i++){
				System.out.print(matriksA[z][i] + matriksB[z][i] + " ");
			}
			System.out.println(" ");

		}

		
	}
}


