package basic;

import java.util.Scanner;

public class Lingkaran{

	public static void main(String[] args){
		Lingkaran panggil= new Lingkaran();
		panggil.run();

	}

	public void run(){
		Lingkaran panggil= new Lingkaran();
	
		try {
			Scanner scanner= new Scanner(System.in);
			String dataBilangan;
			double Phi;
			double Jari;
			double hasil1;
			String dataBilangan1;
			String dataBilangan2;
			

 			System.out.println("Rumus Lingkaran");
			System.out.print("Masukan Phi :");
			dataBilangan1 =scanner.nextLine();
			Phi = Double.parseDouble(dataBilangan1);

			System.out.print("Masukan Jari :");
			dataBilangan2 =scanner.nextLine();
			Jari = Double.parseDouble(dataBilangan2);

			System.out.println("hasilnya :" + Phi  + " * " + Jari + " = " + panggil.hasilpengurangan(Phi,Jari));
			System.out.println("========================");
		}catch (NumberFormatException nfe){
			System.err.println("Mohon Masukan Angka bulat");

		}
	}
	public double hasilpengurangan(double Phi , double jari)
	{
		double hasil = Phi * Math.pow (jari,2);
		return hasil;
	}
}