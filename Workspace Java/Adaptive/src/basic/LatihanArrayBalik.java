 package basic;
import java.util.Scanner;
public class LatihanArrayBalik {
	public static void main(String[] args) {
		LatihanArrayBalik latihanArrayBalik = new LatihanArrayBalik();
		latihanArrayBalik.run();
	}
	public void run() {
		Scanner scan = new Scanner(System.in);
		String strData = "";
		int jmlData = 0;
		int counter = 0;
		String[] namaHari = null;
		int counter2 = 1;
		
		System.out.print("masukan jumlah hari : ");
		strData = scan.nextLine();
		jmlData = Integer.parseInt(strData);
		tempatData = new String[jmlData];
		
		while(counter < jmlData) {
			System.out.print("masukan hari ke-" + (counter+1) + " : ");
			tempatData[counter] = scan.nextLine();
			counter++;
		}
		System.out.println("Data dibalik");
		while(counter>0) {
			
			counter--;
			
			System.out.println("data ke-" + counter2 +" : " +namaHari[counter]);
			counter2++;
		}
		

	}
}