package advance;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class PracteceSet2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		List<String> kata = null;
		Iterator <String> iterKata = null;
		
		int count = 1;
		String strKalimat = null;
		String[] splitKalimat = {};
		kata = new ArrayList<String> ();
		boolean iya = true;
		
		while(iya) { 
			System.out.print("masukan kalimat : ");
			strKalimat= scan.nextLine();
			if(strKalimat.trim().isEmpty()) {
				System.out.println("kalimat tidak boleh kosong");
			} else {
				iya = false;
			}
			splitKalimat = strKalimat.split(" ");
			int PanjangKalimat = splitKalimat.length;
			
			for(int z =0; z<PanjangKalimat;z++) {
				kata.add(splitKalimat[z]);
			}
		}
			
			
		iterKata = kata.iterator();
		
		while(iterKata.hasNext()) {
			System.out.println("Kata ke- "+ count +  ":" +" " +iterKata.next());
			
			++count;
		}
		
		System.out.println("---------------------");
		for(String z : kata ) {
		System.out.println(z);
	}
	}

}