package basic;
import java.util.Scanner;

public class LatihanScan2{
public static void main(String[] args) {
	try {
		Scanner scanner = new Scanner(System.in);
		String Nama;
		String Umur;
		int Umur1;
		String BahasaPemograman;
		String Perusahaan;
	
		System.out.print("Masukan Nama : ");
		Nama = scanner.nextLine();
	
		System.out.print("masukan umur : ");
		Umur = scanner.nextLine();
		Umur1 = Integer.parseInt(Umur);

		System.out.print("Masukan Bahasa Pemograman : ");
		BahasaPemograman = scanner.nextLine();
		
		System.out.print("Masukan perusahaan : ");
		Perusahaan = scanner.nextLine();
		
		System.out.println("========================");
		
		System.out.println("Nama Saya " + Nama + " umur " + Umur + " Saya Sedang belajar " + BahasaPemograman + " di " + Perusahaan);
	} catch (NumberFormatException nfe) {
		System.err.println("input harus angka");
	}

	}
}	

	