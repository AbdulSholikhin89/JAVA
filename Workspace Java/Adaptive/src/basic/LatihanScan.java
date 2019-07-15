package basic;
import java.util.Scanner;

public class LatihanScan {
	
	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		String Nama;
		String strUmur;
		int umur;

		
		System.out.print("Masukan Nama : ");
		Nama = scanner.nextLine();
		
		
		System.out.print("masukan umur : ");
		strUmur = scanner.nextLine();
		umur = Integer.parseInt(strUmur);
		
		System.out.println("========================");
		System.out.println(" Nama : " + Nama);
		System.out.println(" Umur : " + umur);
		
	} catch (NumberFormatException nfe) {
		System.err.println("input harus angka");
	}
	}
}
