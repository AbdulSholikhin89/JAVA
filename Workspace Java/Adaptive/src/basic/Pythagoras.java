package basic;

import java.util.Scanner;

public class Pythagoras{

	public static void main(String[] args){
		Pythagoras panggil= new Pythagoras();
		panggil.run();

	}

	public void run(){
		Pythagoras panggil= new Pythagoras();
	
		try {
			Scanner scanner= new Scanner(System.in);
			String dataBilangan;
			double SisiA;
			double SisiB;
			double hasil1;
			String dataBilangan1;
			String dataBilangan2;
			

 			System.out.println("Rumus Pythagoras");
			System.out.print("Masukan Sisi A :");
			dataBilangan1 =scanner.nextLine();
			SisiA = Double.parseDouble(dataBilangan1);

			System.out.print("Masukan Sisi B :");
			dataBilangan2 =scanner.nextLine();
			SisiB = Double.parseDouble(dataBilangan2);

			System.out.println("jadi Akar :" + SisiA  + " + " + SisiB + " = " + panggil.hasilpythagoras(SisiA,SisiB));
			System.out.println("========================");
		}catch (NumberFormatException nfe){
			System.err.println("Mohon Masukan Angka bulat");

		}
	}
	public double hasilpythagoras(double SisiA , double SisiB)
	{
		double hasil = Math.sqrt(Math.pow (SisiA,2) + Math.pow (SisiB,2));
		return hasil;
	}
}