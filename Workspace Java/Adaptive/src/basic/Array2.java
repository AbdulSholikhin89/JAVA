package basic;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		String[] arrayHari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
		String[] keterangan ={"Masuk","Masuk","Libur","Libur","Masuk","Masuk","Libur"};
		boolean balik = true;
		boolean cari = false;
		int z = 0;
		int x = 0;
		
		Scanner scan = new Scanner (System.in);
		String strHari = null;
		
		
		
		while(balik) {
		
		System.out.print("Masukan hari : ");
		strHari = scan.nextLine();
		if(strHari.trim().isEmpty()) {
			System.out.println("Hari tidak boleh kosong");
		}else {
		
			for( z=0; z <arrayHari.length; z++) {
				if(strHari.equalsIgnoreCase(arrayHari[z])) {
					x=z;
					cari = true;
					balik= false;
				
					break;
				}
				
				else {
					System.out.println("Hari tidak ketemu");
			
				
				}
	
			
			}
			
			
		}
		}
		
		if(cari= true ) {
			
		System.out.println("========Jadwal Kerja=======");
		System.out.println("===========================");		
		System.out.println("Hari  : " + arrayHari[x]);
		System.out.println("Keterangan : " + keterangan[x]);
		
			
		}
	
}
	}
