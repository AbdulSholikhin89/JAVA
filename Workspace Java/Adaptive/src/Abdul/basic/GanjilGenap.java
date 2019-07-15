package Abdul.basic;

import java.util.Scanner;
	

public class GanjilGenap{
	private Scanner scanner = new Scanner(System.in);

	public static void main (String [] args){
		GanjilGenap ganjilGenap = new GanjilGenap();
		ganjilGenap.run();
	}

	public void run(){
		

		int angka = 0;
		String strAngka = null;
		boolean counter = true;

		while (counter){
			try{
				System.out.print("Masukan Angka : ");
				strAngka = scanner.nextLine();
				if (strAngka.trim().isEmpty()){
					System.out.println("Angka tidak boleh kosong.");
				} else {
					angka = Integer.parseInt(strAngka);
					
					if (angka %2 == 0){
						System.out.println("Angka Genap.");
						counter = false;
						pilihan();
					} else {
						System.out.println("Angka Ganjil.");
						counter = false;
						pilihan();
					}	
				}	
			} catch (NumberFormatException nfe){
				System.out.println("Inputan harus angka");	
			}		

		}
	}

	public void pilihan(){

		String pilih = null;
		boolean counter2 = true;

		while(counter2){

			System.out.println("Apakah anda akan keluar dari system [YA / TIDAK]");
			pilih = scanner.nextLine();

			if (pilih.trim().isEmpty()){
				System.out.println ("Silakan isi [YA / TIDAK]\n");
			} else if(pilih.equalsIgnoreCase("YA")){
				System.out.println("GOOD BYE");
				System.exit(0);
			} else if(pilih.equalsIgnoreCase("TIDAK")){
				run();
			} else {
				System.out.println("Isi dengan [YA/TIDAK]\n");
			}
			

		}
			
	}
}	