package basic;

import java.util.Scanner;

public class ControlFlowWhileArray5
{
	Scanner scan = new Scanner(System.in);
	
		int[][] matriks1 = {};
		int[][] matriks2 = {};
		int[][] matriksTotal = {};
		boolean aja = true;
		
		String strMatriks1 = null;
		String strMatriks2 = null;
		String strkolom = null; 
		String strbaris = null;
		
		int kolom = 0;
		int baris = 0;
		int i,j;
	
	public static void main(String[] args)
	{
		ControlFlowWhileArray5 cfw = new ControlFlowWhileArray5();
		cfw.run();
	}
	
	public void run()
	{
		ValidasiMatriks();
		System.out.print("\n");
		IsiMatriks1();
		System.out.print("\n");
		IsiMatriks2();
		System.out.print("\n");
		showIsiMatriks1();
		System.out.print("\n");
		showIsiMatriks2();
		System.out.print("\n");
		penjumlahanMatriks();
		
	}
	
	public void ValidasiMatriks()
	{
		while (aja)
		{
			try
			{
				System.out.print("Ukuran baris matriks : ");
				strbaris = scan.nextLine();
				
				if (strbaris.trim().isEmpty())
				{
					System.out.println("Jangan kosong.\n");
				}
				else
				{
					baris = Integer.parseInt(strbaris);
					
					if (baris > 0)
					{
						System.out.print("Ukuran kolom matriks : ");
						strkolom = scan.nextLine();
						
						if (strkolom.trim().isEmpty())
						{
							System.out.println("Jangan kosong.\n");
						}
						else
						{
							kolom = Integer.parseInt(strkolom);
							
							if (kolom > 0)
							{
								aja = false;
							}
							else
							{
								System.out.println("Tidak boleh 0.\n");
							}
						}
					}
					else
					{
						System.out.println("Tidak boleh 0.\n");
					}
					
				}
			}
			catch (NumberFormatException nfe)
			{
				System.err.println("Masukkan nomor.\n");
			}
		}
		
	
	}
	
	public void IsiMatriks1()
	{
		matriks1 = new int [baris][kolom];
		boolean benar = true;
		i = 0;
		
		while (benar)
		{
			try
			{
				while (i < baris)
				{
					j = 0;
					
					while (j < kolom)
					{
						System.out.print("Masukkan isi matriks 1 " + "[" + i + "]" + "[" + j + "] : ");
						
						matriks1[i][j] = Integer.parseInt(scan.nextLine());
						
						j++;
					}
					
					i++;
				}
				
				benar = false;
			}
			catch (NumberFormatException nfe)
			{
				System.out.println("Masukkan angka.\n");
			}
		}
		
		
	}
	
	public void IsiMatriks2()
	{
		matriks2 = new int [baris][kolom];
		boolean benar = true;
		i = 0;
		
		while (benar)
		{
			try
			{
				while (i < baris)
				{
					j = 0;
					
					while (j < kolom)
					{
						System.out.print("Masukkan isi matriks 2 " + "[" + i + "]" + "[" + j + "] : ");
						
						matriks2[i][j] = Integer.parseInt(scan.nextLine());
						
						j++;
					}
					
					i++;
				}
				
				benar = false;
			}
			catch (NumberFormatException nfe)
			{
				System.out.println("Masukkan angka.\n");
			}
		}
	}
	
	public void showIsiMatriks1()
	{
		System.out.println("Matriks 1");
		
		i = 0;
		while (i < baris)
		{
			j = 0; 
			while (j < kolom)
			{
				System.out.print(matriks1[i][j] + " ");
				
				j++;
			}
			
			System.out.println(" ");
			i++;
		}
	}
	
	public void showIsiMatriks2()
	{
		System.out.println("Matriks 2");
		
		i = 0;
		while (i < baris)
		{
			j = 0; 
			while (j < kolom)
			{
				System.out.print(matriks2[i][j] + " ");
				
				j++;
			}
			
			System.out.println(" ");
			i++;
		}
	}
	
	
	public void penjumlahanMatriks()
	{
		System.out.println("Hasil Penjumlahan Matriks 1 & Matriks 2");
		
		i = 0;
		while (i < baris)
		{
			j = 0; 
			while (j < kolom)
			{
				int hasil = matriks1[i][j] + matriks2[i][j];
				System.out.print(hasil + " ");
				
				j++;
			}
			
			System.out.println(" ");
			i++;
		}
	}
	
	/*menampilkan output (bang malik version)
	akolom = 0;
	while (akolom < kolom)
	{
		while(aBaris < baris)
		{
			System.out.format("%-5s", hasil[kolom][baris]);
			aBaris++;
		}
		System.out.format("%n");
		aBaris = 0;
		akolom++:
	}
	fungsi continue itu buat ngeskip ke i selanjutnya. kalo break bener bener stop looping.
	*/
}