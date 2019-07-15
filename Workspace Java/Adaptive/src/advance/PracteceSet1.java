package advance;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PracteceSet1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Set<String> kata = null;
		Iterator <String> iterKata = null;
		int count = 1;
		String strKata = null;	
		kata = new HashSet<String> ();
		
		for(int z =1; z<=5;z++) {
			System.out.print("masukan kata ke- : " + z + ":");
			strKata= scan.nextLine();
			
			if(strKata.trim().isEmpty()) {
				System.out.println("Kata ke- "+ z +"tidak boleh kosong");
				--z;
			}else {
				kata.add(strKata);
			}
			
		}
		iterKata = kata.iterator();
		
		while(iterKata.hasNext()) {
			System.out.println("Elemen ke- " + count +"tidak boleh kosong" +iterKata.next());
			++count;
		}
		
		System.out.println("---------------------");
		for(String z : kata ) {
		System.out.println(z);
	}
	}

}