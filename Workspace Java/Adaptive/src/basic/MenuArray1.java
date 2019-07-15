package basic;
import java.util.Scanner;
public class MenuArray1 {
	
	
			MenuArray1 menuArray1 = new MenuArray1();
			menuArray1.run();
	}
			String[] namaHari ={"Senin","Selasa","Kamis","Jumat"};
			String[] jadwalPelajaran ={"IPA,IPS & MTK","B.INDONESIA,B.INGGRIS","PKN & PENJASKES","SENI BUDAYA"};
			String strInput = null;
			String strCariHari = null;
			
			System.out.println("==========================");
			System.out.println("APLIKASI JADWAL PELAJARAN");
			System.out.println("1. Tampilkan Hari sekolah");
			System.out.println("2. Tampilkan jadwal pelajaran");
			System.out.println("3. Cari Jadwal Pelajaran");
			System.out.println("4. Exit");
			
		public static void main(String[] args) {
		}
			
	}
		
			
		public void run() {
			{	
			try 
			}
				System.out.print("\nMasukkan menu : ");
				strInput = scan.nextLine();
					
			if (strInput.trim().isEmpty())
			{
				System.out.println("Masukan tidak boleh kosong.\n");
				tekanEnter();
			}
			else 
			{
				inputMenu = Integer.parseInt(strInput);
				
				switch(inputMenu)
				{
					case 1	: Menu1();
							  break;
					case 2	: Menu2();
							  break;
					case 3	: Menu3();
							  break;
					case 4	: Menu4();
							  break;
					default	: System.out.println("Hanya menerima input 1-4.\n");
							  tekanEnter();
							  break;
				}
			}
		}
		
		catch (NumberFormatException nfe) {
		}
		

		
		
		
		
	
	
			
			
	
