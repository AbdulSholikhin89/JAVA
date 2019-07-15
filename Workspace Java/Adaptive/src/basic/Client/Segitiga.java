package basic.Client;
import basic.Utility.Matematika;
import java.util.Scanner;

public class Segitiga {
	
		
	public static void main(String[] args) {
		
		
		
		try {
		Matematika matematika = new Matematika();
		Scanner scanner = new Scanner(System.in);
		
		double Alas;
		double Tinggi;
		double Hasil;
		String databilangan;
		
		
		System.out.print("Masukan Alas : ");
		databilangan = scanner.nextLine();
		Alas = Double.parseDouble(databilangan);
		
		System.out.print("Masukan Tinggi : ");
		databilangan= scanner.nextLine();
		Tinggi = Double.parseDouble(databilangan);
		
	
		
			
		Hasil = matematika.hitungSegitiga(Alas,Tinggi);
		System.out.println("Jadi Luas" + " = " + "1/2" + " * " + Alas + " * " + Tinggi +" = "  + Hasil);
	
	} catch (NumberFormatException nfe) {
		System.err.println("input harus angka");
	
	}
		}
		
	}
	
		
		
