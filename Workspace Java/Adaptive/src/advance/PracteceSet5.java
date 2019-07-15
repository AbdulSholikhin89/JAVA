package advance;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;


public class PracteceSet5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		List<String> kata = null;
		Iterator <String> iterKata = null;
		int count = 1;
		String strKata = null;
		boolean woke = true;
		int x = 1;
		
		kata = new ArrayList<String> ();
		while(woke) {
			System.out.print("masukan kata ke- : " + x + ":");
			strKata= scan.nextLine();
			
			if(strKata.trim().isEmpty()) {
				System.out.println("Kata tidak boleh kosong");
				woke = false;
			
			}else {
				kata.add(strKata);
				x++;
				
			}
			
		}
		iterKata = kata.iterator();
		
		while(iterKata.hasNext()) {
			System.out.println("Elemen ke- " + count +" " +iterKata.next());
			++count;
		}
		
		System.out.println("---------------------");
		for(String z : kata ) {
		System.out.println(z);
	}
	}

}