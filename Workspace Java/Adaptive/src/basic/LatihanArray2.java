package basic;

import java.util.Scanner;


public class LatihanArray2
{
	Scanner scan = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		LatihanArray2 ltArray = new LatihanArray2();
		ltArray.run();
	}
	
	public void run()
	{
		boolean tanyaUrutan = true;
		String strUrutan;
		String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
		int urutan;
		
		while (tanyaUrutan)
		{
			System.out.print("Masukkan urutan hari : ");
			strUrutan = scan.nextLine();
			
			if (!strUrutan.trim().isEmpty())
			{
				try
				{
					
					urutan = Integer.parseInt(strUrutan);
					
					switch (urutan)
					{
						case 1  : System.out.println(namaHari[0]);
								  tanyaUrutan = false;
								  break;
						case 2  : System.out.println(namaHari[1]);
								  tanyaUrutan = false;
								  break;
						case 3  : System.out.println(namaHari[2]);
								  tanyaUrutan = false;
								  break;
						case 4  : System.out.println(namaHari[3]);
								  tanyaUrutan = false;
								  break;
						case 5  : System.out.println(namaHari[4]);
								  tanyaUrutan = false;
								  break;
						case 6  : System.out.println(namaHari[5]);
								  tanyaUrutan = false;
								  break;
						case 7  : System.out.println(namaHari[6]);
								  tanyaUrutan = false;
								  break;
						default : System.out.println("Urutan harus diisi antara 1-7.");
								  break;
					}
				
				}
				catch (NumberFormatException nfe)
				{
					System.out.println("Silakan masukkan bilangan bulat.");
				}
			}
			else
			{
				System.out.println("Tidak dapat memproses nilai kosong.");
			}
		}
	}
}