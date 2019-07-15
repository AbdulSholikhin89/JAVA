package basic;

import java.util.Scanner;

public class ControlFlowIf3 {

public static void main(String[] args) {
	ControlFlowIf3 controlFlowIf3 = new ControlFlowIf3 ();
	controlFlowIf3.run();
	}

	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		
		String jenisKelamin = null;
		String Perempuan = "Perempuan";
		String Lakilaki = "Laki laki";	
			
		
		System.out.print("Jenis Kelamin : ");
		jenisKelamin = scanner.nextLine();
		
	if (jenisKelamin.trim().isEmpty()) 
	{	
		System.out.print("Jenis Kelamin : tidak boleh kosong ");
		
	} else if (jenisKelamin.equalsIgnoreCase(Perempuan)) {
		
		System.out.print("Benar, anda adalah Perempuan");
		
	} else if (jenisKelamin.equalsIgnoreCase(Lakilaki)) {
		System.out.print("Salah, anda bukan  Perempuan" );
		
	
	}else {
		System.out.print("masukan perempuan atau laki laki" );
	}	}
	
	public String cekjenisKelamin(String jenisKelamin) {
		String Keterangan = null;
		String Perempuan = "Perempuan";
		String Lakilaki = "Laki laki";	
		if (jenisKelamin.trim().isEmpty()) 
	{	
		Keterangan = "Jenis Kelamin : tidak boleh kosong";
		
		} else if (jenisKelamin.equalsIgnoreCase(Perempuan)) {
		
			Keterangan = "Benar, anda adalah Perempuan";
		
		} else if (jenisKelamin.equalsIgnoreCase(Lakilaki)) {
			Keterangan = "Salah, anda bukan  Perempuan" ;
		
	
		}else {
		Keterangan = "masukan perempuan atau laki laki"; 
		
		
		}return Keterangan;
	
	}
		
}
	
		
		
	
		
	


