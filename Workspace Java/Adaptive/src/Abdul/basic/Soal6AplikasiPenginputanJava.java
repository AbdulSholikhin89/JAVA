package Abdul.basic;
import java.util.Scanner;
import java.util.Arrays;
public class Soal6AplikasiPenginputan extends Common{
	private static String data[][] = null;
	private static Scanner scan = new Scanner(System.in);
	private static int z = 0;
	private static int input = 0;
	private static String strInput = null;
	private static String userName = null;
	private static String password = null;
	private static String nama = null;

	
	public static void main(String[] args){
		Soal6AplikasiPenginputan soal = new Soal6AplikasiPenginputan();
		soal.run();	
		}
	
	public void run(){
		
		menu();
	}
	public void menu(){
		String strInput = null;
		int input = 0;
		
		System.out.println("============================");
		System.out.println("Aplikasi Pengolahan User");
		System.out.println("============================");
			
		System.out.println("1. Input User Baru");
		System.out.println("2. Lihat Semua User");
		System.out.println("3. Cari User");
		System.out.println("4. Exit");
		input = validasiMenu(strInput , "Masukkan menu: " , 4 , 1);

		
		switch(input){
			case 1 :
				input();
			case 2 :
				show();
			case 3 :
				search();
			case 4 :
				exit();
		}
		
	
	}
	public void input(){
		System.out.println("============================");
		System.out.println("         Input User       ");
		System.out.println("============================");
		input = validasiAngka(strInput , "Masukkan Jumlah User : ");
		data = new String[input][3];
		String temp[] = new String[input];
		boolean validasi = false;
		String a = null;
		for(z = 0 ; z < input ; z++){
		validasi = false;
			while(!validasi){
				
				//for(int j=0; j<data.length; j++){
				//temp[j]=data[j][0];
				//}
				
				data[z][0] = validasiKosong(userName , "Masukkan Username  : "); //username sudah digunakan
				a = data[z][0];
				//try{	
					for(int y = 0 ; y < input ; y++){
					
							if(a.equals(temp[y])){
								System.out.println("Username Sudah Digunakan");
								validasi = false;
								break;
								
							}
					
							else if(!a.equals(temp[y])){
								validasi = true;
							}
						
						
					}
				//}catch(Exception e){
				//	System.err.println("");
				//}

			}
			System.out.println(validasi);
			if(validasi == true){
			data[z][1] = validasiPassword(password , "Masukkan Password  : ");
			data[z][2] = validasiHurufSpasi(nama , "Masukkan Nama User : ");
			temp[z] = a ;
			validasi = false;
			}
			
		}
		enter();
		
	}
	public void show(){
			if(data==null){
				System.err.println("Belum ada data yang diinput");
				enter();
			}
			else{
				
			System.out.println("============================");
			System.out.println("         Data User       ");
			System.out.println("============================");
			System.out.println(" ======================================================================= ");
			System.out.printf("%1s %5s %1s %15s %1s %20s %1s %20s %1s" ,"|", "Nomer" ,"|", "Username" ,"|", "Password" ,"|", "Nama User" ,"|");
			System.out.println("");
			System.out.println(" ======================================================================= ");

			
		
				for (z = 0 ; z < data.length ; z++){
					String pwd = data[z][1];
					String pwdHidden = "";
					for(int temp = 0 ; temp < pwd.length() ; temp++){
						pwdHidden =pwdHidden + "*";
					}
					
					System.out.printf("%1s %5s %1s %15s %1s %20s %1s %20s %1s" ,"|", (z+1) ,"|", data[z][0] ,"|", pwdHidden ,"|", data[z][2] ,"|");
					System.out.println("");
					System.out.println(" ----------------------------------------------------------------------- ");
				}
			enter();
			}		
	}
	public void search(){
			String temp = null;
			if(data==null){
				System.err.println("Belum ada data yang diinput");
				enter();
			}
			else{
				
			temp = validasiKosong(temp , "Masukkan Username : ");
			
				for (z = 0 ; z <= data.length ; z++){
					
					if(temp.equals(data[z][0])){
						System.out.println("============================");
						System.out.println("         Data User       ");
						System.out.println("============================");
						System.out.println("Username  : " + data[z][0]);
						System.out.println("Password  : " + data[z][1]);
						System.out.println("Nama User : " + data[z][2]);
						enter();
					}
					if(data.length - z == 1){
						System.out.println("Data user tidak ditemukan.");
						enter();
					}
				}
			}
		
	}
	public void exit(){
	System.out.println("==============END=============");
	System.exit(0);
	
	}
	public void enter(){
		String enter = null;
		System.out.println(" ");
		System.out.print("Tekan enter untuk kembali ke menu... ");
		enter = scan.nextLine();
		System.out.println(" ");
		menu();
		
	}
		
	

}