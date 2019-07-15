package basic;
import java.util.Scanner;

	public class MenuArray {
	
	String[][] jadwalPelajaran = {
		{"Senin","IPA, IPS, & MTK"}, 
		{"Selasa","Bhs. Indonesia & Bhs. Inggris"}, 
		{"Kamis","PKN & Penjaskes"}, 
		{"Jumat","Seni Budaya"}};
	String strInput = null;
	String strCari = null;
	String strHasil = null;
	String keterangan = null;
	String strMenu = null;
	int inputMenu = 0;
	
	Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
	MenuArray menuArray = new MenuArray(); 
	menuArray.run(); }
	public void run() {
	

		
	try {

		
		
			System.out.println("====================");
			System.out.println("|Aplikasi Jadwal Pelajaran|");
			System.out.println("====================");
			System.out.println("1.Tampilkan Hari masuk sekolah");
			System.out.println("2.Tampilkan jadwal pelajaran ");
			System.out.println("3.Cari jadwal pelajaran");
			System.out.println("4.Exit");
			
			System.out.println("pilih menu : ");
			strInput= scanner.nextLine();
			
	
				
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
		catch (NumberFormatException nfe)
		{
			System.out.println("Masukkan bilangan bulat.\n");
			tekanEnter();
		}		
	}
	
	public void Menu1()
	{
		System.out.println("\n============================");
		System.out.println("HARI MASUK SEKOLAH");
		System.out.println("============================");
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println(jadwalPelajaran[i][0]);
		}
		
		tekanEnter();
	}
	
	public void Menu2()
	{
		System.out.println("\n============================");
		System.out.println("JADWAL PELAJARAN");
		System.out.println("============================");
		
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				if (j == 0)
				{
					System.out.println("Hari             : " + jadwalPelajaran[i][j]);
				}
				else 
				{
					System.out.println("Jadwal Pelajaran : " + jadwalPelajaran[i][j] + "\n");
				}
				
			}
		}
		
		tekanEnter();
	}
	
	public void Menu3()
	{
		boolean foundJadwal = false;
		
		System.out.print("Masukkan hari : ");
		strCari = scanner.nextLine();
		
		if (strCari.trim().isEmpty())
		{
			System.out.println("\nTidak dapat memproses nilai kosong.");
			Menu3();
		}
		else if (!strCari.matches("^[a-zA-Z]*$"))
		{
			System.out.println("\nMasukkan huruf.\n");
			Menu3();
		}
		else
		{
			for (int i = 0; i < 4; i++) //untuk mengecek tiap baris kolom apakah ada nilai yang sesuai dengan nilai strCariHari yang telah diinput
			{
				strHasil = jadwalPelajaran[i][0];
				
				if (strHasil.equalsIgnoreCase(strCari))
				{
					keterangan = jadwalPelajaran[i][1]; //masukkan nilai yang terdapat di baris i kolom 1 ke dalam variabel keterangan 
					foundJadwal = true;
					break;
				}
				
			}
			 
			if (foundJadwal) //jika ada nilai dalam array yang sesuai dengan strCariHari maka print keterangan
			{
				System.out.println("\n============================");
				System.out.println("JADWAL HARI " + strHasil.toUpperCase());
				System.out.println("============================");
					
				System.out.println(keterangan);
			}
			else //jika tidak ada maka tidak ada jadwal
			{
				System.out.println("Tidak ada jadwal.\n");
				Menu3();
			}
			
		}
		
		tekanEnter();
	}
	
	public void Menu4()
	{
		System.out.println("\nBye bye.");
		System.exit(0);
	}
	
	public void tekanEnter()
	{
		System.out.print("\nTekan enter untuk kembali ke menu...");
		scanner.nextLine();
		run();
	}
}
	
		
	
	
	
				