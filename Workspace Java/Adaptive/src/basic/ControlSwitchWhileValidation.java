package basic;

import java.util.Scanner;

public class ControlSwitchWhileValidation
{
	Scanner scan = new Scanner(System.in);
	String strPerse = null;
	int perseneling = 0;
	String keterangan = null;
	boolean aja;
	
	public static void main(String[] args)
	{
		ControlSwitchWhileValidation csw = new ControlSwitchWhileValidation();
		csw.run();
	}
	
	public void run()
	{
		aja = true; 
		while (aja)
		{
			try 
			{
				System.out.print("Masukkan perseneling : ");
				strPerse = scan.nextLine();
				
				if (strPerse.trim().isEmpty())
				{
					System.out.println("Perseneling tidak boleh kosong.\n");
				}
				else
				{
					perseneling = Integer.parseInt(strPerse);
					
					switch(perseneling){
					case 0	: keterangan = "Tidak Bergerak.";
							  keluar();
							  break;
					case 1	: keterangan = "Mulai Bergerak.";
							  keluar();
							  break;
					case 2	: keterangan = "Kecepatan Rendah.";
					          keluar();
							  break;
					case 3	: keterangan = "Kecepatan Sedang.";
							  keluar();
							  break;
					case 4	: keterangan = "Kecepatan Tinggi.";
							  keluar();
							  break;
					default : System.out.println("Kondisi perseneling harus berada di antara 0 - 4.\n");
							  break;
					}
				}
				
			}
			catch (NumberFormatException nfe)
			{
				System.out.println("Perseneling harus bilangan bulat.\n");
			}
		}
		
	}
	
	public void keluar()
	{
		boolean yesno = true;
		aja = false;
		System.out.println(keterangan);
		
		while (yesno)
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
				yesno = false;
				run();
			}
			else
			{
				System.out.println("Perintah tidak dikenali.\n");
			}
		}
		
	}
	
	
}