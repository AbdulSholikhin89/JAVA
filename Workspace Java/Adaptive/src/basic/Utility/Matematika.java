package basic.Utility;
import java.util.Scanner;

public class Matematika{


		
	public static void main(String[] args) {
		
	}
	
	public double hitungPenjumlahan(double Bilangan1,double Bilangan2) {
		double hasilPennjumalhan = Bilangan1 + Bilangan2;
		return hasilPennjumalhan;
	
	}
	
	public double hitungPengurangan(double Bilangan1,double Bilangan2) {
		double hasilPengurangan = Bilangan1 - Bilangan2;
		return hasilPengurangan;
	
	}
	
	public double hitungSegitiga(double Alas,double Tinggi) {
		double hasilSegitiga = 0.5 * Alas * Tinggi;
		return hasilSegitiga;
	}
	
	public double hitungLingkaran(double Phi,double Jari) {
		double hasilLingkaran =  Phi * Math.pow (Jari,2);
		return hasilLingkaran;
	}
	
}
	
