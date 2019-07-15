package advance1;

import java.util.Scanner;
import java.util.Date;
import java.util.Set;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


public class PracticeSet6Common
{
	Scanner scan = new Scanner(System.in);
	
	public Integer validasiInteger(String tanya)
	{
		String input = null;
		Integer keluaran = 0;
		boolean aja = true;
		
		
		while (aja)
		{
			try
			{
				System.out.print(tanya);
				input = scan.nextLine();
				
				if(input.trim().isEmpty())
				{
					System.out.println("Tidak boleh kosong..\n");
				}
				else 
				{
					keluaran = Integer.parseInt(input);
					
					if(keluaran <= 0)
					{
						System.out.println("Harus lebih dari nol.\n");
					}
					else
					{
						aja = false;
					}
				}
			}
			catch (NumberFormatException nfe)
			{
				System.err.println("Masukkan bilangan bulat.\n");
			}
		}
		
		return keluaran;
	}
	
	public String validasiString(String tanya)
	{
		String input = null;
		boolean aja = true;
		
		while (aja)
		{
			System.out.print(tanya);
			input = scan.nextLine();
			
			if(input.trim().isEmpty())
			{
				System.out.println("Input tidak boleh kosong.\n");
			}
			else 
			{
				aja = false;
			}
		}
		
		return input;
	}
	
	public String validasiJenisKelamin(String tanya)
	{
		String input = null;
		boolean aja = true;
		
		while (aja)
		{
			System.out.print(tanya);
			input = scan.nextLine();
			
			if(input.trim().isEmpty())
			{
				System.out.println("Input tidak boleh kosong.\n");
			}
			else if (input.equalsIgnoreCase("l")||input.equalsIgnoreCase("p")) 
			{
				aja = false;
			}
			else
			{
				System.out.println("Format jenis kelamin adalah P/L.\n");
			}
		}
		
		return input;
	}
	
	public String validasiNoHp(String tanya)
	{
		String input = null;
		boolean aja = true;
		
		while (aja)
		{
			System.out.print(tanya);
			input = scan.nextLine();
			
			if(input.trim().isEmpty())
			{
				System.out.println("Input tidak boleh kosong.\n");
			}
			else if (input.matches("^[0-9]*$"))
			{
				if (input.length() < 10 || input.length() > 13)
				{
					System.out.println("Jumlah digit harus di antara 10 hingga 13 digit.\n");
				}
				else
				{
					aja = false;
				}
			}
			else
			{
				System.out.println("Masukkan nomor handphone yang sah.\n");
			}
		}
		
		return input;
	}
	
	public Long validasiNoPelajar(String tanya)
	{
		String input = null;
		Long keluaran = null;
		boolean aja = true;
		
		while (aja)
		{
			try
			{
				System.out.print(tanya);
				input = scan.nextLine();
				
				if(input.trim().isEmpty())
				{
					System.out.println("Masukan tidak boleh kosong.\n");
				}
				else 
				{
					keluaran = Long.parseLong(input);
					
					if(keluaran <= 0)
					{
						System.out.println("Harus lebih dari nol.\n");
					}
					else
					{
						aja = false;
					}
				}
			}
			catch (NumberFormatException nfe)
			{
				System.err.println("Masukkan bilangan bulat.\n");
			}
		}
		
		return keluaran;
	}

	public Date validasiTanggal(String tanya)
	{
		String input = null;
		Date keluaran = null;
		boolean aja = true;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		while (aja)
		{
			try {
				System.out.print(tanya);
				input = scan.nextLine();
				if(input.trim().isEmpty())
				{
					System.out.println("Tanggal tidak boleh kosong.\n");
				} else {
					keluaran = sdf.parse(input);
					aja = false;
				}
			} catch (Exception e){
				System.out.println("Format tanggal harus dd/MM/yyyy. Contoh : 26/03/2017.\n");
			}
		}
		return keluaran;
	}
}
