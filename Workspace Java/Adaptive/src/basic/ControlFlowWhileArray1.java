package basic;

import java.util.Scanner;

public class ControlFlowWhileArray1
{
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ControlFlowWhileArray1 ltArray = new ControlFlowWhileArray1();
		ltArray.run();
	}
	
	public void run()
	{
		String strJmlData = null;
		int jmlData = 0;
		int j = 1;
		int i = 0;
		String[] tampungData = {};
		boolean ambilData = true;
		
		while (ambilData)
		{
			try 
			{
				System.out.print("\nSILAKAN MASUKKAN JUMLAH DATA : ");
				strJmlData = scan.nextLine();
				
				if (strJmlData.trim().isEmpty())
				{
					System.out.println("Goodbye.\n");
					System.exit(0);
				} 
				else
				{
					jmlData = Integer.parseInt(strJmlData);
					
					if (jmlData == 0)
					{
						System.out.println("Goodbye.\n");
						System.exit(0);
					}
					else
					{
						tampungData = new String[jmlData];
						System.out.println("\n====================================");
						
						while(i < jmlData)
						{
							System.out.println("Hari ke-" + (i+1) + " : ");
							tampungData[i] = scan.nextLine();
							i++;
						}
					
						System.out.println("\n=====================================\n");
						System.out.println("Hari akan dibalik menjadi : \n");

						while (jmlData > 0)
						{
							System.out.println("Hari ke-" + j + ": " + tampungData[jmlData-1]);
							jmlData--;
							j++;
						}
						
						ambilData = false;
					}
				}
			}
			catch (NumberFormatException nfe)
			{
				System.err.print("Masukkan bilangan bulat.\n");
			}
		
		}
		
	}
}