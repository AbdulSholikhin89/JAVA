/* Latihan Switch Case */
package basic;
import java.util.Scanner;

public class latihanSwitch1
{
	private int score = 0;
	public static void main(String[] args)
	{
		latihanSwitch1 seleksi = new latihanSwitch1();
		seleksi.custom();
		
	}

	public void custom()
	{
		try
		{
			Scanner cek = new Scanner(System.in);
			//cek.Benar();
			//cek.Salah();
			
			String Nilai = null;
			String strGrade = null; 
			//String Tampung = Nilai + score;
			char Grade;
		
			System.out.println("");
			System.out.println("=============================================================");
			System.out.println("\t\tOne Stuby Milionaire\t\t");
			System.out.println("=============================================================");
			
/* Soal Nomor 1 */
			System.out.println("  Soal No. 1 : Siapa Nama Pemilik Laptop Ini ? \n");
			System.out.printf("%15s", "A. Kevin");
			System.out.printf("%25s", "C. Junot \n");
			System.out.printf("%15s", "B. Rizal");
			System.out.printf("%28s", "D. Gak Tau !! \n");
				strGrade = cek.nextLine();
				//Nilai = Integer.parseInt(Grade);
			
			if(strGrade.length() == 1)
			{
				Grade = strGrade.charAt(0);
				switch(Character.toUpperCase(Grade))
				{
					case 'A' : Salah(); 
					break;
			
					case 'B' : score +=10;
							   Benar(); 
					break;
					
					case 'C' : Salah(); 
					break;
					
					case 'D' : Salah(); 
					break;
					
					default: Nilai = "Harus Jawab"; 
					break;
				}
			}
			else
			{
				//Nilai = "input nilai tidak lebih dari 2 karakter";
			}
			System.out.print("");
			
			
			System.out.print("\n\n\n");
			
/* Soal Nomor 2 */
			System.out.println("  Soal No. 2: Di Tahun Berapa, Pemilik Laptop Ini Lahir ? \n");
			System.out.print("\tA. 1945 \t\t ");
			System.out.println("C. 1901");
			System.out.print("\tB. 1997 \t\t ");
			System.out.println("D. 1994");
				strGrade = cek.nextLine();
			
			if(strGrade.length() == 1)
			{
				Grade = strGrade.charAt(0);
				switch(Character.toUpperCase(Grade))
				{
					case 'A' : Salah(); 
					break;
			
					case 'B' : Salah();
					break;
					
					case 'C' : Salah(); 
					break;
					
					case 'D' : score +=10;
							   Benar(); 
					break;
					
					default: Nilai = "Harus Jawab"; 
					break;
				}
			}
			else
			{
				//Nilai = "input nilai tidak lebih dari 2 karakter";
			}
			
			System.out.println(" \nJawaban Anda : " + strGrade);
		}
		catch(NumberFormatException NFE)
		{
			System.err.println("ERROR");
		}
	}
	
	public void Benar()
	{
		//System.out.println("Benar	" + Nilai);
		
		System.out.println("Jawaban Anda : Benar");
		System.out.println("Score :" + score);
		//Tampung = Nilai + score;
	}
	
	public void Salah()
	{
		System.out.println("\t\t\t Salah");
		System.out.print("Score\t\t\t" + score);
	}
}