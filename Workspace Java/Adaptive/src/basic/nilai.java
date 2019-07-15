package basic;
import java.util.Scanner;
public class nilai {


public static void main(String[] args) {
	
nilai panggil= new nilai();
		panggil.run();
	}
	public void run(){
		try {
			Scanner scanner = new Scanner(System.in);

			String input= null;
			int hasilakhir;
			int hasil;
			
			System.out.print("Masukan Nama : ");
			input=scanner.nextLine();
			


			System.out.print("Masukan Nilai : ");
			input=scanner.nextLine();
			hasil = Integer.parseInt(input);
			hasilakhir = huruf(hasil);


		}catch(NumberFormatException nfe){
			System.out.println("Harap Masukan Angka");

		}
	}

	public Integer huruf(int hasil){

	if (hasil >= 90) {
	System.out.println(" Grade Anda : A ");
 			return hasil;
	
	} else if (hasil >=80) {
	System.out.println(" Grade Anda : B ");
 			return hasil;
	} else if (hasil >=70) {
	System.out.println(" Grade Anda : C ");
 			return hasil;
	} else if (hasil >=60) {
	System.out.println(" Grade Anda : D ");
 			return hasil;
	} else {
	System.out.println(" Grade Anda : E ");
 			return hasil;
		
		}	
	}	
}

