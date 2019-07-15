package basic;
import java.util.Scanner;

public class Kuis 
{
	private int score = 0;
	public static void main(String[] args) 
	{
		Kuis kuis = new Kuis ();
		kuis.run();
	}

	public void run() 
	{	
		try
		{
			char grade = 0;
			String keterangan = null;
			String strGrade = null;
		
			Scanner scanner = new Scanner (System.in);

/* Soal Ke Satu */		
			System.out.printf("1. Apakah singkatan dari RAM ?\n\n");
		
			System.out.printf("%27s","A. Random Assist Memory ");
			System.out.printf("%28s","B. Random Actual Memory\n");
			System.out.printf("%27s","C. Random Access Memory ");
			System.out.printf("%26s","D. Random Anu Memory\n\n");
		
		
			System.out.printf("%21s","Masukan Jawaban : ");
			strGrade= scanner.nextLine();
		
			if(strGrade.length() == 1) 
			{
				grade = strGrade.charAt(0);
				switch (Character.toUpperCase(grade)) 
				{
					case 'A': salah();
					break;
				
					case 'B': salah();
					break;
				
					case 'C': score +=10;
							  benar();
					break;
				
					case 'D': salah();
					break;
				
					default : System.out.println("Jawaban harus A-D" );
					break;
				}
			}
			else 
			{
				System.out.printf("%43s","input tidak boleh lebih dari 2 karakater");
			}

/* Soal Ke Dua */
				System.out.println("\n");
				System.out.printf("%8s", "2. Apakah singkatan dari CPU ?\n\n");
		
				System.out.printf("%26s","A. Central Progam Unit ");
				System.out.printf("%30s","B. Central Protokol Unit\n");
				System.out.printf("%29s","C. Central Procedure Unit ");
				System.out.printf("%30s","D. Central Processing Unit\n\n");
		
				System.out.printf("%21s","Masukan Jawaban : ");
				strGrade= scanner.nextLine();
		
			if (strGrade.length() == 1)
			{
				grade = strGrade.charAt(0);
		
				switch (Character.toUpperCase(grade)) 
				{
					case 'A': salah();
					break;
				
					case 'B': salah();
					break;
				
					case 'C': salah();
					break;
				
					case 'D': score +=10;
							  benar();
					break;
				
					default : System.out.printf("%30s","Jawaban harus A-D" );
					break;
				}
			}
			else
			{
				System.out.println("input tidak boleh lebih dari 2 karakater");
			}
		}
		catch(NumberFormatException NFE)
		{
			System.err.println("ERROR");
		}
	}
	
	public void benar()
	{
		System.out.printf("%9s","Benar\n");
		System.out.printf("%13s","Score : " + score);
	}
	
	public void salah()
	{
		System.out.printf("%9s","salah\n");
		System.out.printf("%18s","tidak ada score");
	}
}