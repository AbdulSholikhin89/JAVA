package basic;

import java.util.Scanner;

public class ControlFlowIf2 {

public static void main(String[] args) {
	ControlFlowIf2 controlFlowIf2 = new ControlFlowIf2 ();
	controlFlowIf2.run();
	}

	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		
		String nama = null;
		String namaSaya = "Abdul Sholikhin";
			
			
		
		System.out.print("Masukan Nama : ");
		nama = scanner.nextLine();
		
	if (nama.equals(namaSaya)){
		
		System.out.print("Benar, anda adalah" + namaSaya);
		
	} else {
		System.out.print("Salah, anda bukan " + namaSaya);
		
		}
	}
			
}
	
		
		
	
		
	


