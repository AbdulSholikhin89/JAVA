package basic;
import java.util.Scanner;

public class LatihanScan2{
public static void main(String[] args) {
	try {
		Scanner scanner = new Scanner(System.in);
		String Nama;
		String Umur;
		int Umur1;
		String Bahasa Pemograman;
		String Perusahaan;
	
		System.out.print("Masukan Nama : ");
		Nama = scanner.nextLine();
	
		System.out.print("masukan umur : ");
		Umur = scanner.nextLine();
		Umur1 = Integer.parseInt(strUmur);

		System.out.print("Masukan Bahasa Pemograman : ");
		BahasaPemograman = scanner.nextLine();
		
		System.out.print("Masukan perusahaan : ");
		Perusahaan = scanner.nextLine();
		
		System.out.println("========================");
		System.out.println(" Nama : " + Nama );
		System.out.println(" Umur : " + Umur );
		System.out.println(" Bahasa Pemograman " + BahasaPemograman);
		System.out.println(" Perusaaan " + Perusahaan);
		System.out.println(Nama + " + " Umur + " + " + BahasaPemograman + " + " Perusahaan);
	} catch (NumberFormatException nfe) {
		System.err.println("input harus angka");
	}

	}
}	

	