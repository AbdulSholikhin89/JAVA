package basic;
import java.util.Scanner;
public class LatihanArray5 {
	public static void main(String[] args) {
			String[] namaBulan ={"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
			for (int z= 0; z<6; z++) {
				System.out.println("Bulan : " + namaBulan[z]);
			}
			
			System.out.println("==============================");
			
			for (String z : namaBulan) {
				System.out.println("Bulan : " + z);
				if (z.equalsIgnoreCase("Agustus")) {
					System.out.println("berhenti");
					break;
				}
			}
	}
}
	