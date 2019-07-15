package basic;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Soal4{

	public static void main(String[] args) {
		Soal4 Soal4 = new Soal4();
		Soal4.run();
	}

	public void run(){

		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder stringBuilder1 = new StringBuilder();

		String arraySay [] = null;
		String strKata = null;
		boolean counter	= true;
		int bKata = 0;
		char huruf = 'a';
		int z=0;
		int e=0;

			
		while(bKata < 3){
			try{
				System.out.print("Masukan Jumlah Kata [Minimal 3]: ");
				strKata = scanner.nextLine();
				if(strKata.trim().isEmpty()){
					System.out.println("Jumlah Tidak Boleh Kosong");
				} else{
					bKata = Integer.parseInt(strKata);
					if (bKata < 3){
					System.out.println("Jumlah [Minimal 3]");
					} else {
						arraySay = new String [bKata];
					}
				}	
			} catch (NumberFormatException nfe){
				System.err.println("Jumlah Harus Angka.");
			}	 
		}



		while (z < arraySay.length){
			System.out.print("Masukkan kata ke-" +(z+1)+ " : ");
			arraySay[z] = scanner.nextLine();
			if (arraySay[z].trim().isEmpty()){
				System.out.println("Kata Tidak boleh kosong");
			} else {
				z++;
			}
		}

		System.out.println("");
		System.out.println("====================");

		String kata = null;
		int indexLast = 0;
		String kataSub = null;
		huruf = 'a';
			for (int a = 0 ; a < arraySay.length; a++){
			stringBuilder.append(huruf + ". ");
			stringBuilder.append(arraySay[a]);
			stringBuilder.append(", ");
			huruf++;
		}

		kata = stringBuilder.toString();
		indexLast = kata.lastIndexOf(",");
		kataSub = kata.substring(0, (indexLast));
		System.out.println(kataSub);

		while (z > 0 ) {
			huruf--;
			z--;
			stringBuilder1.append(huruf + ". ");
			stringBuilder1.append(arraySay[z]);
			stringBuilder1.append(", ");
		}

		kata = stringBuilder1.toString();
		indexLast = kata.lastIndexOf(",");
		kataSub = kata.substring(0, (indexLast));
		System.out.println(kataSub);

	}
}
		
	
