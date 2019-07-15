package basic.Client;
import basic.Utility.Matematika;
import java.util.Scanner;

public class Penjumlahan {
	
		
	public static void main(String[] args) {
		
		
		
		try {
		Matematika matematika = new Matematika();
		Scanner scanner = new Scanner(System.in);
		
		double Bilangan1;
		double Bilangan2;
		double Hasil;
		String databilangan;
		
		
		System.out.print("Masukan Bilangan ke-1 : ");
		databilangan = scanner.nextLine();
		Bilangan1 = Double.parseDouble(databilangan);
		
		System.out.print("Masukan Bilangan ke-2 : ");
		databilangan= scanner.nextLine();
		Bilangan2 = Double.parseDouble(databilangan);
		
	
		
			
		Hasil = matematika.hitungPenjumlahan(Bilangan1,Bilangan2);
		System.out.println("hasilnya" + " = " + Bilangan1 + " + " + Bilangan2 +" = "  + Hasil);
	
	} catch (NumberFormatException nfe) {
		System.err.println("input harus angka");
	
	}
		}
		
	}
	
		
		
