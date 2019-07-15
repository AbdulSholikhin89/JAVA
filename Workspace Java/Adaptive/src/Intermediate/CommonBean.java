package Intermediate;

import java.util.Scanner;
public class CommonBean{


	private Scanner scan = new Scanner(System.in);

	

	public double valid(String pertanyaan){
		boolean counter = true;
		String strInput = null;
		double input = 0;

		while(counter){
			try {
				System.out.print(pertanyaan);
				strInput = scan.nextLine();
				if(strInput.trim().isEmpty()){
					System.out.println("Data Tidak Boleh Kosong");
				} else{
					input = Double.parseDouble (strInput);
					if (input <= 0){
						System.out.println("Masukan Menu 1-4");
						
					} else {
						counter = false;
					}
				}
			} catch (NumberFormatException nfe){
				System.out.println("Inputan harus angka");
			}
		}
		return input;	
	}

	public void Keluar(){
		System.out.println("Sampai Jumpa");
		System.exit(0);
		
	}
}	