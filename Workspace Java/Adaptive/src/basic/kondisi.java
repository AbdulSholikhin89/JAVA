package basic;

import java.util.Scanner;
public class kondisi{

	public static void main(String[] args){
		kondisi panggil= new kondisi();
		panggil.run();
	}


	public void run(){
		try {
			Scanner scanner = new Scanner(System.in);

			String input= null;
			int hasilakhir;
			int hasil;

			System.out.print("Masukan Nilai : ");
			input=scanner.nextLine();
			hasil=Integer.parseInt(input);
			hasilakhir = huruf(hasil);


		}catch(NumberFormatException nfe){
			System.out.println("Harap Masukan Angka");

		}

	}

 	public Integer huruf(int hasil){
 		if (hasil <= 50){
 			System.out.println("Anda mendapat : E ");
 			return hasil;
 		}else{
 			System.out.println("Anda Mendapat : C ");
 		return hasil;
 		}
 	}
 }