 package basic;
import java.util.Scanner;
public class Latihan4 {
	public static void main(String[] args) {
		Latihan4 latihan4 = new Latihan4();
		latihan4.run();
	}
	public void run() {
		Scanner scan = new Scanner(System.in);
		String[] tempatData = new String[3];
		String strKata = "";
		int jmlData = 0;
		int counter2 = 0;
		
		System.out.print("Masukan 3 Kata : ");
		strKata = scan.nextLine();
		
		
		
		while(jmlData < 3) {
			System.out.print("masukan kata ke-" + (jmlData+1) + " : ");
			tempatData[jmlData] = scan.nextLine();
			if(tempatData[jmlData].trim().isEmpty()) {
				System.out.println("kata tidak boleh kosong");
			} else {
			
			jmlData++;
			}
		}
		
		System.out.println("");
		System.out.println("====================");
		for(String z : tempatData) {
					
			System.out.print((counter2+1)+ ". " +tempatData+" ");
			counter2++;
		}
		System.out.println("");
		
		
		while(counter2>0) {			
			
			counter2--;
					
			System.out.print( (counter2+1)+".  " +tempatData[jmlData] +" ");
		
		}
		

	}
}