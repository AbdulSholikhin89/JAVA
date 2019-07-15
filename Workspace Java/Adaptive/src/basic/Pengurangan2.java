package basic;

import java.util.Scanner;

public class Pengurangan2{

	public static void main(String[] args){
		Pengurangan2 panggil= new Pengurangan2();
		panggil.run();

	}

	public void run(){
		try {
			Scanner scanner= new Scanner(System.in);
			String dataBilangan;
			int bilangan1;
			int bilangan2;
			int hasil1;

 			System.out.println("====RUMUS PENGURANGAN====");
			System.out.print("Masukan Bilangan 1 :");
			dataBilangan =scanner.nextLine();
			bilangan1 = Integer.parseInt(dataBilangan);

			System.out.print("Masukan Bilangan 2 :");
			dataBilangan =scanner.nextLine();
			bilangan2 = Integer.parseInt(dataBilangan);

			hasil1=hasilpengurangan(bilangan1, bilangan2);
			System.out.println("jadi :" + bilangan1 + " - " + bilangan2 + " = " + hasil1);
			System.out.println("========================");
		}catch (NumberFormatException nfe){
			System.err.println("Mohon Masukan Angka bulat");

		}
	}
	public Integer hasilpengurangan(int bilangan1, int bilangan2)
	{
		int hasil= bilangan1 - bilangan2;
		return hasil;
	}
}