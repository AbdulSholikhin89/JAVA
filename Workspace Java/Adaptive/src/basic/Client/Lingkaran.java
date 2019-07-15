package basic.Client;
import basic.Utility.Matematika;
import java.util.Scanner;

public class Lingkaran {
	
		
	public static void main(String[] args) {
		
		
		
		try {
		Matematika matematika = new Matematika();
		Scanner scanner = new Scanner(System.in);
		
		double Phi;
		double Jari;
		double Hasil;
		String databilangan;
		
		
		System.out.print("Masukan Phi : ");
		databilangan = scanner.nextLine();
		Phi = Double.parseDouble(databilangan);
		
		System.out.print("Masukan Jari : ");
		databilangan= scanner.nextLine();
		Jari = Double.parseDouble(databilangan);
		
	
		
			
		Hasil = matematika.hitungLingkaran(Phi,Jari);
		System.out.println("Jadi Luas" +  " = " + Phi + " * " + Jari +" = "  + Hasil);
	
	} catch (NumberFormatException nfe) {
		System.err.println("input harus angka");
	
	}
		}
		
	}
	
	}	
		}
		
