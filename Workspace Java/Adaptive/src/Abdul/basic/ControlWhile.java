 package Abdul.basic;
import java.util.Scanner;
public class ControlWhile {
	public static void main(String[] args) {
		ControlWhile controlWhile = new ControlWhile();
		controlWhile.run();
	}
	public void run() {
		Scanner scan = new Scanner(System.in);
		String strData = "";
		int jmlData = 0;
		int counter = 0;
		String[] tempatData = null;
		int counter2 = 1;
		
		System.out.print("masukan jumlah data : ");
		strData = scan.nextLine();
		jmlData = Integer.parseInt(strData);
		tempatData = new String[jmlData];
		
		while(counter < jmlData) {
			System.out.print("masukan data ke-" + (counter+1) + " : ");
			tempatData[counter] = scan.nextLine();
			counter++;
		}
		System.out.println("Data dibalik");
		while(counter>0) {
			
			counter--;
			
			System.out.println("data ke-" + counter2 +" : " +tempatData[counter]);
			counter2++;
		}
		

	}
}