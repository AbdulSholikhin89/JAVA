package basic;

import java.util.Scanner;

public class ControlFlowIfElseValidation
{
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ControlFlowIfElseValidation cfie = new ControlFlowIfElseValidation();
		cfie.run();
	}
	
	public void run()
	{
		String strHutang, strGaji = null;
		int Hutang, Gaji = 0;
		boolean tanya = true;
		boolean tanyaGaji = false;
		String ketHutang = null;
		String ketGaji = null;
		
		
		System.out.println("\n==========================");
		System.out.println("VALIDASI GAJI DAN HUTANG");
		System.out.println("==========================\n");
		
		while (tanya)
		{	
			try {
				System.out.print("Masukkan Hutang : ");
				strHutang = scan.nextLine();
				
				if (strHutang.trim().isEmpty())
				{
					System.out.println("Hutang tidak boleh kosong.\n");
				}
				else
				{
					Hutang = Integer.parseInt(strHutang);
					
					if (Hutang <= 0)
					{
						System.out.println("Hutang harus lebih dari 0.\n");
					}
					else
					{
						ketHutang = "\nHutang Anda adalah " + Hutang;
						tanya = false;
						tanyaGaji = true;
					}
				}					
			} catch (NumberFormatException nfe)
			{
				System.out.println("Hutang harus merupakan bilangan.\n");

			}
			
		}
		
		while (tanyaGaji)
		{
			try {
				System.out.print("Masukkan Gaji : ");
				strGaji = scan.nextLine();
				
				if (strGaji.trim().isEmpty())
				{
					System.out.println("Gaji tidak boleh kosong.\n");
				}
				else
				{
					Gaji = Integer.parseInt(strGaji);
					
					if (Gaji <= 0)
					{
						System.out.println("Gaji harus lebih dari 0.\n");
					}
					else
					{
						ketGaji = "\nGaji Anda adalah " + Gaji;
						tanyaGaji = false;
					}
				}					
			} catch (NumberFormatException nfe)
			{
				System.out.println("Gaji harus merupakan bilangan.\n");
			}
		}
		
		System.out.println(ketHutang + ketGaji);
		keluar();
	}
	
	public void keluar()
	{
		System.out.print("\nIngin keluar? (y|t) ");
		String strInput = scan.nextLine();
		
		if (strInput.equalsIgnoreCase("y"))
		{
			System.out.println("Bye bye.");
			System.exit(0);
		}
		else if (strInput.equalsIgnoreCase("t"))
		{
			run();
		}
		else
		{
			System.out.println("Perintah tidak dikenali.\n");
			keluar();
		}
	}
}