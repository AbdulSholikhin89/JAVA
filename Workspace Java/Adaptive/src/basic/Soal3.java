package basic;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Soal3{

	public static void main(String[] args) {
		Soal3 soal3 = new Soal3();
		soal3.run();
	}

	public void run(){

		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();

		String arraySay [] = new String [3];
		String strKata = null;
		String kata = null;
		String kataSub = null;
		int z=0;
		int e=0;
		int indexLast = 0;

		


		System.out.println("Masukan 3 Kata: ");

		while (z < 3){
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

		for (int a = 0 ; a < arraySay.length; a++){
			stringBuilder.append((a+1) + ". ");
			stringBuilder.append(arraySay[a]);
			stringBuilder.append(", ");
		}

		kata = stringBuilder.toString();
		indexLast = kata.lastIndexOf(",");
		kataSub = kata.substring(0, (indexLast));
		System.out.println(kataSub);

		StringBuilder st = new StringBuilder();
		while (z > 0){
			z--;
			st.append((z+1) + ". ");
			st.append(arraySay[z]);
			st.append(", ");
		}

		kata = st.toString();
		indexLast = kata.lastIndexOf(",");
		kataSub = kata.substring(0, (indexLast));
		System.out.println(kataSub);
	}
}
