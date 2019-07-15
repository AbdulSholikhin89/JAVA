package basic;
import java.util.Scanner;

	public class Menu {
	
	private String strMenu;
	private int pilih;
	private double Bilangan1;
	private double Bilangan2;
	private double Hasil;
	private String databilangan;
	
	
	Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
	Menu menu = new Menu(); 
	menu.run(); }
	public void run() {

		
	try {

		
		int pilihanMenu = 0;
	
			System.out.println("1. penjumlahan");
			System.out.println("2. Pengurangan ");
			System.out.println("3. Perkalian");
			System.out.println("4. Pembagian");
			System.out.println("5. Exit");
			
			System.out.println("pilih menu : ");
			strMenu= scanner.nextLine();
			
			if(strMenu.trim().isEmpty())   
			{
			System.out.print("Inputan tidak boleh kosong");
			run();
			} else {
			pilih = Integer.parseInt(strMenu);
			
			
					switch (pilih) {
				
					case 1 : hitungPenjumlahan();
							run();
					break;	 
				
					case 2 : hitungPengurangan();
							run();
					break;
					
					case 3 : hitungPerkalian();
							run();
					break;
					case 4 : hitungPembagian();
							run();
					break;
					
					case 5 : exit();
							
							
					default :  System.out.println("Silahkan di isi " );
							run();
					break;

				}
				
			}
	
	}catch(NumberFormatException NFE)
		{
			System.err.println("ERROR");
			run();
		}
	}
			
		
	public void hitungPenjumlahan(){
				
			try {
				
			System.out.print("Masukan Bilangan ke-1 : ");
			databilangan = scanner.nextLine();
			Bilangan1 = Double.parseDouble(databilangan);
			
			System.out.print("Masukan Bilangan ke-2 : ");
			databilangan= scanner.nextLine();
			Bilangan2 = Double.parseDouble(databilangan);
			
			Hasil =(Bilangan1 + Bilangan2);
			System.out.println("hasilnya" + " = " + Bilangan1 + " + " + Bilangan2 +" = "  + Hasil);
	
		} catch (NumberFormatException nfe) {
			System.err.println("input harus angka");
			hitungPenjumlahan();
		}
	}
	public void hitungPengurangan(){
				
			try {
				
			System.out.print("Masukan Bilangan ke-1 : ");
			databilangan = scanner.nextLine();
			Bilangan1 = Double.parseDouble(databilangan);
			
			System.out.print("Masukan Bilangan ke-2 : ");
			databilangan= scanner.nextLine();
			Bilangan2 = Double.parseDouble(databilangan);
			
			Hasil =(Bilangan1 - Bilangan2);
			System.out.println("hasilnya" + " = " + Bilangan1 + " - " + Bilangan2 +" = "  + Hasil);
	
		} catch (NumberFormatException nfe) {
			System.err.println("input harus angka");
			hitungPengurangan();
		}
	}
	public void hitungPerkalian(){
				
			try {
				
			System.out.print("Masukan Bilangan ke-1 : ");
			databilangan = scanner.nextLine();
			Bilangan1 = Double.parseDouble(databilangan);
			
			System.out.print("Masukan Bilangan ke-2 : ");
			databilangan= scanner.nextLine();
			Bilangan2 = Double.parseDouble(databilangan);
			
			Hasil =(Bilangan1 * Bilangan2);
			System.out.println("hasilnya" + " = " + Bilangan1 + " * " + Bilangan2 +" = "  + Hasil);
	
		} catch (NumberFormatException nfe) {
			System.err.println("input harus angka");
			hitungPerkalian();
		}
	}
	public void hitungPembagian(){
				
			try {
				
			System.out.print("Masukan Bilangan ke-1 : ");
			databilangan = scanner.nextLine();
			Bilangan1 = Double.parseDouble(databilangan);
			
			System.out.print("Masukan Bilangan ke-2 : ");
			databilangan= scanner.nextLine();
			Bilangan2 = Double.parseDouble(databilangan);
			
			Hasil =(Bilangan1 / Bilangan2);
			System.out.println("hasilnya" + " = " + Bilangan1 + " / " + Bilangan2 +" = "  + Hasil);
	
		} catch (NumberFormatException nfe) {
			System.err.println("input harus angka");
			hitungPembagian();
		}
	}
	public void exit() {
		System.out.println("good bye");
		System.exit(0);
	}	
		
	
	
	
	}					