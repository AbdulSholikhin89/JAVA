package basic;

import java.util.Scanner;

public class VolumeBola{

	public static void main(String[] args){
		VolumeBola panggil= new VolumeBola();
		panggil.run();

	}

	public void run(){
		VolumeBola panggil= new VolumeBola();
	
		try {
			Scanner scanner= new Scanner(System.in);
			String dataBilangan;
			double Bagian;
			double Phi;
			double Jari;
			double hasil1;
			String dataBilangan3;
			String dataBilangan1;
			String dataBilangan2;
			

 			System.out.println("Rumus Bola");
			
			System.out.print("Masukan Bagian :");
			dataBilangan3 = scanner.nextLine();
			Bagian = Double.parseDouble(dataBilangan3);
			
			System.out.print("Masukan Phi :");
			dataBilangan1 = scanner.nextLine();
			Phi = Double.parseDouble(dataBilangan1);

			System.out.print("Masukan Jari :");
			dataBilangan2 = scanner.nextLine();
			Jari = Double.parseDouble(dataBilangan2);

			System.out.println("hasilnya :" + " 1.3 " + Phi  + " * " + Jari + " = " + panggil.hasilpengurangan(Phi,Jari));
			System.out.println("========================");
		}catch (NumberFormatException nfe){
			System.err.println("Mohon Masukan Angka ");

		}
	}
	public double hasilpengurangan(double Phi , double jari)
	{
		double hasil = ((1.3 ) *  Phi * Math.pow (jari,3));
		return hasil;
	}
}