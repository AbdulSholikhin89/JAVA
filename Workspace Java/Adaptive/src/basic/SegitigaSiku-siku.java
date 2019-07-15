package basic;

import java.util.Scanner;

public class SegitigaSiku-siku{

	public static void main(String[] args){
		SegitigaSiku-siku panggil= new SegitigaSiku-siku();
		panggil.run();

	}

	public void run(){
		SegitigaSiku-sikupanggil= new SegitigaSiku-siku();
	
		try {
			Scanner scanner= new Scanner(System.in);
			String dataBilangan;
			double Alas;
			double Tinggi;
			double hasil1;
			String dataBilangan1;
			String dataBilangan2;
			

 			System.out.println("Rumus Segitiga Siku-siku");
			System.out.print("Masukan Alas :");
			dataBilangan1 =scanner.nextLine();
			Alas = Double.parseDouble(dataBilangan1);

			System.out.print("Masukan Tinggi :");
			dataBilangan2 =scanner.nextLine();
			Tinggi = Double.parseDouble(dataBilangan2);

			System.out.println("jadi Rumus :"+ "1/2" + " * " + Alas  + " * " + Tinggi + " = " + panggil.hasilpythagoras(SisiA,SisiB));
			System.out.println("========================");
		}catch (NumberFormatException nfe){
			System.err.println("Mohon Masukan Angka bulat");

		}
	}
	public double hasilpythagoras(double Alas , double Tinggi)
	{
		double hasil = 0.5 * Alas * Tinggi;
		return hasil;
	}
}