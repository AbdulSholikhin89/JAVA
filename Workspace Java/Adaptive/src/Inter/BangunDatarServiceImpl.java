package Inter;

import java.util.Scanner;

public class BangunDatarServiceImpl extends CommonBean implements BangunDatarService{					

	public void luasSegitiga (double alas ,double tinggi){
		alas = valid("Masukan Alas : ");
		tinggi = valid("Masukan Tinggi : ");
		hasil = (alas * tinggi)/2;
		System.out.println(alas+ " * " +tinggi+ " = " +hasil);
	}

	public double rumus (double panjang ,double lebar){
		panjang = valid ("Masukan Panjang : ");
		lebar = valid("Masukan Lebar : ");
		double hasil = panjang * lebar;
		System.out.println("Luas Persegi Panjang : " +panjang+ " * " +lebar+ " = " +hasil);
		return hasil;
	}

	public double rumus (double Sisi ){
		Sisi = valid("Masukan Sisi : ");
		
		double hasil = Sisi * Sisi * Sisi;
		System.out.println("Volume Kubus : " +Sisi+ " * " +Sisi+ " * " +Sisi+ " = " +hasil);
		return hasil;
	}

	public void menu(){
		System.out.println("");
			System.out.println("RUMUS MATEMATIKA");
			System.out.println("================");
			System.out.println("1. Luas Persegi Panjang");
			System.out.println("2. Luas Segitiga");
			System.out.println("3. Volume Kubus");
			System.out.println("4. Exit\n");
			setInput(valid("Masukan Menu : "));
	switch(getInput()){

				case 1 : rumus (varA, varB);
						 menu();
						 break;
				case 2 : luasSegitiga(varA, varB);
						 menu();
						 break;
				case 3 : rumus (Sisi);
						 menu();
						 break;
				case 4 : Keluar();
				default: System.out.print("Pilih [1-4]\n"); 
						 menu();
						 break;
			}
	}		
}
