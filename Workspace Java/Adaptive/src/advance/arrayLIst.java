package advance ;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
	public static void main(String [] args) {
		String kata1 = null;
		String hari = null;
		boolean foundHari = false;
		int indexHari = 0;
		Scanner scan = new Scanner (System.in);
		List<String> kataList = new ArrayList<String> ();
		kataList.add("Senin");
		kataList.add("Selasa");
		kataList.add("Rabu");
		kataList.add("Kamis");
		kataList.add("Jumat");
		kataList.add("Sabtu");
		kataList.add("Minggu");

		
		
		
		
		System.out.println("=========================");
		for(int z=0;z<kataList.size();z++) {
			System.out.println(kataList.get(z));
		}
		
		System.out.print("Cari Index Hari : ");
		hari = scan.nextLine();
		for(int z=0; z<kataList.size();z++) {
			if(hari.trim().equalsIgnoreCase(kataList.get(z).trim())) {
				indexHari = z;
				foundHari = true;
				break;
			}
		}
		
		if(foundHari) {
			System.out.println("index hari " + hari + ":" + indexHari);
			kataList.remove(indexHari);
			System.out.println("=========================");
			for(int z=0;z<kataList.size();z++) {
				System.out.println(kataList.get(z));
			}
		}else {
			System.out.println("Hari tidak ditemukan");
			
		
		}
	}
}

			