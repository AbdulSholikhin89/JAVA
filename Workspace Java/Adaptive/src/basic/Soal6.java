package basic;

import java.util.Scanner;

public class Soal6{
		private String arrayUser [][] = null;
		private Scanner scanner = new Scanner(System.in);

		private String strMenu = null;
		private String strPanjang = null;
		private String strBin = "";
		private String strUser = null;
		private String strInput = null;

		private int user = 0;
		private int menu = 0;
		private boolean counter2 = false;
		private boolean counter3 = false;
		private boolean counter4 = false;
		private boolean counter5 = false;

	public static void main(String[] args) {
		Soal6 soal6 = new Soal6();
		soal6.run();		
	}

	public void run(){
		boolean counter = true;

		System.out.println("=========================");
		System.out.printf("%17s\n","SOAL KE 6");
		System.out.println("=========================");


		while(counter){
			try{
				System.out.println("========================");
				System.out.println("Aplikasi Pengolahan User");
				System.out.println("========================");
				System.out.println("1. Input User Baru");
				System.out.println("2. Lihat Semua User");
				System.out.println("3. Cari User");
				System.out.println("4. Exit");
				System.out.print("Masukan Menu: ");
				strMenu = scanner.nextLine();
				if (strMenu.trim().isEmpty()){
					System.out.println("Menu Belum diisi.");
				} else {
					menu = Integer.parseInt(strMenu);

					switch(menu){
								case 1 : userBaru();
										 run();	
										 break;
								case 2 : lihatUser();
										 run();	
										 break;
								case 3 : Cari();
										 run();
										 break;	
								case 4 : Keluar();
										 break;
								default	: System.out.println("Menu harus 1-4");
										 Enter();	 			 	 							 
										 break;
							
					}	
				}
		
			} catch (NumberFormatException nfe){
				System.out.println("Menu harus angka\n\n");
			}

		}
			counter = false;
		}	

	public void userBaru(){
		
		counter2 = true;
		System.out.println("");
		System.out.println("");

		System.out.println("============================");
		System.out.printf("%19s\n","Input User");
		System.out.println("============================");
		
		while(user <=0 ){
			try{
				System.out.print("Masukan jumlah user: ");
				strUser = scanner.nextLine();
				if(strUser.trim().isEmpty()){
					System.out.println("Jumlah Tidak boleh kosong.");
				} else {
					user = Integer.parseInt(strUser);
					if(user <=0 ){
						System.out.println("Jumlah User Tidak Boleh Kurang Dari 1");
					} else {
					arrayUser = new String [user][3];
					counter2 = false;
						
					}
				}
			} catch (NumberFormatException nfe){
				System.err.println("Inputan Harus Angka");
			}
		}
		System.out.println("");

		for (int z = 0 ; z < arrayUser.length ; z++){
			counter3 = false;
				System.out.println("DATA KE-"+(z+1));
				System.out.println("================");

			while (!counter3){				
				System.out.print("Masukan Username: ");
				strInput = scanner.nextLine();
					if (strInput.trim().isEmpty()){ 		
						System.out.println("Username tidak boleh kosong");
					} else { 
						
						for (int x =0 ; x < arrayUser.length ; x++){
							if((strInput.equals(arrayUser[x][0]))){
								System.out.println("Username sudah terdaftar.");
								counter3 = false;
								break;
							} else {
								counter3 = true;
							} 
						}

					}
					arrayUser [z][0] = strInput;
			}		 

			if (counter3 == true){
			counter4 = true;		
			while(counter4){
				System.out.print("Masukan Password: ");
				arrayUser[z][1] = scanner.nextLine();
				if(arrayUser[z][1].trim().isEmpty()){
					System.out.println("Password tidak boleh kosong");
				} else {
					counter4 = false;
					counter5 = true;
				}
			}
			}

			while(counter5){
				System.out.print("Masukan Nama: ");
				arrayUser[z][2] = scanner.nextLine();
				if(arrayUser[z][2].trim().isEmpty()){
					System.out.println("Nama tidak boleh kosong");
				} else {
					counter5 = false;
				}
			}

			if(z < arrayUser.length){
				counter3 = true;
			} else {
				counter3 = false;
			}

		}
			System.out.println("");
			Enter();		
	}
	
	public void lihatUser(){

		if(arrayUser == null){
			System.err.println("Data User Masih Kosong.");
			Enter();
		} else {
		System.out.println(" ===========================================");
		System.out.printf(" | %-11s | %-11s | %-11s |\n", "Username", "Password", "Nama");
		System.out.println(" ===========================================");

		for(int e = 0 ; e < arrayUser.length; e++){
			strPanjang = arrayUser[e][1];
			strBin = "";
			for(int a = 0 ; a < strPanjang.length() ; a++){
				strBin = strBin + "*";

			}
		System.out.printf(" | %-11s | %-11s | %-11s |\n", arrayUser[e][0], strBin, arrayUser[e][2]);
		}
		System.out.println(" ============================================");

		System.out.println("");
		System.out.println("");
		}
		Enter();
		}
		
	public void Cari(){
		String strCari = null;

		System.out.println("");
		if(arrayUser == null){
			System.err.println("Data User Masih Kosong.");
			Enter();
		}
		else{
			System.out.print("Masukkan Username : ");
			strCari = scanner.nextLine();
			if(strCari.trim().isEmpty()){
				System.out.println("Username Tidak Boleh Kosong.");
			} else {

				for (int z = 0 ; z <= arrayUser.length ; z++){
					
					if(strCari.equals(arrayUser[z][0])){
						System.out.println("============================");
						System.out.printf("%18s\n"," Data User");
						System.out.println("============================");
						System.out.println("Username  : " + arrayUser[z][0]);
						System.out.println("Password  : " + arrayUser[z][1]);
						System.out.println("Nama 	  : " + arrayUser[z][2]);
						Enter();

					} else{
						System.out.println("Data user tidak ditemukan.");
						Enter();
					}
				}
			}
		}
	}

	public void Enter(){
		System.out.print("Tekan enter untuk kembali ke menu..");
		scanner.nextLine();
		run();
	}	

	public void Keluar(){
		System.out.println("bye bye.");
		System.exit(0);
	}

}




					

